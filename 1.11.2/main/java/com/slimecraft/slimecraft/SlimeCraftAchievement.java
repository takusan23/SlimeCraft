package com.slimecraft.slimecraft;

import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SlimeCraftAchievement {

	@SubscribeEvent
	public void EntityItemPickUpEvent(EntityItemPickupEvent e) {
		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == Items.SLIME_BALL) {
            e.getEntityPlayer().addStat(slimecraft.Welcome_to_SlimeCraft);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeSword) {
            e.getEntityPlayer().addStat(slimecraft.Slime_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeIronSword) {
            e.getEntityPlayer().addStat(slimecraft.SlimeIron_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondSword) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamond_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondSwordX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamond_X_Series);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondPickaxeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondPickaxe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondAxeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondAxe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondShovelX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondShovel_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeDiamondHoeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondHoe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeMultiTool) {
            e.getEntityPlayer().addStat(slimecraft.Pickaxe_Axe_Shovel_Hoe);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeMultiToolFortune) {
            e.getEntityPlayer().addStat(slimecraft.MultiTool_Fortune);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == SlimeCraftItems.SlimeMakeing_1) {
            e.getEntityPlayer().addStat(slimecraft.Welcome_to_ScienceClub);
        }




	}
}

