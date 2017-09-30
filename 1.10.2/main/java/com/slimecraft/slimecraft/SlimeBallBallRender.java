package com.slimecraft.slimecraft;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;

public class SlimeBallBallRender extends RenderSnowball<EntitySlimeBallBall> {

	public SlimeBallBallRender(RenderManager renderManagerIn, Item itemin, RenderItem itemRenderin) {
		super(renderManagerIn, itemin, itemRenderin);

	}


}
