package net.immortaldevs.artisanry.item;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static net.immortaldevs.artisanry.Artisanry.id;

public final class ArtisanryItems {
    public static final Item PICKAXE = new Item(new Item.Settings().maxCount(1));
    public static final Item IRON_ARROW_HEAD = new Item(new Item.Settings());
    public static final Item IRON_AXE_HEAD = new Item(new Item.Settings());
    public static final Item IRON_BOW_LIMB = new Item(new Item.Settings());
    public static final Item OAK_BOW_LIMB = new Item(new Item.Settings());
    public static final Item LEATHER_BOWSTRING = new Item(new Item.Settings());
    public static final Item IRON_BROADSWORD_BLADE = new Item(new Item.Settings());
    public static final Item IRON_CAIN_HEAD = new Item(new Item.Settings());
    public static final Item IRON_CLAYDHEAM_MOR_BLADE = new Item(new Item.Settings());
    public static final Item IRON_CROSS_GUARD = new Item(new Item.Settings());
    public static final Item IRON_CROSSBOW_BODY = new Item(new Item.Settings());
    public static final Item OAK_CROSSBOW_BODY = new Item(new Item.Settings());
    public static final Item IRON_CROSSBOW_LIMB = new Item(new Item.Settings());
    public static final Item OAK_CROSSBOW_LIMB = new Item(new Item.Settings());
    public static final Item IRON_DART = new Item(new Item.Settings());
    public static final Item IRON_DWARF_GUARD = new Item(new Item.Settings());
    public static final Item IRON_ESTOC_BLADE = new Item(new Item.Settings());
    public static final Item FEATHER_FLETCHING = new Item(new Item.Settings());
    public static final Item IRON_GREATARROW_HEAD = new Item(new Item.Settings());
    public static final Item IRON_GREATAXE_HEAD = new Item(new Item.Settings());
    public static final Item IRON_GREATBOW_LIMB = new Item(new Item.Settings());
    public static final Item OAK_GREATBOW_LIMB = new Item(new Item.Settings());
    public static final Item IRON_HAFT = new Item(new Item.Settings());
    public static final Item OAK_HAFT = new Item(new Item.Settings());
    public static final Item IRON_HAMMER_HEAD = new Item(new Item.Settings());
    public static final Item IRON_HOE_HEAD = new Item(new Item.Settings());
    public static final Item IRON_KNIFE_BLADE = new Item(new Item.Settings());
    public static final Item IRON_MOON_GUARD = new Item(new Item.Settings());
    public static final Item IRON_PARTIZAN_BLADE = new Item(new Item.Settings());
    public static final PickaxeHeadItem IRON_PICKAXE_HEAD = new PickaxeHeadItem(new Item.Settings());
    public static final Item IRON_PROSPECTING_PICKAXE_HEAD = new Item(new Item.Settings());
    public static final Item LEATHER_RAGS = new Item(new Item.Settings());
    public static final Item IRON_RECURVE_BLADE = new Item(new Item.Settings());
    public static final Item IRON_RIVETS = new Item(new Item.Settings());
    public static final Item IRON_SCYTHE_BLADE = new Item(new Item.Settings());
    public static final Item IRON_SHOVEL_HEAD = new Item(new Item.Settings());
    public static final Item IRON_SLAB = new Item(new Item.Settings());
    public static final Item IRON_THROWING_DAGGER = new Item(new Item.Settings());
    public static final Item IRON_UCHIGATANA_BLADE = new Item(new Item.Settings());


    public static void init() {
        Registry.register(Registry.ITEM, id("pickaxe"), PICKAXE);
        Registry.register(Registry.ITEM, id("iron_arrow_head"), IRON_ARROW_HEAD);
        Registry.register(Registry.ITEM, id("iron_axe_head"), IRON_AXE_HEAD);
        Registry.register(Registry.ITEM, id("iron_bow_limb"), IRON_BOW_LIMB);
        Registry.register(Registry.ITEM, id("oak_bow_limb"), OAK_BOW_LIMB);
        Registry.register(Registry.ITEM, id("leather_bowstring"), LEATHER_BOWSTRING);
        Registry.register(Registry.ITEM, id("iron_broadsword_blade"), IRON_BROADSWORD_BLADE);
        Registry.register(Registry.ITEM, id("iron_cain_head"), IRON_CAIN_HEAD);
        Registry.register(Registry.ITEM, id("iron_claydheam_mor_blade"), IRON_CLAYDHEAM_MOR_BLADE);
        Registry.register(Registry.ITEM, id("iron_cross_guard"), IRON_CROSS_GUARD);
        Registry.register(Registry.ITEM, id("iron_crossbow_body"), IRON_CROSSBOW_BODY);
        Registry.register(Registry.ITEM, id("oak_crossbow_body"), OAK_CROSSBOW_BODY);
        Registry.register(Registry.ITEM, id("iron_crossbow_limb"), IRON_CROSSBOW_LIMB);
        Registry.register(Registry.ITEM, id("oak_crossbow_limb"), OAK_CROSSBOW_LIMB);
        Registry.register(Registry.ITEM, id("iron_dart"), IRON_DART);
        Registry.register(Registry.ITEM, id("iron_dwarf_guard"), IRON_DWARF_GUARD);
        Registry.register(Registry.ITEM, id("iron_estoc_blade"), IRON_ESTOC_BLADE);
        Registry.register(Registry.ITEM, id("feather_fletching"), FEATHER_FLETCHING);
        Registry.register(Registry.ITEM, id("iron_greatarrow_head"), IRON_GREATARROW_HEAD);
        Registry.register(Registry.ITEM, id("iron_greataxe_head"), IRON_GREATAXE_HEAD);
        Registry.register(Registry.ITEM, id("iron_greatbow_limb"), IRON_GREATBOW_LIMB);
        Registry.register(Registry.ITEM, id("oak_greatbow_limb"), OAK_GREATBOW_LIMB);
        Registry.register(Registry.ITEM, id("iron_haft"), IRON_HAFT);
        Registry.register(Registry.ITEM, id("oak_haft"), OAK_HAFT);
        Registry.register(Registry.ITEM, id("iron_hammer_head"), IRON_HAMMER_HEAD);
        Registry.register(Registry.ITEM, id("iron_hoe_head"), IRON_HOE_HEAD);
        Registry.register(Registry.ITEM, id("iron_knife_blade"), IRON_KNIFE_BLADE);
        Registry.register(Registry.ITEM, id("iron_moon_guard"), IRON_MOON_GUARD);
        Registry.register(Registry.ITEM, id("iron_partizan_blade"), IRON_PARTIZAN_BLADE);
        Registry.register(Registry.ITEM, id("iron_pickaxe_head"), IRON_PICKAXE_HEAD);
        Registry.register(Registry.ITEM, id("iron_prospecting_pickaxe_head"), IRON_PROSPECTING_PICKAXE_HEAD);
        Registry.register(Registry.ITEM, id("leather_rags"), LEATHER_RAGS);
        Registry.register(Registry.ITEM, id("iron_recurve_blade"), IRON_RECURVE_BLADE);
        Registry.register(Registry.ITEM, id("iron_rivets"), IRON_RIVETS);
        Registry.register(Registry.ITEM, id("iron_scythe_blade"), IRON_SCYTHE_BLADE);
        Registry.register(Registry.ITEM, id("iron_shovel_head"), IRON_SHOVEL_HEAD);
        Registry.register(Registry.ITEM, id("iron_slab"), IRON_SLAB);
        Registry.register(Registry.ITEM, id("iron_throwing_dagger"), IRON_THROWING_DAGGER);
        Registry.register(Registry.ITEM, id("iron_uchigatana_blade"), IRON_UCHIGATANA_BLADE);
    }
}
