package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlimeMatterBlock extends Block {

	public SlimeMatterBlock() {
		super(Material.ROCK);
		setCreativeTab(slimecraft.SlimeCraftTab);
		setRegistryName("slimematterblock");
		setUnlocalizedName("SlimeMatter Block");
        setHardness(5.0F);
	}

}
