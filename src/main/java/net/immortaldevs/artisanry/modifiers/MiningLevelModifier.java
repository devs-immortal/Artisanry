package net.immortaldevs.artisanry.modifiers;

import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.item.ItemStack;

@FunctionalInterface
public interface MiningLevelModifier extends Modifier {
    int apply(int miningLevel, ItemStack stack);

    static int getMiningLevel(ItemStack stack, int base) {
        MiningLevelModifier modifier = stack.getModifiers().get(MiningLevelModifier.class);
        if (modifier == null) return base;
        return modifier.apply(base, stack);
    }

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(MiningLevelModifier.class, this, (a, b) -> (miningLevel, stack) ->
                b.apply(a.apply(miningLevel, stack), stack));
    }
}
