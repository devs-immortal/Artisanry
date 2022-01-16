package net.immortaldevs.artisanry.item;

import net.immortaldevs.artisanry.aptitude.modifier.FortuneModifier;
import net.immortaldevs.aptitude.base.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ArtisanryPickaxeItem extends Item {
    public ArtisanryPickaxeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        Util.applyModifier(stack, FortuneModifier.class, fortuneModifier ->
                fortuneModifier.apply(stack, text -> user.sendMessage(text, true)));
        return super.use(world, user, hand);
    }
}
