package com.thatbeastbilly.multiversecraft.init;

import com.google.common.base.Supplier;
import com.thatbeastbilly.multiversecraft.MultiverseCraft;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MultiverseCraft.MOD_ID);
	
	public static final RegistryObject<Item> RAW_PARALLITE = register("raw_parallite", () -> new Item(new Item.Properties().tab(MultiverseCraft.MULTIVERSE_TAB)));
	public static final RegistryObject<Item> RIFT_ARCHITECT = register("rift_architect", () -> new Item(new Item.Properties().tab(MultiverseCraft.MULTIVERSE_TAB)));
	public static final RegistryObject<Item> RIFT_BEAM = register("rift_beam", () -> new Item(new Item.Properties().tab(MultiverseCraft.MULTIVERSE_TAB)));
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	}
}
