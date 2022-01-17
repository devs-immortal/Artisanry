package net.immortaldevs.artisanry.client.sar;

import net.immortaldevs.sar.base.client.SarSprite;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.immortaldevs.artisanry.Artisanry;

@Environment(EnvType.CLIENT)
public class ArtisanryLoadedModels {
    public static final SarSprite IRON_PICKAXE_HEAD = new SarSprite(Artisanry.ARTISANRY, "iron_pickaxe_head");
    public static final SarSprite WOODEN_TOOL_HANDLE = new SarSprite(Artisanry.ARTISANRY, "wooden_tool_handle");
    public static final SarSprite PICKAXE_HEAD_LAPIS = new SarSprite(Artisanry.ARTISANRY, "pickaxe_head_lapis");

    public static void touch() {
    }
}
