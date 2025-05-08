package util;

import static gregtech.api.enums.Mods.AE2FluidCraft;
import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.AvaritiaAddons;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.GTNHIntergalactic;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.OpenComputers;
import static gregtech.api.enums.Mods.ProjectRedFabrication;
import static gregtech.api.enums.Mods.SGCraft;
import static gregtech.api.enums.Mods.SuperSolarPanels;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.recipe.maps.AssemblyLineFrontend;

public class ChaosXtremeCraftingRecipes {

    public static final RecipeMap<RecipeMapBackend> addChaosXtremeCraftingRecipes = RecipeMapBuilder
        .of("Chaos of Xtreme Crafting", RecipeMapBackend::new)
        .maxIO(16, 1, 4, 0)
        .minInputs(1, 0)
        .useSpecialSlot()
        .neiTransferRect(88, 8, 18, 72)
        .neiTransferRect(124, 8, 18, 72)
        .neiTransferRect(142, 26, 18, 18)
        .frontend(AssemblyLineFrontend::new)
        // .disableOptimize()
        .build();

    public static void addChaosXtremeCraftingRecipes() {
        // Witchery
        {
            // 无限之蛋
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(Witchery.ID, "chalkinfernal", 4L),
                    getModItem(Witchery.ID, "chalkotherwhere", 4L),
                    getModItem(Witchery.ID, "ingredient", 6L, 23),
                    getModItem(Minecraft.ID, "dragon_egg", 4L),
                    getModItem(Witchery.ID, "stew", 1L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 28),
                    FluidRegistry.getFluidStack("molten.infinity", 144 * 20))
                .itemOutputs(getModItem(Witchery.ID, "infinityegg", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // Avaritia
        {
            // 无尽之锭
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Avaritia.ID, "Resource", 10L, 1), getModItem(Avaritia.ID, "Resource", 11L, 5))
                .fluidInputs(FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 24))
                .itemOutputs(getModItem(Avaritia.ID, "Resource", 1L, 6))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 无尽箱子
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(Avaritia.ID, "Resource", 36L, 0),
                    getModItem(GregTech.ID, "gt.blockmachines", 18L, 129),
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 10L, 60),
                    getModItem(Avaritia.ID, "Resource", 2L, 5))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9 * 6),
                    FluidRegistry.getFluidStack("molten.infinity", 144 * (9 * 4 + 4)),
                    FluidRegistry.getFluidStack("molten.spacetime", 72))
                .itemOutputs(getModItem(AvaritiaAddons.ID, "InfinityChest", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // AppliedEnergistics2
        {
            // ME量子存储元件
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 8L, 60),
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 4L },
                    getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 61))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9 * 4),
                    FluidRegistry.getFluidStack("molten.neutronium", 144 * 9 * 8))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Quantum", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 中子能源元件
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(AppliedEnergistics2.ID, "tile.BlockDenseEnergyCell", 36L),
                    getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorItemAdvEmeraldCore", 12L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9),
                    FluidRegistry.getFluidStack("molten.infinity", 144 * 32))
                .itemOutputs(getModItem(AppliedEnergistics2.ID, "tile.BlockCreativeEnergyCell", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
            /*
             * // 奇点合成存储器
             * GTValues.RA.stdBuilder()
             * .itemInputs(
             * getModItem(AppliedEnergistics2.ID, "tile.BlockCreativeEnergyCell", 4L),
             * getModItem(NewHorizonsCoreMod.ID, "item.PikoCircuit", 8L),
             * getModItem(GregTech.ID, "gt.metaitem.01", 12L, 32045),
             * getModItem(DraconicEvolution.ID, "reactorStabilizer", 8L),
             * getModItem(GregTech.ID, "gt.metaitem.03", 4L, 4581),
             * getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingUnit", 4L, 0),
             * getModItem(NewHorizonsCoreMod.ID, "item.ItemExtremeStorageCell.Singularity", 1L))
             * .fluidInputs(
             * FluidRegistry.getFluidStack("molten.infinity", 144 * 9 * 24),
             * FluidRegistry.getFluidStack("molten.spacetime", 144 * 14))
             * .itemOutputs(getModItem(AppliedEnergistics2.ID, "tile.BlockSingularityCraftingStorage", 1L, 0))
             * .duration(SECONDS)
             * .eut(RECIPE_LV)
             * .addTo(addChaosXtremeCraftingRecipes);
             */
        }

        // AE2FluidCraft
        {
            // ME量子流体存储元件
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(AE2FluidCraft.ID, "fluid_part", 8L, 7),
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 4L },
                    getModItem(AE2FluidCraft.ID, "fluid_storage_housing", 1L, 1))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9 * 4),
                    FluidRegistry.getFluidStack("molten.neutronium", 144 * 9 * 8))
                .itemOutputs(getModItem(AE2FluidCraft.ID, "fluid_storage.quantum", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // ME无限水流体存储元件
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(Avaritia.ID, "Resource", 4L, 5),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32677),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6083),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6317),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6389),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6390),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6582),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 6952),
                    getModItem(AE2FluidCraft.ID, "fluid_storage_housing", 1L, 1))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9 * 8),
                    FluidRegistry.getFluidStack("water", 1000 * 1000))
                .itemOutputs(getModItem(AE2FluidCraft.ID, "fluid_storage.infinity.water", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // ThaumicEnergistics
        {
            // ME源质量子存储元件
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(ThaumicEnergistics.ID, "storage.component", 8L, 8),
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 4L },
                    getModItem(ThaumicEnergistics.ID, "storage.casing", 1L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9 * 4),
                    FluidRegistry.getFluidStack("molten.neutronium", 144 * 9 * 8))
                .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 9))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }
        /*
         * // EnderIO
         * {
         * // 混沌电容库
         * GTValues.RA.stdBuilder()
         * .itemInputs(
         * getModItem(EnderIO.ID, "BlockCapBank", 44L, 3),
         * getModItem(EnderIO.ID, "itemMaterial", 16L, 6),
         * getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 4L, 0),
         * getModItem(DraconicEvolution.ID, "chaoticCore", 1L))
         * .fluidInputs(
         * FluidRegistry.getFluidStack("molten.vibrantalloy", 144 * 4),
         * FluidRegistry.getFluidStack("molten.neutronium", 144 * 12))
         * .itemOutputs(getModItem(EnderIO.ID, "BlockCapBank", 1L, 0))
         * .duration(SECONDS)
         * .eut(RECIPE_LV)
         * .addTo(addChaosXtremeCraftingRecipes);
         * }
         */
        // OpenComputers
        {/*
          * // 创造模式内存
          * GTValues.RA.stdBuilder()
          * .itemInputs(
          * getModItem(OpenComputers.ID, "item", 24L, 39),
          * new Object[] { OrePrefixes.circuit.get(Materials.UEV), 6L },
          * getModItem(GregTech.ID, "gt.metaitem.03", 20L, 32163),
          * getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
          * getModItem(OpenComputers.ID, "item", 2L, 103),
          * getModItem(Avaritia.ID, "big_pearl", 1L))
          * .fluidInputs(
          * FluidRegistry.getFluidStack("molten.infinity", 144 * 2),
          * FluidRegistry.getFluidStack("molten.neutronium", 144 * 25),
          * FluidRegistry.getFluidStack("molten.electrumflux", 144 * 14))
          * .itemOutputs(getModItem(OpenComputers.ID, "computronics.ocSpecialParts", 1L, 0))
          * .duration(SECONDS)
          * .eut(RECIPE_LV)
          * .addTo(addChaosXtremeCraftingRecipes);
          */
            // T3加速处理器(APU)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    new Object[] { OrePrefixes.circuit.get(Materials.IV), 16L },
                    new Object[] { OrePrefixes.circuit.get(Materials.LuV), 4L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 2L },
                    getModItem(OpenComputers.ID, "item", 1L, 10),
                    getModItem(OpenComputers.ID, "item", 1L, 43),
                    getModItem(OpenComputers.ID, "item", 1L, 102))
                .itemOutputs(getModItem(OpenComputers.ID, "item", 1L, 103))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // T3微控制器外壳
            GTValues.RA.stdBuilder()
                .itemInputs(
                    new Object[] { OrePrefixes.circuit.get(Materials.IV), 2L },
                    new Object[] { OrePrefixes.circuit.get(Materials.LuV), 4L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 2L },
                    getModItem(IndustrialCraft2.ID, "blockGenerator", 1L, 6))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.electrum", 144 * 16),
                    FluidRegistry.getFluidStack("molten.obsidian", 144 * 9 * 12),
                    FluidRegistry.getFluidStack("molten.plutonium", 144 * 6))
                .itemOutputs(getModItem(OpenComputers.ID, "item", 1L, 90))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // T3无人机外壳
            GTValues.RA.stdBuilder()
                .itemInputs(
                    new Object[] { OrePrefixes.circuit.get(Materials.IV), 4L },
                    new Object[] { OrePrefixes.circuit.get(Materials.LuV), 6L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 2L },
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32606),
                    getModItem(OpenComputers.ID, "item", 1L, 90))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.chrome", 144 * 6 * 6),
                    FluidRegistry.getFluidStack("endergoo", 400))
                .itemOutputs(getModItem(OpenComputers.ID, "item", 1L, 91))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // ProjectRedFabrication
        {
            // 创造模式IC芯片
            GTValues.RA.stdBuilder()
                .itemInputs(
                    new Object[] { OrePrefixes.circuit.get(Materials.LuV), 24L },
                    new Object[] { OrePrefixes.circuit.get(Materials.ZPM), 16L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 4L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 4L },
                    getModItem(OpenComputers.ID, "item", 1L, 43))
                .fluidInputs(FluidRegistry.getFluidStack("molten.neutronium", 144 * 32))
                .itemOutputs(getModItem(ProjectRedFabrication.ID, "projectred.fabrication.icchip", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // DraconicEvolution
        {
            // 双足飞龙通量电容器
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 8L, 2021),
                    getModItem(DraconicEvolution.ID, "draconiumEnergyCore", 4L, 0),
                    getModItem(DraconicEvolution.ID, "wyvernCore", 1L),
                    getModItem(EnderIO.ID, "blockCapBank", 4L, 3))
                .fluidInputs(FluidRegistry.getFluidStack("molten.draconium", 144 * 12))
                .itemOutputs(getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 1L, 0))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 龙之通量电容器
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 8L, 2022),
                    getModItem(NewHorizonsCoreMod.ID, "item.EnrichedNaquadriaSunnariumAlloy", 4L),
                    getModItem(DraconicEvolution.ID, "draconiumEnergyCore", 3L, 1),
                    getModItem(DraconicEvolution.ID, "awakenedCore", 1L),
                    getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 1L, 0))
                .fluidInputs(FluidRegistry.getFluidStack("molten.draconiumawakened", 144 * 12))
                .itemOutputs(getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 反应堆稳定器转子
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(NewHorizonsCoreMod.ID, "item.EngravedEnergyChip", 15L),
                    getModItem(DraconicEvolution.ID, "wyvernCore", 2L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.draconiumawakened", 144 * 4))
                .itemOutputs(getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 反应堆稳定器外转子
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17975),
                    getModItem(NewHorizonsCoreMod.ID, "item.EngravedDiamondCrystalChip", 15L),
                    getModItem(DraconicEvolution.ID, "draconicCore", 2L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.draconium", 144 * 4))
                .itemOutputs(getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 2))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
            /*
             * // 反应堆稳定器转子总成
             * GTValues.RA.stdBuilder()
             * .itemInputs(
             * getModItem(GregTech.ID, "gt.blockcasing4", 4L, 7),
             * getModItem(DraconicEvolution.ID, "reactorCraftingPart", 10L, 1),
             * getModItem(DraconicEvolution.ID, "reactorCraftingPart", 10L, 2),
             * getModItem(DraconicEvolution.ID, "wyvernCore", 1L))
             * .fluidInputs(FluidRegistry.getFluidStack("molten.draconium", 144 * 16))
             * .itemOutputs(getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 3))
             * .duration(SECONDS)
             * .eut(RECIPE_LV)
             * .addTo(addChaosXtremeCraftingRecipes);
             */
            // 反应堆稳定器聚能环
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 24506),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24500),
                    getModItem(DraconicEvolution.ID, "reactorCraftingPart", 4L, 1),
                    getModItem(DraconicEvolution.ID, "reactorCraftingPart", 4L, 2),
                    getModItem(DraconicEvolution.ID, "wyvernCore", 4L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.rosegold", 144 * 10))
                .itemOutputs(getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 4))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 反应堆稳定器支架
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(DraconicEvolution.ID, "awakenedCore", 1L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.blackplutonium", 144 * 52),
                    FluidRegistry.getFluidStack("molten.draconiumawakened", 144 * 8))
                .itemOutputs(getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 0))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 反应堆稳定器
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 4L, 1),
                    getModItem(DraconicEvolution.ID, "chaoticCore", 1L),
                    getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 3),
                    getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 4),
                    getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 0))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.manyullyn", 144 * 16),
                    FluidRegistry.getFluidStack("molten.cosmicneutronium", 144 * 9),
                    FluidRegistry.getFluidStack("molten.blackplutonium", 144 * 4),
                    FluidRegistry.getFluidStack("molten.draconiumawakened", 144 * 17))
                .itemOutputs(getModItem(DraconicEvolution.ID, "reactorStabilizer", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 错位宝石
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32059),
                    getModItem(DraconicEvolution.ID, "draconicCore", 2L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.europium", 144 * 4),
                    FluidRegistry.getFluidStack("molten.draconium", 144 * 9 * 21),
                    FluidRegistry.getFluidStack("molten.naquadahalloy", 144 * 9 * 18))
                .itemOutputs(getModItem(DraconicEvolution.ID, "teleporterMKI", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 高级错位宝石
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32677),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32697),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32687),
                    getModItem(DraconicEvolution.ID, "teleporterMKI", 5L),
                    getModItem(DraconicEvolution.ID, "awakenedCore", 4L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.infinity", 144 * 8 * 4),
                    FluidRegistry.getFluidStack("molten.draconium", 144 * 9 * 32),
                    FluidRegistry.getFluidStack("molten.draconiumawakened", 144 * 9 * 6),
                    FluidRegistry.getFluidStack("molten.americium", 144 * 9 * 2))
                .itemOutputs(getModItem(DraconicEvolution.ID, "teleporterMKII", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 错位宝石底座
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(Minecraft.ID, "stone_slab", 10L, 0),
                    getModItem(Minecraft.ID, "blaze_rod", 2L),
                    getModItem(Minecraft.ID, "stone", 2L),
                    getModItem(DraconicEvolution.ID, "teleporterMKI", 1L),
                    getModItem(DraconicEvolution.ID, "infusedObsidian", 4L))
                .itemOutputs(getModItem(DraconicEvolution.ID, "teleporterStand", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 错位容器
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(DraconicEvolution.ID, "teleporterStand", 1L),
                    getModItem(DraconicEvolution.ID, "infusedObsidian", 4L),
                    getModItem(DraconicEvolution.ID, "draconicCore", 4L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.silver", 144 * 4),
                    FluidRegistry.getFluidStack("molten.draconium", 144 * 12))
                .itemOutputs(getModItem(DraconicEvolution.ID, "dislocatorReceptacle", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // GregTech
        {
            // 太阳能覆盖板(LV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 4L, 2320),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32751),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32034),
                    new Object[] { OrePrefixes.circuit.get(Materials.HV), 2L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedAluminiumPlate", 2L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.polytetrafluoroethylene", 144 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32752))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(MV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 4L, 2340),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32752),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32034),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32063),
                    new Object[] { OrePrefixes.circuit.get(Materials.EV), 2L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedTitaniumPlate", 2L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.epoxid", 144 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32753))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(HV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 4L, 2360),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32753),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32034),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32065),
                    new Object[] { OrePrefixes.circuit.get(Materials.IV), 4L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedTungstenPlate", 2L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.indiumgalliumphosphide", 144 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32754))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(EV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 6L, 2380),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32754),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32035),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32051),
                    new Object[] { OrePrefixes.circuit.get(Materials.LuV), 4L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedTungstenPlate", 2L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.siliconsolargrade", 144 * 3 * 4),
                    FluidRegistry.getFluidStack("molten.polybenzimidazole", 144 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32755))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(IV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 6L, 2400),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32755),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32034),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32035),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32053),
                    new Object[] { OrePrefixes.circuit.get(Materials.ZPM), 4L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedChromePlate", 2L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.siliconsolargrade", 144 * 4 * 4),
                    FluidRegistry.getFluidStack("molten.polybenzimidazole", 144 * 2 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32756))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(LuV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(SuperSolarPanels.ID, "solarsplitter", 2L),
                    getModItem(GregTech.ID, "gt.blockmachines", 8L, 2421),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32756),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32035),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32151),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32059),
                    new Object[] { OrePrefixes.circuit.get(Materials.ZPM), 4L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 2L },
                    getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 2L, 8))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.siliconsolargrade", 144 * 5 * 4),
                    FluidRegistry.getFluidStack("molten.polybenzimidazole", 144 * 3 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32757))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(ZPM)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(IndustrialCraft2.ID, "itemPartCarbonPlate", 4L),
                    getModItem(GregTech.ID, "gt.blockmachines", 12L, 2441),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32757),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32151),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32153),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32161),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32048),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32164),
                    new Object[] { OrePrefixes.circuit.get(Materials.UV), 2L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 2L },
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedNaquadriaPlate", 4L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.polybenzimidazole", 144 * 4 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32758))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 太阳能覆盖板(UV)
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(IndustrialCraft2.ID, "itemPartCarbonPlate", 4L),
                    getModItem(GregTech.ID, "gt.blockmachines", 18L, 2021),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32758),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32153),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32163),
                    getModItem(GregTech.ID, "gt.metaitem.03", 2L, 32068),
                    new Object[] { OrePrefixes.circuit.get(Materials.UHV), 2L },
                    new Object[] { OrePrefixes.circuit.get(Materials.UEV), 2L },
                    getModItem(NewHorizonsCoreMod.ID, "item.PicoWafer", 4L),
                    getModItem(NewHorizonsCoreMod.ID, "item.RawPicoWafer", 2L),
                    getModItem(NewHorizonsCoreMod.ID, "item.IrradiantReinforcedNeutroniumPlate", 4L))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.siliconsolargrade", 144 * 9 * 12),
                    FluidRegistry.getFluidStack("molten.polybenzimidazole", 144 * 9 * 2))
                .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32759))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }

        // SGCraft
        {
            // 星门导标升级
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32023),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32043),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32047),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32039),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateFramePart", 13L),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateChevron", 4L))
                .itemOutputs(getModItem(SGCraft.ID, "sgChevronUpgrade", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门虹膜叶片
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32023),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32146),
                    getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 4))
                .fluidInputs(
                    FluidRegistry.getFluidStack("molten.whitedwarfmatter", 144 * 64 * 26),
                    FluidRegistry.getFluidStack("molten.magmatter", 144 * 64 * 19))
                .itemOutputs(getModItem(SGCraft.ID, "sgIrisBlade", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门虹膜升级
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.03", 12L, 4143),
                    getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6143),
                    getModItem(SGCraft.ID, "sgIrisBlade", 24L),
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 12L, 14))
                .itemOutputs(getModItem(SGCraft.ID, "sgIrisUpgrade", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 吊炸天电容
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.metaitem.01", 3L, 32146),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32047),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32039),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateShieldingFoil", 12L),
                    getModItem(TecTech.ID, "gt.godforgecasing", 4L, 4),
                    getModItem(EnderIO.ID, "blockCapBank", 8L, 0))
                .itemOutputs(getModItem(SGCraft.ID, "ic2Capacitor", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门外环方块
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 9L, 14),
                    getModItem(GregTech.ID, "gt.metaitem.01", 9L, 32047),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateShieldingFoil", 11L),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateFramePart", 21L),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateChevron", 3L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 9 * 18))
                .itemOutputs(getModItem(SGCraft.ID, "stargateRing", 1L, 0))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门导标方块
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 12L, 14),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32047),
                    getModItem(TecTech.ID, "gt.godforgecasing", 4L, 7),
                    getModItem(SGCraft.ID, "sgChevronUpgrade", 4L),
                    getModItem(SGCraft.ID, "stargateRing", 1L, 0))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 9 * 16))
                .itemOutputs(getModItem(SGCraft.ID, "stargateRing", 1L, 1))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门底座方块
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GregTech.ID, "gt.blockmachines", 4L, 15410),
                    getModItem(GregTech.ID, "gt.blockmachines", 2L, 14006),
                    getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32047),
                    getModItem(GregTech.ID, "gt.metaitem.01", 8L, 32039),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32146),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 32758),
                    getModItem(GregTech.ID, "gt.metaitem.03", 4L, 4143),
                    getModItem(TecTech.ID, "gt.godforgecasing", 8L, 7),
                    getModItem(TecTech.ID, "item.tm.itemAstralArrayFabricator", 6L),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateShieldingFoil", 8L),
                    getModItem(SGCraft.ID, "sgCoreCrystal", 1L),
                    getModItem(SGCraft.ID, "stargateRing", 8L, 1),
                    getModItem(GTNHIntergalactic.ID, "item.MiningDrone", 2L, 12),
                    getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Universe", 1L),
                    getModItem(AE2FluidCraft.ID, "fluid_storage.Universe", 1L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 64 * 4))
                .itemOutputs(getModItem(SGCraft.ID, "stargateBase", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // RF星门能量单元
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 12L, 14),
                    getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32146),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32416),
                    getModItem(GregTech.ID, "gt.metaitem.03", 6L, 4143),
                    getModItem(GoodGenerator.ID, "compactFusionCoil", 10L, 4),
                    getModItem(SGCraft.ID, "ic2Capacitor", 1L),
                    getModItem(SGCraft.ID, "stargateRing", 1L, 0))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 9 * 18))
                .itemOutputs(getModItem(SGCraft.ID, "rfPowerUnit", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门OC接口
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 12L, 14),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32416),
                    getModItem(GregTech.ID, "gt.metaitem.03", 6L, 4143),
                    getModItem(GoodGenerator.ID, "compactFusionCoil", 10L, 4),
                    getModItem(GregTech.ID, "gt.blockmachines", 4L, 15445),
                    getModItem(AppliedEnergistics2.ID, "tile.BlockSingularityCraftingStorage", 1L, 0),
                    getModItem(SGCraft.ID, "stargateRing", 1L, 0))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 9 * 18))
                .itemOutputs(getModItem(SGCraft.ID, "ocInterface", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);

            // 星门控制器
            GTValues.RA.stdBuilder()
                .itemInputs(
                    getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 4L, 14),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32039),
                    getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32043),
                    getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32146),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateShieldingFoil", 6L),
                    getModItem(NewHorizonsCoreMod.ID, "item.StargateFramePart", 8L),
                    getModItem(SGCraft.ID, "ocInterface", 1L),
                    getModItem(SGCraft.ID, "sgControllerCrystal", 1L),
                    getModItem(OpenComputers.ID, "keyboard", 8L, 0),
                    getModItem(AE2FluidCraft.ID, "fluid_storage.Universe", 1L))
                .fluidInputs(FluidRegistry.getFluidStack("molten.magmatter", 144 * 9 * 15))
                .itemOutputs(getModItem(SGCraft.ID, "stargateController", 1L))
                .duration(SECONDS)
                .eut(RECIPE_LV)
                .addTo(addChaosXtremeCraftingRecipes);
        }
    }
}
