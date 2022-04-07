package com.thatbeastbilly.multiversecraft.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ParalliteOre extends OreBlock {
	
	public ParalliteOre(Properties properties) {
		super(properties);
		
	}
	
	@Override
	public int getExpDrop(BlockState state, LevelReader level, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
		
		if(silkTouchLevel > 0) {
			return 0;
		}
		else {
			return 5;
		}
		
	}
	
}
