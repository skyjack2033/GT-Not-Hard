package util.RecipesFrontend;

import java.util.Comparator;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.gtnewhorizons.modularui.api.math.Pos2d;

import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.util.GTRecipe;
import gregtech.common.gui.modularui.UIHelper;
import gregtech.nei.RecipeDisplayInfo;

public class ResourceCatalogFrontend extends LocalizedRecipeFrontend {

    public static final int OUTPUTS_PER_PAGE = 27;
    public static final int HANDLER_HEIGHT = 140;

    public static List<Pos2d> outputPositions(int count) {
        if (count < 0 || count > OUTPUTS_PER_PAGE) {
            throw new IllegalArgumentException("Catalog outputs must be split into pages of " + OUTPUTS_PER_PAGE);
        }
        return UIHelper.getGridPositions(count, 7, 44, 9, 3);
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
    public void drawDescription(RecipeDisplayInfo recipeInfo) {
        // Catalog pages are previews, not energy-consuming processing recipes.
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
