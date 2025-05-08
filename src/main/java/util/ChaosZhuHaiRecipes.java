package util;

import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GTUtility;

public class ChaosZhuHaiRecipes {

    public static final RecipeMap<RecipeMapBackend> addChaosZhuHaiFisheryRecipes = RecipeMapBuilder
        .of("Chaos of ZhuHai Fishery")
        .maxIO(1, 1, 0, 0)
        .minInputs(1, 0)
        .disableOptimize()
        .build();

    public static void addChaosZhuHaiFisheryRecipes() {
        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(1))
            .itemOutputs(getModItem(Minecraft.ID, "dye", 1L))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(2))
            .itemOutputs(getModItem(Minecraft.ID, "fish", 1L))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(3))
            .itemOutputs(getModItem(Minecraft.ID, "leather", 1L))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(4))
            .itemOutputs(getModItem(Minecraft.ID, "bone", 1L))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(5))
            .itemOutputs(getModItem(PamsHarvestCraft.ID, "seaweedItem", 1L))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);
    }
}
