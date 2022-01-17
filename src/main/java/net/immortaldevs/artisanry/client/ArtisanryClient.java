package net.immortaldevs.artisanry.client;

import net.immortaldevs.artisanry.client.sar.ArtisanryLoadedModels;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ArtisanryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ArtisanryLoadedModels.touch();
    }
}
