package com.github.chrisofnormandy.dinos;

import com.github.chrisofnormandy.conlib.blocks.basic.FullBlocks;
import com.github.chrisofnormandy.conlib.registry.ModRegister;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dinos.MODID)
public class Dinos {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "dinos";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Dinos() {
        LOGGER.info("MOD IS LOADING!");
        ModRegister.initRegistries(MODID);
        FullBlocks.create("dino_sample", CreativeModeTabs.BUILDING_BLOCKS);
        init();
    }

    private void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModRegister.finishRegistries(modEventBus, MODID);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("CONLIB COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        LOGGER.info("ASSIGNING CREATIVE TABS");

        ModRegister.creativeTabs.forEach((key, value) -> {
            if (event.getTabKey() == key) {
                value.forEach((item) -> event.accept(item));
            }
        });
    }
}
