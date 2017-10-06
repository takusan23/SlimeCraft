package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlimeDiamondBlock extends Block{
    public SlimeDiamondBlock() {
        super(Material.IRON);
        setRegistryName("slimediamondblock");
        setCreativeTab(slimecraft.SlimeCraftTab);
        setUnlocalizedName("SlimeDiamond Block");
        setHardness(5.0F);

        }
}