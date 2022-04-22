package net.immortaldevs.artisanry.modifiers;

import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

@FunctionalInterface
public interface DamageModifier extends Modifier {
    int apply(int amount, ItemStack stack, Random random, @Nullable ServerPlayerEntity player);

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(DamageModifier.class, this, (a, b) -> (amount, stack, random, player) ->
                b.apply(a.apply(amount, stack, random, player), stack, random, player));
    }
}
