package com.slimecraft.slimecraft;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class UltimateSlimeBallBallRender extends Render<EntityUltimateSlimeBallBall>{
	
	private static final ResourceLocation ultimateballtexture = new 
	//適当に架空のパスを指定してます
	ResourceLocation("slimecraft:textures/blocks/compactslimeblock.png");
			
	protected final Item item;
	private final RenderItem itemRenderer;

	public UltimateSlimeBallBallRender(RenderManager renderManagerIn, Item itemIn, RenderItem itemRendererIn) {
		super(renderManagerIn);
		this.item = itemIn;
        this.itemRenderer = itemRendererIn;

	}
	protected ResourceLocation func_180572_a(UltimateSlimeBallBallRender entity)
	{
	return ultimateballtexture;
	}
	
	protected ResourceLocation getEntityTexture(UltimateSlimeBallBallRender entity)
	{
	return this.func_180572_a((UltimateSlimeBallBallRender)entity);
	}


	 public void doRender(EntityUltimateSlimeBallBall entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
	        GlStateManager.pushMatrix();
	        GlStateManager.translate((float)x, (float)y, (float)z);
	        GlStateManager.enableRescaleNormal();
	        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
	        GlStateManager.rotate((float)(this.renderManager.options.thirdPersonView == 2 ? -1 : 1) * this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
	        GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
	        this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);

	        if (this.renderOutlines)
	        {
	            GlStateManager.enableColorMaterial();
	            GlStateManager.enableOutlineMode(this.getTeamColor(entity));
	        }

	        this.itemRenderer.renderItem(this.getStackToRender(entity), ItemCameraTransforms.TransformType.GROUND);

	        if (this.renderOutlines)
	        {
	            GlStateManager.disableOutlineMode();
	            GlStateManager.disableColorMaterial();
	        }

	        GlStateManager.disableRescaleNormal();
	        GlStateManager.popMatrix();
	        super.doRender(entity, x, y, z, entityYaw, partialTicks);
	    }

	    public ItemStack getStackToRender(EntityUltimateSlimeBallBall entity)
	    {
	        return new ItemStack(this.item);
	    }
		@Override
		protected ResourceLocation getEntityTexture(EntityUltimateSlimeBallBall entity) {
			return null;
		}

	    
	   
}