package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import net.minecraft.util.StringTranslate;

import org.junit.Test;

public class LanguageResourcesTest {

    private static final Pattern PLACEHOLDER = Pattern.compile("%(?:\\d+\\$)?s");
    private static final Pattern RECIPE_MAP = Pattern.compile("\\.of\\(\\s*\"([^\"]+)\"");
    private static final Pattern LITERAL_KEY = Pattern.compile("\"(gtnothard\\.[^\"]+)\"");
    private static final Pattern MODE_ARRAY = Pattern.compile("_mod\\s*=\\s*\\{([^}]+)}");
    private static final Pattern STRING_LITERAL = Pattern.compile("\"([^\"]+)\"");

    @Test
    public void languageFilesHaveMatchingKeysAndPlaceholders() throws IOException {
        Map<String, String> english = readLanguage("en_US");
        Map<String, String> chinese = readLanguage("zh_CN");
        assertEquals(english.keySet(), chinese.keySet());
        for (String key : english.keySet()) {
            List<String> placeholders = placeholders(english.get(key));
            assertEquals(key, placeholders, placeholders(chinese.get(key)));
            Object[] arguments = new Object[placeholders.size()];
            for (int i = 0; i < arguments.length; i++) {
                arguments[i] = "123";
            }
            String.format(Locale.ROOT, english.get(key), arguments);
            String.format(Locale.ROOT, chinese.get(key), arguments);
            assertTrue(
                "Missing Chinese text: " + key,
                chinese.get(key)
                    .codePoints()
                    .anyMatch(codePoint -> Character.UnicodeScript.of(codePoint) == Character.UnicodeScript.HAN));
        }
    }

    @Test
    public void everyRecipeMapHasATranslation() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        int checked = 0;
        for (String source : sources()) {
            Matcher maps = RECIPE_MAP.matcher(source);
            while (maps.find()) {
                assertTrue("Missing recipe map: " + maps.group(1), language.containsKey(maps.group(1)));
                checked++;
            }
        }
        assertTrue("No recipe maps were checked", checked > 0);
    }

    @Test
    public void everyLiteralDisplayKeyHasATranslation() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        int checked = 0;
        for (String source : sources()) {
            Matcher keys = LITERAL_KEY.matcher(source);
            while (keys.find()) {
                String key = keys.group(1);
                if (!key.endsWith(".")) {
                    assertTrue("Missing display key: " + key, language.containsKey(key));
                    checked++;
                }
            }
        }
        assertTrue("No display keys were checked", checked > 0);
    }

    @Test
    public void machineRegistryNamesHaveTranslations() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        String source = readSource("src/main/java/loader/MachinesLoader.java");
        Matcher names = Pattern.compile("new (?:Chaos|Origin|Singularity)\\(\\d+,\\s*\"([^\"]+)\"")
            .matcher(source);
        int checked = 0;
        while (names.find()) {
            // CommonMetaTileEntity normalizes the registry name before constructing this key.
            String key = "gt.blockmachines." + names.group(1)
                .toLowerCase(Locale.ROOT) + ".name";
            assertTrue("Missing machine name: " + key, language.containsKey(key));
            checked++;
        }
        assertEquals(3, checked);
    }

    @Test
    public void machineTooltipsUseTheActualLowercaseNameKeys() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        for (String machine : new String[] { "Chaos", "Origin", "Singularity" }) {
            String key = "gt.blockmachines." + machine.toLowerCase(Locale.ROOT) + ".name";
            String source = readSource("src/main/java/machines/" + machine + ".java");
            assertTrue(machine, source.contains("translateToLocal(\"" + key + "\")"));
            assertTrue(key, language.containsKey(key));
            assertFalse("Oversized tooltip separator: " + machine, source.contains(".addInfo(\"-----"));
        }
    }

    @Test
    public void everyLegacyRecipeDescriptionHasATranslation() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        Pattern description = Pattern.compile("\\.setNEIDesc\\(\"([^\"]+)\"");
        int checked = 0;
        for (String source : sources()) {
            Matcher matcher = description.matcher(source);
            while (matcher.find()) {
                String value = matcher.group(1);
                String key = value.startsWith("Fuel Baseline = ") ? "gtnothard.nei.fuel_baseline"
                    : "gtnothard.nei.description." + value;
                assertTrue("Missing recipe description: " + key, language.containsKey(key));
                checked++;
            }
        }
        assertTrue("No recipe descriptions were checked", checked > 0);
    }

    @Test
    public void legacyModeValuesHaveTranslations() throws IOException {
        Map<String, String> language = readLanguage("zh_CN");
        Matcher arrays = MODE_ARRAY.matcher(readSource("src/main/java/machines/Chaos.java"));
        int checked = 0;
        while (arrays.find()) {
            Matcher modes = STRING_LITERAL.matcher(arrays.group(1));
            while (modes.find()) {
                assertMode(language, modes.group(1));
                checked++;
            }
        }
        Matcher modes = Pattern.compile("machineType = \"([^\"]+)\"")
            .matcher(readSource("src/main/java/machines/Singularity.java"));
        while (modes.find()) {
            assertMode(language, modes.group(1));
            checked++;
        }
        assertTrue("No legacy modes were checked", checked > 0);
        assertMode(language, "Canner");
        assertMode(language, "Arc Furnace");
        assertMode(language, "Cutting");
        assertMode(language, "Unpackeager");
    }

    private void assertMode(Map<String, String> language, String mode) {
        assertTrue("Missing legacy mode: " + mode, language.containsKey("gtnothard.mode." + mode));
    }

    private List<String> placeholders(String value) {
        List<String> result = new ArrayList<>();
        Matcher matcher = PLACEHOLDER.matcher(value);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

    private List<String> sources() throws IOException {
        List<String> result = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get("src/main/java"))) {
            Iterator<Path> files = paths.filter(
                path -> path.toString()
                    .endsWith(".java"))
                .iterator();
            while (files.hasNext()) {
                result.add(
                    readSource(
                        files.next()
                            .toString()));
            }
        }
        return result;
    }

    private String readSource(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    }

    private Map<String, String> readLanguage(String locale) throws IOException {
        String resource = "/assets/gtnothard/lang/" + locale + ".lang";
        byte[] bytes;
        try (InputStream stream = getClass().getResourceAsStream(resource);
            ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            assertNotNull("Language resource was not packaged: " + resource, stream);
            byte[] buffer = new byte[4096];
            int count;
            while ((count = stream.read(buffer)) != -1) {
                output.write(buffer, 0, count);
            }
            bytes = output.toByteArray();
        }
        String text = StandardCharsets.UTF_8.newDecoder()
            .onMalformedInput(CodingErrorAction.REPORT)
            .onUnmappableCharacter(CodingErrorAction.REPORT)
            .decode(ByteBuffer.wrap(bytes))
            .toString();
        assertFalse("Unexpected UTF-8 BOM: " + locale, text.startsWith("\uFEFF"));
        Map<String, String> expected = new HashMap<>();
        for (String line : text.split("\\r?\\n")) {
            if (line.isEmpty() || line.startsWith("#")) {
                continue;
            }
            int separator = line.indexOf('=');
            assertTrue("Malformed language line: " + line, separator > 0);
            String key = line.substring(0, separator);
            String value = line.substring(separator + 1);
            assertFalse(
                "Empty translation: " + key,
                value.trim()
                    .isEmpty());
            assertFalse("Duplicate language key: " + key, expected.containsKey(key));
            expected.put(key, value);
        }
        assertFalse("Empty language file: " + locale, expected.isEmpty());
        // Use Forge's actual 1.7.10 parser to also check keys containing spaces and values containing '='.
        Map<String, String> parsed = StringTranslate.parseLangFile(new ByteArrayInputStream(bytes));
        assertEquals(locale, expected, parsed);
        return parsed;
    }
}
