package net.immortaldevs.aptitude.base.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface AptitudeSpriteExt {
    int aptitude$getAtlasWidth();

    int aptitude$getAtlasHeight();
}
