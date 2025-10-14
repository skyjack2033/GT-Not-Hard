package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.GregTechAPI.METATILEENTITIES;
import static gregtech.api.enums.GTValues.V;
import static gregtech.api.enums.HatchElement.Dynamo;
import static gregtech.api.enums.HatchElement.InputHatch;
import static gregtech.api.enums.HatchElement.Maintenance;
// OVERLAY_FRONT_PROCESSING_ARRAY* constants were removed/renamed in newer GTNH; use casing texture as temporary placeholder
import static gregtech.api.enums.Textures.BlockIcons.casingTexturePages;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.api.util.GTUtility.validMTEList;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;

import org.jetbrains.annotations.NotNull;

import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ISecondaryDescribable;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEBasicGenerator;
import gregtech.api.metatileentity.implementations.MTEHatch;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.maps.FuelBackend;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase;

public class Origin extends GTPPMultiBlockBase<Origin> implements ISurvivalConstructable, ISecondaryDescribable {

    public Origin(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Origin(String aName) {
        super(aName);
    }

    private GTRecipe recipe = null;
    private int Efficiency = 0;
    private int Voltage = 0;

    // 保存NBT数据
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wireless_mode", wireless_mode);
    }

    // 加载NBT数据
    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        wireless_mode = aNBT.getBoolean("wireless_mode");
    }

    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 1)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Origin> STRUCTURE_DEFINITION = StructureDefinition.<Origin>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
                    'h',
                    buildHatchAdder(Origin.class).atLeast(InputHatch, Maintenance, Dynamo)
                        .casingIndex(mcasingIndex)
                        .dot(1)
                        .buildAndChain(onElementPass(Origin::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 1))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Origin> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            // Overlay constants were removed in GTNH 2.8; return the base casing texture as a placeholder
            return new ITexture[] { casingTexturePages[0][mcasingIndex] };
        }
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    // 主机ToolTips
    @Override
    protected MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Origin")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("You can put some single block generators of fluid in the host machine.")
            .addInfo("Compared with the original generator, it has a sixteenfold increase.")
            .addInfo("It is recommended to use the appropriate fluid fuel for the best experience.")
            .addInfo("Add By: GT Not Hard")
            .addSeparator()
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Clean Stainless Steel Machine Casing", 4, 24, false)
            .addDynamoHatch("Any casing", 1)
            .addMaintenanceHatch("Any casing", 1)
            .addInputHatch("Any casing", 1)
            .toolTipFinisher();
        return tt;
    }

    // 创造自动搭建
    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    // 生存自动搭建
    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        if (mMachine) {
            return -1;
        }
        return survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    // 检查机器结构
    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        this.mMaintenanceHatches.clear();
        this.mInputHatches.clear();
        this.mDynamoHatches.clear();
        this.mTecTechDynamoHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    // 检查仓室
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Origin(this.mName);
    }

    // 设定机器最大效率
    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 0;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    // 获取机器类型
    @Override
    public String getMachineType() {
        return "Origin";
    }

    // 获取最大并行数
    @Override
    public int getMaxParallelRecipes() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) Math.pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    private UUID ownerUUID;

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
    }

    // 检查配方表
    @Nonnull
    @Override
    public CheckRecipeResult checkProcessing() {
        lEUt = 0;
        ItemStack slot = getControllerSlot();
        mMaxProgresstime = 0;
        // debug ULV
        if (slot != null && slot.getItemDamage() == 2006) {
            mMaxProgresstime = 20;
            lEUt = (long) 8 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug LV
        if (slot != null && slot.getItemDamage() == 30651) {
            mMaxProgresstime = 20;
            lEUt = (long) 32 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug MV
        if (slot != null && slot.getItemDamage() == 2320) {
            mMaxProgresstime = 20;
            lEUt = (long) 128 * 4 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug HV
        if (slot != null && slot.getItemDamage() == 2340) {
            mMaxProgresstime = 20;
            lEUt = (long) 512 * 6 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug EV
        if (slot != null && slot.getItemDamage() == 2360) {
            mMaxProgresstime = 20;
            lEUt = (long) 2048 * 8 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug IV
        if (slot != null && slot.getItemDamage() == 2380) {
            mMaxProgresstime = 20;
            lEUt = (long) 8192 * 12 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug LUV
        if (slot != null && slot.getItemDamage() == 2400) {
            mMaxProgresstime = 20;
            lEUt = (long) 32768 * 16 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug ZPM
        if (slot != null && slot.getItemDamage() == 2420) {
            mMaxProgresstime = 20;
            lEUt = (long) 131072 * 24 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UV
        if (slot != null && slot.getItemDamage() == 2440) {
            mMaxProgresstime = 20;
            lEUt = (long) 524288 * 32 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UHV
        if (slot != null && slot.getItemDamage() == 2020) {
            mMaxProgresstime = 20;
            lEUt = (long) 2097152 * 48 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UEV
        if (slot != null && slot.getItemDamage() == 2026) {
            mMaxProgresstime = 20;
            lEUt = (long) 8388608 * 64 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UIV
        if (slot != null && slot.getItemDamage() == 2081) {
            mMaxProgresstime = 20;
            lEUt = (long) 33554432 * 64 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UMV
        if (slot != null && slot.getItemDamage() == 2089) {
            mMaxProgresstime = 20;
            lEUt = (long) 134217728 * 12 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug UXV
        if (slot != null && slot.getItemDamage() == 2606) {
            mMaxProgresstime = 20;
            lEUt = (long) 536870912 * 2 * getMaxParallelRecipes();
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }
        // debug long
        if (slot != null && slot.getItemDamage() == 11430) {
            mMaxProgresstime = 20;
            lEUt = Long.MAX_VALUE;
            mEfficiency = 1;
            if (wireless_mode) {
                BigInteger power = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime));
                if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                    return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                }
            }
            return CheckRecipeResultRegistry.GENERATING;
        }

        if (slot != null && recipe == null && Efficiency == 0 && Voltage == 0) {
            MetaTileEntity tile = (MetaTileEntity) METATILEENTITIES[slot.getItemDamage()];
            if (tile instanceof MTEBasicGenerator generator) {
                GTRecipe recipe = getFluidRecipe(generator, getStoredFluids());
                if (recipe != null) {
                    Voltage = (int) V[generator.mTier];
                    // Efficiency = generator.getEfficiency();
                    Efficiency = 10000;
                    this.recipe = recipe;
                } else {
                    recipe = getItemRecipe(generator, getAllStoredInputs());
                    if (recipe != null) {
                        Voltage = (int) V[generator.mTier];
                        // Efficiency = generator.getEfficiency();
                        Efficiency = 10000;
                        this.recipe = recipe;
                    } else return CheckRecipeResultRegistry.NO_RECIPE;
                }
            }
        }
        if (recipe != null && slot != null) {
            int meta = slot.getItemDamage();
            Generator generator = Generator.generators.get(meta);
            if (deleteInput(recipe, generator.getFluidAmount() * getMaxParallelRecipes())) {
                mMaxProgresstime = generator.getProgresstime();
                lEUt = (long) Voltage * getMaxParallelRecipes() * 10000;
                mEfficiency = Efficiency;
                if (wireless_mode) {
                    BigInteger power = BigInteger.valueOf(lEUt)
                        .multiply(BigInteger.valueOf(mMaxProgresstime));
                    if (!addEUToGlobalEnergyMap(ownerUUID, power)) {
                        return CheckRecipeResultRegistry.insufficientPower(power.longValue());
                    }
                }
                return CheckRecipeResultRegistry.GENERATING;
            } else {
                recipe = null;
                Efficiency = 0;
                Voltage = 0;
            }
        }
        return CheckRecipeResultRegistry.NO_RECIPE;
    }

    // 发电机设定
    private static class Generator {

        private static HashMap<Integer, Generator> generators = new HashMap<>();
        private int fluidAmount;
        private int Progresstime;

        static {
            // Basic Gas Turbine-基础燃气轮机
            generators.put(1115, new Generator(1, 800));
            // Advanced Gas Turbine-进阶燃气轮机
            generators.put(1116, new Generator(1, 800));
            // Turbo Gas Turbine-涡轮燃气轮机
            generators.put(1117, new Generator(1, 800));
            // Turbo Gas Turbine II-涡轮燃气轮机II
            generators.put(1118, new Generator(1, 800));
            // Turbo Gas Turbine III-涡轮燃气轮机III
            generators.put(1119, new Generator(1, 800));
            // Basic Semi-Fluid Generator-基础半流质发电机
            generators.put(837, new Generator(1, 18));
            // Advanced Semi-Fluid Generator-进阶半流质发电机
            generators.put(838, new Generator(1, 18));
            // Turbo Semi-Fluid Generator-涡轮半流质发电机
            generators.put(839, new Generator(1, 18));
            // Turbo Semi-Fluid Generator II-涡轮半流质发电机 II
            generators.put(993, new Generator(1, 18));
            // Turbo Semi-Fluid Generator III-涡轮半流质发电机 III
            generators.put(994, new Generator(1, 18));
            // Acid Generator LV-酸性发电机(LV)
            generators.put(12793, new Generator(1, 20));
            // Acid Generator MV-酸性发电机(MV)
            generators.put(12726, new Generator(1, 20));
            // Acid Generator HV-酸性发电机(HV)
            generators.put(12727, new Generator(1, 20));
            // Acid Generator EV-酸性发电机(EV)
            generators.put(12728, new Generator(1, 20));
            // Basic Combustion Generator-基础内燃发电机
            generators.put(1110, new Generator(1, 125));
            // Advanced Combustion Generator-进阶内燃发电机
            generators.put(1111, new Generator(1, 125));
            // Turbo Combustion Generator-涡轮内燃发电机
            generators.put(1112, new Generator(1, 125));
            // Turbo Supercharging Combustion Generator-涡轮增压内燃发电机
            generators.put(1113, new Generator(1, 125));
            // Ultimate Chemical Energy Releaser-终极化学能释放者
            generators.put(1114, new Generator(1, 125));
            // Plasma Generator Mark I-等离子发电机Mk I
            generators.put(1196, new Generator(1, 36000));
            // Plasma Generator Mark II-等离子发电机Mk II
            generators.put(1197, new Generator(1, 36000));
            // Plasma Generator Mark III-等离子发电机Mk III
            generators.put(1198, new Generator(1, 36000));
            // Plasma Generator Mark IV-等离子发电机Mk IV
            generators.put(10752, new Generator(1, 36000));
            // Ultimate Pocket Sun-终极便携式恒星
            generators.put(10753, new Generator(1, 36000));
        }

        public Generator(int fluidAmount, int Progresstime) {
            this.fluidAmount = fluidAmount;
            this.Progresstime = Progresstime;
        }

        public int getFluidAmount() {
            return fluidAmount;
        }

        public int getProgresstime() {
            return Progresstime;
        }

        public void setFluidAmount(int fluidAmount) {
            this.fluidAmount = fluidAmount;
        }

        public void setProgresstime(int progresstime) {
            Progresstime = progresstime;
        }
    }

    // 输入燃料消耗
    private boolean deleteInput(GTRecipe recipe, int amount) {
        FluidStack fluidStack = null;
        if (recipe != null) {
            ItemStack input = recipe.getRepresentativeInput(0);
            if (GTUtility.isStackValid(input)) {
                fluidStack = GTUtility.getFluidForFilledItem(input, true);
            } else fluidStack = recipe.getRepresentativeFluidInput(0);
        }
        ArrayList<FluidStack> fluidStacks = getStoredFluids();
        int i = getMaxFluidAmount(fluidStacks, fluidStack);
        if (i >= amount) {
            for (var stack : fluidStacks) {
                if (GTUtility.areFluidsEqual(stack, fluidStack)) {
                    stack.amount -= amount;
                    return true;
                }
            }
        }
        return false;
    }

    // 获取输入仓最大流体数量
    private int getMaxFluidAmount(ArrayList<FluidStack> fluidStacks, FluidStack fluidStack) {
        int i = 0;
        for (var stack : fluidStacks) {
            if (GTUtility.areFluidsEqual(stack, fluidStack)) {
                i += stack.amount;
            }
        }
        return i;
    }

    // 获取流体燃料配方
    public GTRecipe getFluidRecipe(MTEBasicGenerator generator, ArrayList<FluidStack> FluidStackList) {
        RecipeMap<?> tRecipes = generator.getRecipeMap();
        if (!(FluidStackList.isEmpty() || !(tRecipes.getBackend() instanceof FuelBackend tFuels))) {
            for (var fluidStack : FluidStackList) {
                return tFuels.findFuel(fluidStack);
            }
        }
        return null;
    }

    // 获取物品燃料配方
    public GTRecipe getItemRecipe(MTEBasicGenerator generator, ArrayList<ItemStack> ItemStacks) {
        RecipeMap<?> tRecipes = generator.getRecipeMap();
        if (!ItemStacks.isEmpty() || getRecipeMap() == null) {
            for (var itemStack : ItemStacks) {
                if (!(GTUtility.isStackInvalid(itemStack)) && generator.solidFuelOverride(itemStack)) {
                    return getRecipeMap().findRecipeQuery()
                        .items(itemStack)
                        .find();
                }
            }
        }
        return null;
    }

    // 获取主方块中机器配方
    @NotNull
    @Override
    public Collection<RecipeMap<?>> getAvailableRecipeMaps() {
        return super.getAvailableRecipeMaps();
    }

    @Override
    public boolean onRunningTick(ItemStack aStack) {
        if (this.lEUt > 0) {
            addEnergyOutput(this.lEUt * mEfficiency / 100);
            return true;
        }
        if (this.lEUt < 0) {
            if (!drainEnergyInput(getActualEnergyUsage())) {
                stopMachine(ShutDownReasonRegistry.POWER_LOSS);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addEnergyOutput(long aEU) {
        if (aEU <= 0) {
            return true;
        }
        if (!this.mAllDynamoHatches.isEmpty()) {
            return addEnergyOutputMultipleDynamos(aEU, true, 0);
        }
        return false;
    }

    // 动力仓能量判断
    public boolean addEnergyOutputMultipleDynamos(long aEU, boolean aAllowMixedVoltageDynamos, int i) {
        int injected = 0;
        long aFirstVoltageFound = -1;
        for (MTEHatch aDynamo : validMTEList(mAllDynamoHatches)) {
            long aVoltage = aDynamo.maxEUOutput();
            // Check against voltage to check when hatch mixing
            if (aFirstVoltageFound == -1) {
                aFirstVoltageFound = aVoltage;
            }
        }

        long leftToInject;
        long aVoltage;
        int aAmpsToInject;
        int aRemainder;
        int ampsOnCurrentHatch;
        for (MTEHatch aDynamo : validMTEList(mAllDynamoHatches)) {
            leftToInject = aEU - injected;
            aVoltage = aDynamo.maxEUOutput();
            aAmpsToInject = (int) (leftToInject / aVoltage);
            aRemainder = (int) (leftToInject - (aAmpsToInject * aVoltage));
            ampsOnCurrentHatch = (int) Math.min(aDynamo.maxAmperesOut(), aAmpsToInject);

            // add full amps
            aDynamo.getBaseMetaTileEntity()
                .increaseStoredEnergyUnits(aVoltage * ampsOnCurrentHatch, false);
            injected += (int) (aVoltage * ampsOnCurrentHatch);

            // add reminder
            if (aRemainder > 0 && ampsOnCurrentHatch < aDynamo.maxAmperesOut()) {
                aDynamo.getBaseMetaTileEntity()
                    .increaseStoredEnergyUnits(aRemainder, false);
                injected += aRemainder;
            }
        }
        return injected > 0;
    }

    private boolean wireless_mode = false;

    // 开启无线电网条件
    protected boolean canUseWireless() {
        if (getControllerSlot().getItemDamage() == 11430) {
            return true;
        } else if (getControllerSlot().stackSize >= 8) {
            return true;
        } else {
            return false;
        }
    }

    // 开启无线电网模式
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            wireless_mode = !wireless_mode;
            if (canUseWireless() && wireless_mode) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: wireless_mode");
            } else {
                GTUtility.sendChatToPlayer(aPlayer, "mode: nowireless_mode");
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }
}
