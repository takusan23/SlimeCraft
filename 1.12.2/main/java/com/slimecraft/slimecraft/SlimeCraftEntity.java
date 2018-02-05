package com.slimecraft.slimecraft;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SlimeCraftEntity {
	//架空です
	public static final ResourceLocation slimeballball = new ResourceLocation("");
	public static final ResourceLocation ultimateballball = new ResourceLocation("");

	public static void register() {
       	EntityRegistry.registerModEntity(slimeballball, EntitySlimeBallBall.class, "slimeballball", 0, slimecraft.Instance , 250, 1, false);
       	EntityRegistry.registerModEntity(ultimateballball, EntityUltimateSlimeBallBall.class, "ultimateballball", 1, slimecraft.Instance, 250, 1, false);


	}

}
