package com.slimecraft.slimecraft;

import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;

public class UltimateSlimeBallBallRender extends RenderSnowball<EntitySnowball>{
	
    protected final Item item;
    private final RenderItem itemRenderer;

    public UltimateSlimeBallBallRender(RenderManager renderManagerIn, Item itemIn, RenderItem itemRendererIn)
    {
        super(renderManagerIn, itemIn, itemRendererIn);
        this.item = itemIn;
        this.itemRenderer = itemRendererIn;
    }
    
  
   
}
