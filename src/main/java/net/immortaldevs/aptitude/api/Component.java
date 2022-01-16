package net.immortaldevs.aptitude.api;

import net.immortaldevs.aptitude.base.AptitudeRegistries;

public abstract class Component {
    public static final Component UNKNOWN = new Component() {
        @Override
        public void init(ComponentData data) {
        }
    };

    public abstract void init(ComponentData data);

    @Override
    public String toString() {
        return AptitudeRegistries.COMPONENT.getId(this).toString();
    }
}
