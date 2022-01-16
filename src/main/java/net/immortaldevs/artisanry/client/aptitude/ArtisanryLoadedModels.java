package net.immortaldevs.artisanry.client.aptitude;

import net.immortaldevs.aptitude.base.client.AptitudeSprite;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.immortaldevs.artisanry.Artisanry;

@Environment(EnvType.CLIENT)
public class ArtisanryLoadedModels {
    public static final AptitudeSprite IRON_PICKAXE_HEAD = new AptitudeSprite(Artisanry.ARTISANRY, "iron_pickaxe_head");
    public static final AptitudeSprite WOODEN_TOOL_HANDLE = new AptitudeSprite(Artisanry.ARTISANRY, "wooden_tool_handle");
    public static final AptitudeSprite PICKAXE_HEAD_LAPIS = new AptitudeSprite(Artisanry.ARTISANRY, "pickaxe_head_lapis");

    public static void touch() {
    }
}
