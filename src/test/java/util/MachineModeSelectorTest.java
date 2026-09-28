package util;

import static org.junit.Assert.assertEquals;
import static util.MachineModeSelector.selectMode;

import org.junit.Test;

public class MachineModeSelectorTest {

    @Test
    public void mergedRecipeMapsAcceptEveryExistingMode() {
        for (String recipeMap : new String[] { "canner", "arcFurnace", "cutter" }) {
            String[] modes = { recipeMap };
            for (int savedMode = 0; savedMode < 3; savedMode++) {
                assertEquals(recipeMap, selectMode(modes, savedMode));
            }
        }
    }

    @Test
    public void twoModeMachinesKeepTheirExistingSelection() {
        String[] modes = { "dehydrator", "vacuumFurnace" };
        assertEquals("dehydrator", selectMode(modes, 0));
        assertEquals("vacuumFurnace", selectMode(modes, 1));
        assertEquals("vacuumFurnace", selectMode(modes, 2));
    }

    @Test
    public void threeModeMachinesKeepAllRecipeMaps() {
        String[] modes = { "oreWasher", "simpleWasher", "chemicalBath" };
        for (int mode = 0; mode < modes.length; mode++) {
            assertEquals(modes[mode], selectMode(modes, mode));
        }
    }

    @Test
    public void invalidSavedModesAreClamped() {
        String[] modes = { "first", "last" };
        assertEquals("first", selectMode(modes, Integer.MIN_VALUE));
        assertEquals("last", selectMode(modes, Integer.MAX_VALUE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyModeListsAreRejected() {
        selectMode(new String[0], 0);
    }
}
