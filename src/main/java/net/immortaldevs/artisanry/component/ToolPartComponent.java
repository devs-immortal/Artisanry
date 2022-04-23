package net.immortaldevs.artisanry.component;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.LarvalComponentData;
import net.immortaldevs.sar.api.Modifier;

public class ToolPartComponent extends Component {
    protected final Modifier[] modifiers;

    public ToolPartComponent(Modifier... modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public void init(LarvalComponentData data) {
        for (Modifier modifier : modifiers) data.addModifier(modifier);
        data.loadChildren("modifiers");
    }
}
