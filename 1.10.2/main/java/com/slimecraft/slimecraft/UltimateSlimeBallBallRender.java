package com.slimecraft.slimecraft;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;

public class UltimateSlimeBallBallRender extends RenderSnowball<EntitySnowball>{

	public UltimateSlimeBallBallRender(RenderManager renderManagerIn, Item itemin, RenderItem itemRenderin) {
		super(renderManagerIn, itemin, itemRenderin);

	}

}
