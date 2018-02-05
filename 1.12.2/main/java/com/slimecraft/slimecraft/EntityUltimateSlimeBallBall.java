package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityUltimateSlimeBallBall extends EntityThrowable{

	public EntityUltimateSlimeBallBall(World worldIn)
    {
        super(worldIn);
    }

    public EntityUltimateSlimeBallBall(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityUltimateSlimeBallBall(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    @EventHandler
	 public void init(FMLInitializationEvent event) {


    }
    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }
    }



    //@SuppressWarnings("null")
	protected void onImpact(RayTraceResult result) {

		EntityPlayer playerIn = null;
		Entity tagetentity = null;

		if (result.entityHit != null)
        {
            int i = 47;


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
            //それ以外


            result.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()), (float)i);



            //範囲攻撃
            {

    	        //範囲攻撃
    			//EntityMOBでモンスターにだけダメージを入れる

                for (EntityMob entitymob : this.world.getEntitiesWithinAABB(EntityMob.class, this.getEntityBoundingBox().grow(16.0D, 16.0D, 16.0D)))
                {
                    //if (entitymob != playerIn && entitymob != tagetentity && !this.isOnSameTeam(entitymob) && this.getDistanceSq(entitymob) < 9.0D)
                    if(entitymob != null)
                	{
                    	entitymob.knockBack(this, 0.4F, (double)MathHelper.sin(this.rotationYaw * 0.017453292F), (double)(-MathHelper.cos(this.rotationYaw * 0.017453292F)));
                    	entitymob.attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()), (float)i);
                    }
                }

                this.world.playSound((EntityPlayer)null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, this.getSoundCategory(), 1.0F, 1.0F);

    		    }
    		    //スライム用
            for (EntitySlime entitySlime : this.world.getEntitiesWithinAABB(EntitySlime.class, this.getEntityBoundingBox().grow(16.0D, 16.0D, 16.0D)))
            {
    		    	if (entitySlime != null)
    		    	{
    		            entitySlime.knockBack(playerIn, 0.4F, (double)MathHelper.sin(this.rotationYaw * 0.017453292F), (double)(-MathHelper.cos(this.rotationYaw * 0.017453292F)));
    		            entitySlime .attackEntityFrom(DamageSource.causeMobDamage(this.getThrower()), (float)i);

    		    	}

                    this.world.playSound((EntityPlayer)null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, this.getSoundCategory(), 1.0F, 1.0F);

    		    }


          }


		for (int j = 0; j < 8; ++j)
        {
            this.world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);

        }



    }




}