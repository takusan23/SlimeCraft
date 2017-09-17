package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class InvisibilityCard extends Item {

	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) { if(isSelected){  ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY,10,4)); }}


}
