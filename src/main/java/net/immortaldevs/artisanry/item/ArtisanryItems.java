package net.immortaldevs.artisanry.item;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.immortaldevs.artisanry.Artisanry.id;

public class ArtisanryItems {
    public static final Item TOOL_PART = new Item(new Item.Settings());
    public static final Item PICKAXE = new ArtisanryPickaxeItem(new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, id("tool_part"), TOOL_PART);
        Registry.register(Registry.ITEM, id("pickaxe"), PICKAXE);
    }
}
