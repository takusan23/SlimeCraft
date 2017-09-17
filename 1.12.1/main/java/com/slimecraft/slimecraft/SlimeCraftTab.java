package com.slimecraft.slimecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SlimeCraftTab extends CreativeTabs{

	public SlimeCraftTab(String label){
		super(label);
	}
	@Override
	public ItemStack getTabIconItem() {
		// TODO 自動生成されたメソッド・スタブ
		return new ItemStack(slimecraft.SlimeDiamond);
	}
}