package net.immortaldevs.artisanry.component;

import net.fabricmc.yarn.constants.MiningLevels;
import net.immortaldevs.artisanry.modifiers.DurabilityModifier;
import net.immortaldevs.artisanry.modifiers.ToolSuitabilityModifier;
import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.LarvalComponentData;
import net.minecraft.tag.BlockTags;

public final class PickaxeHeadComponents {
    public static final Component IRON_PICKAXE_HEAD = new Component() {
        @Override
        public void init(LarvalComponentData data) {
            data.addModifier(ToolSuitabilityModifier.of(MiningLevels.IRON, BlockTags.PICKAXE_MINEABLE));
            data.addModifier(DurabilityModifier.add(180));
        }
    };
}
