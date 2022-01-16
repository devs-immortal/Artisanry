package net.immortaldevs.aptitude.mixin;

import net.immortaldevs.aptitude.base.RootComponentData;
import net.immortaldevs.aptitude.base.VersionedRootComponentData;
import net.immortaldevs.aptitude.base.AptitudeItemStackExt;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements AptitudeItemStackExt {
    @Shadow
    public abstract @Nullable NbtCompound getNbt();

    @Unique
    private @Nullable VersionedRootComponentData componentRoot;

    @Override
    public @Nullable RootComponentData aptitude$getComponentRoot() {
        NbtCompound nbt = this.getNbt();
        if (nbt == null || !nbt.contains("aptitude_component_version", NbtElement.INT_TYPE)) {
            return null;
        }

        int version = nbt.getInt("aptitude_component_version");
        if (this.componentRoot != null && this.componentRoot.version == version) {
            return this.componentRoot;
        }

        NbtCompound aptitudeComponent = nbt.getCompound("aptitude_component");
        this.componentRoot = new VersionedRootComponentData(aptitudeComponent, true, version);

        return this.componentRoot;
    }
}
