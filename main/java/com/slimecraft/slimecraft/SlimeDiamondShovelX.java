package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SlimeDiamondShovelX extends ItemSpade{
	public SlimeDiamondShovelX(ToolMaterial toolMaterial){
		super(toolMaterial);
	}


	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
		 if (itemStack.isItemEnchanted() == false) {
			 itemStack.addEnchantment(Enchantments.EFFICIENCY, 10);
			 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
             itemStack.addEnchantment(Enchantments.SILK_TOUCH,1);
             itemStack.addEnchantment(Enchantments.MENDING,1);
             //エンチャントが付いてなければ付け直す。
		 }
     }
}