package com.slimecraft.slimecraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UltimateSlimeChainsaw extends ItemTool {

	public UltimateSlimeChainsaw(ToolMaterial toolMaterial) {
	//super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		super(10, 20, SlimeCraftItems.UltimateTool, effectiveAgainst);
	}
		private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		});

		 @SuppressWarnings("incomplete-switch")
		 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		    {
		        ItemStack itemstack = player.getHeldItem(hand);

		        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
		        {
		            return EnumActionResult.FAIL;
		        }
	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            //Shiftと右クリックでStaffにする
		        	if(block == Blocks.PLANKS && player.isSneaking())
		        	{
		        		itemstack.shrink(1);
		        		//playerIn.inventory.addItemStackToInventory(new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
		        		player.setHeldItem(hand, (new ItemStack(SlimeCraftItems.UltimateSlimeStaff)));
		        	}
		        	else if(block == Blocks.LOG && player.isSneaking())
		        	{
		        		itemstack.shrink(1);
		        		//playerIn.inventory.setInventorySlotContents(0, new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
		        		player.setHeldItem(hand, (new ItemStack(SlimeCraftItems.UltimateSlimeStaff)));
		        	}
		        	else if(block == Blocks.LOG2 && player.isSneaking())
		        	{
		        		itemstack.shrink(1);
		        		//playerIn.inventory.setInventorySlotContents(0, new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
		        		player.setHeldItem(hand, (new ItemStack(SlimeCraftItems.UltimateSlimeStaff)));
		        	}
		        	else if(block == Blocks.BEDROCK && player.isSneaking())
          			{
    	        		player.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
    	        		itemstack.shrink(1); 
          			}

			  		else if(block.getBlockHardness(iblockstate, worldIn, pos) != -1.0F)
	        		{
	        			worldIn.destroyBlock(pos, false);
	        			TileEntity tileEntity = null;
	        			block.harvestBlock(worldIn, player, pos, iblockstate, tileEntity, itemstack);
	        		}

        return EnumActionResult.SUCCESS;
	    }
    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
  	  if (itemStack.isItemEnchanted() == false) {
				 itemStack.addEnchantment(Enchantments.EFFICIENCY, 10);
				 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
	             itemStack.addEnchantment(Enchantments.SILK_TOUCH,1);
	             itemStack.addEnchantment(Enchantments.SHARPNESS,10);
	             itemStack.addEnchantment(Enchantments.LOOTING,10);
	             itemStack.addEnchantment(Enchantments.MENDING,1);

			 }
    }

    }
