package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AdvancedSlimeTableCard extends Item{
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		 if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
	        {
	            return EnumActionResult.FAIL;
	        }

	        else if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	        {
		           IBlockState iblockstate = worldIn.getBlockState(pos);
		           Block block = iblockstate.getBlock();
		           if (block == Blocks.SLIME_BLOCK)
	            		{
	            			stack.damageItem(-1, playerIn);
	            			worldIn.destroyBlock(pos, false);

	            		}


			 else if (worldIn.isAirBlock(pos.up()))
			 {
				 if (stack.getMaxDamage() !=1)
				 	{
					pos = pos.offset(facing);
          			worldIn.setBlockState(pos, SlimeCraftBlocks.AdvancedSlimeTable.getDefaultState(), 11);
          			stack.damageItem(1, playerIn);
			 		}
			 }



			 }


	            return EnumActionResult.SUCCESS;




    }

}





