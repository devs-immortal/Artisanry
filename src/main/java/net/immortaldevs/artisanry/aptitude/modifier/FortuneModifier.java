package net.immortaldevs.artisanry.aptitude.modifier;

import net.immortaldevs.aptitude.api.Modifier;
import net.immortaldevs.aptitude.api.ModifierMap;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.function.Consumer;

@FunctionalInterface
public interface FortuneModifier extends Modifier {
    void apply(ItemStack stack, Consumer<Text> consumer);

    @Override
    default void register(ModifierMap modifierMap) {
        modifierMap.append(FortuneModifier.class, this, fortuneModifier -> (stack, consumer) -> {
            fortuneModifier.apply(stack, consumer);
            this.apply(stack, consumer);
        });
    }
}
