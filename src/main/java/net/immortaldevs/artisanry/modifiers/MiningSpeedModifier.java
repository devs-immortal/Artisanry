package net.immortaldevs.artisanry.modifiers;

import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;

@FunctionalInterface
public interface MiningSpeedModifier extends Modifier {
    float apply(float multiplier, ItemStack stack, BlockState state);

    static MiningSpeedModifier add(float value, TagKey<Block> tag) {
        return (multiplier, stack, state) -> state.isIn(tag) ? value + multiplier : multiplier;
    }

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(MiningSpeedModifier.class, this, (a, b) -> (multiplier, stack, state) ->
                b.apply(a.apply(multiplier, stack, state), stack, state));
    }
}
