package com.slimecraft.slimecraft;

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
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AdvancedSlimeTable extends Block {
	public static final PropertyDirection FACING;

    private BlockPattern snowmanBasePattern;


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
        BlockPattern.PatternHelper blockpattern$patternhelper = this.getSnowmanBasePattern().match(worldIn, pos);

        if (blockpattern$patternhelper != null)
        {
            for (int i = 0; i < this.getSnowmanBasePattern().getThumbLength(); ++i)
            {
                BlockWorldState blockworldstate = blockpattern$patternhelper.translateOffset(0, i, 0);
                worldIn.setBlockState(blockworldstate.getPos(), Blocks.AIR.getDefaultState(), 2);
            }

            EntitySnowman entitysnowman = new EntitySnowman(worldIn);
/*            BlockPos blockpos1 = blockpattern$patternhelper.translateOffset(0, 2, 0).getPos();
            entitysnowman.setLocationAndAngles((double)blockpos1.getX() + 0.5D, (double)blockpos1.getY() + 0.05D, (double)blockpos1.getZ() + 0.5D, 0.0F, 0.0F);
            worldIn.spawnEntityInWorld(entitysnowman);
*/
            EntitySlime entitySlime = new EntitySlime(worldIn);
            BlockPos blockpos1 = blockpattern$patternhelper.translateOffset(0, 2, 0).getPos();
            entitySlime.setLocationAndAngles((double)blockpos1.getX() + 0.5D, (double)blockpos1.getY() + 0.05D, (double)blockpos1.getZ() + 0.5D, 0.0F, 0.0F);
            entitySlime.dropItem(SlimeCraftItems.SlimeMatter, 10);
            worldIn.spawnEntityInWorld(entitySlime);

            }
    }


    //パターン
    private BlockPattern getSnowmanBasePattern()
    {
        if (this.snowmanBasePattern == null)
        {
            this.snowmanBasePattern = FactoryBlockPattern.start().aisle(new String[] {"~", " ", "#"}).where('#', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.SLIME_BLOCK))).where('~', BlockWorldState.hasState(BlockStateMatcher.forBlock(Blocks.AIR))).build();

        }

        return this.snowmanBasePattern;
    }




}
