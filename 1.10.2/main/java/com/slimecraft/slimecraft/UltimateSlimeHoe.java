package com.slimecraft.slimecraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UltimateSlimeHoe extends ItemTool {

	public UltimateSlimeHoe(ToolMaterial toolMaterial) {
	//super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		super(10, 20, SlimeCraftItems.UltimateTool, effectiveAgainst);
	}
		private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		});


		public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		    {

			 if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
		        {
		            return EnumActionResult.FAIL;
		        }
		        else
		        {
		            IBlockState iblockstate = worldIn.getBlockState(pos);
		            Block block = iblockstate.getBlock();

		            if (facing != EnumFacing.DOWN && worldIn.getBlockState(pos.up()).getMaterial() == Material.AIR && block == Blocks.GRASS)
		            {
		                IBlockState iblockstate1 = Blocks.GRASS_PATH.getDefaultState();
		                worldIn.playSound(playerIn, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

		                if (!worldIn.isRemote)
		                {
		                    worldIn.setBlockState(pos, iblockstate1, 11);
		                    stack.damageItem(1, playerIn);
		                }

		                return EnumActionResult.SUCCESS;
		            }



		            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
		            {
		                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
		                {
		                    this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                   return EnumActionResult.SUCCESS;
		                }

		                if (block == Blocks.DIRT)
		                {
		                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
		                    {
		                        case DIRT:
		                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                            return EnumActionResult.SUCCESS;
		                        case COARSE_DIRT:
		                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
		                            return EnumActionResult.SUCCESS;
		                    }
		                	}
		            }
	    	        if(playerIn.isSneaking()) {
	    	        	if(block == Blocks.DIRT)
	          			{
	    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		--stack.stackSize;
	          			}
	    	        	if(block == Blocks.GRASS)
	          			{
	    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		--stack.stackSize;
	          			}	
	    	        	if(block == Blocks.FARMLAND)
	          			{
	    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		--stack.stackSize;
	          			}	    	        	

	    	        }
	                        if (!worldIn.isRemote)
	                        {
	                            worldIn.playEvent(2005, pos, 0);
	                        }
	                        if (iblockstate.getBlock() instanceof IGrowable)
	                        {
	                            IGrowable igrowable = (IGrowable)iblockstate.getBlock();

	                            if (igrowable.canGrow(worldIn, pos, iblockstate, worldIn.isRemote))
	                            {
	                                if (!worldIn.isRemote)
	                                {
	                                    if (igrowable.canUseBonemeal(worldIn, worldIn.rand, pos, iblockstate))
	                                    {
	                                        igrowable.grow(worldIn, worldIn.rand, pos, iblockstate);
	                                    }
	                                }
	                            }
	                        }

	          			}
		        
			return null;

	    	        }
		        

			 

	      protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
	      {
	          worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

	          if (!worldIn.isRemote)
	          {
	              worldIn.setBlockState(pos, state, 11);
	              stack.damageItem(1, player);
	          }
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
