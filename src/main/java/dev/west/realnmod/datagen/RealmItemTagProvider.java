package dev.west.realnmod.datagen;

import dev.west.realnmod.item.RealmItems;
import dev.west.realnmod.tag.RealmTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RealmItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public RealmItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(RealmTags.Items.TRANSFORMABLE_ITEMS)

                .add(RealmItems.getRK(RealmItems.BRIGHT_SILVER_SEED))
                .add(RealmItems.getRK(RealmItems.DARK_APPLE))
                .add(RealmItems.getRK(RealmItems.SILVER_APPLE))
                .add(RealmItems.getRK(RealmItems.GOAT_FEED))
                .add(RealmItems.getRK(RealmItems.GOLD_SEEDS));


    }
}
