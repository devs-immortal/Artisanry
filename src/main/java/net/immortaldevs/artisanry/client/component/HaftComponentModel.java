package net.immortaldevs.artisanry.client.component;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.ComponentData;
import net.immortaldevs.sar.base.client.LoadedModelComponentModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class HaftComponentModel extends LoadedModelComponentModel {
    public HaftComponentModel(Component component) {
        super(component);
    }

    @Override
    public void itemRender(ComponentData data,
                           VertexConsumerProvider vertexConsumers,
                           ItemStack stack, MatrixStack matrices,
                           ModelTransformation.Mode renderMode,
                           int light,
                           int overlay) {
        matrices.translate(0.0, -0.0625, 0.0);
        super.itemRender(data, vertexConsumers, stack, matrices, renderMode, light, overlay);
    }
}
