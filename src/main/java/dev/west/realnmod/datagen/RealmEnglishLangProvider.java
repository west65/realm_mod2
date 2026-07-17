package dev.west.realnmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RealmEnglishLangProvider extends FabricLanguageProvider {
    public RealmEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.realm_mod.mithril_ingot", "mithril_ingot");
        translationBuilder.add("item.realm_mod.blackiron", "blackiron");
        translationBuilder.add("item.realm_mod.silver_ingot", "silver_ingot");
        translationBuilder.add("item.realm_mod.sun_ingot", "sun_ingot");
        translationBuilder.add("item.realm_mod.magic_ingot", "magic_ingot");
        translationBuilder.add("item.realm_mod.dark_ingot", "dark_ingot");
        translationBuilder.add("item.realm_mod.marine_ingot", "marne_ingot");


        translationBuilder.add("item.realm_mod.dark_apple", "dark_apple");
        translationBuilder.add("item.realm_mod.silver_apple", "silver_apple");
        translationBuilder.add("item.realm_mod.gold_seeds", "gold_seeds");
        translationBuilder.add("item.realm_mod.goat_feed", "goat_feed");
        translationBuilder.add("item.realm_mod.bright_silver_seed", "bright_silver_seeds");
        translationBuilder.add("item.realm_mod.dark_soul_seed", "dark_soul_seeds");
        translationBuilder.add("item.realm_mod.dark_water_bucket", "dark_water_bucket");
        translationBuilder.add("item.realm_mod.mushroom", "mushroom");




        translationBuilder.add("block.realm_mod.stone_brick5", "stone_brick5");
        translationBuilder.add("block.realm_mod.stone_brick4", "stone_brick4");
        translationBuilder.add("block.realm_mod.stone_brick_m1", "stone_brick_m1");
        translationBuilder.add("block.realm_mod.stone_brick_m", "stone_brick_m");
        translationBuilder.add("block.realm_mod.stone_age", "stone_age");
        translationBuilder.add("block.realm_mod.stone", "stone");
        translationBuilder.add("block.realm_mod.stone1", "stone1");
        translationBuilder.add("block.realm_mod.stone2", "stone2");
        translationBuilder.add("block.realm_mod.stone3", "stone3");
        translationBuilder.add("block.realm_mod.stone_1", "stone_1");
        translationBuilder.add("block.realm_mod.stone_2", "stone_2");
        translationBuilder.add("block.realm_mod.stone_3", "stone_3");
        translationBuilder.add("block.realm_mod.stone_4", "stone_4");
        translationBuilder.add("block.realm_mod.dark_stone", "dark_stone");
        translationBuilder.add("block.realm_mod.dark_stonebrick", "dark_stonebrick");
        translationBuilder.add("block.realm_mod.dark_stone1", "dark_stone1");
        translationBuilder.add("block.realm_mod.dark_stone2", "dark_stone2");
        translationBuilder.add("block.realm_mod.dark_brick", "dark_brick");
        translationBuilder.add("block.realm_mod.dark_stone_slab", "dark_stone_slab");
        translationBuilder.add("block.realm_mod.red_stone", "red_stone");
        translationBuilder.add("block.realm_mod.red_stone1", "red_stone1");

        translationBuilder.add("block.realm_mod.chalk1_2", "chalk1_2");
        translationBuilder.add("block.realm_mod.chalk", "chalk");
        translationBuilder.add("block.realm_mod.chalk1", "chalk1");
        translationBuilder.add("block.realm_mod.chalk2", "chalk2");

        translationBuilder.add("block.realm_mod.stonebrick", "stonebrick");
        translationBuilder.add("block.realm_mod.stone_rock_n1", "stone_rock_n1");
        translationBuilder.add("block.realm_mod.stone_rock_n", "stone_rock_n");
        translationBuilder.add("block.realm_mod.stone_rock2", "stone_rock2");
        translationBuilder.add("block.realm_mod.stone_rock1", "stone_rock1");
        translationBuilder.add("block.realm_mod.stone_rock", "stone_rock");
        translationBuilder.add("block.realm_mod.stone_deep_rock1", "stone_deep_rock1");
        translationBuilder.add("block.realm_mod.stone_deep_rock", "stone_deep_rock");
        translationBuilder.add("block.realm_mod.stone_brick", "stone_brick");
        translationBuilder.add("block.realm_mod.stone_brick1", "stone_brick1");
        translationBuilder.add("block.realm_mod.stone_brick2", "stone_brick2");
        translationBuilder.add("block.realm_mod.stone_brick2_1", "stone_brick2_1");
        translationBuilder.add("block.realm_mod.stone_brick2_2", "stone_brick2_2");
        translationBuilder.add("block.realm_mod.stone_brick_1", "stone_brick_1");
        translationBuilder.add("block.realm_mod.stone_brick_2", "stone_brick_2");
        translationBuilder.add("block.realm_mod.stone_brick_2_slab", "stone_brick_2_slab");
        translationBuilder.add("block.realm_mod.stone_brick_3", "stone_brick_3");
        translationBuilder.add("block.realm_mod.stone_brick_4", "stone_brick_4");
        translationBuilder.add("block.realm_mod.stone_brick_5", "stone_brick_5");
        translationBuilder.add("block.realm_mod.stone_brick_6", "stone_brick_6");
        translationBuilder.add("block.realm_mod.stone_brick_7", "stone_brick_7");
        translationBuilder.add("block.realm_mod.stone_brick_8", "stone_brick_8");
        translationBuilder.add("block.realm_mod.stone_brick_9", "stone_brick_9");
        translationBuilder.add("block.realm_mod.stone_brick_9_slab", "stone_brick_9_slab");
        translationBuilder.add("block.realm_mod.stone_brick_10", "stone_brick_10");
        translationBuilder.add("block.realm_mod.stone_brick_11", "stone_brick_11");
        translationBuilder.add("block.realm_mod.stone_brick_11_slab", "stone_brick_11_slab");
        translationBuilder.add("block.realm_mod.white_stone", "white_stone");
        translationBuilder.add("block.realm_mod.white_stone_half", "white_stone_half");
        translationBuilder.add("block.realm_mod.white_stone2", "white_stone2");



        translationBuilder.add("block.realm_mod.tuff_brick", "tuff_brick");
        translationBuilder.add("block.realm_mod.tuff_brick1", "tuff_brick1");
        translationBuilder.add("block.realm_mod.tuff_brick2", "tuff_brick2");
        translationBuilder.add("block.realm_mod.tuff_brick3", "tuff_brick3");






        translationBuilder.add("block.realm_mod.tuff1", "tuff1");
        translationBuilder.add("block.realm_mod.tuff2", "tuff2");
        translationBuilder.add("block.realm_mod.tuff3", "tuff3");

        translationBuilder.add("block.realm_mod.aged_limestone", "aged_limestone");
        translationBuilder.add("block.realm_mod.aged_limestone2", "aged_limestone2");
        translationBuilder.add("block.realm_mod.aged_limestone1", "aged_limestone1");
        translationBuilder.add("block.realm_mod.aged_limestone3", "aged_limestone3");
        translationBuilder.add("block.realm_mod.aged_limestone4", "aged_limestone4");
        translationBuilder.add("block.realm_mod.aged_limestone_c", "aged_limestone_c");
        translationBuilder.add("block.realm_mod.rock_stone_s", "rock_stone_s");
        translationBuilder.add("block.realm_mod.dark_rock", "dark_rock");
        translationBuilder.add("block.realm_mod.dark_rock1", "dark_rock1");
        translationBuilder.add("block.realm_mod.dark_rock2", "dark_rock2");
        translationBuilder.add("block.realm_mod.rock_stone", "rock_stone");
        translationBuilder.add("block.realm_mod.deep_stone", "deep_stone");
        translationBuilder.add("block.realm_mod.deep_stone1", "deep_stone1");
        translationBuilder.add("block.realm_mod.deep_stone2", "deep_stone2");
        translationBuilder.add("block.realm_mod.deep_stone_rune", "deep_stone_rune");
        translationBuilder.add("block.realm_mod.dark_stone_deep", "dark_stone_deep");
        translationBuilder.add("block.realm_mod.dark_stone_deep_brick", "dark_stone_deep_brick");
        translationBuilder.add("block.realm_mod.dark_stone_deep_brick1", "dark_stone_deep_brick1");
        translationBuilder.add("block.realm_mod.dark_stone_deep1", "dark_stone_deep1");

        translationBuilder.add("block.realm_mod.mithril_glow", "mithril_glow");
        translationBuilder.add("block.realm_mod.dark_soul_glow", "dark_soul_glow");
        translationBuilder.add("block.realm_mod.gold_light_glow", "gold_light_glow");


        translationBuilder.add("block.realm_mod.angel_mushroom", "angel_mushroom");
        translationBuilder.add("block.realm_mod.marshmoon_mushroom", "marshmoon_mushroom");
        translationBuilder.add("block.realm_mod.dark_soul_mushroom", "dark_soul_mushroom");
        translationBuilder.add("block.realm_mod.silver_mushroom", "silver_mushroom");
        translationBuilder.add("block.realm_mod.poss_mushroom", "poss_mushroom");
        translationBuilder.add("block.realm_mod.mithril_mushroom", "mithril_mushroom");


        translationBuilder.add("block.realm_mod.desert_rock", "desert_rock");
        translationBuilder.add("block.realm_mod.desert_rock2_c", "desert_rock2_c");
        translationBuilder.add("block.realm_mod.desert_rock1_c", "desert_rock1_c");
        translationBuilder.add("block.realm_mod.desert_rock1", "desert_rock1");
        translationBuilder.add("block.realm_mod.desert_rock2", "desert_rock2");

        translationBuilder.add("block.realm_mod.alder_log", "alder_log");
        translationBuilder.add("block.realm_mod.crystal_oak_log", "crystal_oak_log");
        translationBuilder.add("block.realm_mod.white_pine_log", "white_pine_log");
        translationBuilder.add("block.realm_mod.moss_oak_log", "moss_oak_log");
        translationBuilder.add("block.realm_mod.ask_oak_log", "ask_oak_log");
        translationBuilder.add("block.realm_mod.mithril_log", "mithril_log");
        translationBuilder.add("block.realm_mod.sun_oak_log", "sun_oak_log");
        translationBuilder.add("block.realm_mod.sun_oak_planks", "sun_oak_planks");
        translationBuilder.add("block.realm_mod.sun_oak_fence", "sun_oak_fence");
        translationBuilder.add("block.realm_mod.dark_soul_log", "dark_soul_log");
        translationBuilder.add("block.realm_mod.dark_soul_log_chain", "dark_soul_log_chain");
        translationBuilder.add("block.realm_mod.dark_branch", "dark_branch");
        translationBuilder.add("block.realm_mod.dark_soul_planks", "dark_soul_planks");
        translationBuilder.add("block.realm_mod.dark_soul_stairs", "dark_soul_stairs");
        translationBuilder.add("block.realm_mod.white_oak_log", "white_oak_log");
        translationBuilder.add("block.realm_mod.white_oak_planks", "white_oak_planks");
        translationBuilder.add("block.realm_mod.blood_oak_log", "blood_oak_log");
        translationBuilder.add("block.realm_mod.burn_birch_log", "burn_birch_log");
        translationBuilder.add("block.realm_mod.angel_birch_log", "angel_birch_log");
        translationBuilder.add("block.realm_mod.thunder_oak_log", "thunder_oak_log");
        translationBuilder.add("block.realm_mod.wniter_oak_log", "winter_oak_log");
        translationBuilder.add("block.realm_mod.winter_oak_planks", "winter_oak_planks");
        translationBuilder.add("block.realm_mod.winter_oak_leaves", "winter_oak_leaves");
        translationBuilder.add("block.realm_mod.white_pine_leaves", "white_pine_leaves");
        translationBuilder.add("block.realm_mod.sun_oak_leaves", "sun_oak_leaves");
        translationBuilder.add("block.realm_mod.mithril_leaves", "mithril_leaves");
        translationBuilder.add("block.realm_mod.moonshade_birch_log", "moonshade_birch_log");
        translationBuilder.add("block.realm_mod.light_birch_log", "light_birch_log");
        translationBuilder.add("block.realm_mod.eswell_birch_log", "eswell_birch_log");
        translationBuilder.add("block.realm_mod.winter_oak_log", "winter_oak_log");
        translationBuilder.add("block.realm_mod.gold_shadow_log", "gold_shadow_log");
        translationBuilder.add("block.realm_mod.veil_wood_log", "veil_wood_log");
        translationBuilder.add("block.realm_mod.emberiar_log", "emberiar_log");
        translationBuilder.add("block.realm_mod.mistwood_log", "mistwood_log");
        translationBuilder.add("block.realm_mod.deepcore_log", "deepcore_log");
        translationBuilder.add("block.realm_mod.shadow_birch_log", "shadow_birch_log");
        translationBuilder.add("block.realm_mod.shadow_pine_log", "shadow_pine_log");
        translationBuilder.add("block.realm_mod.org_willow_log", "org_willow_log");
        translationBuilder.add("block.realm_mod.starbloom_log", "starbloom_log");


        translationBuilder.add("block.realm_mod.rhyolite1_c", "rhyolite1_c");
        translationBuilder.add("block.realm_mod.rhyolite", "rhyolite");
        translationBuilder.add("block.realm_mod.rhyolite1", "rhyolite1");


        translationBuilder.add("block.realm_mod.evil_shards", "evil_shards");
        translationBuilder.add("block.realm_mod.blackiron_shards_block", "blackiron_shards_block");
        translationBuilder.add("block.realm_mod.mithril_shards", "mithril_shards");
        translationBuilder.add("block.realm_mod.large_mithril_shards", "large_mithril_shards");
        translationBuilder.add("block.realm_mod.med_mithril_shards", "med_mithril_shards");
        translationBuilder.add("block.realm_mod.black_poss_shards", "black_poss_shards");
        translationBuilder.add("block.realm_mod.voryn_shards", "voryn_shards");



        translationBuilder.add("block.realm_mod.light_limestone2", "light_limestone2");
        translationBuilder.add("block.realm_mod.light_limestone_1", "light_limestone_1");
        translationBuilder.add("block.realm_mod.light_limestone1", "light_limestone1");
        translationBuilder.add("block.realm_mod.light_limestone", "light_limestone");
        translationBuilder.add("block.realm_mod.limestone", "limestone");
        translationBuilder.add("block.realm_mod.red_limestone", "red_limestone");
        translationBuilder.add("block.realm_mod.limestone1", "limestone1");
        translationBuilder.add("block.realm_mod.limestone2", "limestone2");
        translationBuilder.add("block.realm_mod.limestone3", "limestone3");
        translationBuilder.add("block.realm_mod.limestone4", "limestone4");
        translationBuilder.add("block.realm_mod.limestone5", "limestone5");
        translationBuilder.add("block.realm_mod.limestone6", "limestone6");
        translationBuilder.add("block.realm_mod.limestone7", "limestone7");
        translationBuilder.add("block.realm_mod.mithril_stone", "mithril_stone");
        translationBuilder.add("block.realm_mod.mithril_stone1", "mithril_stone1");
        translationBuilder.add("block.realm_mod.mithril_stone2", "mithril_stone2");
        translationBuilder.add("block.realm_mod.mithril_stone_slab", "mithril_stone_slab");

        translationBuilder.add("block.realm_mod.mithril_cobble", "mithril_cobble");
        translationBuilder.add("block.realm_mod.mithril_cobble1", "mithril_cobble1");
        translationBuilder.add("block.realm_mod.mithril_cobble2", "mithril_cobble2");
        translationBuilder.add("block.realm_mod.mithril_cobble_slab", "mithril_cobble_slab");
        translationBuilder.add("block.realm_mod.mithril_cobble1_slab", "mithril_cobble1_slab");
        translationBuilder.add("block.realm_mod.moss_forge", "moss_forge");
        translationBuilder.add("block.realm_mod.gold_cobble", "gold_cobble");
        translationBuilder.add("block.realm_mod.dark_soul_cobble", "dark_soul_cobble");
        translationBuilder.add("block.realm_mod.dark_soul_stone_rune", "dark_soul_stone_rune");




        translationBuilder.add("block.realm_mod.blackstone1", "blackstone1");
        translationBuilder.add("block.realm_mod.blackstone2", "blackstone2");
        translationBuilder.add("block.realm_mod.blackstone1_stair", "blackstone1_stair");


        translationBuilder.add("block.realm_mod.desert_stone2_c", "desert_stone2_c");
        translationBuilder.add("block.realm_mod.desert_stone1_c", "desert_stone1_c");
        translationBuilder.add("block.realm_mod.desert_stone", "desert_stone");
        translationBuilder.add("block.realm_mod.desert_stone1", "desert_stone1");
        translationBuilder.add("block.realm_mod.desert_stone2", "desert_stone2");
        translationBuilder.add("block.realm_mod.desert_stone3", "desert_stone3");
        translationBuilder.add("block.realm_mod.desert_stone4", "desert_stone4");
        translationBuilder.add("block.realm_mod.desert_stone_rock", "desert_stone_rock");
        translationBuilder.add("block.realm_mod.desert_stone_rock1", "desert_stone_rock1");


        translationBuilder.add("block.realm_mod.mithril_rune", "mithril_rune");
        translationBuilder.add("block.realm_mod.silver_rune", "silver_rune");
        translationBuilder.add("block.realm_mod.dark_rune", "dark_rune");
        translationBuilder.add("block.realm_mod.dark_rune1", "dark_rune1");
        translationBuilder.add("block.realm_mod.dark_rune1_slab", "dark_rune1_slab");
        translationBuilder.add("block.realm_mod.evil_rune", "evil_rune");
        translationBuilder.add("block.realm_mod.evil_rune1", "evil_rune1");
        translationBuilder.add("block.realm_mod.dark_evil_rune", "dark_evil_rune");
        translationBuilder.add("block.realm_mod.stone_rune", "stone_rune");
        translationBuilder.add("block.realm_mod.light_birch_rune", "light_birch_rune");
        translationBuilder.add("block.realm_mod.birch_rune", "birch_rune");

        translationBuilder.add("block.realm_mod.mithril_ore", "mithril_ore");
        translationBuilder.add("block.realm_mod.blackiron_ore", "blackiron_ore");
        translationBuilder.add("block.realm_mod.silver_ore", "silver_ore");
        translationBuilder.add("block.realm_mod.grizz_ore", "grizz_ore");
        translationBuilder.add("block.realm_mod.sun_ore", "sun_ore");





        translationBuilder.add("item.realm_fantasy", "fantasy");
        translationBuilder.add("item.realm_Item", "Item");
        translationBuilder.add("item.realm_food", "food");
        translationBuilder.add("item.realm_stone", "stone");
        translationBuilder.add("item.realm_runes", "runes");
        translationBuilder.add("item.realm_stone_brick", "stone_brick");
        translationBuilder.add("item.realm_tuff", "tuff");
        translationBuilder.add("item.realm_mushroom", "mushroom");
        translationBuilder.add("item.realm_ore", "ore");
        translationBuilder.add("item.realm_grass", "grass");
        translationBuilder.add("item.realm_logs", "logs");
        translationBuilder.add("item.realm_limestone", "limestone");
        translationBuilder.add("item.realm_light_limestone", "light_limestone");
        translationBuilder.add("item.realm_chalk", "chalk");
        translationBuilder.add("item.realm_rhyolite", "rhyolite");
        translationBuilder.add("item.realm_desert", "desert");









    }


}

