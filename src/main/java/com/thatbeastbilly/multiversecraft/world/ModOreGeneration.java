package com.thatbeastbilly.multiversecraft.world;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {
	public static void generateOres(final BiomeLoadingEvent event) {
		List <Holder<PlacedFeature>> base = 
				event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
		
		base.add(ModPlacedFeatures.PARALLITE_ORE_PLACED);
	}
}
