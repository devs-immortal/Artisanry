package net.immortaldevs.artisanry.mixin;

import net.immortaldevs.artisanry.modifiers.DurabilityModifier;
import net.immortaldevs.divineintervention.injection.ModifyOperand;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Item.class)
public abstract class ItemMixin {
    @ModifyOperand(method = {"getItemBarStep", "getItemBarColor"},
            at = @At(value = "FIELD",
                    target = "Lnet/minecraft/item/Item;maxDamage:I"))
    private int getMaxDamage(int value, ItemStack stack) {
        DurabilityModifier modifier = stack.getModifiers().get(DurabilityModifier.class);
        if (modifier == null) return value;
        return modifier.apply(value, stack);
    }
}
