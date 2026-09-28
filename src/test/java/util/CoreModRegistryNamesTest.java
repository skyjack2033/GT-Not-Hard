package util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class CoreModRegistryNamesTest {

    private static final Pattern CORE_MOD_LOOKUP = Pattern
        .compile("getModItem\\(\\s*NewHorizonsCoreMod\\.ID\\s*,\\s*\"([^\"]+)\"");

    @Test
    public void coreModLookupsUseTargetRegistryNames() throws IOException {
        Set<String> names = new HashSet<>();
        readRegistryNames("/com/dreammaster/item/NHItemList.class", names);
        readRegistryNames("/com/dreammaster/block/BlockList.class", names);
        assertTrue(names.contains("OriginGatePlate"));
        assertFalse("Enum field names are not always registry names", names.contains("GatePlateOrigin"));
        int checked = 0;
        try (Stream<Path> sources = Files.walk(Paths.get("src/main/java"))) {
            Iterator<Path> files = sources.filter(
                path -> path.toString()
                    .endsWith(".java"))
                .iterator();
            while (files.hasNext()) {
                Path file = files.next();
                String source = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
                Matcher lookup = CORE_MOD_LOOKUP.matcher(source);
                while (lookup.find()) {
                    String name = lookup.group(1);
                    assertTrue(file + ": unknown CoreMod registry name " + name, names.contains(name));
                    checked++;
                }
            }
        }
        assertTrue("No CoreMod item lookups were checked", checked > 0);
    }

    private void readRegistryNames(String resource, Set<String> names) throws IOException {
        // CoreMod registers the third enum constructor argument, not the enum constant name.
        try (InputStream stream = getClass().getResourceAsStream(resource)) {
            assertNotNull("Missing target CoreMod class: " + resource, stream);
            ClassReader reader = new ClassReader(stream);
            String enumClass = reader.getClassName();
            reader.accept(new ClassVisitor(Opcodes.ASM5) {

                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
                    String[] exceptions) {
                    if (!"<clinit>".equals(name)) {
                        return null;
                    }
                    return new MethodVisitor(Opcodes.ASM5) {

                        private List<String> arguments;

                        @Override
                        public void visitTypeInsn(int opcode, String type) {
                            if (opcode == Opcodes.NEW && enumClass.equals(type)) {
                                arguments = new ArrayList<>();
                            }
                        }

                        @Override
                        public void visitLdcInsn(Object value) {
                            if (arguments != null && value instanceof String) {
                                arguments.add((String) value);
                            }
                        }

                        @Override
                        public void visitMethodInsn(int opcode, String owner, String name, String descriptor,
                            boolean isInterface) {
                            if (enumClass.equals(owner) && "<init>".equals(name)) {
                                assertTrue(descriptor.startsWith("(Ljava/lang/String;ILjava/lang/String;"));
                                assertNotNull(arguments);
                                assertTrue(arguments.size() >= 2);
                                names.add(arguments.get(1));
                                arguments = null;
                            }
                        }
                    };
                }
            }, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        }
    }
}
