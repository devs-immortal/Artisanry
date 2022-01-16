package net.immortaldevs.artisanry.aptitude;

import net.immortaldevs.aptitude.api.Component;
import net.immortaldevs.aptitude.api.ComponentData;
import net.immortaldevs.aptitude.base.client.modifier.LayeredSpriteModelModifier;
import net.immortaldevs.aptitude.base.client.modifier.SpriteLayerModifier;
import net.immortaldevs.artisanry.aptitude.modifier.FortuneModifier;
import net.immortaldevs.artisanry.client.aptitude.ArtisanryLoadedModels;
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
