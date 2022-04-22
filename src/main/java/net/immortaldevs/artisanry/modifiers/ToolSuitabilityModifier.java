package net.immortaldevs.artisanry.modifiers;

import net.fabricmc.fabric.api.mininglevel.v1.MiningLevelManager;
import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;

@FunctionalInterface
public interface ToolSuitabilityModifier extends Modifier {
    boolean apply(boolean suitable, ItemStack stack, BlockState state);

    static ToolSuitabilityModifier of(int miningLevel, TagKey<Block> tag) {
        return (suitable, stack, state) -> suitable
                || (state.isIn(tag)
                && MiningLevelManager.getRequiredMiningLevel(state) <= miningLevel);
    }

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(ToolSuitabilityModifier.class, this, (a, b) -> (suitable, stack, state) ->
                b.apply(a.apply(suitable, stack, state), stack, state));
    }
}
