package dev.west.realnmod.datagen;

import dev.west.realnmod.block.*;
import dev.west.realnmod.item.RealmItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;


public class RealmModelProvider extends FabricModelProvider {
    public RealmModelProvider(FabricPackOutput output) {
        super(output);
    }

    private static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.EAST, BlockModelGenerators.Y_ROT_90)
            .select(Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
            .select(Direction.WEST, BlockModelGenerators.Y_ROT_270)
            .select(Direction.NORTH, BlockModelGenerators.NOP);


    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        var realm2 = blockModelGenerators.family(Realm_logs.DARK_SOUL_PLANKS);
        var realm3 = blockModelGenerators.family(RealmStone.BLACKSTONE1);
        var realm1 = blockModelGenerators.family(RealmStone.dark_stone1);
        var realm4 = blockModelGenerators.family(RealmStone.MITHRIL_STONE);
        var realm5 = blockModelGenerators.family(RealmStone.MITHRIL_COBBLE);
        var realm6 =  blockModelGenerators.family(RealmStone.MITHRIL_COBBLE1);
        var realm7= blockModelGenerators.family(RealmStoneBrick.stone_Brick_11);
        var realm8 = blockModelGenerators.family(RealmStoneBrick.stone_Brick_9);
        var realm9 = blockModelGenerators.family(Realm_logs.SUN_OAK_PLANKS);
        var realm10 = blockModelGenerators.family(RealmStoneBrick.stone_Brick_2);




















        blockModelGenerators.createTrivialCube(RealmBlocks.MITHRIL_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.SILVER_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.SUN_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.BLACKIRON_ORE);
        blockModelGenerators.createTrivialCube(RealmBlocks.GRIZZ_ORE);














        blockModelGenerators.woodProvider(Realm_logs.WHITE_PINE_LOG).log(Realm_logs.WHITE_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MOSS_OAK_LOG).log(Realm_logs.MOSS_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MITHRIL_LOG).log(Realm_logs.MITHRIL_LOG);
        blockModelGenerators.woodProvider(Realm_logs.GOLDEN_PINE_LOG).log(Realm_logs.GOLDEN_PINE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.CRYSTAL_OAK_LOG).log(Realm_logs.CRYSTAL_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WHITE_OAK_LOG).log(Realm_logs.WHITE_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DARK_SOUL_LOG).log(Realm_logs.DARK_SOUL_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SUN_OAK_LOG).log(Realm_logs.SUN_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BLOOD_OAK_LOG).log(Realm_logs.BLOOD_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.WINTER_OAK_LOG).log(Realm_logs.WINTER_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ASH_OAK_LOG).log(Realm_logs.ASH_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ANGEL_BIRCH_LOG).log(Realm_logs.ANGEL_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.BURN_BIRCH_LOG).log(Realm_logs.BURN_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.THUNDER_OAK_LOG).log(Realm_logs.THUNDER_OAK_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MOONSHADE_BIRCH_LOG).log(Realm_logs.MOONSHADE_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.LIGHT_BIRCH_LOG).log(Realm_logs.LIGHT_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ESWELL_BIRCH_LOG).log(Realm_logs.ESWELL_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.GOLD_SHADOW_LOG).log(Realm_logs.GOLD_SHADOW_LOG);
        blockModelGenerators.woodProvider(Realm_logs.VEIL_WOOD_LOG).log(Realm_logs.VEIL_WOOD_LOG);
        blockModelGenerators.woodProvider(Realm_logs.EMBERIAR_LOG).log(Realm_logs.EMBERIAR_LOG);
        blockModelGenerators.woodProvider(Realm_logs.MISTWOOD_LOG).log(Realm_logs.MISTWOOD_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DEEPCORE_LOG).log(Realm_logs.DEEPCORE_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SHADOW_BIRCH_LOG).log(Realm_logs.SHADOW_BIRCH_LOG);
        blockModelGenerators.woodProvider(Realm_logs.DARK_SOUL_LOG_CHAIN).log(Realm_logs.DARK_SOUL_LOG_CHAIN);
        blockModelGenerators.woodProvider(Realm_logs.ORG_WILLOW_LOG).log(Realm_logs.ORG_WILLOW_LOG);
        blockModelGenerators.woodProvider(Realm_logs.STARBLOOM_LOG).log(Realm_logs.STARBLOOM_LOG);
        blockModelGenerators.woodProvider(Realm_logs.ALDER_LOG).log(Realm_logs.ALDER_LOG);
        blockModelGenerators.woodProvider(Realm_logs.SHADOW_PINE_LOG).log(Realm_logs.SHADOW_PINE_LOG);




        blockModelGenerators.createAmethystCluster(RealmBlocks.BLACKIRON_SHARDS_BLOCK);
        blockModelGenerators.createAmethystCluster(RealmBlocks.EVIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.LARGE_MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.MED_MITHRIL_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.BLACK_POSS_SHARDS);
        blockModelGenerators.createAmethystCluster(RealmBlocks.VORYN_SHARDS);






        blockModelGenerators.createTrivialCube(RealmLimestone.red_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone2);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone3);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone4);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone5);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone6);
        blockModelGenerators.createTrivialCube(RealmLimestone.limestone7);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone2);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone3);
        blockModelGenerators.createTrivialCube(RealmLimestone.aged_limestone4);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone1);
        blockModelGenerators.createTrivialCube(RealmLimestone.light_limestone2);








        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK);
        blockModelGenerators.createTrivialCube(RealmStone.STONEBRICK);





        blockModelGenerators.createTrivialCube(RealmChalk.chalk);
        blockModelGenerators.createTrivialCube(RealmChalk.chalk1);
        blockModelGenerators.createTrivialCube(RealmChalk.chalk2);





        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone2);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone3);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone4);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone_rock);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_stone_rock1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock1);
        blockModelGenerators.createTrivialCube(RealmDesert.desert_rock2);




        blockModelGenerators.createTrivialCube(RealmRhyolite.rhyolite);
        blockModelGenerators.createTrivialCube(RealmRhyolite.rhyolite1);











        blockModelGenerators.createTrivialBlock(Realm_logs.WINTER_OAK_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.DARK_SOUL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.SUN_OAK_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.MITHRIL_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(Realm_logs.WHITE_PINE_LEAVES, TexturedModel.LEAVES);



        blockModelGenerators.createTrivialCube(RealmMushroom.angel_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.marshmoon_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.dark_soul_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.poss_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.silver_mushroom);
        blockModelGenerators.createTrivialCube(RealmMushroom.mithril_mushroom);






        blockModelGenerators.createTrivialCube(Realm_logs.WINTER_OAK_PLANKS);


        blockModelGenerators.createCropBlock(RealmBlocks.GOATFEED_CROP, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.Gold_WHEAT, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.DARK_SOUL_WHEAT, CropBlock.AGE, 0,1,2,3,4,5,6,7);
        blockModelGenerators.createCropBlock(RealmBlocks.BRIGHT_SILVER, CropBlock.AGE, 0,1,2,3,4,5,6,7);

        realm2.stairs(Realm_logs.DARK_SOUL_STAIRS);



        realm9.fence(Realm_logs.SUN_OAK_FENCE);








        realm1.slab(RealmStone.dark_stone_slab);
        realm7.slab(RealmStoneBrick.stone_Brick_11_slab);
        realm8.slab(RealmStoneBrick.stone_Brick_9_slab);
        realm10.slab(RealmStoneBrick.stone_Brick_2_slab);




        blockModelGenerators.createTrivialCube(RealmBlocks.MITHRIL_GLOW);
        blockModelGenerators.createTrivialCube(RealmBlocks.DARK_SOUL_GLOW);
        blockModelGenerators.createTrivialCube(RealmBlocks.GOLD_LIGHT_GLOW);





        blockModelGenerators.createTrivialCube(RealmStone.stone_brick5);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick4);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick_m1);
        blockModelGenerators.createTrivialCube(RealmStone.stone_brick_m);
        blockModelGenerators.createTrivialCube(RealmStone.stone_age);
        blockModelGenerators.createTrivialCube(RealmStone.stone);
        blockModelGenerators.createTrivialCube(RealmStone.stone1);
        blockModelGenerators.createTrivialCube(RealmStone.stone2);
        blockModelGenerators.createTrivialCube(RealmStone.stone3);
        blockModelGenerators.createTrivialCube(RealmStone.stone_1);
        blockModelGenerators.createTrivialCube(RealmStone.stone_2);
        blockModelGenerators.createTrivialCube(RealmStone.stone_3);
        blockModelGenerators.createTrivialCube(RealmStone.stone_4);
        blockModelGenerators.createTrivialCube(RealmStone.red_stone);
        blockModelGenerators.createTrivialCube(RealmStone.red_stone1);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_DEEP_ROCK);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_DEEP_ROCK1);
        blockModelGenerators.createTrivialCube(RealmStone.WHITE_STONE);




        blockModelGenerators.createTrivialCube(RealmStone.dark_rock);
        blockModelGenerators.createTrivialCube(RealmStone.dark_rock1);
        blockModelGenerators.createTrivialCube(RealmStone.dark_rock2);
        blockModelGenerators.createTrivialCube(RealmStone.rock_stone);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone1);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP_BRICK);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_STONE_DEEP_BRICK1);
        blockModelGenerators.createTrivialCube(RealmStone.dark_stonebrick);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK1);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK2);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK_n);
        blockModelGenerators.createTrivialCube(RealmStone.STONE_ROCK_n1);










        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_STONE1);
        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_STONE2);
        blockModelGenerators.createTrivialCube(RealmStone.MITHRIL_COBBLE2);
        blockModelGenerators.createTrivialCube(RealmStone.MOSS_FORGE);
        blockModelGenerators.createTrivialCube(RealmStone.GOLD_COBBLE);
        blockModelGenerators.createTrivialCube(RealmStone.DARK_SOUL_COBBLE);



        blockModelGenerators.createTrivialCube(RealmStone.DARK_SOUL_STONE_RUNE);
        blockModelGenerators.createTrivialCube(Realm_Ruins.STONE_RUNE);
        blockModelGenerators.createTrivialCube(Realm_Ruins.DEEP_STONE_RUNE);



        realm6.slab(RealmStone.MITHRIL_COBBLE1_SLAB);


        realm5.slab(RealmStone.MITHRIL_COBBLE_SLAB);




        realm4.slab(RealmStone.MITHRIL_STONE_SLAB);



       realm3.stairs(RealmStone.BLACKSTONE1_STAIR);

       blockModelGenerators.createTrivialCube(RealmStone.BLACKSTONE2);




       blockModelGenerators.createTrivialCube(RealmStone.WHITE_STONE_2);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2_1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick2_2);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_1);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_3);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_4);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_5);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_6);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_7);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_8);
        blockModelGenerators.createTrivialCube(RealmStoneBrick.stone_Brick_10);



        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick1);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick2);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick3);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff_brick4);


        blockModelGenerators.createTrivialCube(RealmTuff.tuff1);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff2);
        blockModelGenerators.createTrivialCube(RealmTuff.tuff3);




        blockModelGenerators.createTrivialCube(RealmStone.dark_stone);
        blockModelGenerators.createTrivialCube(RealmStone.dark_stone2);
        blockModelGenerators.createTrivialCube(RealmStone.deep_stone2);
        blockModelGenerators.createTrivialCube(RealmStone.dark_brick);

















    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(RealmItems.DARK_APPLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RealmItems.SILVER_APPLE, ModelTemplates.FLAT_ITEM);









    }


}
