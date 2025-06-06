package com.christianbutnot.justanotherlibrarymod;


import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Main.MODID)
public class Main {
	
	public static final String MODID = "justanotherlibrarymod";

	public Main(IEventBus bus) {
   
	}
	
	private static final Logger LOGGER = LogUtils.getLogger();
	   
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("[JustAnotherLibrary] JustAnotherLibraryMod reporting for duty.");
            LOGGER.info("[JustAnotherLibrary] Any tags that fail to load can be ignored, they only matter for within the mod and load properly when supported mods are in your mod list.");
        }
    }
	
}