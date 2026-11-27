package Recipes.SingularityRecipes_VoidGem;

import static Recipes.SingularityNEICatalog.addItemDisplay;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static util.AggregateItemStackArray.addCompressAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;
import static util.RecipesFrontend.ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

import net.minecraft.item.ItemStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Small;
import util.RecipesFrontend.ResourceCatalogFrontend;
import util.RegisteredResourceCatalog;

public class FakeSingularityGemRecipes {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes = RecipeMapBuilder
        .of("Singularity of Void Gem")
        .maxIO(1, OUTPUTS_PER_PAGE, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Small::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T0 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T1 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T2 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T3 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T4 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T5 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T6 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T7 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T8 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T9 = addFakeVoidGemRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T10 = addFakeVoidGemRecipes;

    public static void addFakeVoidGemRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Lignite_Coal_Vein,
            SmallOre_Gem.Overworld_SmallOre);
        ItemStack[] Fake_T0_Overworld_Gem_Checked = checkItemStack(Fake_T0_Overworld_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L),
            Fake_T0_Overworld_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein,
            SmallOre_Gem.Nether_SmallOre);
        ItemStack[] Fake_T0_Nether_Gem_Checked = checkItemStack(Fake_T0_Nether_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L),
            Fake_T0_Nether_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Gem = addCompressAggregateArray(
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Almandine_Sapphire_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            SmallOre_Gem.Twilight_SmallOre);
        ItemStack[] Fake_T0_Twilight_Gem_Checked = checkItemStack(Fake_T0_Twilight_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L),
            Fake_T0_Twilight_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Gem = addCompressAggregateArray(Vein_Gem.Beryllium_Vein);
        ItemStack[] Fake_T0_TheEnd_Gem_Checked = checkItemStack(Fake_T0_TheEnd_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L),
            Fake_T0_TheEnd_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein);
        ItemStack[] Fake_T0_EndAsteroid_Gem_Checked = checkItemStack(Fake_T0_EndAsteroid_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L),
            Fake_T0_EndAsteroid_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T0 - TheToxicEverglades - Eg
        ItemStack[] Fake_T0_TheToxicEverglades_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein);
        ItemStack[] Fake_T0_TheToxicEverglades_Gem_Checked = checkItemStack(Fake_T0_TheToxicEverglades_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eg", 1L),
            Fake_T0_TheToxicEverglades_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[] Fake_T1_Moon_Gem_Checked = checkItemStack(Fake_T1_Moon_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T1,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L),
            Fake_T1_Moon_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Gem = addCompressAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Draconium_Vein,
            SmallOre_Gem.Deimos_SmallOre);
        ItemStack[] Fake_T2_Deimos_Gem_Checked = checkItemStack(Fake_T2_Deimos_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L),
            Fake_T2_Deimos_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Sulfur_Vein);
        ItemStack[] Fake_T2_Mars_Gem_Checked = checkItemStack(Fake_T2_Mars_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L),
            Fake_T2_Mars_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            SmallOre_Gem.Phobos_SmallOre);
        ItemStack[] Fake_T2_Phobos_Gem_Checked = checkItemStack(Fake_T2_Phobos_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L),
            Fake_T2_Phobos_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Gem = addCompressAggregateArray(
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            SmallOre_Gem.Asteroids_SmallOre);
        ItemStack[] Fake_T3_Asteroids_Gem_Checked = checkItemStack(Fake_T3_Asteroids_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L),
            Fake_T3_Asteroids_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Gem = addCompressAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            SmallOre_Gem.Callisto_SmallOre);
        ItemStack[] Fake_T3_Callisto_Gem_Checked = checkItemStack(Fake_T3_Callisto_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L),
            Fake_T3_Callisto_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Beryllium_Vein,
            SmallOre_Gem.Ceres_SmallOre);
        ItemStack[] Fake_T3_Ceres_Gem_Checked = checkItemStack(Fake_T3_Ceres_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L),
            Fake_T3_Ceres_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Gem = addCompressAggregateArray(Vein_Gem.Magnesite_Vein, Vein_Gem.Ledox_Vein);
        ItemStack[] Fake_T3_Europa_Gem_Checked = checkItemStack(Fake_T3_Europa_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L),
            Fake_T3_Europa_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Gem = addCompressAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            SmallOre_Gem.Ganymede_SmallOre);
        ItemStack[] Fake_T3_Ganymede_Gem_Checked = checkItemStack(Fake_T3_Ganymede_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L),
            Fake_T3_Ganymede_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Gem = addCompressAggregateArray(
            Vein_Gem.Hedenbergite_Vein,
            Vein_Gem.Olenite_Vein,
            Vein_Gem.Forsterite_Vein,
            Vein_Gem.Thorianite_Vein,
            Vein_Gem.Graphite_Vein,
            Vein_Gem.Fayalite_Vein,
            Vein_Gem.Bismutite_Vein);
        ItemStack[] Fake_T3_Ross128b_Gem_Checked = checkItemStack(Fake_T3_Ross128b_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L),
            Fake_T3_Ross128b_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Io_SmallOre);
        ItemStack[] Fake_T4_Io_Gem_Checked = checkItemStack(Fake_T4_Io_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L),
            Fake_T4_Io_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Gem = addCompressAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] Fake_T4_Mercury_Gem_Checked = checkItemStack(Fake_T4_Mercury_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L),
            Fake_T4_Mercury_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Quantium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Venus_SmallOre);
        ItemStack[] Fake_T4_Venus_Gem_Checked = checkItemStack(Fake_T4_Venus_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L),
            Fake_T4_Venus_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Gem = addCompressAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Enceladus_SmallOre);
        ItemStack[] Fake_T5_Enceladus_Gem_Checked = checkItemStack(Fake_T5_Enceladus_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L),
            Fake_T5_Enceladus_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Gem = addCompressAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] Fake_T5_Miranda_Gem_Checked = checkItemStack(Fake_T5_Miranda_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L),
            Fake_T5_Miranda_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            SmallOre_Gem.Oberon_SmallOre);
        ItemStack[] Fake_T5_Oberon_Gem_Checked = checkItemStack(Fake_T5_Oberon_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L),
            Fake_T5_Oberon_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Titan_SmallOre);
        ItemStack[] Fake_T5_Titan_Gem_Checked = checkItemStack(Fake_T5_Titan_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L),
            Fake_T5_Titan_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Gem = addCompressAggregateArray(
            Vein_Gem.BArTiMaEuSNeK_Vein,
            Vein_Gem.Amethyst_Vein,
            Vein_Gem.Fayalite_Vein,
            Vein_Gem.Tiberium_Vein,
            Vein_Gem.Olenite_Vein);
        ItemStack[] Fake_T5_Ross128ba_Gem_Checked = checkItemStack(Fake_T5_Ross128ba_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L),
            Fake_T5_Ross128ba_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[] Fake_T6_Proteus_Gem_Checked = checkItemStack(Fake_T6_Proteus_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T6,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L),
            Fake_T6_Proteus_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Triton_SmallOre);
        ItemStack[] Fake_T6_Triton_Gem_Checked = checkItemStack(Fake_T6_Triton_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T6,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L),
            Fake_T6_Triton_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Gem = addCompressAggregateArray(
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] Fake_T7_Haumea_Gem_Checked = checkItemStack(Fake_T7_Haumea_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L),
            Fake_T7_Haumea_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T7 - Kuiper Belt - KB
        ItemStack[] Fake_T7_Kuiperbelt_Gem = addCompressAggregateArray(
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Kuiperbelt_SmallOre);
        ItemStack[] Fake_T7_Kuiperbelt_Gem_Checked = checkItemStack(Fake_T7_Kuiperbelt_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_KB", 1L),
            Fake_T7_Kuiperbelt_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Gem = addCompressAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] Fake_T7_Makemake_Gem_Checked = checkItemStack(Fake_T7_Makemake_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L),
            Fake_T7_Makemake_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Gem = addCompressAggregateArray(
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] Fake_T7_Pluto_Gem_Checked = checkItemStack(Fake_T7_Pluto_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L),
            Fake_T7_Pluto_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Gem = addCompressAggregateArray(
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Lignite_Coal_Vein);
        ItemStack[] Fake_T8_BarnardC_Gem_Checked = checkItemStack(Fake_T8_BarnardC_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L),
            Fake_T8_BarnardC_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Bentonite_Olivine_Vein);
        ItemStack[] Fake_T8_BarnardE_Gem_Checked = checkItemStack(Fake_T8_BarnardE_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L),
            Fake_T8_BarnardE_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] Fake_T8_BarnardF_Gem_Checked = checkItemStack(Fake_T8_BarnardF_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L),
            Fake_T8_BarnardF_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Gem = addCompressAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[] Fake_T8_Centauri_Gem_Checked = checkItemStack(Fake_T8_Centauri_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L),
            Fake_T8_Centauri_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Gem = addCompressAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Ilmenite_Vein,
            SmallOre_Gem.TCetiE_SmallOre);
        ItemStack[] Fake_T8_TCetiE_Gem_Checked = checkItemStack(Fake_T8_TCetiE_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L),
            Fake_T8_TCetiE_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Gem = addCompressAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            SmallOre_Gem.VegaB_SmallOre);
        ItemStack[] Fake_T8_VegaB_Gem_Checked = checkItemStack(Fake_T8_VegaB_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L),
            Fake_T8_VegaB_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Gem = addCompressAggregateArray(
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Mytryl_Vein);
        ItemStack[] Fake_T9_Anubis_Gem_Checked = checkItemStack(Fake_T9_Anubis_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L),
            Fake_T9_Anubis_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Gem = addCompressAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Almandine_Sapphire_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Quantium_Vein,
            SmallOre_Gem.Horus_SmallOre);
        ItemStack[] Fake_T9_Horus_Gem_Checked = checkItemStack(Fake_T9_Horus_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L),
            Fake_T9_Horus_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Gem = addCompressAggregateArray(
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            Vein_Gem.Quantium_Vein);
        ItemStack[] Fake_T9_Maahes_Gem_Checked = checkItemStack(Fake_T9_Maahes_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L),
            Fake_T9_Maahes_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Gem = addCompressAggregateArray(
            Vein_Gem.Draconium_Awakened_Draconium_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.MehenBelt_SmallOre);
        ItemStack[] Fake_T9_MehenBelt_Gem_Checked = checkItemStack(Fake_T9_MehenBelt_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L),
            Fake_T9_MehenBelt_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Gem = addCompressAggregateArray(
            Vein_Gem.Dilithium_Vein,
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[] Fake_T9_Neper_Gem_Checked = checkItemStack(Fake_T9_Neper_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L),
            Fake_T9_Neper_Gem_Checked,
            "Singularity with Void Gem Mode");

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Gem = addCompressAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] Fake_T9_Seth_Gem_Checked = checkItemStack(Fake_T9_Seth_Gem);
        addItemDisplay(
            addFakeVoidGemRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L),
            Fake_T9_Seth_Gem_Checked,
            "Singularity with Void Gem Mode");
    }

    public static void addFakeVoidGemRecipes_T10() {
        // T10 - DeepDark - DD
        ItemStack[] resources = SingularityGemRecipes.VoidGemRecipes_T10.get("DD");
        if (resources == null) {
            throw new IllegalStateException("Build the T10 gem catalog before registering its NEI recipes");
        }
        ItemStack[] Fake_T10_Gem_Checked = RegisteredResourceCatalog.copyItems(resources);
        addItemDisplay(
            addFakeVoidGemRecipes_T10,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L),
            Fake_T10_Gem_Checked,
            "Singularity with Void Gem Mode");
    }
}
