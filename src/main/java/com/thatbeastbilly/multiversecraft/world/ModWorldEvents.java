package com.thatbeastbilly.multiversecraft.world;

import com.thatbeastbilly.multiversecraft.MultiverseCraft;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MultiverseCraft.MOD_ID)
public class ModWorldEvents {
	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		ModOreGeneration.generateOres(event);
	}

}
