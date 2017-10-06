package com.slimecraft.slimecraft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SpeedCard  extends Item{

	public SpeedCard() {


	}

	//public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		//if(isSelected){  ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.SPEED,0,4)); }



	  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
      {
		  ItemStack itemstack = playerIn.getHeldItem(handIn);
		  
		  if(true) {
			  if(playerIn instanceof EntityLivingBase)
				  ((EntityLivingBase) playerIn).addPotionEffect(new PotionEffect(MobEffects.SPEED,500,10));

		  }

          //playerIn.addStat(StatList.getObjectUseStats(this));

		  return new ActionResult<ItemStack>(EnumActionResult.PASS,itemstack);

 }


	  }
