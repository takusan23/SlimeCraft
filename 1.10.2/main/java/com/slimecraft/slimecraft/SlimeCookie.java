package com.slimecraft.slimecraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlimeCookie extends ItemFood {
	public static Item SlimeCookie;

	public SlimeCookie(int amount, boolean isWolfFood) {
		super(amount, isWolfFood);

	this.setCreativeTab(slimecraft.SlimeCraftTab);
    this.setUnlocalizedName("Slime Cookie");

	}

	public static void init() {
        SlimeCookie = new SlimeCookie(10, false);

	}

	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 8;
	}

	public static void register() {
		GameRegistry.registerItem(SlimeCraftItems.SlimeCookie,"slimecookie");
	}

	public static void renderItem(){
		ModelLoader.setCustomModelResourceLocation(SlimeCraftItems.SlimeCookie, 0, new ModelResourceLocation(SlimeCraftItems.SlimeCookie.getRegistryName(),"inventory"));
	}
}

//
//
//if (event.getSide().isClient()) {
//	ModelLoader.setCustomModelResourceLocation(SlimeCookie, 0, new ModelResourceLocation(SlimeCookie.getRegistryName(),"inventory"));
