package net.immortaldevs.artisanry.sar.modifier;

import net.immortaldevs.sar.api.Modifier;
import net.immortaldevs.sar.api.ModifierMap;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.function.Consumer;

@FunctionalInterface
public interface FortuneModifier extends Modifier {
    void apply(ItemStack stack, Consumer<Text> consumer);

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.merge(FortuneModifier.class, this, (a, b) -> (stack, consumer) -> {
            a.apply(stack, consumer);
            b.apply(stack, consumer);
        });
    }
}
