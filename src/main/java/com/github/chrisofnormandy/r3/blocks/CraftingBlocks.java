package com.github.chrisofnormandy.r3.blocks;

import com.github.chrisofnormandy.conlib.blocks.basic.FullBlocks;

import net.minecraft.world.item.CreativeModeTabs;

public class CraftingBlocks {
    public static final void init() {
        FullBlocks.create("sieve", CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("scribe_workbench", CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("analyzer", CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("naex_machine", CreativeModeTabs.BUILDING_BLOCKS);
        FullBlocks.create("vat", CreativeModeTabs.BUILDING_BLOCKS);
    }
}
