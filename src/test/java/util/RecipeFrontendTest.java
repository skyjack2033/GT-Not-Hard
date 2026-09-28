package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.Test;

import com.gtnewhorizons.modularui.api.math.Pos2d;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;

import gregtech.nei.GTNEIDefaultHandler.NEITemplateContext;
import util.RecipesFrontend.LocalizedRecipeFrontend;
import util.RecipesFrontend.ResourceCatalogFrontend;

public class RecipeFrontendTest {

    @Test
    public void allCustomFrontendsOverrideTheBeta3ProgressBarHook() throws Exception {
        int checked = 0;
        try (Stream<Path> sources = Files.list(Paths.get("src/main/java/util/RecipesFrontend"))) {
            Iterator<Path> files = sources.filter(
                path -> path.toString()
                    .endsWith(".java"))
                .iterator();
            while (files.hasNext()) {
                String name = files.next()
                    .getFileName()
                    .toString()
                    .replace(".java", "");
                if (name.equals("LocalizedRecipeFrontend") || name.equals("ResourceCatalogFrontend")) {
                    continue;
                }
                Class<?> frontend = Class.forName("util.RecipesFrontend." + name, false, getClass().getClassLoader());
                Method method = frontend
                    .getDeclaredMethod("addProgressBar", ModularWindow.Builder.class, NEITemplateContext.class);
                assertEquals(frontend, method.getDeclaringClass());
                assertTrue(name, LocalizedRecipeFrontend.class.isAssignableFrom(frontend));
                checked++;
            }
        }
        assertEquals(18, checked);
    }

    @Test
    public void catalogSlotsFitTheBackgroundWithoutOverlappingTheSelectorOrArrow() {
        Rectangle background = new Rectangle(0, 0, 170, 100);
        Rectangle selector = new Rectangle(79, 8, 18, 18);
        Rectangle progress = new Rectangle(81, 27, 14, 16);
        for (int count = 0; count <= ResourceCatalogFrontend.OUTPUTS_PER_PAGE; count++) {
            List<Pos2d> positions = ResourceCatalogFrontend.outputPositions(count);
            assertEquals(count, positions.size());
            Set<Rectangle> slots = new HashSet<>();
            for (Pos2d position : positions) {
                Rectangle slot = new Rectangle(position.x, position.y, 18, 18);
                assertTrue(background.contains(slot));
                assertTrue(!slot.intersects(selector) && !slot.intersects(progress));
                for (Rectangle previous : slots) {
                    assertTrue(!slot.intersects(previous));
                }
                assertTrue(slots.add(slot));
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void oversizedCatalogPagesCannotSilentlyHideOutputs() {
        ResourceCatalogFrontend.outputPositions(ResourceCatalogFrontend.OUTPUTS_PER_PAGE + 1);
    }
}
