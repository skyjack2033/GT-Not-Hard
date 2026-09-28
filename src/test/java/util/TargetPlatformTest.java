package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cpw.mods.fml.common.Mod;

public class TargetPlatformTest {

    private static final String GREGTECH = "gregtech.GTMod";
    private static final String GTNHLIB = "com.gtnewhorizon.gtnhlib.GTNHLib";

    @Test
    public void resolvedDependenciesMatchTheRc1Manifest() throws ClassNotFoundException {
        // https://github.com/GTNewHorizons/DreamAssemblerXXL/blob/master/releases/manifests/2.9.0-RC-1.json
        assertEquals("5.09.54.183", readModAnnotation(GREGTECH).version());
        assertEquals("0.11.51", readModAnnotation(GTNHLIB).version());
        assertEquals("3.4.34-GTNH", readModAnnotation("micdoodle8.mods.galacticraft.core.GalacticraftCore").version());
        assertEquals("2.9.76", readModAnnotation("com.dreammaster.main.MainRegistry").version());
        assertEquals("1.99", readModAnnotation("fox.spiteful.avaritia.Avaritia").version());
    }

    @Test
    public void forgeMinimumVersionsMatchTheCompileDependencies() throws ClassNotFoundException {
        String expected = "required-after:gregtech@[" + readModAnnotation(GREGTECH).version()
            + ",);required-after:gtnhlib@["
            + readModAnnotation(GTNHLIB).version()
            + ",)";
        assertEquals(expected, readModAnnotation("com.mofoga.gtnothard.MyMod").dependencies());
    }

    private Mod readModAnnotation(String className) throws ClassNotFoundException {
        // Inspect the JVM-selected class without initializing mods that need Minecraft.
        Class<?> type = Class.forName(className, false, getClass().getClassLoader());
        Mod annotation = type.getAnnotation(Mod.class);
        assertNotNull("Missing Forge mod annotation: " + className, annotation);
        return annotation;
    }
}
