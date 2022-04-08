package com.thatbeastbilly.multiversecraft.entities;

import com.google.j2objc.annotations.ReflectionSupport.Level;
import com.thatbeastbilly.multiversecraft.init.ItemInit;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;

public class RiftBeamEntity extends AbstractArrow {
	private final Item referenceItem;
	public RiftBeamEntity(EntityType<? extends AbstractArrow> type, Level level) {
		super(type, level);
		this.referenceItem = ItemInit.RIFT_BEAM.get();
	}
	
	public RiftBeamEntity(LivingEntity shooter, Level level) {
		super(type, shooter, level);
		this.referenceItem = referenceItem;
	}
	
	@Override
	public ItemStack getPickupItem() {
		return null;
	}

}
