package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SlimeDiamondBlock extends Block{
    public SlimeDiamondBlock() {
        super(Material.IRON);
        setCreativeTab(slimecraft.SlimeCraftTab);
        setUnlocalizedName("SlimeDiamond Block");
        setHardness(5.0F);
        setSoundType(blockSoundType.STONE);
        }


}
