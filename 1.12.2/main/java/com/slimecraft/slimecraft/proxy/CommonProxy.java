package com.slimecraft.slimecraft.proxy;

import com.slimecraft.slimecraft.SlimeCraftBlocks;
import com.slimecraft.slimecraft.SlimeCraftEntity;
import com.slimecraft.slimecraft.SlimeCraftItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		SlimeCraftItems.init();
		SlimeCraftItems.register();
		SlimeCraftBlocks.init();
		SlimeCraftBlocks.register();
	}

	public void init(FMLInitializationEvent event) {
		SlimeCraftEntity.register();

	}

	public void postInit(FMLPostInitializationEvent event) {

	}

  /*  
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	SlimeCraftItems.init();
    	SlimeCraftItems.register();
    }

    
    public static void registerBlock(RegistryEvent.Register<Block> event) {
    	SlimeCraftBlocks.init();
    	SlimeCraftBlocks.register();
    }
*/
}
