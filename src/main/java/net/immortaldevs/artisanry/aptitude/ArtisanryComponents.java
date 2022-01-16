package net.immortaldevs.artisanry.aptitude;

import net.minecraft.util.registry.Registry;

import static net.immortaldevs.artisanry.Artisanry.id;
import static net.immortaldevs.aptitude.base.AptitudeRegistries.COMPONENT;

public class ArtisanryComponents {
    public static final PickaxeComponent PICKAXE = new PickaxeComponent();
    public static final IronPickaxeHeadComponent IRON_PICKAXE_HEAD = new IronPickaxeHeadComponent();
    public static final WoodenToolHandleComponent WOODEN_TOOL_HANDLE = new WoodenToolHandleComponent();
    public static final PickaxeHeadLapisComponent PICKAXE_HEAD_LAPIS = new PickaxeHeadLapisComponent();

    public static void init() {
        Registry.register(COMPONENT, id("pickaxe"), PICKAXE);
        Registry.register(COMPONENT, id("iron_pickaxe_head"), IRON_PICKAXE_HEAD);
        Registry.register(COMPONENT, id("wooden_tool_handle"), WOODEN_TOOL_HANDLE);
        Registry.register(COMPONENT, id("pickaxe_head_lapis"), PICKAXE_HEAD_LAPIS);
    }
}
