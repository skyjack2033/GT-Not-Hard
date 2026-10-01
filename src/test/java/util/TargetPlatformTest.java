package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cpw.mods.fml.common.Mod;

public class TargetPlatformTest {

    @Test
    public void resolvedDependenciesMatchBeta3() throws ClassNotFoundException {
        assertEquals("5.09.54.133", readMod("gregtech.GTMod").version());
        assertEquals("0.11.46", readMod("com.gtnewhorizon.gtnhlib.GTNHLib").version());
        assertEquals("3.4.33-GTNH", readMod("micdoodle8.mods.galacticraft.core.GalacticraftCore").version());
        assertEquals("2.9.61", readMod("com.dreammaster.main.MainRegistry").version());
        assertEquals("1.99", readMod("fox.spiteful.avaritia.Avaritia").version());
    }

    @Test
    public void forgeAcceptsTheTargetPackDependencies() throws ClassNotFoundException {
        assertEquals(
            "required-after:gregtech@[5.09.54.133,);required-after:gtnhlib@[0.11.46,)",
            readMod("com.mofoga.gtnothard.MyMod").dependencies());
    }

    private Mod readMod(String name) throws ClassNotFoundException {
        // Read the actual classpath without initializing mods that need a running Minecraft instance.
        Mod annotation = Class.forName(name, false, getClass().getClassLoader())
            .getAnnotation(Mod.class);
        assertNotNull("Missing Forge mod annotation: " + name, annotation);
        return annotation;
    }
}
