package util.RecipesFrontend;

import java.util.Comparator;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.gtnewhorizons.modularui.api.math.Pos2d;

import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipeProperties;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.util.GTRecipe;
import gregtech.common.gui.modularui.UIHelper;
import gregtech.nei.GTNEIDefaultHandler.CachedDefaultRecipe;
import gregtech.nei.NEIScrollArea;
import gregtech.nei.RecipeDisplayInfo;

public class ResourceCatalogFrontend extends LocalizedRecipeFrontend {

    private static final int OUTPUT_X = 7;
    private static final int OUTPUT_Y = 44;
    private static final int OUTPUT_COLUMNS = 8;
    private static final int OUTPUT_ROWS = 3;
    public static final int OUTPUTS_PER_PAGE = OUTPUT_COLUMNS * OUTPUT_ROWS;
    public static final int HANDLER_HEIGHT = 140;

    public static List<Pos2d> outputPositions(int count) {
        int rows = (count + OUTPUT_COLUMNS - 1) / OUTPUT_COLUMNS;
        return UIHelper.getGridPositions(count, OUTPUT_X, OUTPUT_Y, OUTPUT_COLUMNS, rows);
    }

    public ResourceCatalogFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder,
            neiRecipePropertiesBuilder.recipeComparator(
                Comparator.comparing(ResourceCatalogFrontend::selectorName)
                    .thenComparingInt(ResourceCatalogFrontend::selectorMetadata)));
    }

    @Override
    protected NEIRecipePropertiesBuilder modifyNEIProperties(NEIRecipePropertiesBuilder builder) {
        builder = super.modifyNEIProperties(builder);
        NEIRecipeProperties properties = builder.build();
        return builder.handlerInfoCreator(
            handler -> (properties.handlerInfoCreator == null ? handler : properties.handlerInfoCreator.apply(handler))
                .setMultipleWidgetsAllowed(false));
    }

    @Override
    public void prepareRecipe(CachedDefaultRecipe recipe) {
        if (recipe.mOutputs.size() > OUTPUTS_PER_PAGE) {
            recipe.addScrollArea(
                new NEIScrollArea(OUTPUT_X, OUTPUT_Y, OUTPUT_COLUMNS, OUTPUT_ROWS).setStacks(recipe.mOutputs));
        }
    }

    @Override
    public void drawDescription(RecipeDisplayInfo recipeInfo) {
        drawSpecialInfo(recipeInfo);
    }

    private static String selectorName(GTRecipe recipe) {
        ItemStack selector = recipe.mInputs.length == 0 ? null : recipe.mInputs[0];
        return selector == null ? "" : selector.getUnlocalizedName();
    }

    private static int selectorMetadata(GTRecipe recipe) {
        ItemStack selector = recipe.mInputs.length == 0 ? null : recipe.mInputs[0];
        return selector == null ? 0 : selector.getItemDamage();
    }
}
