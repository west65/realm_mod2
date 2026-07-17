package dev.west.realnmod.datagen;

import dev.west.realnmod.block.*;

import dev.west.realnmod.block.custom.GoatFeedCropBlock;
import dev.west.realnmod.block.custom.GoldCropBlock;
import dev.west.realnmod.item.RealmItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;

import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;

import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;



import java.util.concurrent.CompletableFuture;


public class RealmLootTableProvider extends FabricBlockLootSubProvider {
    public RealmLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }


    @Override
    public void generate() {






        dropSelf(RealmBlocks.MITHRIL_GLOW);
        dropSelf(RealmBlocks.DARK_SOUL_GLOW);
        dropSelf(RealmBlocks.GOLD_LIGHT_GLOW);













        add(RealmBlocks.MITHRIL_ORE, createOreDrop(RealmBlocks.MITHRIL_ORE, RealmItems.MITHRIL_INGOT));
        add(RealmBlocks.SILVER_ORE, createOreDrop(RealmBlocks.SILVER_ORE, RealmItems.SILVER_INGOT));
        add(RealmBlocks.SUN_ORE, createOreDrop(RealmBlocks.SUN_ORE, RealmItems.SUN_INGOT));
        add(RealmBlocks.BLACKIRON_ORE, createOreDrop(RealmBlocks.BLACKIRON_ORE, RealmItems.BLACKIRON));
        add(RealmBlocks.GRIZZ_ORE, createOreDrop(RealmBlocks.GRIZZ_ORE, RealmItems.GRIZZ_INGOT));








        add(RealmBlocks.Gold_WHEAT, createCropDrops(RealmBlocks.Gold_WHEAT, RealmItems.GOLD_SEEDS, RealmItems.GOLD_SEEDS,
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(RealmBlocks.Gold_WHEAT)
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GoldCropBlock.AGE, GoldCropBlock.MAX_AGE))));

        add(RealmBlocks.GOATFEED_CROP, createCropDrops(RealmBlocks.GOATFEED_CROP, RealmItems.GOAT_FEED, RealmItems.GOLD_SEEDS,
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(RealmBlocks.GOATFEED_CROP)
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GoatFeedCropBlock.AGE, GoatFeedCropBlock.MAX_AGE))));

        add(RealmBlocks.DARK_SOUL_WHEAT, createCropDrops(RealmBlocks.DARK_SOUL_WHEAT, RealmItems.Dark_Soul_SEED, RealmItems.Dark_Soul_SEED,
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(RealmBlocks.DARK_SOUL_WHEAT)
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GoatFeedCropBlock.AGE, GoatFeedCropBlock.MAX_AGE))));

        add(RealmBlocks.BRIGHT_SILVER, createCropDrops(RealmBlocks.BRIGHT_SILVER, RealmItems.BRIGHT_SILVER_SEED, RealmItems.BRIGHT_SILVER_SEED,
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(RealmBlocks.BRIGHT_SILVER)
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GoatFeedCropBlock.AGE, GoatFeedCropBlock.MAX_AGE))));


        dropSelf(Realm_logs.WHITE_PINE_LOG);
        dropSelf(Realm_logs.MOSS_OAK_LOG);
        dropSelf(Realm_logs.MITHRIL_LOG);
        dropSelf(Realm_logs.GOLDEN_PINE_LOG);
        dropSelf(Realm_logs.CRYSTAL_OAK_LOG);
        dropSelf(Realm_logs.WHITE_OAK_LOG);
        dropSelf(Realm_logs.DARK_SOUL_LOG);
        dropSelf(Realm_logs.LIGHT_BIRCH_LOG);
        dropSelf(Realm_logs.ESWELL_BIRCH_LOG);
        dropSelf(Realm_logs.SUN_OAK_LOG);
        dropSelf(Realm_logs.BLOOD_OAK_LOG);
        dropSelf(Realm_logs.DARK_SOUL_PLANKS);
        dropSelf(Realm_logs.SUN_OAK_PLANKS);
        dropSelf(Realm_logs.WINTER_OAK_PLANKS);
        dropSelf(Realm_logs.WINTER_OAK_LOG);
        dropSelf(Realm_logs.ASH_OAK_LOG);
        dropSelf(Realm_logs.DARK_SOUL_STAIRS);
        dropSelf(Realm_logs.WINTER_OAK_LEAVES);
        dropSelf(Realm_logs.DARK_SOUL_LEAVES);
        dropSelf(Realm_logs.SUN_OAK_LEAVES);
        dropSelf(Realm_logs.MITHRIL_LEAVES);
        dropSelf(Realm_logs.WINTER_OAK_LEAVES);
        dropSelf(Realm_logs.ANGEL_BIRCH_LOG);
        dropSelf(Realm_logs.BURN_BIRCH_LOG);
        dropSelf(Realm_logs.THUNDER_OAK_LOG);
        dropSelf(Realm_logs.MOONSHADE_BIRCH_LOG);
        dropSelf(Realm_logs.GOLD_SHADOW_LOG);
        dropSelf(Realm_logs.VEIL_WOOD_LOG);
        dropSelf(Realm_logs.EMBERIAR_LOG);
        dropSelf(Realm_logs.MISTWOOD_LOG);
        dropSelf(Realm_logs.DEEPCORE_LOG);
        dropSelf(Realm_logs.SHADOW_BIRCH_LOG);
        dropSelf(Realm_logs.STARBLOOM_LOG);
        dropSelf(Realm_logs.DARK_SOUL_LOG_CHAIN);
        dropSelf(Realm_logs.ALDER_LOG);
        dropSelf(Realm_logs.SHADOW_PINE_LOG);




        dropSelf(RealmLimestone.red_limestone);
        dropSelf(RealmLimestone.limestone1);
        dropSelf(RealmLimestone.limestone2);
        dropSelf(RealmLimestone.limestone3);
        dropSelf(RealmLimestone.limestone4);
        dropSelf(RealmLimestone.aged_limestone);
        dropSelf(RealmLimestone.aged_limestone1);
        dropSelf(RealmLimestone.aged_limestone2);
        dropSelf(RealmLimestone.aged_limestone3);
        dropSelf(RealmLimestone.aged_limestone4);
        dropSelf(RealmLimestone.light_limestone);
        dropSelf(RealmLimestone.light_limestone1);
        dropSelf(RealmLimestone.light_limestone2);












        dropSelf(RealmStone.MITHRIL_STONE);
        dropSelf(RealmStone.MITHRIL_STONE1);
        dropSelf(RealmStone.MITHRIL_STONE2);
        dropSelf(RealmStone.MITHRIL_STONE_SLAB);
        dropSelf(RealmStone.MITHRIL_COBBLE);
        dropSelf(RealmStone.MITHRIL_COBBLE1);
        dropSelf(RealmStone.MITHRIL_COBBLE2);
        dropSelf(RealmStone.MITHRIL_COBBLE_SLAB);
        dropSelf(RealmStone.MITHRIL_COBBLE1_SLAB);
        dropSelf(RealmStone.MOSS_FORGE);
        dropSelf(RealmStone.GOLD_COBBLE);
        dropSelf(RealmStone.DARK_SOUL_COBBLE);


        dropSelf(RealmStone.BLACKSTONE1);
        dropSelf(RealmStone.BLACKSTONE2);


        dropSelf(RealmStone.BLACKSTONE1_STAIR);




        dropSelf(RealmBlocks.BLACKIRON_SHARDS_BLOCK);
        dropSelf(RealmBlocks.EVIL_SHARDS);
        dropSelf(RealmBlocks.MITHRIL_SHARDS);
        dropSelf(RealmBlocks.LARGE_MITHRIL_SHARDS);
        dropSelf(RealmBlocks.MED_MITHRIL_SHARDS);
        dropSelf(RealmBlocks.BLACK_POSS_SHARDS);
        dropSelf(RealmStone.WHITE_STONE_2);



        dropSelf(RealmMushroom.angel_mushroom);
        dropSelf(RealmMushroom.marshmoon_mushroom);
        dropSelf(RealmMushroom.dark_soul_mushroom);
        dropSelf(RealmMushroom.poss_mushroom);




        dropSelf(RealmStone.stone);
        dropSelf(RealmStone.stone1);
        dropSelf(RealmStone.stone2);
        dropSelf(RealmStone.stone3);
        dropSelf(RealmStone.stone_1);


        dropSelf(RealmStoneBrick.stone_Brick);
        dropSelf(RealmStoneBrick.stone_Brick1);
        dropSelf(RealmStoneBrick.stone_Brick2);
        dropSelf(RealmStoneBrick.stone_Brick2_2);
        dropSelf(RealmStoneBrick.stone_Brick_1);
        dropSelf(RealmStoneBrick.stone_Brick_2);
        dropSelf(RealmStoneBrick.stone_Brick_3);
        dropSelf(RealmStoneBrick.stone_Brick_4);
        dropSelf(RealmStoneBrick.stone_Brick_5);
        dropSelf(RealmStoneBrick.stone_Brick_6);
        dropSelf(RealmStoneBrick.stone_Brick_7);
        dropSelf(RealmStoneBrick.stone_Brick_8);
        dropSelf(RealmStoneBrick.stone_Brick_9);
        dropSelf(RealmStoneBrick.stone_Brick_10);
        dropSelf(RealmStoneBrick.stone_Brick_11);
        dropSelf(RealmStoneBrick.stone_Brick_11_slab);
        dropSelf(RealmStoneBrick.stone_Brick_9_slab);
        dropSelf(RealmStone.STONE_ROCK);
        dropSelf(RealmStone.STONE_ROCK1);
        dropSelf(RealmStone.STONE_ROCK2);
        dropSelf(RealmStone.STONE_ROCK_n);
        dropSelf(RealmStone.STONE_ROCK_n1);
        dropSelf(RealmStone.STONE_DEEP_ROCK);
        dropSelf(RealmStone.STONE_DEEP_ROCK1);
        dropSelf(RealmStone.STONEBRICK);
        dropSelf(RealmStone.WHITE_STONE);


        dropSelf(RealmRhyolite.rhyolite);
        dropSelf(RealmRhyolite.rhyolite1);




        dropSelf(RealmChalk.chalk);
        dropSelf(RealmChalk.chalk1);
        dropSelf(RealmChalk.chalk2);



        dropSelf(RealmDesert.desert_stone);
        dropSelf(RealmDesert.desert_stone1);
        dropSelf(RealmDesert.desert_stone2);
        dropSelf(RealmDesert.desert_stone3);
        dropSelf(RealmDesert.desert_stone4);
        dropSelf(RealmDesert.desert_stone_rock);
        dropSelf(RealmDesert.desert_stone_rock1);
        dropSelf(RealmDesert.desert_rock);
        dropSelf(RealmDesert.desert_rock1);
        dropSelf(RealmDesert.desert_rock2);



        dropSelf(RealmTuff.tuff3);
        dropSelf(RealmTuff.tuff2);
        dropSelf(RealmTuff.tuff1);
        dropSelf(RealmTuff.tuff_brick);
        dropSelf(RealmTuff.tuff_brick1);
        dropSelf(RealmTuff.tuff_brick2);
        dropSelf(RealmTuff.tuff_brick3);
        dropSelf(RealmTuff.tuff_brick4);




        dropSelf(RealmStone.dark_stone);
        dropSelf(RealmStone.dark_stone1);
        dropSelf(RealmStone.dark_stone2);
        dropSelf(RealmStone.deep_stone2);
        dropSelf(RealmStone.dark_stone_slab);
        dropSelf(RealmStone.dark_brick);
        dropSelf(RealmStone.dark_stonebrick);



        dropSelf(Realm_Ruins.MITHRIL_RUNE);
        dropSelf(Realm_Ruins.EVIL_RUNE1);
        dropSelf(Realm_Ruins.SILVER_RUNE);
        dropSelf(Realm_Ruins.DARK_RUNE);
        dropSelf(Realm_Ruins.EVIL_RUNE);
        dropSelf(Realm_Ruins.DARK_RUNE1);
        dropSelf(Realm_Ruins.DARK_EVIL_RUNE);
        dropSelf(Realm_Ruins.LIGHT_BIRCH_LOG_RUNE);


        dropSelf(RealmLimestone.aged_limestone);
        dropSelf(RealmLimestone.aged_limestone1);
        dropSelf(RealmLimestone.aged_limestone2);
        dropSelf(RealmLimestone.aged_limestone3);
        dropSelf(RealmLimestone.aged_limestone4);
        dropSelf(RealmLimestone.limestone5);
        dropSelf(RealmLimestone.limestone6);


























    }
}
