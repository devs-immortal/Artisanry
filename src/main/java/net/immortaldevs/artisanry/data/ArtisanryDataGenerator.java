package net.immortaldevs.artisanry.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.immortaldevs.artisanry.component.ArtisanryComponents;
import net.immortaldevs.artisanry.component.HaftComponents;
import net.immortaldevs.artisanry.component.PickaxeHeadComponents;
import net.immortaldevs.artisanry.item.ArtisanryItems;
import net.immortaldevs.sar.base.data.ComponentModelGenerator;
import net.immortaldevs.sar.base.data.SarModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ArtisanryDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(ArtisanryModelProvider::new);
    }

    private static final class ArtisanryModelProvider extends FabricModelProvider implements SarModelProvider {
        private ArtisanryModelProvider(FabricDataGenerator generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator generator) {
        }

        @Override
        public void generateItemModels(ItemModelGenerator generator) {
            generator.register(ArtisanryItems.PICKAXE, new Model(Optional.of(new Identifier("item/generated")), Optional.empty()));
            generator.register(ArtisanryItems.IRON_ARROW_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_AXE_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_BOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.OAK_BOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.LEATHER_BOWSTRING, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_BROADSWORD_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_CAIN_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_CLAYDHEAM_MOR_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_CROSS_GUARD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_CROSSBOW_BODY, Models.GENERATED);
            generator.register(ArtisanryItems.OAK_CROSSBOW_BODY, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_CROSSBOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.OAK_CROSSBOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_DART, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_ESTOC_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.FEATHER_FLETCHING, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_GREATARROW_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_GREATAXE_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_GREATBOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.OAK_GREATBOW_LIMB, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_HAFT, Models.GENERATED);
            generator.register(ArtisanryItems.OAK_HAFT, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_HAMMER_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_HOE_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_KNIFE_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_PARTIZAN_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_PICKAXE_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_PROSPECTING_PICKAXE_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.LEATHER_RAGS, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_RECURVE_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_RIVETS, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_SCYTHE_BLADE, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_SHOVEL_HEAD, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_SLAB, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_THROWING_DAGGER, Models.GENERATED);
            generator.register(ArtisanryItems.IRON_UCHIGATANA_BLADE, Models.GENERATED);
        }

        @Override
        public void generateComponentModels(ComponentModelGenerator generator) {
            generator.register(ArtisanryComponents.IRON_ARROW_HEAD, ArtisanryItems.IRON_ARROW_HEAD);
            generator.register(ArtisanryComponents.IRON_AXE_HEAD, ArtisanryItems.IRON_AXE_HEAD);
            generator.register(ArtisanryComponents.IRON_BOW_LIMB, ArtisanryItems.IRON_BOW_LIMB);
            generator.register(ArtisanryComponents.OAK_BOW_LIMB, ArtisanryItems.OAK_BOW_LIMB);
            generator.register(ArtisanryComponents.LEATHER_BOWSTRING, ArtisanryItems.LEATHER_BOWSTRING);
            generator.register(ArtisanryComponents.IRON_BROADSWORD_BLADE, ArtisanryItems.IRON_BROADSWORD_BLADE);
            generator.register(ArtisanryComponents.IRON_CAIN_HEAD, ArtisanryItems.IRON_CAIN_HEAD);
            generator.register(ArtisanryComponents.IRON_CLAYDHEAM_MOR_BLADE, ArtisanryItems.IRON_CLAYDHEAM_MOR_BLADE);
            generator.register(ArtisanryComponents.IRON_CROSS_GUARD, ArtisanryItems.IRON_CROSS_GUARD);
            generator.register(ArtisanryComponents.IRON_CROSSBOW_BODY, ArtisanryItems.IRON_CROSSBOW_BODY);
            generator.register(ArtisanryComponents.OAK_CROSSBOW_BODY, ArtisanryItems.OAK_CROSSBOW_BODY);
            generator.register(ArtisanryComponents.IRON_CROSSBOW_LIMB, ArtisanryItems.IRON_CROSSBOW_LIMB);
            generator.register(ArtisanryComponents.OAK_CROSSBOW_LIMB, ArtisanryItems.OAK_CROSSBOW_LIMB);
            generator.register(ArtisanryComponents.IRON_DART, ArtisanryItems.IRON_DART);
            generator.register(ArtisanryComponents.IRON_ESTOC_BLADE, ArtisanryItems.IRON_ESTOC_BLADE);
            generator.register(ArtisanryComponents.FEATHER_FLETCHING, ArtisanryItems.FEATHER_FLETCHING);
            generator.register(ArtisanryComponents.IRON_GREATARROW_HEAD, ArtisanryItems.IRON_GREATARROW_HEAD);
            generator.register(ArtisanryComponents.IRON_GREATAXE_HEAD, ArtisanryItems.IRON_GREATAXE_HEAD);
            generator.register(ArtisanryComponents.IRON_GREATBOW_LIMB, ArtisanryItems.IRON_GREATBOW_LIMB);
            generator.register(ArtisanryComponents.OAK_GREATBOW_LIMB, ArtisanryItems.OAK_GREATBOW_LIMB);
            generator.register(HaftComponents.IRON_HAFT, ArtisanryItems.IRON_HAFT);
            generator.register(HaftComponents.OAK_HAFT, ArtisanryItems.OAK_HAFT);
            generator.register(ArtisanryComponents.IRON_HAMMER_HEAD, ArtisanryItems.IRON_HAMMER_HEAD);
            generator.register(ArtisanryComponents.IRON_HOE_HEAD, ArtisanryItems.IRON_HOE_HEAD);
            generator.register(ArtisanryComponents.IRON_KNIFE_BLADE, ArtisanryItems.IRON_KNIFE_BLADE);
            generator.register(ArtisanryComponents.IRON_PARTIZAN_BLADE, ArtisanryItems.IRON_PARTIZAN_BLADE);
            generator.register(PickaxeHeadComponents.IRON_PICKAXE_HEAD, ArtisanryItems.IRON_PICKAXE_HEAD);
            generator.register(ArtisanryComponents.IRON_PROSPECTING_PICKAXE_HEAD, ArtisanryItems.IRON_PROSPECTING_PICKAXE_HEAD);
            generator.register(ArtisanryComponents.LEATHER_RAGS, ArtisanryItems.LEATHER_RAGS);
            generator.register(ArtisanryComponents.IRON_RECURVE_BLADE, ArtisanryItems.IRON_RECURVE_BLADE);
            generator.register(ArtisanryComponents.IRON_RIVETS, ArtisanryItems.IRON_RIVETS);
            generator.register(ArtisanryComponents.IRON_SCYTHE_BLADE, ArtisanryItems.IRON_SCYTHE_BLADE);
            generator.register(ArtisanryComponents.IRON_SHOVEL_HEAD, ArtisanryItems.IRON_SHOVEL_HEAD);
            generator.register(ArtisanryComponents.IRON_SLAB, ArtisanryItems.IRON_SLAB);
            generator.register(ArtisanryComponents.IRON_THROWING_DAGGER, ArtisanryItems.IRON_THROWING_DAGGER);
            generator.register(ArtisanryComponents.IRON_UCHIGATANA_BLADE, ArtisanryItems.IRON_UCHIGATANA_BLADE);
        }
    }
}
