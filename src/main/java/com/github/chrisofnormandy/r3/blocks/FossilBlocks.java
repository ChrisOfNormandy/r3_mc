package com.github.chrisofnormandy.r3.blocks;

import com.github.chrisofnormandy.conlib.blocks.basic.FullBlocks;
import com.github.chrisofnormandy.conlib.blocks.landscapes.BrushableLand;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;

public class FossilBlocks {
    public static final void init() {
        BrushableLand.create("muddy_deposit", () -> Blocks.MUD, CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("coastal_deposit", () -> Blocks.SAND, CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("deserted_seaway_deposit", () -> Blocks.SAND, CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("peat", CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("permafrost_preservation",
                () -> ModRegister.blocks.get("permafrost").get(),
                CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("fossiliferous_limestone",
                () -> ModRegister.blocks.get("limestone").get(),
                CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("fossiliferous_conglomerate",
                () -> ModRegister.blocks.get("conglomerate").get(),
                CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("fossiliferous_shale",
                () -> ModRegister.blocks.get("shale").get(),
                CreativeModeTabs.BUILDING_BLOCKS);
        BrushableLand.create("fossiliferous_sandstone", () -> Blocks.SANDSTONE, CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("amber_cluster", CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("fusainized_remains", CreativeModeTabs.BUILDING_BLOCKS);
    }
}
