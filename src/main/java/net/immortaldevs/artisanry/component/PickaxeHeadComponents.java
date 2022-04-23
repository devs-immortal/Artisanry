package net.immortaldevs.artisanry.component;

import net.fabricmc.yarn.constants.MiningLevels;
import net.immortaldevs.artisanry.modifiers.DurabilityModifier;
import net.immortaldevs.artisanry.modifiers.MiningSpeedModifier;
import net.immortaldevs.artisanry.modifiers.ToolSuitabilityModifier;
import net.immortaldevs.artisanry.util.AttributeModifiers;
import net.immortaldevs.sar.api.Component;
import net.minecraft.tag.BlockTags;

public final class PickaxeHeadComponents {
    public static final Component IRON_PICKAXE_HEAD = new ToolPartComponent(
            ToolSuitabilityModifier.of(MiningLevels.IRON, BlockTags.PICKAXE_MINEABLE),
            MiningSpeedModifier.add(5f, BlockTags.PICKAXE_MINEABLE),
            DurabilityModifier.add(180),
            AttributeModifiers.damageSpeed(3.0, -2.8));
}
