package net.immortaldevs.artisanry.util;

import net.immortaldevs.sar.base.AttributeModifierModifier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

public final class AttributeModifiers {
    public static AttributeModifierModifier damageSpeed(double damage, double speed) {
        return AttributeModifierModifier.of(EquipmentSlot.MAINHAND,
                EntityAttributes.GENERIC_ATTACK_DAMAGE,
                add(damage),
                EntityAttributes.GENERIC_ATTACK_SPEED,
                add(speed));
    }

    public static AttributeModifierModifier damage(double damage) {
        return AttributeModifierModifier.of(EquipmentSlot.MAINHAND,
                EntityAttributes.GENERIC_ATTACK_DAMAGE,
                add(damage));
    }

    public static EntityAttributeModifier add(double value) {
        return new EntityAttributeModifier("Tool part modifier",
                value,
                EntityAttributeModifier.Operation.ADDITION);
    }
}
