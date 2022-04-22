package net.immortaldevs.artisanry.modifiers;

import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.item.ItemStack;

@FunctionalInterface
public interface DurabilityModifier extends Modifier {
    int apply(int durability, ItemStack stack);

    static DurabilityModifier add(int value) {
        return (durability, stack) -> durability + value;
    }

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(DurabilityModifier.class, this, (a, b) -> (durability, stack) ->
                b.apply(a.apply(durability, stack), stack));
    }
}
