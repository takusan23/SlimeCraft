package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlimeTable extends Block {


	public static final PropertyDirection FACING;

    public SlimeTable() {
        super(Material.ROCK);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setRegistryName("slimetable");
        setUnlocalizedName("Slime Table");
        setHardness(5.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

/*	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
    }
*/

    static {
		FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	}

    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }

    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
    return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}



	//新しいクラフティングシステム
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = playerIn.getHeldItem(hand);

		//playerIn.addStat(slimecraft.SlimeCraft_New_Crafting_System);

		//MOBドロップからスライムボール
         if (itemstack != null && (itemstack.getItem() == Items.ROTTEN_FLESH))
         {
        	 //4個以上持っている場合変換する
             if (itemstack.getCount() >= 4)
             {
            	 itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
             }
         }

         if (itemstack != null && (itemstack.getItem() == Items.BONE))
         {
        	 if (itemstack.getCount() >= 4)
             {
        		 itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
             }
         }

         if (itemstack != null && (itemstack.getItem() == Items.ARROW))
         {
        	 if (itemstack.getCount() >= 4)
             {
        		 itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
             }
         }

         if (itemstack != null && (itemstack.getItem() == Items.GUNPOWDER))
         {
        	 if (itemstack.getCount() >= 4)
             {
        		 itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
             }
         }

         if (itemstack != null && (itemstack.getItem() == Items.STRING))
         {
        	 if (itemstack.getCount() >= 4)
             {
        		 itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
             }
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_1))
         {
        	 	 itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_2), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_2))
         {
        	 	 itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_3), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_3))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_4), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_4))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_5), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_5))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_6), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_6))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_7), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_7))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_8), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_8))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_9), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_9))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_10), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_10))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeKit), true);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL,9), true);
         }

         if (itemstack != null && (itemstack.getItem() == SlimeCraftItems.SlimeMakeing_10))
         {
        	     itemstack.shrink(1);
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeKit), true);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL,9), true);
         }
		return true;


	}

}

