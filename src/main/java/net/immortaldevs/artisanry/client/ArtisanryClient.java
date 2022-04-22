package net.immortaldevs.artisanry.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.immortaldevs.artisanry.client.component.ArtisanryComponentModels;

@Environment(EnvType.CLIENT)
public class ArtisanryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ArtisanryComponentModels.init();
    }
}
