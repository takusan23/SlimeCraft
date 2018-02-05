package com.slimecraft.slimecraft.proxy;

import com.slimecraft.slimecraft.EntitySlimeBallBall;
import com.slimecraft.slimecraft.EntityUltimateSlimeBallBall;
import com.slimecraft.slimecraft.SlimeBallBallRender;
import com.slimecraft.slimecraft.SlimeCraftBlocks;
import com.slimecraft.slimecraft.SlimeCraftItems;
import com.slimecraft.slimecraft.UltimateSlimeBallBallRender;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		SlimeCraftItems.init();
		SlimeCraftItems.register();
		SlimeCraftBlocks.init();
		SlimeCraftBlocks.register();
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		 SlimeCraftItems.registerRenders();
		 SlimeCraftBlocks.registerRenders();

		 RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		 RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		 RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBallBall.class, new SlimeBallBallRender(renderManager, Items.SLIME_BALL, renderItem));
		 RenderingRegistry.registerEntityRenderingHandler(EntityUltimateSlimeBallBall.class, new UltimateSlimeBallBallRender(renderManager, SlimeCraftItems.UltimateSlimeBall, renderItem));


	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

	 public static void registerItems(RegistryEvent.Register<Item> event) {
	    	SlimeCraftItems.init();
	    	SlimeCraftItems.register();
	    }

	    public static void registerBlock(RegistryEvent.Register<Block> event) {
	    	SlimeCraftBlocks.init();
	    	SlimeCraftBlocks.register();
	    }

	 public static void registerModels(ModelRegistryEvent event) {
		 SlimeCraftItems.registerRenders();
		 SlimeCraftBlocks.registerRenders();


		 RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		 RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		 RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBallBall.class, new SlimeBallBallRender(renderManager, Items.SLIME_BALL, renderItem));
		 RenderingRegistry.registerEntityRenderingHandler(EntityUltimateSlimeBallBall.class, new UltimateSlimeBallBallRender(renderManager, SlimeCraftItems.UltimateSlimeBall, renderItem));


	 }
	    
	   


}
