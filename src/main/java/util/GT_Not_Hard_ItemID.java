package util;

import gregtech.api.util.GTUtility;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.OreDictionary;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class GT_Not_Hard_ItemID extends GTUtility.ItemId{
    // region Member Variables
    private Item item;
    private int metaData;
    private NBTTagCompound nbt;
    // endregion

    // region Class Constructors
    public GT_Not_Hard_ItemID(Item item, int metaData, NBTTagCompound nbt) {
        this.item = item;
        this.metaData = metaData;
        this.nbt = nbt;
    }

    public GT_Not_Hard_ItemID(Item item, int metaData) {
        this.item = item;
        this.metaData = metaData;
    }

    public GT_Not_Hard_ItemID(Item item) {
        this.item = item;
        this.metaData = 0;
    }

    public GT_Not_Hard_ItemID() {}
    // endregion

    // region Static Methods
    public static final GT_Not_Hard_ItemID NULL = new GT_Not_Hard_ItemID();

    public static GT_Not_Hard_ItemID create(ItemStack itemStack) {
        if (null == itemStack) return NULL;
        return new GT_Not_Hard_ItemID(itemStack.getItem(), itemStack.getItemDamage(), itemStack.getTagCompound());
    }

    public static GT_Not_Hard_ItemID createNoNBT(ItemStack itemStack) {
        if (null == itemStack) return NULL;
        return new GT_Not_Hard_ItemID(itemStack.getItem(), itemStack.getItemDamage());
    }

    public static GT_Not_Hard_ItemID createAsWildcard(ItemStack itemStack) {
        if (null == itemStack) return NULL;
        return new GT_Not_Hard_ItemID(itemStack.getItem(), OreDictionary.WILDCARD_VALUE);
    }

    public static GT_Not_Hard_ItemID[] create(ItemStack... itemStacks) {
        GT_Not_Hard_ItemID[] out = new GT_Not_Hard_ItemID[itemStacks.length];
        for (int i = 0; i < itemStacks.length; i++) {
            out[i] = GT_Not_Hard_ItemID.create(itemStacks[i]);
        }
        return out;
    }
    // endregion

    // region Special Methods
    public ItemStack getItemStack() {
        ItemStack r = new ItemStack(item, 1, metaData);
        if (nbt != null) {
            r.setTagCompound(nbt);
        }
        return r;
    }

    public ItemStack getItemStack(int amount) {
        ItemStack r = new ItemStack(item, amount, metaData);
        if (nbt != null) {
            r.setTagCompound(nbt);
        }
        return r;
    }

    public ItemStack getItemStackWithNBT() {
        ItemStack itemStack = new ItemStack(item, 1, metaData);
        itemStack.setTagCompound(nbt);
        return itemStack;
    }

    public ItemStack getItemStackWithNBT(int amount) {
        ItemStack itemStack = new ItemStack(item, amount, metaData);
        itemStack.setTagCompound(nbt);
        return itemStack;
    }

    public ItemStack getItemStackWithoutNBT() {
        return new ItemStack(item, 1, metaData);
    }

    public ItemStack getItemStackWithoutNBT(int amount) {
        return new ItemStack(item, amount, metaData);
    }

    // endregion

    // region General Methods
    public boolean isWildcard() {
        return this.metaData == OreDictionary.WILDCARD_VALUE;
    }

    public GT_Not_Hard_ItemID setItem(Item item) {
        this.item = item;
        return this;
    }

    public GT_Not_Hard_ItemID setMetaData(int metaData) {
        this.metaData = metaData;
        return this;
    }

    public GT_Not_Hard_ItemID setNbt(NBTTagCompound nbt) {
        this.nbt = nbt;
        return this;
    }

    @Override
    protected Item item() {
        return item;
    }

    @Override
    protected int metaData() {
        return metaData;
    }

    @Nullable
    @Override
    protected NBTTagCompound nbt() {
        return nbt;
    }

    @Nullable
    @Override
    protected Integer stackSize() {
        // todo
        return null;
    }

    @Nullable
    protected NBTTagCompound getNBT() {
        return nbt;
    }

    protected Item getItem() {
        return item;
    }

    protected int getMetaData() {
        return metaData;
    }

    public boolean equalItemStack(ItemStack itemStack) {
        return this.equals(isWildcard() ? createAsWildcard(itemStack) : createNoNBT(itemStack));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GT_Not_Hard_ItemID gtnothardItemID)) {
            return false;
        }
        return metaData == gtnothardItemID.metaData && Objects.equals(item, gtnothardItemID.item)
            && Objects.equals(nbt, gtnothardItemID.nbt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, metaData, nbt);
    }
}
