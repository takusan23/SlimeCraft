package com.slimecraft.slimecraft;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDrop {

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.getEntityLiving().worldObj.isRemote) {
			return;
		}
		if(event.getEntityLiving() instanceof EntitySlime) {
			if(event.getEntityLiving().worldObj.rand.nextInt(5) == 0) {
				event.getEntityLiving().entityDropItem(new ItemStack(slimecraft.SlimeTrophy), 0);
			}
			}
			}

	}

