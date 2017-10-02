package com.slimecraft.slimecraft.proxy;

import com.slimecraft.slimecraft.EntitySlimeBallBall;
import com.slimecraft.slimecraft.SlimeBallBallRender;
import com.slimecraft.slimecraft.SlimeCraftBlocks;
import com.slimecraft.slimecraft.SlimeCraftEntity;
import com.slimecraft.slimecraft.SlimeCraftItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Items;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	 public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		SlimeCraftItems.register();
		SlimeCraftItems.init();
		SlimeCraftBlocks.init();
		SlimeCraftBlocks.register();

	 }
	@Override
	 public void init(FMLInitializationEvent event) {
		super.init(event);
		//SlimeCraftItems.init();
		SlimeCraftItems.registerRenders();

		//SlimeCraftBlocks.init();
		SlimeCraftBlocks.registerRenders();

		SlimeCraftEntity.register();


		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBallBall.class, new SlimeBallBallRender(renderManager, Items.SLIME_BALL, renderItem));

	 }

	@Override
	 public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	 }



}
