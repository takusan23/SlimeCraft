package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HungerCard extends Item {


	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
      {
		  if(itemStackIn.getItemDamage() <= 38)
		  {
			  	if(playerIn instanceof EntityLivingBase)
			  		((EntityLivingBase) playerIn).addPotionEffect(new PotionEffect(MobEffects.HUNGER,500,10));
			  	itemStackIn.damageItem(1, playerIn);
		        playerIn.getCooldownTracker().setCooldown(this, 20);
		  }
		  return new ActionResult<ItemStack>(EnumActionResult.PASS,itemStackIn);
      }

	  public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	  {
			 if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
		        {
		            return EnumActionResult.FAIL;
		        }

			 if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
		        {
		           IBlockState iblockstate = worldIn.getBlockState(pos);
		           Block block = iblockstate.getBlock();
		           if (block == SlimeCraftBlocks.SlimeTrophy && stack.getItemDamage() >= 1)
		            		{
		            			stack.damageItem(-1, playerIn);
		            			worldIn.destroyBlock(pos, false);
		            		}
		        }
		        return EnumActionResult.SUCCESS;
	    }

 }
