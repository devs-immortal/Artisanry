package net.immortaldevs.aptitude.base;

import net.immortaldevs.aptitude.api.Component;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Aptitude implements ModInitializer {
    public static final String APTITUDE = "aptitude";
    @Override
    public void onInitialize() {
        Registry.register(AptitudeRegistries.COMPONENT,
                new Identifier("aptitude", "unknown"),
                Component.UNKNOWN);
    }
}
