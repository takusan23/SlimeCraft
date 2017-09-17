package com.slimecraft.slimecraft;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class compactslimeblock_2 extends BlockBreakable {
	public compactslimeblock_2(){
        super(Material.CLAY, false, MapColor.GRASS);
        setUnlocalizedName("Compact SlimeBlock 2");
		setCreativeTab(slimecraft.SlimeCraftTab);
        this.slipperiness = 0.8F;
        setSoundType(blockSoundType.SLIME);


	}
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
    {
        if (entityIn.isSneaking())
        {
            entityIn.fall(fallDistance, 0.0F);
        }
        else
        {
            entityIn.fall(fallDistance, 0.0F);
        }
    }

    public void onLanded(World worldIn, Entity entityIn)
    {
        if (entityIn.isSneaking())
        {
            super.onLanded(worldIn, entityIn);
        }
        else if (entityIn.motionY < 0.0D)
        {
            entityIn.motionY = 4;

        }

    }

}
