package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlimeIronBlock extends Block{
    public SlimeIronBlock() {
        super(Material.IRON);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setRegistryName("slimeironblock");
        setUnlocalizedName("SlimeIron Block");
        setHardness(5.0F);

    }
}
