package Recipes;

import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes;
import Recipes.SingularityRecipes_ModItem.FakeSingularityModItemRecipes_Show;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T10;
import Recipes.SingularityRecipes_VoidGem.FakeSingularityGemRecipes;
import Recipes.SingularityRecipes_VoidIngot.FakeSingularityIngotRecipes;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTRecipeBuilder;
import util.MachineRecipeCatalog;
import util.RecipesFrontend.ResourceCatalogFrontend;

public final class SingularityNEICatalog {

    private SingularityNEICatalog() {}

    public static void rebuild() {
        for (RecipeMap<?> map : MachineRecipeCatalog.getSingularityRecipeMaps()) {
            if (map.getFrontend() instanceof ResourceCatalogFrontend) {
                map.getBackend()
                    .clearRecipes();
            }
        }

        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T0();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T1();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T2();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T3();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T4();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T5();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T6();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T7();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T8();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T9();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T10();

        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T0();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T1();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T2();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T3();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T4();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T5();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T6();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T7();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T8();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T9();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T10();

        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T0();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T1();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T2();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T3();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T4();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T5();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T6();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T7();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T8();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T9();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T10();

        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T0();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T1();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T2();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T3();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T4();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T5();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T6();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T7();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T8();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T9();
        SingularityFluidRecipes_T10.addFakeVoidFluidRecipes_T10();

        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T0();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T1();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T2();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T3();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T4();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T5();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T6();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T7();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T8();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T9();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T10();

        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_AlgaeFarm();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_Comb();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_Food();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_TreeGrowth();

        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_GT_Item();
        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_GT_Machine();
        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_Storage();

        FakeSingularityModItemRecipes_Show.addFakeModItemRecipes_Show();
    }

    public static void addItemDisplay(RecipeMap<?> map, ItemStack selector, ItemStack[] outputs, String description) {
        if (selector != null && outputs != null && outputs.length > 0) {
            displayRecipe(selector, description).itemOutputs(outputs.clone())
                .addTo(map);
        }
    }

    public static void addFluidDisplay(RecipeMap<?> map, ItemStack selector, FluidStack[] outputs, String description) {
        if (selector != null && outputs != null && outputs.length > 0) {
            displayRecipe(selector, description).fluidOutputs(outputs.clone())
                .addTo(map);
        }
    }

    private static GTRecipeBuilder displayRecipe(ItemStack selector, String description) {
        return GTValues.RA.stdBuilder()
            .itemInputs(selector)
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc(description)
            .eut(0);
    }
}
