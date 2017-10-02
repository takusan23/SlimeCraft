package com.slimecraft.slimecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SlimeCraftTab extends CreativeTabs{

	public SlimeCraftTab(String label){
		super(label);
	}

	@Override
	public Item getTabIconItem(){
		return SlimeCraftItems.SlimeDiamond;
	}
}

