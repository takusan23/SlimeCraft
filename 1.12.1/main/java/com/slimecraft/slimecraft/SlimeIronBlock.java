package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlimeIronBlock extends Block{
    public SlimeIronBlock() {
        super(Material.IRON);

        this.setCreativeTab(slimecraft.SlimeCraftTab);
        this.setUnlocalizedName("SlimeIron Block");
        this.setRegistryName("slimeironblock");
        this.setHardness(5.0F);
    }
}
