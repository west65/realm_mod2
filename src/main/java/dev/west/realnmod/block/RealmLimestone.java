package dev.west.realnmod.block;

import dev.west.realnmod.RealmLayers;
import dev.west.realnmod.Realm_Mod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RealmLimestone {

    public static final Block red_limestone = registerBlock("red_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone = registerBlock("limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone1 = registerBlock("limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone2 = registerBlock("limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone3 = registerBlock("limestone3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone4 = registerBlock("limestone4",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone5 = registerBlock("limestone5",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone6 = registerBlock("limestone6",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block limestone7 = registerBlock("limestone7",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone = registerBlock("aged_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone1 = registerBlock("aged_limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone2 = registerBlock("aged_limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone3 = registerBlock("aged_limestone3",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block aged_limestone4 = registerBlock("aged_limestone4",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone = registerBlock("light_limestone",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone1 = registerBlock("light_limestone1",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone2 = registerBlock("light_limestone2",
            properties -> new Block(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block light_limestone_1 = registerBlock("light_limestone_1",
            properties -> new RealmLayers(properties.strength(1.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));





    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
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

