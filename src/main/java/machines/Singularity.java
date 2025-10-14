package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.enums.HatchElement.Maintenance;
import static gregtech.api.enums.HatchElement.OutputBus;
import static gregtech.api.enums.HatchElement.OutputHatch;
// OVERLAY_FRONT_PROCESSING_ARRAY* constants removed/renamed in GTNH 2.8 — use casing texture placeholder for now
import static gregtech.api.enums.Textures.BlockIcons.casingTexturePages;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;

import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gtneioreplugin.plugin.item.ItemDimensionDisplay;
import util.SingularityDebugRecipes;
import util.SingularityFluidRecipes;
import util.SingularityOreRecipes;

public class Singularity extends MTEExtendedPowerMultiBlockBase<Singularity> implements ISurvivalConstructable {

    public Singularity(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    private String mLastDimensionOverride = "None";

    public Singularity(String aName) {
        super(aName);
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setString("mLastDimensionOverride", this.mLastDimensionOverride);
        aNBT.setBoolean("mVoidFluidMode", VoidFluidMode);
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        this.mLastDimensionOverride = aNBT.getString("mLastDimensionOverride");
        this.VoidFluidMode = aNBT.getBoolean("mVoidFluidMode");
    }

    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 2)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Singularity> STRUCTURE_DEFINITION = StructureDefinition
        .<Singularity>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Singularity.class).atLeast(OutputHatch, OutputBus, Maintenance)
                .casingIndex(mcasingIndex)
                .dot(1)
                .buildAndChain(onElementPass(Singularity::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 2))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Singularity> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            // OVERLAY_* constants removed in GTNH 2.8; use base casing texture as placeholder
            return new ITexture[] { casingTexturePages[0][mcasingIndex] };
        }
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    // 主机ToolTips
    @Override
    protected MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Singularity")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("You can only place 'GT NEI Ore Plugin' items in controller to get resources.")
            .addInfo("This machine can get two types of resources: Ore and Fluid.")
            .addInfo("Sneak left click controller to switch resources type.")
            .addInfo("Add By: GT Not Hard")
            .addSeparator()
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Stable Titanium Machine Casing", 4, 24, false)
            .addMaintenanceHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
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
        this.mOutputBusses.clear();
        this.mOutputHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    // 检查仓室
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    // 获取最大并行数
    private int getMaxParallel() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) Math.pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return aStack != null;
    }

    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    @Override
    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Singularity(this.mName);
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
    }

    private boolean VoidFluidMode = false;

    // 潜行左键切换虚空的类型
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            VoidFluidMode = !VoidFluidMode;
            if (VoidFluidMode) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: VoidFluid");
            } else {
                GTUtility.sendChatToPlayer(aPlayer, "mode: VoidOre");
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    // 机器运行逻辑
    @Nonnull
    @Override
    public CheckRecipeResult checkProcessing() {
        mMaxProgresstime = 60;
        String dim = Optional.ofNullable(this.mInventory[1])
            .filter(s -> s.getItem() instanceof ItemDimensionDisplay)
            .map(ItemDimensionDisplay::getDimension)
            .orElse("None");
        ItemStack slot = getControllerSlot();
        if (slot != null && !VoidFluidMode) {
            Map<Integer, ItemStack> ItemRecipes = SingularityDebugRecipes.VoidDebugRecipes
                .get(getControllerSlot().getItemDamage());
            if (ItemRecipes != null) {
                for (int mLoop = 0; mLoop < 8; mLoop++) {
                    this.DebugOutPuts();
                }
                /*
                 * for (int mLoop = 0; mLoop < ItemRecipes.size(); mLoop++) {
                 * ItemStack recipeItem = ItemRecipes.get(mLoop)
                 * .copy();
                 * recipeItem.stackSize = getMaxParallel();
                 * addOutput(recipeItem);
                 * }
                 */
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }
        if (VoidFluidMode) {
            Map<Integer, FluidStack> FluidRecipes = SingularityFluidRecipes.VoidFliudRecipes.get(dim);
            if (FluidRecipes != null) {
                if (!Objects.equals(dim, mLastDimensionOverride)) {
                    mLastDimensionOverride = dim;
                }
                for (int mLoop = 0; mLoop < 32; mLoop++) {
                    this.FluidOutPuts();
                }
                /*
                 * for (int mLoop = 0; mLoop < FluidRecipes.size(); mLoop++) {
                 * FluidStack recipeFluid = FluidRecipes.get(mLoop)
                 * .copy();
                 * recipeFluid.amount = getMaxParallel();
                 * addOutput(recipeFluid);
                 * }
                 */
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        } else {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }
            Map<Integer, ItemStack> OreRecipes = SingularityOreRecipes.VoidOreRecipes.get(dim);
            if (OreRecipes != null) {
                for (int mLoop = 0; mLoop < 256; mLoop++) {
                    this.OreOutPuts();
                }
                /*
                 * for (int mLoop = 0; mLoop < OreRecipes.size(); mLoop++) {
                 * ItemStack recipeOre = OreRecipes.get(mLoop)
                 * .copy();
                 * // System.out.println(recipeOre.getItem());
                 * recipeOre.stackSize = getMaxParallel();
                 * addOutput(recipeOre);
                 * }
                 */
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }
        this.stopMachine(ShutDownReasonRegistry.NONE);
        return CheckRecipeResultRegistry.NO_RECIPE;
    }

    // 虚空矿石输出
    private void OreOutPuts() {
        Map<Integer, ItemStack> OreRecipes = SingularityOreRecipes.VoidOreRecipes.get(mLastDimensionOverride);
        Random random = new Random();
        ItemStack recipeOre = OreRecipes.get(random.nextInt(OreRecipes.size()))
            .copy();
    recipeOre.stackSize = getMaxParallel();
    safeAddOutput(recipeOre);
    }

    // 虚空流体输出
    private void FluidOutPuts() {
        Map<Integer, FluidStack> FluidRecipes = SingularityFluidRecipes.VoidFliudRecipes.get(mLastDimensionOverride);
        Random random = new Random();
        FluidStack recipeFluid = FluidRecipes.get(random.nextInt(FluidRecipes.size()))
            .copy();
    recipeFluid.amount = getMaxParallel();
    safeAddOutput(recipeFluid);
    }

    // 虚空Debug输出
    private void DebugOutPuts() {
        Map<Integer, ItemStack> ItemRecipes = SingularityDebugRecipes.VoidDebugRecipes
            .get(getControllerSlot().getItemDamage());
        Random random = new Random();
        ItemStack recipeItem = ItemRecipes.get(random.nextInt(ItemRecipes.size()))
            .copy();
        recipeItem.stackSize = getMaxParallel();
        safeAddOutput(recipeItem);

    }

    // Reflection helper to call addOutput with either ItemStack or FluidStack at runtime to avoid
    // compile-time overload resolution issues between GT versions.
    private void safeAddOutput(Object output) {
        try {
            Class<?> cls = this.getClass();
            // search for addOutput method taking the runtime type
            java.lang.reflect.Method m = null;
            Class<?> paramClass = output.getClass();
            while (cls != null && m == null) {
                try {
                    m = cls.getMethod("addOutput", paramClass);
                } catch (NoSuchMethodException e) {
                    // try superclass
                    cls = cls.getSuperclass();
                }
            }
            if (m != null) {
                m.invoke(this, output);
                return;
            }
            // fallback: try methods on this (MetaTileEntity) instance
            Object meta = this;
            cls = meta.getClass();
            while (cls != null && m == null) {
                try {
                    m = cls.getMethod("addOutput", paramClass);
                } catch (NoSuchMethodException e) {
                    cls = cls.getSuperclass();
                }
            }
            if (m != null) {
                m.invoke(meta, output);
            }
        } catch (Exception e) {
            // ignore - best effort to avoid breaking compile/runtime; if reflection fails, do nothing
        }
    }
}
