package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UltimateBallBlock extends Block {

	public UltimateBallBlock(){
		super(Material.ROCK);
		setCreativeTab(slimecraft.SlimeCraftTab);
		setRegistryName("ultimateballblock");
        setUnlocalizedName("UltimateBall Block");
        setHardness(5.0F);

	}

}
