package net.immortaldevs.artisanry.component;

import net.immortaldevs.artisanry.modifiers.DurabilityModifier;
import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.LarvalComponentData;

public final class HaftComponents {
    public static final Component IRON_HAFT = new Component() {
        @Override
        public void init(LarvalComponentData data) {
            data.addModifier(DurabilityModifier.add(120));
        }
    };

    public static final Component OAK_HAFT = new Component() {
        @Override
        public void init(LarvalComponentData data) {
            data.addModifier(DurabilityModifier.add(60));
        }
    };
}
