package com.slimecraft.slimecraft;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
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

    public IBlockState withRotation(IBlockState state, Rotation rot)
    {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }


    public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
    {
        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
    }


    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }


    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }


    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    static {
		FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	}


	//新しいクラフティングシステム
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem,EnumFacing side, float hitX, float hitY, float hitZ)
	{
		Entity entity = null;
		//MOBドロップからスライムボール
         if (heldItem != null && (heldItem.getItem() == Items.ROTTEN_FLESH))
         {        	 
        	 //4個以上持っている場合変換する
             if (heldItem.stackSize >= 4)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
            	 return true;
             }
         }

         if (heldItem != null && (heldItem.getItem() == Items.BONE))
         {
             if (heldItem.stackSize >= 4)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
            	 return true;
             }
         }

         if (heldItem != null && (heldItem.getItem() == Items.ARROW))
         {
             if (heldItem.stackSize >= 4)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
            	 return true;
             }
         }

         if (heldItem != null && (heldItem.getItem() == Items.GUNPOWDER))
         {
             if (heldItem.stackSize >= 4)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
            	 return true;
             }
         }

         if (heldItem != null && (heldItem.getItem() == Items.STRING))
         {
             if (heldItem.stackSize >= 4)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
            	 return true;
             }
         }

         if (heldItem != null && (heldItem.getItem() == Items.DIAMOND))
         {
             if (heldItem.stackSize >= 9)
             {
            	 heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.AdvancedSlimeTableCard), true);
            	 return true;
             }
         }


         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_1))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_2), true);
            	 return true;
         }


         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_2))
         {
        	 	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_3), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_3))
         {
        	     heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_4), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_4))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_5), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_5))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_6), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_6))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_7), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_7))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_8), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_8))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_9), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_9))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeing_10), true);
            	 return true;
         }

         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_10))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeKit), true);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL,9), true);
            	 return true;
         }
                 
         if (heldItem != null && (heldItem.getItem() == SlimeCraftItems.SlimeMakeing_10))
         {
             	 heldItem.stackSize--;
            	 playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMakeKit), true);
            	 playerIn.dropItem(new ItemStack(Items.SLIME_BALL,9), true);
            	 return true;
         }
                 

   		return true;

	}

}

