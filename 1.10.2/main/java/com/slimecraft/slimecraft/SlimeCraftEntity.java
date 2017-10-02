package com.slimecraft.slimecraft;

import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SlimeCraftEntity {

	public static void register() {
       	EntityRegistry.registerModEntity(EntitySlimeBallBall.class, "slimeballball", 0, slimecraft.Instance , 250, 1, false);
       	

       	
	}

}
