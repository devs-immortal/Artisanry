package net.immortaldevs.artisanry.component;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.LarvalComponentData;

public class PickaxeComponent extends Component {
    @Override
    public void init(LarvalComponentData data) {
        data.loadChild("head");
        data.loadChild("haft");
    }
}
