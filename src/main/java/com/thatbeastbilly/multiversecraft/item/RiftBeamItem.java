package com.thatbeastbilly.multiversecraft.item;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;

public class RiftBeamItem extends ArrowItem {
	public final float damage;
	public RiftBeamItem(Properties properties, float damage) {
		super(properties);
		this.damage = damage;
		
	}

	   @Override
	   public AbstractArrow createArrow(Level p_40513_, ItemStack p_40514_, LivingEntity p_40515_) {
		      Arrow arrow = new Arrow(p_40513_, p_40515_);
		      arrow.setBaseDamage(this.damage);
		      return arrow;
		   }
	   @Override
	   public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player) {
		      int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
		      return enchant <= 0 ? false : this.getClass() == RiftBeamItem.class;
		   }
}
