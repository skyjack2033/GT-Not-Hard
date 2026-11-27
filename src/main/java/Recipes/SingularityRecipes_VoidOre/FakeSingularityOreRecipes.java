package Recipes.SingularityRecipes_VoidOre;

import static Recipes.SingularityNEICatalog.addItemDisplay;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static util.AggregateItemStackArray.addCompressAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import net.minecraft.item.ItemStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;
import util.RecipesFrontend.ResourceCatalogFrontend;
import util.RegisteredResourceCatalog;

public class FakeSingularityOreRecipes {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes = RecipeMapBuilder
        .of("Singularity of Void Ore")
        .maxIO(1, ResourceCatalogFrontend.OUTPUTS_PER_PAGE, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T0 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T1 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T2 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T3 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T4 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T5 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T6 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T7 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T8 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T9 = addFakeVoidOreRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T10 = addFakeVoidOreRecipes;

    public static void addFakeVoidOreRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Ore = addCompressAggregateArray(
            Vein.Chalcopyrite_Vermiculite_Vein,
            Vein.Oilsands_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Redstone_Vein,
            Vein.Kyanite_Mica_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Apatite_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Magnetite_Vein,
            Vein.Cassiterite_Tin_Vein,
            Vein.Rock_Salt_Salt_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Coal_Vein,
            Vein.Dolomite_Vein,
            Vein.Soapstone_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Kaolinite_Vein,
            Vein.Lignite_Coal_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Overworld_SmallOre);
        ItemStack[] Fake_T0_Overworld_Ore_Checked = checkItemStack(Fake_T0_Overworld_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L),
            Fake_T0_Overworld_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Redstone_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Sulfur_Vein,
            Vein.Quartzite_Vein,
            Vein.Beryllium_Vein,
            Vein.Saltpeter_Electrotine_Vein,
            Vein.Nether_Quartz_Vein,
            SmallOre.Nether_SmallOre);
        ItemStack[] Fake_T0_Nether_Ore_Checked = checkItemStack(Fake_T0_Nether_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L),
            Fake_T0_Nether_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Apatite_Vein,
            Vein.Magnetite_Vein,
            Vein.Rock_Salt_Salt_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Terra_Aer_Vein,
            Vein.Coal_Vein,
            Vein.Almandine_Sapphire_Vein,
            Vein.Galena_Cryolite_Vein,
            Vein.Soapstone_Vein,
            Vein.Perditio_Ordo_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Tin_Cassiterite_Vein,
            Vein.Aqua_Ignis_Amber_Vein,
            SmallOre.Twilight_SmallOre);
        ItemStack[] Fake_T0_Twilight_Ore_Checked = checkItemStack(Fake_T0_Twilight_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L),
            Fake_T0_Twilight_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.TheEnd_SmallOre);
        ItemStack[] Fake_T0_TheEnd_Ore_Checked = checkItemStack(Fake_T0_TheEnd_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L),
            Fake_T0_TheEnd_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Naquadah_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Sheldonite_Platinum_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.EndAsteroid_SmallOre);
        ItemStack[] Fake_T0_EndAsteroid_Ore_Checked = checkItemStack(Fake_T0_EndAsteroid_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T0,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L),
            Fake_T0_EndAsteroid_Ore_Checked,
            "Singularity with Void Ore Mode");

        addDimensionRecipes("Eg", SingularityOreRecipes.VoidOreRecipes_T0.get("Eg"), addFakeVoidOreRecipes_T0);
    }

    public static void addFakeVoidOreRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Bauxite_Vein,
            Vein.Galena_Vein,
            Vein.Ilmenite_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Moon_SmallOre);
        ItemStack[] Fake_T1_Moon_Ore_Checked = checkItemStack(Fake_T1_Moon_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T1,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L),
            Fake_T1_Moon_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Ore = addCompressAggregateArray(
            Vein.Bastnasite_Monazite_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Oriharukon_Vein,
            Vein.Magnetite_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Sulfur_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Draconium_Vein,
            SmallOre.Deimos_SmallOre);
        ItemStack[] Fake_T2_Deimos_Ore_Checked = checkItemStack(Fake_T2_Deimos_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L),
            Fake_T2_Deimos_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Ore = addCompressAggregateArray(
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Redstone_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Arsenic_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Rock_Salt_Salt_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Sulfur_Vein,
            Vein.Desh_Vein,
            Vein.Magnetite_Gold_Vein,
            SmallOre.Mars_SmallOre);
        ItemStack[] Fake_T2_Mars_Ore_Checked = checkItemStack(Fake_T2_Mars_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L),
            Fake_T2_Mars_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Oriharukon_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Sulfur_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Draconium_Vein,
            Vein.Magnetite_Gold_Vein,
            SmallOre.Phobos_SmallOre);
        ItemStack[] Fake_T2_Phobos_Ore_Checked = checkItemStack(Fake_T2_Phobos_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T2,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L),
            Fake_T2_Phobos_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Ore = addCompressAggregateArray(
            Vein.Carbon_Dioxide_Vein,
            Vein.Oxygen_Vein,
            Vein.Sulfur_Dioxide_Vein,
            Vein.Bauxite_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Naquadah_Vein,
            Vein.Methane_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Nitrogen_Vein,
            Vein.Sheldonite_Platinum_Vein,
            SmallOre.Asteroids_SmallOre);
        ItemStack[] Fake_T3_Asteroids_Ore_Checked = checkItemStack(Fake_T3_Asteroids_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L),
            Fake_T3_Asteroids_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Ore = addCompressAggregateArray(
            Vein.Uranium238_Plutonium239_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Magnetite_Gold_Vein,
            SmallOre.Callisto_SmallOre);
        ItemStack[] Fake_T3_Callisto_Ore_Checked = checkItemStack(Fake_T3_Callisto_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L),
            Fake_T3_Callisto_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Ore = addCompressAggregateArray(
            Vein.Uranium238_Plutonium239_Vein,
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Magnetite_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Soapstone_Vein,
            Vein.Beryllium_Vein,
            Vein.Saltpeter_Electrotine_Vein,
            SmallOre.Ceres_SmallOre);
        ItemStack[] Fake_T3_Ceres_Ore_Checked = checkItemStack(Fake_T3_Ceres_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L),
            Fake_T3_Ceres_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Ore = addCompressAggregateArray(
            Vein.Magnesite_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Chrome_Vein,
            Vein.Ledox_Vein,
            Vein.Cassiterite_Tin_Vein);
        ItemStack[] Fake_T3_Europa_Ore_Checked = checkItemStack(Fake_T3_Europa_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L),
            Fake_T3_Europa_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Ore = addCompressAggregateArray(
            Vein.Uranium238_Plutonium239_Vein,
            Vein.Redstone_Vein,
            Vein.Bauxite_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            SmallOre.Ganymede_SmallOre);
        ItemStack[] Fake_T3_Ganymede_Ore_Checked = checkItemStack(Fake_T3_Ganymede_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L),
            Fake_T3_Ganymede_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Ore = addCompressAggregateArray(
            Vein.Arsenopyrite_Vein,
            Vein.Hedenbergite_Vein,
            Vein.Olenite_Vein,
            Vein.Forsterite_Vein,
            Vein.Djurleite_Vein,
            Vein.Thorianite_Vein,
            Vein.Graphite_Vein,
            Vein.Fayalite_Vein,
            Vein.Ferberite_Vein,
            Vein.Bismutite_Vein);
        ItemStack[] Fake_T3_Ross128b_Ore_Checked = checkItemStack(Fake_T3_Ross128b_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T3,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L),
            Fake_T3_Ross128b_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Ore = addCompressAggregateArray(
            Vein.Uranium238_Plutonium239_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Pyrolusite_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Magnetite_Vein,
            Vein.Sulfur_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Mytryl_Vein,
            Vein.Nickel_Iridium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Io_SmallOre);
        ItemStack[] Fake_T4_Io_Ore_Checked = checkItemStack(Fake_T4_Io_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L),
            Fake_T4_Io_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Redstone_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Naquadah_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Draconium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Nickel_Iridium_Vein,
            SmallOre.Mercury_SmallOre);
        ItemStack[] Fake_T4_Mercury_Ore_Checked = checkItemStack(Fake_T4_Mercury_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L),
            Fake_T4_Mercury_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Ore = addCompressAggregateArray(
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Redstone_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            Vein.Sulfur_Vein,
            Vein.Beryllium_Vein,
            Vein.Rutile_Vein,
            Vein.Quantium_Vein,
            Vein.Nickel_Iridium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Venus_SmallOre);
        ItemStack[] Fake_T4_Venus_Ore_Checked = checkItemStack(Fake_T4_Venus_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T4,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L),
            Fake_T4_Venus_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Ore = addCompressAggregateArray(
            Vein.Bastnasite_Monazite_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Ledox_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Vanadium_Vein,
            Vein.Nickel_Iridium_Vein,
            SmallOre.Enceladus_SmallOre);
        ItemStack[] Fake_T5_Enceladus_Ore_Checked = checkItemStack(Fake_T5_Enceladus_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L),
            Fake_T5_Enceladus_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Ore = addCompressAggregateArray(
            Vein.Redstone_Vein,
            Vein.Pyrolusite_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Desh_Vein,
            Vein.Draconium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Nickel_Iridium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Miranda_SmallOre);
        ItemStack[] Fake_T5_Miranda_Ore_Checked = checkItemStack(Fake_T5_Miranda_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L),
            Fake_T5_Miranda_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Ore = addCompressAggregateArray(
            Vein.Tungsten_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Platinum_Palladium_Vein,
            SmallOre.Oberon_SmallOre);
        ItemStack[] Fake_T5_Oberon_Ore_Checked = checkItemStack(Fake_T5_Oberon_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L),
            Fake_T5_Oberon_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Naquadah_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Beryllium_Vein,
            Vein.Rutile_Vein,
            Vein.Nickel_Iridium_Vein,
            SmallOre.Titan_SmallOre);
        ItemStack[] Fake_T5_Titan_Ore_Checked = checkItemStack(Fake_T5_Titan_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L),
            Fake_T5_Titan_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Ore = addCompressAggregateArray(
            Vein.BArTiMaEuSNeK_Vein,
            Vein.Amethyst_Vein,
            Vein.Djurleite_Vein,
            Vein.Galena_Vein,
            Vein.Fayalite_Vein,
            Vein.Ferberite_Vein,
            Vein.Tiberium_Vein,
            Vein.Olenite_Vein);
        ItemStack[] Fake_T5_Ross128ba_Ore_Checked = checkItemStack(Fake_T5_Ross128ba_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T5,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L),
            Fake_T5_Ross128ba_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Tungsten_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Bauxite_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            SmallOre.Proteus_SmallOre);
        ItemStack[] Fake_T6_Proteus_Ore_Checked = checkItemStack(Fake_T6_Proteus_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T6,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L),
            Fake_T6_Proteus_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Ore = addCompressAggregateArray(
            Vein.Tungsten_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Galena_Vein,
            Vein.Niobium_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Thorium_Vein,
            Vein.Neutronium_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Nickel_Iridium_Vein,
            SmallOre.Triton_SmallOre);
        ItemStack[] Fake_T6_Triton_Ore_Checked = checkItemStack(Fake_T6_Triton_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T6,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L),
            Fake_T6_Triton_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Ore = addCompressAggregateArray(
            Vein.Pitchblende_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Bauxite_Vein,
            Vein.Garnet_Sand_Nether_Star_Vein,
            Vein.Naquadah_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Thorium_Vein,
            Vein.Neutronium_Vein,
            Vein.Beryllium_Vein,
            SmallOre.Haumea_SmallOre);
        ItemStack[] Fake_T7_Haumea_Ore_Checked = checkItemStack(Fake_T7_Haumea_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L),
            Fake_T7_Haumea_Ore_Checked,
            "Singularity with Void Ore Mode");

        addDimensionRecipes("KB", SingularityOreRecipes.VoidOreRecipes_T7.get("KB"), addFakeVoidOreRecipes_T7);

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Ore = addCompressAggregateArray(
            Vein.Pitchblende_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Bauxite_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Niobium_Vein,
            Vein.Magnetite_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            Vein.Beryllium_Vein,
            SmallOre.Makemake_SmallOre);
        ItemStack[] Fake_T7_Makemake_Ore_Checked = checkItemStack(Fake_T7_Makemake_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L),
            Fake_T7_Makemake_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Tungsten_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Bauxite_Vein,
            Vein.Brown_Limonite_Iron_Vein,
            Vein.Naquadah_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Thorium_Vein,
            Vein.Neutronium_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Beryllium_Vein,
            SmallOre.Pluto_SmallOre);
        ItemStack[] Fake_T7_Pluto_Ore_Checked = checkItemStack(Fake_T7_Pluto_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T7,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L),
            Fake_T7_Pluto_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Ore = addCompressAggregateArray(
            Vein.Oilsands_Vein,
            Vein.Tungsten_Vein,
            Vein.Kyanite_Mica_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Arsenic_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Rock_Salt_Salt_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Samarium_Vein,
            Vein.Lignite_Coal_Vein);
        ItemStack[] Fake_T8_BarnardC_Ore_Checked = checkItemStack(Fake_T8_BarnardC_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L),
            Fake_T8_BarnardC_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Ore = addCompressAggregateArray(
            Vein.Wulfenite_Molybdenum_Vein,
            Vein.Tungsten_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Garnet_Sand_Nether_Star_Vein,
            Vein.Naquadah_Vein,
            Vein.Magnetite_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Cadmium_Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Neutronium_Vein,
            SmallOre.BarnardE_SmallOre);
        ItemStack[] Fake_T8_BarnardE_Ore_Checked = checkItemStack(Fake_T8_BarnardE_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L),
            Fake_T8_BarnardE_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Ore = addCompressAggregateArray(
            Vein.Tungsten_Vein,
            Vein.Grossular_Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Redstone_Vein,
            Vein.Bastnasite_Monazite_Vein,
            Vein.Chalcopyrite_Copper_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Naquadah_Vein,
            Vein.Niobium_Vein,
            Vein.Graphite_Diamond_Vein,
            Vein.Cadmium_Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Beryllium_Vein,
            SmallOre.BarnardF_SmallOre);
        ItemStack[] Fake_T8_BarnardF_Ore_Checked = checkItemStack(Fake_T8_BarnardF_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L),
            Fake_T8_BarnardF_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Ore = addCompressAggregateArray(
            Vein.Grossular_Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Redstone_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Cassiterite_Tin_Vein,
            Vein.Sulfur_Vein,
            Vein.Samarium_Vein,
            Vein.Cadmium_Rare_Earth_Vein,
            Vein.Beryllium_Vein,
            Vein.Saltpeter_Electrotine_Vein,
            Vein.Nether_Quartz_Vein);
        ItemStack[] Fake_T8_Centauri_Ore_Checked = checkItemStack(Fake_T8_Centauri_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L),
            Fake_T8_Centauri_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Ore = addCompressAggregateArray(
            Vein.Oilsands_Vein,
            Vein.Magnesite_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Bauxite_Vein,
            Vein.Garnet_Sand_Nether_Star_Vein,
            Vein.Apatite_Vein,
            Vein.Magnetite_Vein,
            Vein.Rock_Salt_Salt_Vein,
            Vein.Ilmenite_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Kaolinite_Vein,
            Vein.Chrome_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.TCetiE_SmallOre);
        ItemStack[] Fake_T8_TCetiE_Ore_Checked = checkItemStack(Fake_T8_TCetiE_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L),
            Fake_T8_TCetiE_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Ore = addCompressAggregateArray(
            Vein.Pitchblende_Vein,
            Vein.Redstone_Vein,
            Vein.Gold_Infused_Gold_Vein,
            Vein.Arsenic_Vein,
            Vein.Garnet_Sand_Nether_Star_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            Vein.Niobium_Vein,
            Vein.Scheelite_Tungstate_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Cadmium_Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            Vein.Magnetite_Gold_Vein,
            SmallOre.VegaB_SmallOre);
        ItemStack[] Fake_T8_VegaB_Ore_Checked = checkItemStack(Fake_T8_VegaB_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T8,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L),
            Fake_T8_VegaB_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Ore = addCompressAggregateArray(
            Vein.Neutronium_Infinity_Catalyst_Vein,
            Vein.Kyanite_Mica_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Sulfur_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Desh_Vein,
            Vein.Galena_Cryolite_Vein,
            Vein.Dolomite_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Soapstone_Vein,
            Vein.Mytryl_Vein,
            Vein.Rutile_Vein,
            SmallOre.Anubis_SmallOre);
        ItemStack[] Fake_T9_Anubis_Ore_Checked = checkItemStack(Fake_T9_Anubis_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L),
            Fake_T9_Anubis_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Ore = addCompressAggregateArray(
            Vein.Magnesite_Vein,
            Vein.Quartzite_Quartz_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Neutronium_Cosmic_Neutronium_Vein,
            Vein.Garnet_Sand_Nether_Star_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Oriharukon_Vein,
            Vein.Ledox_Vein,
            Vein.Certus_Quartz_Vein,
            Vein.Draconium_Vein,
            Vein.Almandine_Sapphire_Vein,
            Vein.Mytryl_Vein,
            Vein.Quantium_Vein,
            SmallOre.Horus_SmallOre);
        ItemStack[] Fake_T9_Horus_Ore_Checked = checkItemStack(Fake_T9_Horus_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L),
            Fake_T9_Horus_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Ore = addCompressAggregateArray(
            Vein.Naquadah_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Naquadah_Naquadria_Vein,
            Vein.Galena_Cryolite_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Vanadium_Vein,
            Vein.Soapstone_Vein,
            Vein.Neutronium_Vein,
            Vein.Sheldonite_Platinum_Vein,
            Vein.Quantium_Vein,
            Vein.Chrome_Vein);
        ItemStack[] Fake_T9_Maahes_Ore_Checked = checkItemStack(Fake_T9_Maahes_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L),
            Fake_T9_Maahes_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Ore = addCompressAggregateArray(
            Vein.Draconium_Awakened_Draconium_Vein,
            Vein.Garnierite_Nickel_Vein,
            Vein.Uraninite_Uranium238_Vein,
            Vein.Lazurite_Lapis_Vein,
            Vein.Bentonite_Olivine_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Neutronium_Vein,
            Vein.Sheldonite_Platinum_Vein,
            Vein.Nickel_Iridium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.MehenBelt_SmallOre);
        ItemStack[] Fake_T9_MehenBelt_Ore_Checked = checkItemStack(Fake_T9_MehenBelt_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L),
            Fake_T9_MehenBelt_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Ore = addCompressAggregateArray(
            Vein.Tungsten_Vein,
            Vein.Dilithium_Vein,
            Vein.Kyanite_Mica_Vein,
            Vein.Arsenic_Vein,
            Vein.Terra_Aer_Vein,
            Vein.Certus_Quartz_Vein,
            Vein.Quartzite_Vein,
            Vein.Dolomite_Vein,
            Vein.Perditio_Ordo_Vein,
            Vein.Kaolinite_Vein,
            Vein.Aqua_Ignis_Amber_Vein,
            Vein.Nether_Quartz_Vein);
        ItemStack[] Fake_T9_Neper_Ore_Checked = checkItemStack(Fake_T9_Neper_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L),
            Fake_T9_Neper_Ore_Checked,
            "Singularity with Void Ore Mode");

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Ore = addCompressAggregateArray(
            Vein.Bastnasite_Monazite_Vein,
            Vein.Bauxite_Vein,
            Vein.Raw_Tengam_Vein,
            Vein.Magnetite_Vein,
            Vein.Nickel_Osmium_Vein,
            Vein.Samarium_Vein,
            Vein.Draconium_Vein,
            Vein.Platinum_Palladium_Vein,
            Vein.Magnetite_Gold_Vein,
            Vein.Nickel_Iridium_Vein,
            Vein.Tin_Cassiterite_Vein,
            SmallOre.Seth_SmallOre);
        ItemStack[] Fake_T9_Seth_Ore_Checked = checkItemStack(Fake_T9_Seth_Ore);
        addItemDisplay(
            addFakeVoidOreRecipes_T9,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L),
            Fake_T9_Seth_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    public static void addFakeVoidOreRecipes_T10() {
        // T10 - DeepDark - DD
        ItemStack[] resources = SingularityOreRecipes.VoidOreRecipes_T10.get("DD");
        if (resources == null) {
            throw new IllegalStateException("Build the T10 ore catalog before registering its NEI recipes");
        }
        ItemStack[] Fake_T10_Ore_Checked = RegisteredResourceCatalog.copyItems(resources);
        addItemDisplay(
            addFakeVoidOreRecipes_T10,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L),
            Fake_T10_Ore_Checked,
            "Singularity with Void Ore Mode");
    }

    private static void addDimensionRecipes(String abbreviation, ItemStack[] resources,
        RecipeMap<RecipeMapBackend> recipeMap) {
        addItemDisplay(
            recipeMap,
            getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_" + abbreviation, 1L),
            checkItemStack(resources),
            "Singularity with Void Ore Mode");
    }
}
