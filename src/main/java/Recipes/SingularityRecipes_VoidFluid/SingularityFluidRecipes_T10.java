package Recipes.SingularityRecipes_VoidFluid;

import static Recipes.SingularityNEICatalog.addFluidDisplay;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import util.RegisteredResourceCatalog;

public class SingularityFluidRecipes_T10 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T10 = new HashMap<>();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T10 = FakeSingularityFluidRecipes.addFakeVoidFluidRecipes;

    public static void addVoidFluidRecipes_T10() {
        VoidFluidRecipes_T10.put("DD", RegisteredResourceCatalog.collectFluids());
    }

    public static void addFakeVoidFluidRecipes_T10() {
        FluidStack[] fluids = VoidFluidRecipes_T10.get("DD");
        if (fluids == null) {
            throw new IllegalStateException("Build the T10 fluid catalog before registering its NEI recipes");
        }
        addFluidDisplay(
            addFakeVoidFluidRecipes_T10,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L),
            RegisteredResourceCatalog.copyFluids(fluids),
            "Singularity with Void Fluid Mode");
    }
}
