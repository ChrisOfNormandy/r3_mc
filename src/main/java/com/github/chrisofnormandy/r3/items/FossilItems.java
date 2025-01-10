package com.github.chrisofnormandy.r3.items;

import com.github.chrisofnormandy.conlib.items.ModItem;

import net.minecraft.world.item.CreativeModeTabs;

public class FossilItems {
    public static final void init() {
        ModItem.create("encased_fossil", CreativeModeTabs.INGREDIENTS);
        ModItem.create("fossil_fragment", CreativeModeTabs.INGREDIENTS);
        ModItem.create("fossil_shard", CreativeModeTabs.INGREDIENTS);
        ModItem.create("rock_matrix", CreativeModeTabs.INGREDIENTS);
        ModItem.create("genetic_sample", CreativeModeTabs.INGREDIENTS);
        ModItem.create("genetic_waste", CreativeModeTabs.INGREDIENTS);
        ModItem.create("arrowhead", CreativeModeTabs.INGREDIENTS);
        ModItem.create("ivory", CreativeModeTabs.INGREDIENTS);
        ModItem.create("axe_head", CreativeModeTabs.INGREDIENTS);
    }
}
