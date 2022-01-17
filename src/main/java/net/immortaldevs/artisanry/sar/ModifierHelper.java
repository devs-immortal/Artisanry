package net.immortaldevs.artisanry.sar;

import net.immortaldevs.sar.api.ComponentData;
import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.base.client.modifier.SpriteLayerModifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public final class ModifierHelper {
    private BiConsumer<ComponentData, Modifier> consumer = ComponentData::addModifier;

    public ModifierHelper add(Function<BiConsumer<ComponentData, Modifier>,
                    BiConsumer<ComponentData, Modifier>> function) {
        this.consumer = function.apply(this.consumer);
        return this;
    }

    public Consumer<Modifier> build(ComponentData data) {
        return modifier -> consumer.accept(data, modifier);
    }

    public ModifierHelper translate(int x, int y, float z) {
        return this.add(consumer -> (data, modifier) -> {
            if (data.onClient() && modifier instanceof SpriteLayerModifier spriteLayerModifier) {
                consumer.accept(data, spriteLayerModifier.translate(x, y, z));
            } else {
                consumer.accept(data, modifier);
            }
        });
    }
}
