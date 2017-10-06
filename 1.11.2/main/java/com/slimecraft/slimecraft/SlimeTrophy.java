package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlimeTrophy extends Block {

	public static final PropertyDirection FACING;


	public SlimeTrophy() {
		super(Material.ROCK);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setUnlocalizedName("SlimeTrophy");
        setRegistryName("slimetrophy");
        setHardness(1.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}


	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }




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

	}

