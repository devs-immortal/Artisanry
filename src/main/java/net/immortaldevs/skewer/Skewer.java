package net.immortaldevs.skewer;

import net.fabricmc.api.ModInitializer;
import net.immortaldevs.skewer.sar.SkewerComponents;
import net.immortaldevs.skewer.item.SkewerItems;
import net.minecraft.util.Identifier;

public class Skewer implements ModInitializer {
    public static final String SKEWER = "skewer";

    @Override
    public void onInitialize() {
        SkewerComponents.init();
        SkewerItems.init();
    }

    public static Identifier id(String path) {
        return new Identifier(SKEWER, path);
    }
}
