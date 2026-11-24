package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import com.mofoga.gtnothard.MyMod;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTRecipeBuilder;

public final class ChaosAssemblyRecipeBuilder {

    private static int skippedRecipeCount;

    private final String source;
    private final GTRecipeBuilder delegate;
    private final List<String> missingItems = new ArrayList<>();
    private final List<String> missingFluids = new ArrayList<>();
    private boolean skipRecorded;

    private ChaosAssemblyRecipeBuilder(String source) {
        this.source = source;
        delegate = GTValues.RA.stdBuilder();
    }

    public static ChaosAssemblyRecipeBuilder builder(String source) {
        return new ChaosAssemblyRecipeBuilder(source);
    }

    public static RequiredFluid requiredFluid(String name, int amount) {
        return new RequiredFluid(name, FluidRegistry.getFluidStack(name, amount));
    }

    public static int getSkippedRecipeCount() {
        return skippedRecipeCount;
    }

    public ChaosAssemblyRecipeBuilder itemInputsUnsafe(ItemStack... inputs) {
        if (!recordMissingItems("input", inputs)) {
            delegate.itemInputsUnsafe(inputs);
        }
        return this;
    }

    public ChaosAssemblyRecipeBuilder itemOutputs(ItemStack... outputs) {
        if (!recordMissingItems("output", outputs)) {
            delegate.itemOutputs(outputs);
        }
        return this;
    }

    private boolean recordMissingItems(String kind, ItemStack[] items) {
        boolean missing = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                missingItems.add(kind + "[" + i + "]");
                missing = true;
            }
        }
        return missing;
    }

    public ChaosAssemblyRecipeBuilder fluidInputs(RequiredFluid... inputs) {
        FluidStack[] fluids = new FluidStack[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            RequiredFluid input = inputs[i];
            if (input.stack == null) {
                missingFluids.add(input.name);
            } else {
                fluids[i] = input.stack;
            }
        }
        if (missingFluids.isEmpty()) {
            delegate.fluidInputs(fluids);
        }
        return this;
    }

    public ChaosAssemblyRecipeBuilder eut(int eut) {
        delegate.eut(eut);
        return this;
    }

    public ChaosAssemblyRecipeBuilder eut(long eut) {
        delegate.eut(eut);
        return this;
    }

    public ChaosAssemblyRecipeBuilder duration(int duration) {
        delegate.duration(duration);
        return this;
    }

    public ChaosAssemblyRecipeBuilder duration(long duration) {
        delegate.duration(duration);
        return this;
    }

    public Collection<GTRecipe> addTo(RecipeMap<?> recipeMap) {
        if (!missingItems.isEmpty() || !missingFluids.isEmpty()) {
            if (!skipRecorded) {
                skippedRecipeCount++;
                skipRecorded = true;
                MyMod.LOG.warn(
                    "[assembly-recipes] skipped {}: missing required items {}, fluids {}",
                    source,
                    missingItems,
                    missingFluids);
            }
            return Collections.emptyList();
        }
        return delegate.addTo(recipeMap);
    }

    public static final class RequiredFluid {

        private final String name;
        private final FluidStack stack;

        private RequiredFluid(String name, FluidStack stack) {
            this.name = name;
            this.stack = stack;
        }
    }
}
