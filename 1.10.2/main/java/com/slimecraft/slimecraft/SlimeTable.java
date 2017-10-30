package com.slimecraft.slimecraft;

import javax.annotation.Nullable;

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
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class SlimeTable extends Block {

	public static final PropertyDirection FACING;

    public SlimeTable() {
        super(Material.IRON);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setRegistryName("slimetable");
        setUnlocalizedName("Slime Table");
        setHardness(5.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
    }


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
		//MOBドロップからスライムボール
         if (heldItem != null && (heldItem.getItem() == Items.ROTTEN_FLESH))
         {
   		   heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
      	   playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
   		   return true;
         }
         if (heldItem != null && (heldItem.getItem() == Items.BONE))
         {
   		   heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
      	   playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
   		  return true;
         }
         if (heldItem != null && (heldItem.getItem() == Items.ARROW))
         {
   		   heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
      	   playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
   		  return true;
         }
         if (heldItem != null && (heldItem.getItem() == Items.GUNPOWDER))
         {
   		   heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
      	   playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
   		  return true;
         }
         if (heldItem != null && (heldItem.getItem() == Items.STRING))
         {
   		   heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;heldItem.stackSize--;
      	   playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
   		  return true;
         }

         if (heldItem != null && (heldItem.getItem() == Items.BOOK))
         {
        	 if (!worldIn.isRemote)
        	 {
        		 playerIn.addChatMessage(new TextComponentString("OverWorld MonsterDrop Item ×4 = SlimeBall"));
        		 return true;
        	 }
        }

         return true;
	}
}

