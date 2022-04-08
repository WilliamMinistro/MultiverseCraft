package com.thatbeastbilly.multiversecraft.world;

import java.util.List;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> PARALLITE_ORE_PLACED = PlacementUtils.register("parallite_ore_placed",
            OreGeneration.PARALLITE_ORE, ModOrePlacement.rareOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}
