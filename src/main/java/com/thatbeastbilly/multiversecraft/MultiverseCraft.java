package com.thatbeastbilly.multiversecraft;

import com.thatbeastbilly.multiversecraft.init.BlockInit;
import com.thatbeastbilly.multiversecraft.init.ItemInit;
import com.thatbeastbilly.multiversecraft.util.ModItemProperties;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("multiversecraft")
public class MultiverseCraft {
	
	public static final String MOD_ID = "multiversecraft";
	
	public static final CreativeModeTab MULTIVERSE_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon(){
			return new ItemStack(BlockInit.PARALLITE_ORE.get());
		}	
	};

	public MultiverseCraft()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		ModItemProperties.addCustomItemProperties();
	}
}
