package net.immortaldevs.artisanry.client.component;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.ComponentData;
import net.immortaldevs.sar.base.client.LoadedModelComponentModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3f;

public class TestComponentModel extends LoadedModelComponentModel {
    public TestComponentModel(Component component) {
        super(component);
    }

    @Override
    public void itemRender(ComponentData data,
                           VertexConsumerProvider vertexConsumers,
                           ItemStack stack,
                           MatrixStack matrices,
                           ModelTransformation.Mode renderMode,
                           int light,
                           int overlay) {
        NbtCompound nbt = data.getNbt();
        if (nbt != null) {
            NbtCompound translation = nbt.getCompound("translation");
            matrices.translate(translation.getDouble("x"),
                    translation.getDouble("y"),
                    translation.getDouble("z"));

            NbtCompound rotation = nbt.getCompound("rotation");
            matrices.multiply(Quaternion.fromEulerXyzDegrees(new Vec3f(rotation.getFloat("x"),
                    rotation.getFloat("y"),
                    rotation.getFloat("z"))));
        }

        super.itemRender(data, vertexConsumers, stack, matrices, renderMode, light, overlay);
    }
}
