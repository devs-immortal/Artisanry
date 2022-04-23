package net.immortaldevs.artisanry.component;

import net.immortaldevs.sar.api.Component;
import net.immortaldevs.sar.api.SarRegistries;
import net.minecraft.util.registry.Registry;

import static net.immortaldevs.artisanry.Artisanry.id;
import static net.immortaldevs.artisanry.component.HaftComponents.*;
import static net.immortaldevs.artisanry.component.PickaxeHeadComponents.*;

public final class ArtisanryComponents {
    public static final Component PICKAXE = new PickaxeComponent();
    public static final Component IRON_ARROW_HEAD = new Component();
    public static final Component IRON_AXE_HEAD = new Component();
    public static final Component IRON_BOW_LIMB = new Component();
    public static final Component OAK_BOW_LIMB = new Component();
    public static final Component LEATHER_BOWSTRING = new Component();
    public static final Component IRON_BROADSWORD_BLADE = new Component();
    public static final Component IRON_CAIN_HEAD = new Component();
    public static final Component IRON_CLAYDHEAM_MOR_BLADE = new Component();
    public static final Component IRON_CROSS_GUARD = new Component();
    public static final Component IRON_CROSSBOW_BODY = new Component();
    public static final Component OAK_CROSSBOW_BODY = new Component();
    public static final Component IRON_CROSSBOW_LIMB = new Component();
    public static final Component OAK_CROSSBOW_LIMB = new Component();
    public static final Component IRON_DART = new Component();
    public static final Component IRON_ESTOC_BLADE = new Component();
    public static final Component FEATHER_FLETCHING = new Component();
    public static final Component IRON_GREATARROW_HEAD = new Component();
    public static final Component IRON_GREATAXE_HEAD = new Component();
    public static final Component IRON_GREATBOW_LIMB = new Component();
    public static final Component OAK_GREATBOW_LIMB = new Component();
    public static final Component IRON_HAMMER_HEAD = new Component();
    public static final Component IRON_HOE_HEAD = new Component();
    public static final Component IRON_KNIFE_BLADE = new Component();
    public static final Component IRON_PARTIZAN_BLADE = new Component();
    public static final Component IRON_PROSPECTING_PICKAXE_HEAD = new Component();
    public static final Component LEATHER_RAGS = new Component();
    public static final Component IRON_RECURVE_BLADE = new Component();
    public static final Component IRON_RIVETS = new Component();
    public static final Component IRON_SCYTHE_BLADE = new Component();
    public static final Component IRON_SHOVEL_HEAD = new Component();
    public static final Component IRON_SLAB = new Component();
    public static final Component IRON_THROWING_DAGGER = new Component();
    public static final Component IRON_UCHIGATANA_BLADE = new Component();

    public static void init() {
        Registry.register(SarRegistries.COMPONENT, id("pickaxe"), PICKAXE);
        Registry.register(SarRegistries.COMPONENT, id("iron_arrow_head"), IRON_ARROW_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_axe_head"), IRON_AXE_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_bow_limb"), IRON_BOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("oak_bow_limb"), OAK_BOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("leather_bowstring"), LEATHER_BOWSTRING);
        Registry.register(SarRegistries.COMPONENT, id("iron_broadsword_blade"), IRON_BROADSWORD_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_cain_head"), IRON_CAIN_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_claydheam_mor_blade"), IRON_CLAYDHEAM_MOR_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_cross_guard"), IRON_CROSS_GUARD);
        Registry.register(SarRegistries.COMPONENT, id("iron_crossbow_body"), IRON_CROSSBOW_BODY);
        Registry.register(SarRegistries.COMPONENT, id("oak_crossbow_body"), OAK_CROSSBOW_BODY);
        Registry.register(SarRegistries.COMPONENT, id("iron_crossbow_limb"), IRON_CROSSBOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("oak_crossbow_limb"), OAK_CROSSBOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("iron_dart"), IRON_DART);
        Registry.register(SarRegistries.COMPONENT, id("iron_estoc_blade"), IRON_ESTOC_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("feather_fletching"), FEATHER_FLETCHING);
        Registry.register(SarRegistries.COMPONENT, id("iron_greatarrow_head"), IRON_GREATARROW_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_greataxe_head"), IRON_GREATAXE_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_greatbow_limb"), IRON_GREATBOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("oak_greatbow_limb"), OAK_GREATBOW_LIMB);
        Registry.register(SarRegistries.COMPONENT, id("iron_haft"), IRON_HAFT);
        Registry.register(SarRegistries.COMPONENT, id("oak_haft"), OAK_HAFT);
        Registry.register(SarRegistries.COMPONENT, id("iron_hammer_head"), IRON_HAMMER_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_hoe_head"), IRON_HOE_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_knife_blade"), IRON_KNIFE_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_partizan_blade"), IRON_PARTIZAN_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_pickaxe_head"), IRON_PICKAXE_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("iron_prospecting_pickaxe_head"), IRON_PROSPECTING_PICKAXE_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("leather_rags"), LEATHER_RAGS);
        Registry.register(SarRegistries.COMPONENT, id("iron_recurve_blade"), IRON_RECURVE_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_rivets"), IRON_RIVETS);
        Registry.register(SarRegistries.COMPONENT, id("iron_scythe_blade"), IRON_SCYTHE_BLADE);
        Registry.register(SarRegistries.COMPONENT, id("iron_shovel_head"), IRON_SHOVEL_HEAD);
        Registry.register(SarRegistries.COMPONENT, id("ison_slab"), IRON_SLAB);
        Registry.register(SarRegistries.COMPONENT, id("iron_throwing_dagger"), IRON_THROWING_DAGGER);
        Registry.register(SarRegistries.COMPONENT, id("iron_uchigatana_blade"), IRON_UCHIGATANA_BLADE);
    }
}
