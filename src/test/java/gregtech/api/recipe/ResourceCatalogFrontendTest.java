package gregtech.api.recipe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import com.gtnewhorizons.modularui.api.forge.IItemHandlerModifiable;
import com.gtnewhorizons.modularui.api.forge.ItemStackHandler;
import com.gtnewhorizons.modularui.api.math.Pos2d;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.widget.Widget;
import com.gtnewhorizons.modularui.common.widget.SlotWidget;

import codechicken.nei.recipe.HandlerInfo;
import gregtech.nei.GTNEIDefaultHandler.NEITemplateContext;
import util.RecipesFrontend.OneToManyFluidsFrontend_Large;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;
import util.RecipesFrontend.OneToManyItemsFrontend_Small;
import util.RecipesFrontend.ResourceCatalogFrontend;

/** Exercises the same real GT/ModularUI template construction that runs during NEI handler registration. */
public class ResourceCatalogFrontendTest {

    private static final int[] OUTPUT_COUNTS = { 0, 1, 27, 28, 90, 135 };

    @Test
    public void catalogLayoutKeepsAllOutputsIncludingLegacyCapacities() {
        assertTrue(
            ResourceCatalogFrontend.outputPositions(-1)
                .isEmpty());
        for (int count : OUTPUT_COUNTS) {
            List<Pos2d> positions = ResourceCatalogFrontend.outputPositions(count);
            assertEquals("Output count " + count, count, positions.size());
            assertEquals("Slots must not overlap", count, new HashSet<>(positions).size());
            for (int i = 0; i < count; i++) {
                assertEquals(new Pos2d(7 + i % 9 * 18, 44 + i / 9 * 18), positions.get(i));
            }
        }
    }

    @Test
    public void allCatalogTemplatesRegisterWithLegacyCapacities() {
        for (int count : OUTPUT_COUNTS) {
            for (RecipeMapFrontend.FrontendCreator creator : Arrays.<RecipeMapFrontend.FrontendCreator>asList(
                OneToManyItemsFrontend_Large::new,
                OneToManyItemsFrontend_Small::new,
                OneToManyFluidsFrontend_Large::new)) {
                boolean fluids = creator.create(
                    BasicUIProperties.builder()
                        .maxItemInputs(1),
                    NEIRecipeProperties.builder()) instanceof OneToManyFluidsFrontend_Large;
                int[] counts = fluids ? new int[] { 1, 0, 0, count } : new int[] { 1, count, 0, 0 };
                RecipeMapFrontend frontend = createFrontend(creator, counts, NEIRecipeProperties.builder());
                assertTemplate(frontend, counts);
            }
        }
    }

    @Test
    public void oversizedCatalogResizesBothBackgroundAndHandlerWithoutDroppingSettings() {
        RecipeMapFrontend frontend = createFrontend(
            OneToManyItemsFrontend_Large::new,
            new int[] { 1, 135, 0, 0 },
            NEIRecipeProperties.builder()
                .handlerInfoCreator(
                    handler -> handler.setWidth(192)
                        .setHeight(140)));
        NEIRecipeProperties properties = frontend.getNEIProperties();
        assertEquals(316, properties.recipeBackgroundSize.height);
        HandlerInfo info = properties.handlerInfoCreator
            .apply(new HandlerInfo.Builder("catalog-test", "GT Not Hard", "gtnothard"))
            .build();
        assertEquals(356, info.getHeight());
        assertEquals(192, info.getWidth());
    }

    @Test
    public void normalCatalogRetainsPageSizeAndHandlerConfiguration() {
        NEIRecipePropertiesBuilder properties = NEIRecipeProperties.builder()
            .handlerInfoCreator(handler -> handler.setHeight(ResourceCatalogFrontend.HANDLER_HEIGHT));
        Object configuredCreator = properties.build().handlerInfoCreator;
        RecipeMapFrontend frontend = createFrontend(
            OneToManyItemsFrontend_Large::new,
            new int[] { 1, 27, 0, 0 },
            properties);
        assertEquals(27, ResourceCatalogFrontend.OUTPUTS_PER_PAGE);
        assertEquals(100, frontend.getNEIProperties().recipeBackgroundSize.height);
        assertSame(configuredCreator, frontend.getNEIProperties().handlerInfoCreator);
    }

    @Test
    public void everyCustomFrontendBuildsItsRegisteredTemplate() throws ReflectiveOperationException {
        String[] names = { "AntimatterOfChaosFrontend", "ArcaneWorktableOfChaosFrontend", "BloodMagicOfChaosFrontend",
            "BotaniaOfChaosFrontend", "CrucibleOfChaosFrontend", "EssenceFarmOfChaosFrontend", "ExoticOfChaosFrontend",
            "FallingTowerOfChaosFrontend", "FluidFuelOfGeneratorFrontend", "FluidReplicatorOfChaosFrontend",
            "ItemFuelOfGeneratorFrontend", "ItemReplicatorOfChaosFrontend", "OneToManyItemsFrontend_Large",
            "OneToManyItemsFrontend_Small", "OneToManyFluidsFrontend_Large", "OreProcessOfChaosFrontend",
            "RunicMatrixOfChaosFrontend", "SpecialCompressOfChaosFrontend" };
        int[][] counts = { { 0, 0, 5, 1 }, { 20, 1, 0, 0 }, { 11, 1, 1, 0 }, { 11, 1, 0, 0 }, { 11, 1, 0, 0 },
            { 2, 25, 0, 0 }, { 1, 0, 2, 1 }, { 1, 27, 1, 0 }, { 1, 0, 1, 1 }, { 1, 0, 1, 1 }, { 2, 1, 0, 0 },
            { 1, 1, 1, 0 }, { 1, 27, 0, 0 }, { 1, 27, 0, 0 }, { 1, 0, 0, 27 }, { 1, 16, 2, 0 }, { 35, 1, 0, 0 },
            { 1, 1, 0, 0 } };
        for (int i = 0; i < names.length; i++) {
            RecipeMapFrontend frontend = (RecipeMapFrontend) Class.forName("util.RecipesFrontend." + names[i])
                .getConstructor(BasicUIPropertiesBuilder.class, NEIRecipePropertiesBuilder.class)
                .newInstance(uiProperties(counts[i]), NEIRecipeProperties.builder());
            assertTemplate(frontend, counts[i]);
        }
    }

    private static RecipeMapFrontend createFrontend(RecipeMapFrontend.FrontendCreator creator, int[] counts,
        NEIRecipePropertiesBuilder properties) {
        return creator.create(uiProperties(counts), properties);
    }

    private static BasicUIPropertiesBuilder uiProperties(int[] counts) {
        return BasicUIProperties.builder()
            .maxItemInputs(counts[0])
            .maxItemOutputs(counts[1])
            .maxFluidInputs(counts[2])
            .maxFluidOutputs(counts[3]);
    }

    private static void assertTemplate(RecipeMapFrontend frontend, int[] counts) {
        IItemHandlerModifiable[] inventories = { new ItemStackHandler(counts[0]), new ItemStackHandler(counts[1]),
            new ItemStackHandler(counts[2]), new ItemStackHandler(counts[3]) };
        Pos2d offset = new Pos2d(-5, -11);
        NEITemplateContext context = new NEITemplateContext(
            inventories[0],
            inventories[1],
            new ItemStackHandler(1),
            inventories[2],
            inventories[3],
            () -> 0.5f,
            () -> null,
            offset);
        ModularWindow window = frontend.createNEITemplate(context)
            .build();
        int[] actual = new int[4];
        for (Widget widget : window.getChildren()) {
            if (!(widget instanceof SlotWidget)) {
                continue;
            }
            SlotWidget slot = (SlotWidget) widget;
            for (int i = 0; i < inventories.length; i++) {
                if (slot.getMcSlot()
                    .getItemHandler() != inventories[i]) {
                    continue;
                }
                int index = slot.getMcSlot()
                    .getSlotIndex();
                assertTrue(index >= 0 && index < counts[i]);
                // Reading an invalid slot reproduces the real inventory bounds check.
                inventories[i].getStackInSlot(index);
                actual[i]++;
                assertTrue(slot.getPos().x - offset.x >= 0);
                assertTrue(slot.getPos().y - offset.y >= 0);
                assertTrue(slot.getPos().x - offset.x + 18 <= frontend.getNEIProperties().recipeBackgroundSize.width);
                assertTrue(slot.getPos().y - offset.y + 18 <= frontend.getNEIProperties().recipeBackgroundSize.height);
            }
        }
        for (int i = 0; i < counts.length; i++) {
            assertEquals(
                frontend.getClass()
                    .getSimpleName() + " inventory "
                    + i,
                counts[i],
                actual[i]);
        }
    }
}
