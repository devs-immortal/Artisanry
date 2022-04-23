package net.immortaldevs.artisanry.mixin;

import net.immortaldevs.artisanry.modifiers.DamageModifier;
import net.immortaldevs.artisanry.modifiers.DurabilityModifier;
import net.immortaldevs.artisanry.modifiers.MiningSpeedModifier;
import net.immortaldevs.artisanry.modifiers.ToolSuitabilityModifier;
import net.immortaldevs.divineintervention.injection.ModifyOperand;
import net.immortaldevs.sar.base.SarItemStack;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Slice;

import java.util.Random;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements SarItemStack {
    @Shadow
    public abstract Item getItem();

    @ModifyOperand(method = "getMaxDamage",
            at = @At(value = "RETURN",
                    shift = At.Shift.BEFORE))
    private int getMaxDamage(int value) {
        DurabilityModifier modifier = this.getModifiers().get(DurabilityModifier.class);
        if (modifier == null) return value;
        return modifier.apply(value, (ItemStack) (Object) this);
    }

    @ModifyOperand(method = "isDamageable",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/item/Item;getMaxDamage()I"))
    private int isDamageable(int value) {
        DurabilityModifier modifier = this.getModifiers().get(DurabilityModifier.class);
        if (modifier == null) return value;
        return modifier.apply(value, (ItemStack) (Object) this);
    }

    @SuppressWarnings("InvalidInjectorMethodSignature")
    @ModifyVariable(method = "damage(ILjava/util/Random;Lnet/minecraft/server/network/ServerPlayerEntity;)Z",
            index = 1,
            at = @At(value = "JUMP",
                    opcode = Opcodes.IFNULL,
                    ordinal = 0),
            slice = @Slice(
                    from = @At(value = "INVOKE",
                            target = "Lnet/minecraft/enchantment/UnbreakingEnchantment;shouldPreventDamage(Lnet/minecraft/item/ItemStack;ILjava/util/Random;)Z")),
            argsOnly = true)
    private int modifyDamage(int amount, int oldAmount, Random random, @Nullable ServerPlayerEntity player) {
        DamageModifier modifier = this.getModifiers().get(DamageModifier.class);
        if (modifier == null) return amount;
        return modifier.apply(amount, (ItemStack) (Object) this, random, player);
    }

    @ModifyOperand(method = "isSuitableFor",
            at = @At(value = "RETURN",
                    shift = At.Shift.BEFORE))
    private boolean isSuitableFor(boolean suitable, BlockState state) {
        ToolSuitabilityModifier modifier = this.getModifiers().get(ToolSuitabilityModifier.class);
        if (modifier == null) return suitable;
        return modifier.apply(suitable, (ItemStack) (Object) this, state);
    }

    @ModifyOperand(method = "getMiningSpeedMultiplier",
            at = @At(value = "RETURN",
                    shift = At.Shift.BEFORE))
    private float getMiningSpeedMultiplier(float multiplier, BlockState state) {
        MiningSpeedModifier modifier = this.getModifiers().get(MiningSpeedModifier.class);
        if (modifier == null) return multiplier;
        return modifier.apply(multiplier, (ItemStack) (Object) this, state);
    }
}
