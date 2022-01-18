package net.immortaldevs.artisanry.sar;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.ComponentData;

public class PickaxeComponent extends Component {
    private static final ModifierHelper HEAD_HELPER = new ModifierHelper()
            .translate(2, -1, 100);

    private static final ModifierHelper HANDLE_HELPER = new ModifierHelper()
            .translate(0, 1, -100);

    @Override
    public void init(ComponentData data) {
        data.addChild("head", HEAD_HELPER.build(data));
        data.addChild("handle", HANDLE_HELPER.build(data));
    }
}