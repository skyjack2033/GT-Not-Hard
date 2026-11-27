package com.mofoga.gtnothard;

import static loader.MachinesLoader.loaderMachines;

import net.minecraft.command.CommandHandler;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mofoga.gtnothard.config.LargeAssemblyRecipeConfig;

import EnumList.EnumListCheck.EnumFluidListCheck;
import Recipes.ChaosRecipes.ChaosAntimatterRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosFallingTowerRecipes;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_CasingRecipe_Normal;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_HatchRecipe_Item;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_HatchRecipe_Normal;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_ItemRecipe_Item;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_ItemRecipe_Normal;
import Recipes.ChaosRecipes.ChaosOfAssemblyLine.ChaosAssemblyLine_MachineRecipe_Normal;
import Recipes.ChaosRecipes.ChaosOreRecipes;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosSpecialCompressRecipes;
import Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosRecipes.ChaosZhuHaiRecipes;
import Recipes.SingularityNEICatalog;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T10;
import Recipes.SingularityRecipes_VoidGem.SingularityGemRecipes;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes;
import Tools.FluidExporter;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import loader.CraftingLoader;
import util.ChaosAssemblyRecipeBuilder;
import util.MachineRecipeCatalog;
import util.OriginGeneratorRegistry;

@Mod(
    modid = MyMod.MODID,
    version = Tags.VERSION,
    name = "GT Not Hard",
    acceptedMinecraftVersions = "[1.7.10]",
    dependencies = "required-after:gregtech@[5.09.54.277,);required-after:gtnhlib@[0.11.58,)")
public class MyMod {

    public static final String MODID = "gtnothard";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "com.mofoga.gtnothard.ClientProxy", serverSide = "com.mofoga.gtnothard.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LargeAssemblyRecipeConfig.load(event.getModConfigurationDirectory());
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance()
            .bus()
            .register(this);
        loaderMachines();
        MachineRecipeCatalog.initialize();
        new CraftingLoader();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

        // Chaos Recipes
        registerAssemblyRecipeGroup(
            "ItemHatch",
            LargeAssemblyRecipeConfig.enabledItemRecipes,
            ChaosAssemblyLine_HatchRecipe_Item::addChaosAssemblyLine_HatchRecipe_Item);
        registerAssemblyRecipeGroup(
            "ItemItem",
            LargeAssemblyRecipeConfig.enabledItemRecipes,
            ChaosAssemblyLine_ItemRecipe_Item::addChaosAssemblyLine_ItemRecipe_Item);
        registerAssemblyRecipeGroup(
            "NormalCasing",
            LargeAssemblyRecipeConfig.enableNormalRecipes,
            ChaosAssemblyLine_CasingRecipe_Normal::addChaosAssemblyLine_NormalCasingRecipe);
        registerAssemblyRecipeGroup(
            "NormalHatch",
            LargeAssemblyRecipeConfig.enableNormalRecipes,
            ChaosAssemblyLine_HatchRecipe_Normal::addChaosAssemblyLine_HatchRecipe_Normal);
        registerAssemblyRecipeGroup(
            "NormalItem",
            LargeAssemblyRecipeConfig.enableNormalRecipes,
            ChaosAssemblyLine_ItemRecipe_Normal::addChaosAssemblyLine_ItemRecipe_Normal);
        registerAssemblyRecipeGroup(
            "NormalMachine",
            LargeAssemblyRecipeConfig.enableNormalRecipes,
            ChaosAssemblyLine_MachineRecipe_Normal::addChaosAssemblyLine_NormalMachineRecipe);

        ChaosReplicatorRecipes.addReplicatorRecipes_Item();
        ChaosReplicatorRecipes.addReplicatorRecipes_Fluid();
        ChaosExoticRecipes.addExoticRecipes_DegenerateQuarkGluon();
        ChaosExoticRecipes.addExoticRecipes_Magmatter();
        ChaosAntimatterRecipes.addAntimatterRecipes();
        ChaosFallingTowerRecipes.addChaosFallingTowerRecipes();
        ChaosOreRecipes.addChaosOreRecipes();
        ChaosSpecialCompressRecipes.addSpecialCompressRecipes();

        OriginGeneratorRegistry.registerRecipes();

        // Singularity of Void Ore
        SingularityOreRecipes.addVoidOreRecipes_T0();
        SingularityOreRecipes.addVoidOreRecipes_T1();
        SingularityOreRecipes.addVoidOreRecipes_T2();
        SingularityOreRecipes.addVoidOreRecipes_T3();
        SingularityOreRecipes.addVoidOreRecipes_T4();
        SingularityOreRecipes.addVoidOreRecipes_T5();
        SingularityOreRecipes.addVoidOreRecipes_T6();
        SingularityOreRecipes.addVoidOreRecipes_T7();
        SingularityOreRecipes.addVoidOreRecipes_T8();
        SingularityOreRecipes.addVoidOreRecipes_T9();

        // Singularity of Void Gem
        SingularityGemRecipes.addVoidGemRecipes_T0();
        SingularityGemRecipes.addVoidGemRecipes_T1();
        SingularityGemRecipes.addVoidGemRecipes_T2();
        SingularityGemRecipes.addVoidGemRecipes_T3();
        SingularityGemRecipes.addVoidGemRecipes_T4();
        SingularityGemRecipes.addVoidGemRecipes_T5();
        SingularityGemRecipes.addVoidGemRecipes_T6();
        SingularityGemRecipes.addVoidGemRecipes_T7();
        SingularityGemRecipes.addVoidGemRecipes_T8();
        SingularityGemRecipes.addVoidGemRecipes_T9();

        // Singularity of Void Dust
        SingularityDustRecipes.addVoidDustRecipes_T0();
        SingularityDustRecipes.addVoidDustRecipes_T1();
        SingularityDustRecipes.addVoidDustRecipes_T2();
        SingularityDustRecipes.addVoidDustRecipes_T3();
        SingularityDustRecipes.addVoidDustRecipes_T4();
        SingularityDustRecipes.addVoidDustRecipes_T5();
        SingularityDustRecipes.addVoidDustRecipes_T6();
        SingularityDustRecipes.addVoidDustRecipes_T7();
        SingularityDustRecipes.addVoidDustRecipes_T8();
        SingularityDustRecipes.addVoidDustRecipes_T9();

        // Singularity of Void Fluid
        SingularityFluidRecipes.addVoidFluidRecipes_T0();
        SingularityFluidRecipes.addVoidFluidRecipes_T1();
        SingularityFluidRecipes.addVoidFluidRecipes_T2();
        SingularityFluidRecipes.addVoidFluidRecipes_T3();
        SingularityFluidRecipes.addVoidFluidRecipes_T4();
        SingularityFluidRecipes.addVoidFluidRecipes_T5();
        SingularityFluidRecipes.addVoidFluidRecipes_T6();
        SingularityFluidRecipes.addVoidFluidRecipes_T7();
        SingularityFluidRecipes.addVoidFluidRecipes_T8();
        SingularityFluidRecipes.addVoidFluidRecipes_T9();

        // Singularity of Void Ingot
        SingularityIngotRecipes.addVoidIngotRecipes_T0();
        SingularityIngotRecipes.addVoidIngotRecipes_T1();
        SingularityIngotRecipes.addVoidIngotRecipes_T2();
        SingularityIngotRecipes.addVoidIngotRecipes_T3();
        SingularityIngotRecipes.addVoidIngotRecipes_T4();
        SingularityIngotRecipes.addVoidIngotRecipes_T5();
        SingularityIngotRecipes.addVoidIngotRecipes_T6();
        SingularityIngotRecipes.addVoidIngotRecipes_T7();
        SingularityIngotRecipes.addVoidIngotRecipes_T8();
        SingularityIngotRecipes.addVoidIngotRecipes_T9();

        // Singularity of Ecosystem
        SingularityEcosystemRecipes.addEcosystemRecipes_AlgaeFarm();
        SingularityEcosystemRecipes.addEcosystemRecipes_Comb();
        SingularityEcosystemRecipes.addEcosystemRecipes_Food();
        SingularityEcosystemRecipes.addEcosystemRecipes_TreeGrowth();

        // Singularity of Pachinko
        SingularityPachinkoRecipes.addPachinkoRecipes_GT_Item();
        SingularityPachinkoRecipes.addPachinkoRecipes_GT_Machine();
        SingularityPachinkoRecipes.addPachinkoRecipes_Storage();

        ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes();
        ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes();
        EnumFluidListCheck.addEnumFluidListCheckRecipes();

        FMLCommonHandler.instance()
            .bus()
            .register(new CommandHandler());
    }

    private static void registerAssemblyRecipeGroup(String name, boolean enabled, Runnable registration) {
        if (!enabled) {
            LOG.warn("[assembly-recipes] group {} disabled by configuration", name);
            return;
        }
        int skippedBefore = ChaosAssemblyRecipeBuilder.getSkippedRecipeCount();
        long started = System.nanoTime();
        LOG.info("[assembly-recipes] group {} begin", name);
        registration.run();
        LOG.info(
            "[assembly-recipes] group {} done in {} ms; skipped for missing ingredients={}",
            name,
            (System.nanoTime() - started) / 1_000_000L,
            ChaosAssemblyRecipeBuilder.getSkippedRecipeCount() - skippedBefore);
    }

    @Mod.EventHandler
    public void completeInit(FMLLoadCompleteEvent event) {
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes();
        SingularityOreRecipes.addVoidOreRecipes_T10();
        SingularityGemRecipes.addVoidGemRecipes_T10();
        SingularityDustRecipes.addVoidDustRecipes_T10();
        SingularityFluidRecipes_T10.addVoidFluidRecipes_T10();
        SingularityIngotRecipes.addVoidIngotRecipes_T10();
        SingularityNEICatalog.rebuild();
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        FluidExporter.registerCommand(event);
        proxy.serverStarting(event);
    }
}
