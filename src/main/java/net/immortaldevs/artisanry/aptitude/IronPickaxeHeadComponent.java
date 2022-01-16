package net.immortaldevs.artisanry.aptitude;

import net.immortaldevs.aptitude.api.Component;
import net.immortaldevs.aptitude.api.ComponentData;
import net.immortaldevs.aptitude.base.client.modifier.LayeredSpriteModelModifier;
import net.immortaldevs.aptitude.base.client.modifier.SpriteLayerModifier;
import net.immortaldevs.artisanry.client.aptitude.ArtisanryLoadedModels;

public class IronPickaxeHeadComponent extends Component {
    @Override
    public void init(ComponentData data) {
        if (data.onClient()) {
            data.addModifier((SpriteLayerModifier) consumer ->
                    consumer.accept(ArtisanryLoadedModels.IRON_PICKAXE_HEAD, 0));

            data.addModifier(new LayeredSpriteModelModifier());
        }

        data.addChildren("modifiers");
    }
}
