package com.slimecraft.slimecraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.IGrowable;
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


		 @SuppressWarnings("incomplete-switch")
		 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		    {
		        ItemStack itemstack = player.getHeldItem(hand);

		        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
		        {
		            return EnumActionResult.FAIL;
		        }
		        else
		        {
		            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
		            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

		            IBlockState iblockstate = worldIn.getBlockState(pos);
		            Block block = iblockstate.getBlock();

		            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
		            {
		                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
		                {
		                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                    return EnumActionResult.SUCCESS;
		                }

		                if (block == Blocks.DIRT)
		                {
		                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
		                    {
		                        case DIRT:
		                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                            return EnumActionResult.SUCCESS;
		                        case COARSE_DIRT:
		                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
		                            return EnumActionResult.SUCCESS;
		                    }
		                	}
		            }
	    	        if(player.isSneaking()) {
	    	        	if(block == Blocks.DIRT)
	          			{
	    	        		player.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		itemstack.shrink(1);
	          			}
	    	        	if(block == Blocks.GRASS)
	          			{
	    	        		player.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		itemstack.shrink(1);
	          			}
	    	        	if(block == Blocks.FARMLAND)
	          			{
	    	        		player.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		itemstack.shrink(1);
	          			}
	    	        	if(block == Blocks.BEDROCK)
	          			{
	    	        		player.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	    	        		itemstack.shrink(1);
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