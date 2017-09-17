package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SlimeDiamondHoeX extends ItemHoe {
	public SlimeDiamondHoeX(ToolMaterial toolMaterial){
		super(toolMaterial);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
		 if (itemStack.isItemEnchanted() == false) {
			 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
             itemStack.addEnchantment(Enchantments.MENDING,1);
             
		 }
     }
}