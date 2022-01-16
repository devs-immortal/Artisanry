package net.immortaldevs.aptitude.base;

import net.immortaldevs.aptitude.api.ModifierMap;
import net.minecraft.nbt.NbtCompound;

public class RootComponentData extends BasicComponentData {
    public final ModifierMap modifierMap;

    public RootComponentData(NbtCompound nbt, boolean onClient) {
        this(nbt, onClient, new HashModifierMap());
    }

    public RootComponentData(NbtCompound nbt, boolean onClient, ModifierMap modifierMap) {
        super(nbt, onClient, modifier -> modifier.register(modifierMap));
        this.modifierMap = modifierMap;
    }
}
