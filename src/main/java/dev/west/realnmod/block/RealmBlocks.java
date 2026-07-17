package dev.west.realnmod.block;

import dev.west.realnmod.Realm_Mod;
import dev.west.realnmod.block.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.GlowstoneFeature;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class RealmBlocks {

    public static final Block GOATFEED_CROP = registerBlockWithoutBlockItem("goatfeed_crop",
            properties -> new GoatFeedCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block Gold_WHEAT = registerBlockWithoutBlockItem("gold_wheat",
            properties -> new GoldCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block DARK_SOUL_WHEAT = registerBlockWithoutBlockItem("dark_soul_wheat",
            properties -> new DarkSoulWheatCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block BRIGHT_SILVER = registerBlockWithoutBlockItem("bright_silver",
            properties -> new BrightCropBlock(properties.randomTicks().instabreak()
                    .sound(SoundType.CROP).noCollision().pushReaction(PushReaction.DESTROY)));



    public static final Block MITHRIL_GLOW = registerBlock("mithril_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 12)));

    public static final Block DARK_SOUL_GLOW = registerBlock("dark_soul_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 9)));


    public static final Block GOLD_LIGHT_GLOW = registerBlock("gold_light_glow",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).lightLevel(statex-> 14)));


    public static final Block BLACKIRON_ORE = registerBlock("blackiron_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SUN_ORE = registerBlock("sun_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block GRIZZ_ORE = registerBlock("grizz_ore",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block BLACKIRON_SHARDS_BLOCK = registerBlock("blackiron_shards_block",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block EVIL_SHARDS = registerBlock("evil_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block MITHRIL_SHARDS = registerBlock("mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block LARGE_MITHRIL_SHARDS = registerBlock("large_mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block MED_MITHRIL_SHARDS = registerBlock("med_mithril_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block BLACK_POSS_SHARDS = registerBlock("black_poss_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));
    public static final Block VORYN_SHARDS = registerBlock("voryn_shards",
            properties -> new AmethystClusterBlock(7.0f, 10.0f, properties.noOcclusion().lightLevel(statex-> 13).forceSolidOn()));






    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }









    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name)))));
    }



    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Realm_Mod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Realm_Mod.LOGGER.info("Registering Mod Blocks for " + Realm_Mod.MOD_ID);
    }
}


