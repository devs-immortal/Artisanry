package net.immortaldevs.aptitude.base;

import net.immortaldevs.aptitude.api.Component;
import net.immortaldevs.aptitude.mixin.RegistryAccessor;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class AptitudeRegistries {
    public static final RegistryKey<Registry<Component>> COMPONENT_KEY =
            RegistryAccessor.callCreateRegistryKey("aptitude:component");

    public static final DefaultedRegistry<Component> COMPONENT =
            RegistryAccessor.callCreate(COMPONENT_KEY,
                    "aptitude:unknown", () -> Component.UNKNOWN);
}
