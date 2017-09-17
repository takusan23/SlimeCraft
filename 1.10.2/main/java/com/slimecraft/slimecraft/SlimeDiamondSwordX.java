package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class SlimeDiamondSwordX extends ItemSword{
	public SlimeDiamondSwordX(ToolMaterial material) {
		super(material);
		// TODO 自動生成されたコンストラクター・スタブ

	}

	@Override
		public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
	if (itemStack.isItemEnchanted() == false) {
				 itemStack.addEnchantment(Enchantments.SHARPNESS, 10);
				 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
	             itemStack.addEnchantment(Enchantments.LOOTING,10);

	           
	        }


	}
}

