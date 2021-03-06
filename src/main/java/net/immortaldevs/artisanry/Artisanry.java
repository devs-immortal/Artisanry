package net.immortaldevs.artisanry;

import net.immortaldevs.artisanry.component.ArtisanryComponents;
import net.immortaldevs.artisanry.item.ArtisanryItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Artisanry implements ModInitializer {
    public static final String ARTISANRY = "artisanry";
    public static final Logger LOGGER = LogManager.getLogger(ARTISANRY);

    @Override
    public void onInitialize() {
        ArtisanryItems.init();
        ArtisanryComponents.init();
    }

    public static Identifier id(String path) {
        return new Identifier(ARTISANRY, path);
    }
}
