package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;

public class concrete_orange extends Block {
	public concrete_orange(){
		super(Material.ROCK);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName("concrete_orange");
        setHardness(9.0F);
        setSoundType(blockSoundType.STONE);
	}
	public boolean canEntitySpawn(IBlockState state, Entity entityIn)
    {
        return entityIn.isImmuneToFire();
    }
}
