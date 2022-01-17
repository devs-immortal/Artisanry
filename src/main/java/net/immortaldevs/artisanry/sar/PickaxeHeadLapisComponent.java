package net.immortaldevs.artisanry.sar;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.ComponentData;
import net.immortaldevs.sar.base.client.modifier.LayeredSpriteModelModifier;
import net.immortaldevs.sar.base.client.modifier.SpriteLayerModifier;
import net.immortaldevs.artisanry.sar.modifier.FortuneModifier;
import net.immortaldevs.artisanry.client.sar.ArtisanryLoadedModels;
import net.minecraft.text.LiteralText;

public class PickaxeHeadLapisComponent extends Component {
    @Override
    public void init(ComponentData data) {
        if (data.onClient()) {
            data.addModifier((SpriteLayerModifier) consumer ->
                    consumer.accept(ArtisanryLoadedModels.PICKAXE_HEAD_LAPIS, 1));

            data.addModifier(new LayeredSpriteModelModifier());
        }

        data.addModifier((FortuneModifier) (stack, consumer) ->
                consumer.accept(new LiteralText("This item, \"")
                        .append(stack.getName())
                        .append("\", has fortune!")));
    }
}
