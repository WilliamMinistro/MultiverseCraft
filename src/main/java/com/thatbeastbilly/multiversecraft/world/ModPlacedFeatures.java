package com.thatbeastbilly.multiversecraft.world;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> PARALLITE_ORE_PLACED = PlacementUtils.register("parallite_ore_placed",
            ModConfiguredFeatures.PARALLITE_ORE, ModOrePlacement.commonOrePlacement(3, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(100))));
    
}
