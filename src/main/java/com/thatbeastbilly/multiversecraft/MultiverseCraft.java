package com.thatbeastbilly.multiversecraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("multiversecraft")
public class MultiverseCraft {

	public MultiverseCraft()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
}
