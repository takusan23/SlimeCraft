package com.slimecraft.slimecraft;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class SlimeCookie extends ItemFood {

	public SlimeCookie(int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		// TODO 自動生成されたコンストラクター・スタブ
	
	this.setCreativeTab(slimecraft.SlimeCraftTab);
    this.setUnlocalizedName("Slime Cookie");
	
	}
	
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 8;
	}
}
