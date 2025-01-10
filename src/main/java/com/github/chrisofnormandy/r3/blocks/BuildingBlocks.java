package com.github.chrisofnormandy.r3.blocks;

import com.github.chrisofnormandy.conlib.blocks.StoneBlockSet;
import com.github.chrisofnormandy.conlib.blocks.basic.FullBlocks;

import net.minecraft.world.item.CreativeModeTabs;

public class BuildingBlocks {
    public static final void init() {
        FullBlocks.create("permafrost", CreativeModeTabs.BUILDING_BLOCKS);
        StoneBlockSet.create("shale", CreativeModeTabs.BUILDING_BLOCKS);
        StoneBlockSet.create("limestone", CreativeModeTabs.BUILDING_BLOCKS);
        StoneBlockSet.create("conglomerate", CreativeModeTabs.BUILDING_BLOCKS);
        StoneBlockSet.create("petrified_wood", CreativeModeTabs.BUILDING_BLOCKS);
    }
}
