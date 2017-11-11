package com.slimecraft.slimecraft;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlimeXpTable extends Block {

	public static final PropertyDirection FACING;

	public SlimeXpTable() {
        super(Material.ROCK);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setRegistryName("slimexptable");
        setUnlocalizedName("Slime XPTable");
        setHardness(5.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

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

    //経験値落ちるよ
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem,EnumFacing side, float hitX, float hitY, float hitZ)
	{
		playerIn.addStat(slimecraft.SlimeXpTable);
		//スライムボールから経験値へ
        if (heldItem != null && (heldItem.getItem() == Items.SLIME_BALL))
        {
        	heldItem.stackSize--;
             if (!worldIn.isRemote)
             {
                     playerIn.worldObj.spawnEntityInWorld(new EntityXPOrb(playerIn.worldObj, playerIn.posX, playerIn.posY, playerIn.posZ, 5));
             }
        }

        if (heldItem != null && (heldItem.getItem() == Items.ENCHANTED_BOOK))
        {
        	heldItem.stackSize--;
             if (!worldIn.isRemote)
             {
                     playerIn.worldObj.spawnEntityInWorld(new EntityXPOrb(playerIn.worldObj, playerIn.posX, playerIn.posY, playerIn.posZ, 10));
             }
        }
         return true;
	}

}