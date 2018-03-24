package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

	public class SlimeAxe extends ItemAxe{
		public SlimeAxe(ToolMaterial toolMaterial){
			super(toolMaterial);
}
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
		            if (stack.getItemDamage() >= 1)
		        	if(block == SlimeCraftBlocks.SlimeTrophy)
	          			{
	    	        		worldIn.destroyBlock(pos, false);
	    	        		stack.damageItem(-1, playerIn);
	          			}

	            else
	         	{
	        	 return EnumActionResult.PASS;
	         	}
		        }
		 return null;
	    }


	}
