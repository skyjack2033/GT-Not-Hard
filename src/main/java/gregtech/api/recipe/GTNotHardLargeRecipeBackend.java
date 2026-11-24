package gregtech.api.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTStreamUtil;
import gregtech.api.util.GTUtility;

public final class GTNotHardLargeRecipeBackend extends RecipeMapBackend {

    private final Map<RecipeCategory, Collection<GTRecipe>> recipesByCategory = new HashMap<>();
    private final GTRecipe[] cacheMap = new GTRecipe[CACHE_MAP_SIZE];
    private RecipeMap<?> recipeMap;

    public GTNotHardLargeRecipeBackend(RecipeMapBackendPropertiesBuilder propertiesBuilder) {
        super(propertiesBuilder);
    }

    @Override
    void setRecipeMap(RecipeMap<?> recipeMap) {
        super.setRecipeMap(recipeMap);
        this.recipeMap = recipeMap;
    }

    @Override
    Collection<GTRecipe> allRecipes() {
        return recipesByCategory.values()
            .stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Collection<GTRecipe> getRecipesByCategory(RecipeCategory recipeCategory) {
        return Collections
            .unmodifiableCollection(recipesByCategory.getOrDefault(recipeCategory, Collections.emptyList()));
    }

    @Override
    public Map<RecipeCategory, Collection<GTRecipe>> getRecipeCategoryMap() {
        return Collections.unmodifiableMap(recipesByCategory);
    }

    @Override
    public GTRecipe compileRecipe(GTRecipe recipe) {
        if (recipe.getRecipeCategory() == null) {
            recipe.setRecipeCategory(recipeMap.getDefaultRecipeCategory());
        }
        recipesByCategory.computeIfAbsent(recipe.getRecipeCategory(), category -> new ArrayList<>())
            .add(recipe);
        return addToItemMap(recipe);
    }

    @Override
    public void removeRecipes(Collection<? extends GTRecipe> recipesToRemove) {
        for (Collection<GTRecipe> recipes : recipesByCategory.values()) {
            recipes.removeAll(recipesToRemove);
        }
        recipesByCategory.entrySet()
            .removeIf(
                entry -> entry.getValue()
                    .isEmpty());
        rebuildInputMap(false);
    }

    @Override
    public void clearRecipes() {
        recipesByCategory.clear();
        super.clearRecipes();
        Arrays.fill(cacheMap, null);
    }

    @Override
    public void reInit() {
        rebuildInputMap(true);
    }

    private void rebuildInputMap(boolean reUnificate) {
        super.clearRecipes();
        Arrays.fill(cacheMap, null);
        for (GTRecipe recipe : allRecipes()) {
            if (reUnificate) {
                GTOreDictUnificator.setStackArray(true, true, recipe.mInputs);
                GTOreDictUnificator.setStackArray(true, true, recipe.mOutputs);
            }
            addToItemMap(recipe);
        }
    }

    @Override
    Stream<GTRecipe> matchRecipeStream(ItemStack[] rawItems, FluidStack[] fluids, ItemStack specialSlot,
        GTRecipe cachedRecipe, boolean notUnificated, boolean dontCheckStackSizes, boolean forCollisionCheck) {
        if (recipesByCategory.isEmpty()) {
            return Stream.empty();
        }
        if (!forCollisionCheck) {
            if (Arrays.stream(fluids)
                .filter(Objects::nonNull)
                .count() < properties.minFluidInputs) {
                return Stream.empty();
            }
            if (Arrays.stream(rawItems)
                .filter(Objects::nonNull)
                .count() < properties.minItemInputs) {
                return Stream.empty();
            }
        }
        ItemStack[] items = notUnificated ? GTOreDictUnificator.getStackArray(true, (Object[]) rawItems) : rawItems;
        return Stream.<Stream<GTRecipe>>of(
            GTStreamUtil.ofNullable(cachedRecipe)
                .filter(recipe -> recipe.mCanBeBuffered),
            GTStreamUtil.ofSupplier(() -> cacheMap[GTUtility.mod(hash(items, fluids), CACHE_MAP_SIZE)])
                .filter(Objects::nonNull),
            Stream.<Supplier<Stream<GTRecipe>>>of(() -> lookupCandidateStream(items, fluids))
                .flatMap(Supplier::get))
            .flatMap(Function.identity())
            .distinct()
            .filter(recipe -> filterFindRecipe(recipe, items, fluids, specialSlot, dontCheckStackSizes))
            .map(recipe -> modifyFoundRecipe(recipe, items, fluids, specialSlot))
            .filter(Objects::nonNull);
    }

    @Override
    protected Stream<GTRecipe> lookupCandidateStream(ItemStack[] items, FluidStack[] fluids) {
        return recipesByCategory.values()
            .stream()
            .flatMap(Collection::stream);
    }

    @Override
    protected void cache(ItemStack[] items, FluidStack[] fluids, GTRecipe recipe) {
        cacheMap[GTUtility.mod(hash(items, fluids), CACHE_MAP_SIZE)] = recipe;
    }
}
