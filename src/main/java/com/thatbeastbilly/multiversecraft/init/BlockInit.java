package com.thatbeastbilly.multiversecraft.init;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.thatbeastbilly.multiversecraft.MultiverseCraft;
import com.thatbeastbilly.multiversecraft.block.DeepslateParalliteOre;
import com.thatbeastbilly.multiversecraft.block.ParalliteOre;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MultiverseCraft.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	public static final RegistryObject<Block> PARALLITE_ORE = register("parallite_ore", 
			() -> new ParalliteOre(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(3.0f).sound(SoundType.STONE).requiresCorrectToolForDrops().lightLevel(state -> 3)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(MultiverseCraft.MULTIVERSE_TAB)));
	
	public static final RegistryObject<Block> DEEPSLATE_PARALLITE_ORE = register("deepslate_parallite_ore", 
			() -> new DeepslateParalliteOre(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(3.0f).sound(SoundType.STONE).requiresCorrectToolForDrops().lightLevel(state -> 3)), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(MultiverseCraft.MULTIVERSE_TAB)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}
		
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, 
			Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
