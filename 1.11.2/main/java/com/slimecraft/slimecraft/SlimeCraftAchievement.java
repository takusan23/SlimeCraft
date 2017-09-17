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
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeSword) {
            e.getEntityPlayer().addStat(slimecraft.Slime_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeIronSword) {
            e.getEntityPlayer().addStat(slimecraft.SlimeIron_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondSword) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamond_Sword);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondSwordX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamond_X_Series);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondPickaxeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondPickaxe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondAxeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondAxe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondShovelX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondShovel_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeDiamondHoeX) {
            e.getEntityPlayer().addStat(slimecraft.SlimeDiamondHoe_X);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeMultiTool) {
            e.getEntityPlayer().addStat(slimecraft.Pickaxe_Axe_Shovel_Hoe);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeMultiToolFortune) {
            e.getEntityPlayer().addStat(slimecraft.MultiTool_Fortune);
        }

		if (e.getEntityPlayer() != null && e.getItem() != null && e.getItem().getEntityItem() != null
                && e.getItem().getEntityItem().getItem() == slimecraft.SlimeMakeing_1) {
            e.getEntityPlayer().addStat(slimecraft.Welcome_to_ScienceClub);
        }




	}
}

