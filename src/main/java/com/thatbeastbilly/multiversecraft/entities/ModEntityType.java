package com.thatbeastbilly.multiversecraft.entities;

import com.thatbeastbilly.multiversecraft.MultiverseCraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntityType {
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MultiverseCraft.MOD_ID);
	
	public static final RegistryObject<EntityType<RiftBeamEntity>> RIFT_BEAM_ENTITY = ENTITIES.register("rift_beam_entity",
			() -> EntityType.Builder.<RiftBeamEntity>of(RiftBeamEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(MultiverseCraft.MOD_ID,
					"rift_beam_entity")));
	
	
	public static void register(IEventBus eventBus) {
		ENTITIES.register(eventBus);
	}

}
