package net.immortaldevs.aptitude.base.client.modifier;

import net.immortaldevs.aptitude.api.ModifierMap;
import net.immortaldevs.aptitude.api.Modifier;
import net.immortaldevs.aptitude.base.client.AptitudeSprite;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
@FunctionalInterface
public interface SpriteLayerModifier extends Modifier {
    void apply(SpriteConsumer consumer);

    default SpriteLayerModifier translate(int x, int y, float z) {
        return consumer -> this.apply((sprite, x0, y0, z0) ->
                consumer.accept(sprite, x0 + x, y0 + y, z0 + z));
    }

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.append(SpriteLayerModifier.class, this, spriteLayerModifier -> consumer -> {
            spriteLayerModifier.apply(consumer);
            this.apply(consumer);
        });
    }

    @Environment(EnvType.CLIENT)
    @FunctionalInterface
    interface SpriteConsumer {
        void accept(AptitudeSprite sprite, int x, int y, float z);

        default void accept(AptitudeSprite sprite, float z) {
            this.accept(sprite, 0, 0, z);
        }
    }
}
