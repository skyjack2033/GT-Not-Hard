package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import gregtech.api.recipe.RecipeMap;

public final class MachineRecipeCatalog {

    private MachineRecipeCatalog() {}

    public static List<RecipeMap<?>> getChaosRecipeMaps() {
        return collectRecipeMaps(RecipeMap.ALL_RECIPE_MAPS.values(), "Chaos of ");
    }

    public static List<RecipeMap<?>> getSingularityRecipeMaps() {
        return collectRecipeMaps(RecipeMap.ALL_RECIPE_MAPS.values(), "Singularity of ");
    }

    static List<RecipeMap<?>> collectRecipeMaps(Collection<RecipeMap<?>> registeredMaps, String prefix) {
        // NEI scans machine prototypes with empty controller slots. Only inspect maps already registered by loaders.
        LinkedHashSet<RecipeMap<?>> maps = new LinkedHashSet<>();
        for (RecipeMap<?> recipeMap : registeredMaps) {
            if (recipeMap != null && recipeMap.unlocalizedName.startsWith(prefix)) {
                maps.add(recipeMap);
            }
        }
        ArrayList<RecipeMap<?>> snapshot = new ArrayList<>(maps);
        snapshot.sort(Comparator.comparing(recipeMap -> recipeMap.unlocalizedName));
        return Collections.unmodifiableList(snapshot);
    }
}
