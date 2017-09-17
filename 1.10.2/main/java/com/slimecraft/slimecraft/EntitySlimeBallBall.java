package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntitySlimeBallBall extends EntityThrowable{
	





	public EntitySlimeBallBall(World worldIn)
    {
        super(worldIn);
    }

    public EntitySlimeBallBall(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntitySlimeBallBall(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
    
    @EventHandler
	 public void init(FMLInitializationEvent event) {

    	EntityRegistry.registerModEntity(EntitySlimeBallBall.class, "SlimeBallBall", 0,this, 250, 1, false);
    	
    }
    

    @Override
    protected void onImpact(RayTraceResult result) {
		
		if (result.entityHit != null)
        {
            int i = 0;

            if (result.entityHit instanceof Entity)
            {
                i = 30;
            }
            
            if (result.entityHit instanceof EntitySlime)
            {
            	entityDropItem(new ItemStack(Blocks.SLIME_BLOCK), 50);
            
            }
            
            //友好MOB、プレイヤー、etc
            if (result.entityHit instanceof EntityPlayer)
            {
            
            	i = 0;

            }
            
            if (result.entityHit instanceof EntityWolf)
            {
            
                i = 0;
            	
            }
            
            if (result.entityHit instanceof EntityOcelot)
            {
            
            	i = 0;

            }

            if (result.entityHit instanceof EntityHorse)
            {
            
            	i = 0;

            }
            
           

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
	}

		
		for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
        }

    }

	
	
}
