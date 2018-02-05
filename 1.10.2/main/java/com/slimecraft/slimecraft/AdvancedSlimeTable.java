package com.slimecraft.slimecraft;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AdvancedSlimeTable extends Block {
	public static final PropertyDirection FACING;

    private BlockPattern slimebox_village;
    private BlockPattern slimebox;
    private static final Predicate<IBlockState> ADVANCED = new Predicate<IBlockState>()
    {
        public boolean apply(@Nullable IBlockState p_apply_1_)
        {
            return p_apply_1_ != null && (p_apply_1_.getBlock() == SlimeCraftBlocks.AdvancedSlimeTable);
        }
    };


	public AdvancedSlimeTable(){
        super(Material.ROCK);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setRegistryName("advancedslimetable");
        setUnlocalizedName("Advanced SlimeTable");
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



    //Advanced Crafting System
    //無駄に名前だけかっこいい

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        super.onBlockAdded(worldIn, pos, state);
        this.trySpawnGolem(worldIn, pos);
    }


    private void trySpawnGolem(World worldIn, BlockPos pos)
    {
        BlockPattern.PatternHelper blockpattern$patternhelper = this.Slimebox_Village_Crafting().match(worldIn, pos);
        if (blockpattern$patternhelper != null)
        {
            for (int k = 0; k < this.SlimeBox_Crafting().getPalmLength(); ++k)
            {
                for (int l = 0; l < this.SlimeBox_Crafting().getThumbLength(); ++l)
                {
                    worldIn.setBlockState(blockpattern$patternhelper.translateOffset(k, l, 0).getPos(), Blocks.AIR.getDefaultState(), 2);
                }
            }
            EntitySlime entitySlime = new EntitySlime(worldIn);
            BlockPos blockpos1 = blockpattern$patternhelper.translateOffset(0, 2, 0).getPos();
            entitySlime.setLocationAndAngles((double)blockpos1.getX() + 0.5D, (double)blockpos1.getY() + 0.05D, (double)blockpos1.getZ() + 0.5D, 0.0F, 0.0F);
            //worldIn.spawnEntityInWorld(entitySlime);
            worldIn.setBlockState(pos, SlimeCraftBlocks.SlimeBox_Village.getDefaultState(), 2);
        }

        else
        {
        	blockpattern$patternhelper = this.SlimeBox_Crafting().match(worldIn, pos);
            if (blockpattern$patternhelper != null)
            {
                for (int k = 0; k < this.SlimeBox_Crafting().getPalmLength(); ++k)
                {
                    for (int l = 0; l < this.SlimeBox_Crafting().getThumbLength(); ++l)
                    {
                        worldIn.setBlockState(blockpattern$patternhelper.translateOffset(k, l, 0).getPos(), Blocks.AIR.getDefaultState(), 2);
                    }
                }

                BlockPos blockpos = blockpattern$patternhelper.translateOffset(1, 2, 0).getPos();
                EntityIronGolem entityirongolem = new EntityIronGolem(worldIn);
                entityirongolem.setPlayerCreated(true);
                entityirongolem.setLocationAndAngles((double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.05D, (double)blockpos.getZ() + 0.5D, 0.0F, 0.0F);
                //worldIn.spawnEntityInWorld(entityirongolem);
                worldIn.setBlockState(pos, SlimeCraftBlocks.SlimeBox.getDefaultState(), 2);

          }
        }
    }


    //パターン
    private BlockPattern Slimebox_Village_Crafting()
    {
        if (this.slimebox_village== null)
        {
            this.slimebox_village = FactoryBlockPattern.start().aisle(new String[]
            		{"~C~", "E L", "DBS"})
            		//{"~^~", "CCC", "~B~"})
            		.where('C', BlockWorldState.hasState(BlockStateMatcher.forBlock(SlimeCraftBlocks.CompactSlimeBlock)))
            		.where('E', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.EMERALD_BLOCK)))
            		.where('L', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.LOG)))
            		.where('D', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.GRASS)))
            		.where('B', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.BEACON)))
            		.where('S', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.COBBLESTONE)))
            		.where('~', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.AIR)))
            		.build();
        }

        return this.slimebox_village;
    }

    private BlockPattern SlimeBox_Crafting()
    {
        if (this.slimebox == null)
        {
            this.slimebox = FactoryBlockPattern.start().aisle(new String[]
            		{"~C~", "L P", "~B~"})
            		//{"~^~", "CCC", "~B~"})
            		.where('C', BlockWorldState.hasState(BlockStateMatcher.forBlock(SlimeCraftBlocks.CompactSlimeBlock)))
            		.where('B', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.BEACON)))
            		.where('P', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.LEAVES)))
            		.where('L', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.GRASS)))
            		.where('~', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.AIR)))
            		.build();
        }
        return this.slimebox;
    }



}
