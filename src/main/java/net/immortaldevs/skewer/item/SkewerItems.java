package net.immortaldevs.skewer.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import static net.immortaldevs.skewer.Skewer.id;

public class SkewerItems {
    public static final SkewerItem SKEWER = new SkewerItem(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().build())
            .maxCount(1));

    public static void init() {
        Registry.register(Registry.ITEM, id("skewer"), SKEWER);
    }
}
