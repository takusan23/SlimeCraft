package com.slimecraft.slimecraft.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{


	 public void PreInit(FMLPreInitializationEvent event)
	 {
		 super.preInit(event);
	 }
	 public void init(FMLInitializationEvent event)
	 {
     	super.init(event);
	 }
	 public void postInit(FMLPostInitializationEvent event)
	 {
		 super.postInit(event);

	 }


}
