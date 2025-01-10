package com.github.chrisofnormandy.r3;

import com.github.chrisofnormandy.conlib.registry.ModRegister;
import com.github.chrisofnormandy.r3.blocks.BuildingBlocks;
import com.github.chrisofnormandy.r3.blocks.FossilBlocks;
import com.github.chrisofnormandy.r3.items.FossilItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

@Mod(R3.MODID)
public class R3 {
    public static final String MODID = "r3";
    private static final Logger LOGGER = LogUtils.getLogger();

    public R3() {
        LOGGER.info("Loading R3");
        ModRegister.initRegistries(MODID);
        BuildingBlocks.init();
        FossilBlocks.init();
        FossilItems.init();
        init();
    }

    private void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModRegister.finishRegistries(modEventBus, MODID);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
