package net.immortaldevs.artisanry.sar;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.ComponentData;
import net.immortaldevs.sar.base.client.modifier.LayeredItemModelModifier;
import net.immortaldevs.sar.base.client.modifier.SpriteLayerModifier;
import net.immortaldevs.artisanry.client.sar.ArtisanryLoadedModels;

public class WoodenToolHandleComponent extends Component {
    @Override
    public void init(ComponentData data) {
        if (data.onClient()) {
            data.addModifier((SpriteLayerModifier) consumer ->
                    consumer.accept(ArtisanryLoadedModels.WOODEN_TOOL_HANDLE, 0));

            data.addModifier(new LayeredItemModelModifier(data.modifierMap()));
        }

        data.loadChildren("modifiers");
    }
}
