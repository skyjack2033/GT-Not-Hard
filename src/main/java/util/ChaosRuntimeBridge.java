package util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

import net.minecraft.item.ItemStack;

import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.MTEEnhancedMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;

public final class ChaosRuntimeBridge {

    private static final Map<Class<?>, Map<String, Field>> FIELD_CACHE = new HashMap<>();
    private static final Map<MTEMultiBlockBase, Integer> LAST_INSTANCE_COUNTS = new WeakHashMap<>();

    private ChaosRuntimeBridge() {}

    public static boolean supports(MTEMultiBlockBase prototype) {
        return prototype != null;
    }

    public static boolean supportsMachineModeSwitch(MTEMultiBlockBase delegate) {
        if (delegate == null) {
            return false;
        }
        if (delegate.supportsMachineModeSwitch()) {
            return true;
        }
        try {
            return delegate.getClass()
                .getMethod("setMachineMode", int.class)
                .getDeclaringClass() != MTEMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static MTEMultiBlockBase create(MTEMultiBlockBase prototype, MTEMultiBlockBase source)
        throws ReflectiveOperationException {
        if (prototype == null || source == null || source.getBaseMetaTileEntity() == null) {
            return null;
        }
        if (!(prototype.newMetaEntity(source.getBaseMetaTileEntity()) instanceof MTEMultiBlockBase delegate)) {
            return null;
        }
        syncToDelegate(source, delegate);
        invokeWithBase(source, delegate, () -> {
            delegate.onFirstTick(source.getBaseMetaTileEntity());
            return null;
        });
        return delegate;
    }

    public static void syncToDelegate(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws IllegalAccessException {
        copyFields(source, delegate);
        ItemStack controller = source.getControllerSlot();
        delegate
            .setInventorySlotContents(delegate.getControllerSlotIndex(), controller == null ? null : controller.copy());
        setField(delegate, "mMachine", source.mMachine);
        setField(delegate, "EUtCanUse", source.getMaxInputEu());
        setAliasField(delegate, "isWirelessMode", getField(source, "wirelessMode"));
        if (Boolean.TRUE.equals(getField(source, "wirelessMode"))) {
            setField(delegate, "lEUt", 0L);
            setField(delegate, "mEUt", 0);
        }
    }

    public static void syncFromDelegate(MTEMultiBlockBase delegate, MTEMultiBlockBase source)
        throws IllegalAccessException {
        copyFields(delegate, source);
    }

    public static void setMachineMode(MTEMultiBlockBase source, MTEMultiBlockBase delegate, int index)
        throws ReflectiveOperationException {
        invokeWithBase(source, delegate, () -> {
            delegate.setMachineMode(index);
            return null;
        });
    }

    public static int switchMachineMode(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws ReflectiveOperationException {
        syncToDelegate(source, delegate);
        return invokeWithBase(source, delegate, () -> {
            delegate.onMachineModeSwitchClick();
            int currentMode = delegate.getMachineMode();
            int nextMode;
            if (overrides(delegate, "nextMachineMode")) {
                nextMode = delegate.nextMachineMode();
            } else {
                Integer modeCount = findEnumModeCount(delegate, currentMode);
                if (modeCount != null) {
                    nextMode = Math.floorMod(currentMode + 1, modeCount);
                } else {
                    Integer iconCount = findModeIconCount(delegate);
                    nextMode = iconCount == null ? delegate.nextMachineMode()
                        : Math.floorMod(currentMode + 1, iconCount);
                }
            }
            delegate.setMachineMode(nextMode);
            return delegate.getMachineMode();
        });
    }

    private static boolean overrides(MTEMultiBlockBase delegate, String method) throws NoSuchMethodException {
        return delegate.getClass()
            .getMethod(method)
            .getDeclaringClass() != MTEMultiBlockBase.class;
    }

    private static Integer findEnumModeCount(MTEMultiBlockBase delegate, int mode) throws IllegalAccessException {
        for (Field field : fieldsFor(delegate.getClass()).values()) {
            if (Modifier.isStatic(field.getModifiers()) || !field.getType()
                .isEnum()
                || !field.getName()
                    .toLowerCase(Locale.ROOT)
                    .contains("mode")) {
                continue;
            }
            if (field.get(delegate) instanceof Enum<?>current && current.ordinal() == mode) {
                return field.getType()
                    .getEnumConstants().length;
            }
        }
        return null;
    }

    private static Integer findModeIconCount(MTEMultiBlockBase delegate) throws IllegalAccessException {
        for (Field field : fieldsFor(delegate.getClass()).values()) {
            if (!field.getName()
                .replace("_", "")
                .toLowerCase(Locale.ROOT)
                .endsWith("modeicons")) {
                continue;
            }
            Object icons = field.get(delegate);
            int count = icons instanceof List<?>list ? list.size()
                : icons != null && icons.getClass()
                    .isArray() ? Array.getLength(icons) : 0;
            if (count > 0) return count;
        }
        return null;
    }

    public static CheckRecipeResult checkProcessing(MTEMultiBlockBase source, MTEMultiBlockBase delegate)
        throws ReflectiveOperationException {
        return checkProcessing(source, delegate, 1);
    }

    public static CheckRecipeResult checkProcessing(MTEMultiBlockBase source, MTEMultiBlockBase delegate, int parallel)
        throws ReflectiveOperationException {
        int requestedInstances = Math.max(1, parallel);
        setLastSuccessfulInstances(delegate, 0);
        ProcessingAggregate aggregate = new ProcessingAggregate(isCustomCheckProcessing(delegate));
        CheckRecipeResult lastResult = CheckRecipeResultRegistry.NO_RECIPE;
        CheckRecipeResult lastSuccessfulResult = CheckRecipeResultRegistry.SUCCESSFUL;

        for (int instance = 0; instance < requestedInstances; instance++) {
            syncToDelegate(source, delegate);
            clearProcessingState(delegate);
            CheckRecipeResult result = invokeWithBase(source, delegate, delegate::checkProcessing);
            if (!result.wasSuccessful()) {
                lastResult = result;
                break;
            }
            aggregate.add(delegate);
            lastSuccessfulResult = result;
            setLastSuccessfulInstances(delegate, aggregate.instances);
        }

        if (aggregate.instances == 0) {
            syncFromDelegate(delegate, source);
            return lastResult;
        }

        aggregate.apply(delegate);
        syncFromDelegate(delegate, source);
        return lastSuccessfulResult;
    }

    public static int getLastSuccessfulInstances(MTEMultiBlockBase delegate) {
        synchronized (LAST_INSTANCE_COUNTS) {
            Integer count = LAST_INSTANCE_COUNTS.get(delegate);
            return count == null ? 1 : Math.max(1, count);
        }
    }

    public static boolean isCustomCheckProcessing(MTEMultiBlockBase delegate) {
        try {
            Class<?> declaringClass = delegate.getClass()
                .getMethod("checkProcessing")
                .getDeclaringClass();
            return declaringClass != MTEMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static boolean isCustomRunningTick(MTEMultiBlockBase delegate) {
        try {
            Class<?> declaringClass = delegate.getClass()
                .getMethod("onRunningTick", ItemStack.class)
                .getDeclaringClass();
            return declaringClass != MTEMultiBlockBase.class && declaringClass != MTEEnhancedMultiBlockBase.class
                && declaringClass != MTEExtendedPowerMultiBlockBase.class;
        } catch (NoSuchMethodException exception) {
            return false;
        }
    }

    public static boolean invokeCustomRunningTick(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        ItemStack controller) throws ReflectiveOperationException {
        return invokeCustomRunningTick(source, delegate, controller, getLastSuccessfulInstances(delegate));
    }

    public static boolean invokeCustomRunningTick(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        ItemStack controller, int instances) throws ReflectiveOperationException {
        if (!isCustomRunningTick(delegate)) {
            return true;
        }
        Field euTick = findField(delegate.getClass(), "lEUt");
        Field mEuTick = findField(delegate.getClass(), "mEUt");
        Object oldEuTick = euTick == null ? null : getFieldValue(euTick, delegate);
        Object oldMEuTick = mEuTick == null ? null : getFieldValue(mEuTick, delegate);
        boolean completed = false;
        boolean result = false;
        try {
            result = true;
            for (int instance = 0; instance < Math.max(1, instances); instance++) {
                if (euTick != null) euTick.set(delegate, 0L);
                if (mEuTick != null) mEuTick.set(delegate, 0);
                if (!invokeWithBase(source, delegate, () -> delegate.onRunningTick(controller))) {
                    result = false;
                    break;
                }
            }
            completed = true;
            return result;
        } finally {
            if (!completed || result) {
                if (euTick != null) euTick.set(delegate, oldEuTick);
                if (mEuTick != null) mEuTick.set(delegate, oldMEuTick);
            }
        }
    }

    private static void setLastSuccessfulInstances(MTEMultiBlockBase delegate, int count) {
        synchronized (LAST_INSTANCE_COUNTS) {
            LAST_INSTANCE_COUNTS.put(delegate, count);
        }
    }

    private static void clearProcessingState(MTEMultiBlockBase delegate) {
        setField(delegate, "mOutputItems", null);
        setField(delegate, "mOutputFluids", null);
        setField(delegate, "mMaxProgresstime", 0);
        setField(delegate, "lEUt", 0L);
        setField(delegate, "mEUt", 0);
    }

    private static final class ProcessingAggregate {

        private final boolean aggregateTargetParallel;
        private final List<ItemStack> items = new ArrayList<>();
        private final List<net.minecraftforge.fluids.FluidStack> fluids = new ArrayList<>();
        private int instances;
        private int maxProgress;
        private int efficiency;
        private int efficiencyIncrease;
        private boolean hasEfficiency;
        private long lEUt;
        private int mEUt;
        private int lastParallel;
        private int maxParallel;

        private ProcessingAggregate(boolean aggregateTargetParallel) {
            this.aggregateTargetParallel = aggregateTargetParallel;
        }

        private void add(MTEMultiBlockBase delegate) {
            instances++;
            if (delegate.mOutputItems != null) {
                for (ItemStack item : delegate.mOutputItems) {
                    if (item != null) items.add(item.copy());
                }
            }
            if (delegate.mOutputFluids != null) {
                for (net.minecraftforge.fluids.FluidStack fluid : delegate.mOutputFluids) {
                    if (fluid != null) fluids.add(fluid.copy());
                }
            }
            maxProgress = Math.max(maxProgress, delegate.mMaxProgresstime);
            if (!hasEfficiency) {
                efficiency = delegate.mEfficiency;
                efficiencyIncrease = delegate.mEfficiencyIncrease;
                hasEfficiency = true;
            }
            lEUt = addLong(lEUt, getLongField(delegate, "lEUt"));
            mEUt = addInt(mEUt, delegate.mEUt);
            if (aggregateTargetParallel) {
                lastParallel = addInt(lastParallel, delegate.lastParallel);
                maxParallel = addInt(maxParallel, getIntField(delegate, "maxParallel"));
            }
        }

        private void apply(MTEMultiBlockBase delegate) {
            delegate.mOutputItems = items.isEmpty() ? null : items.toArray(new ItemStack[0]);
            delegate.mOutputFluids = fluids.isEmpty() ? null
                : fluids.toArray(new net.minecraftforge.fluids.FluidStack[0]);
            delegate.mMaxProgresstime = maxProgress;
            delegate.mEfficiency = efficiency;
            delegate.mEfficiencyIncrease = efficiencyIncrease;
            setField(delegate, "lEUt", lEUt);
            delegate.mEUt = mEUt;
            if (aggregateTargetParallel) {
                delegate.lastParallel = lastParallel;
                setField(delegate, "maxParallel", maxParallel);
            }
        }
    }

    private static int getIntField(Object source, String name) {
        Object value = getField(source, name);
        return value instanceof Number ? ((Number) value).intValue() : 0;
    }

    private static long getLongField(Object source, String name) {
        Object value = getField(source, name);
        return value instanceof Number ? ((Number) value).longValue() : 0L;
    }

    private static long addLong(long left, long right) {
        if (right > 0 && left > Long.MAX_VALUE - right) return Long.MAX_VALUE;
        if (right < 0 && left < Long.MIN_VALUE - right) return Long.MIN_VALUE;
        return left + right;
    }

    private static int addInt(int left, int right) {
        long result = (long) left + right;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }

    private static <T> T invokeWithBase(MTEMultiBlockBase source, MTEMultiBlockBase delegate,
        ThrowingSupplier<T> action) throws ReflectiveOperationException {
        IGregTechTileEntity base = source.getBaseMetaTileEntity();
        delegate.setBaseMetaTileEntity(base);
        try {
            return action.get();
        } finally {
            delegate.setBaseMetaTileEntity(null);
            source.setBaseMetaTileEntity(base);
        }
    }

    private static void copyFields(Object source, Object target) throws IllegalAccessException {
        Map<String, Field> sourceFields = fieldsFor(source.getClass());
        Map<String, Field> targetFields = fieldsFor(target.getClass());
        for (Map.Entry<String, Field> entry : sourceFields.entrySet()) {
            String name = entry.getKey();
            if (name.equals("mInventory") || name.equals("mBaseMetaTileEntity")
                || name.equals("processingLogic")
                || name.equals("inventoryHandler")
                || name.equals("mode")
                || name.equals("machineMode")
                || name.equals("machineModeIcons")) {
                continue;
            }
            Field sourceField = entry.getValue();
            Field targetField = targetFields.get(name);
            if (targetField == null || Modifier.isFinal(targetField.getModifiers())
                || Modifier.isStatic(targetField.getModifiers())
                || !targetField.getType()
                    .isAssignableFrom(sourceField.getType())) {
                continue;
            }
            Object value = getFieldValue(sourceField, source);
            targetField.set(target, value);
        }
    }

    private static Map<String, Field> fieldsFor(Class<?> type) {
        synchronized (FIELD_CACHE) {
            return FIELD_CACHE.computeIfAbsent(type, ChaosRuntimeBridge::scanFields);
        }
    }

    private static Map<String, Field> scanFields(Class<?> type) {
        Map<String, Field> fields = new HashMap<>();
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            for (Field field : current.getDeclaredFields()) {
                fields.putIfAbsent(field.getName(), accessible(field));
            }
        }
        return fields;
    }

    private static Field findField(Class<?> type, String name) {
        return fieldsFor(type).get(name);
    }

    private static Field accessible(Field field) {
        field.setAccessible(true);
        return field;
    }

    private static Object getField(Object source, String name) {
        Field field = findField(source.getClass(), name);
        return field == null ? null : getFieldValue(field, source);
    }

    private static Object getFieldValue(Field field, Object source) {
        try {
            return field.get(source);
        } catch (IllegalAccessException exception) {
            return null;
        }
    }

    private static void setField(Object target, String name, Object value) {
        Field field = findField(target.getClass(), name);
        if (field == null || Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
            return;
        }
        try {
            field.set(target, value);
        } catch (IllegalAccessException ignored) {}
    }

    private static void setAliasField(Object target, String name, Object value) {
        if (value == null) return;
        setField(target, name, value);
    }

    @FunctionalInterface
    private interface ThrowingSupplier<T> {

        T get() throws ReflectiveOperationException;
    }
}
