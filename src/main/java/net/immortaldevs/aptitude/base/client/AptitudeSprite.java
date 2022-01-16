package net.immortaldevs.aptitude.base.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public final class AptitudeSprite {
    private static final List<SpriteIdentifier> IDS = new ArrayList<>();
    private static boolean frozen = false;

    public final SpriteIdentifier id;

    @SuppressWarnings("deprecation")
    public AptitudeSprite(String namespace, String path) {
        this(new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE,
                new Identifier(namespace, "aptitude/" + path)));
    }

    public AptitudeSprite(SpriteIdentifier id) {
        if (frozen) {
            throw new IllegalStateException("Cannot create aptitude sprite " + id
                    + " because sprites have already finished loading");
        }

        this.id = id;
        IDS.add(this.id);
    }

    public static List<SpriteIdentifier> freeze() {
        frozen = true;
        return IDS;
    }
}
