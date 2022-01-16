package net.immortaldevs.aptitude.base;

import net.immortaldevs.aptitude.api.Modifier;
import net.minecraft.item.ItemStack;

import java.util.function.Consumer;

public class Util {
    public static <T extends Modifier> void applyModifier(ItemStack stack, Class<T> type, Consumer<T> action) {
        RootComponentData rootComponentData = ((AptitudeItemStackExt) (Object) stack).aptitude$getComponentRoot();
        if (rootComponentData == null) return;
        T component = rootComponentData.modifierMap.get(type);
        if (component == null) return;
        action.accept(component);
    }
}
