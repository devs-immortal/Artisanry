package net.immortaldevs.aptitude.base.client;

import net.immortaldevs.aptitude.base.RootComponentData;
import net.immortaldevs.aptitude.base.client.modifier.BakedModelModifier;
import net.immortaldevs.aptitude.base.AptitudeItemStackExt;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.texture.Sprite;
import net.minecraft.item.ItemStack;

import java.util.*;
import java.util.function.Supplier;

@Environment(EnvType.CLIENT)
public class DynamicBakedModel extends ForwardingBakedModel {
    public DynamicBakedModel(BakedModel wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean isVanillaAdapter() {
        return false;
    }

    @Override
    public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
        super.emitItemQuads(stack, randomSupplier, context);

        RootComponentData root = ((AptitudeItemStackExt) (Object) stack).aptitude$getComponentRoot();
        if (root == null) return;

        BakedModelModifier bakedModelModifier = root.modifierMap.get(BakedModelModifier.class);
        if (bakedModelModifier != null) {
            bakedModelModifier.apply(bakedModel ->
                    ((FabricBakedModel) bakedModel).emitItemQuads(stack, randomSupplier, context));
        }
    }

    @Override
    public Sprite getParticleSprite() {
        return super.getParticleSprite();
    }
}
