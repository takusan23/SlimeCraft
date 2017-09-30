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

public class HungerCard extends Item {


	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
		  if(true) {
			  if(playerIn instanceof EntityLivingBase)
				  ((EntityLivingBase) playerIn).addPotionEffect(new PotionEffect(MobEffects.HUNGER,500,10));

		  }


		  return new ActionResult<ItemStack>(EnumActionResult.PASS,itemStackIn);

}



}
