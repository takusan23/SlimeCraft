package com.slimecraft.slimecraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

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

    private void extinguishFires(BlockPos pos)
    {
        if (this.worldObj.getBlockState(pos).getBlock() == Blocks.FIRE)
        {
            this.worldObj.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);
        }
    }


    //@SuppressWarnings("null")
	protected void onImpact(RayTraceResult result) {

		if (result.entityHit != null)
        {
            int i = 30;

            //友好MOB、プレイヤー、etc
            if (result.entityHit instanceof EntityPlayer)
            {
            	i = 0;
            }

            if (result.entityHit instanceof EntityPlayerMP)
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
            if (result.entityHit instanceof Entity )
            {
            	i = 30;
            }

            if (result.entityHit instanceof EntitySlime)
            {
            	entityDropItem(new ItemStack(Blocks.SLIME_BLOCK), (float)getYOffset());
            }


            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);

            //範囲攻撃
    		if (result.entityHit != null)
            {
    			//プレイヤーにはダメージを入れない
    			int d = 0;

                 	if (result.entityHit instanceof EntityPlayer)
                	{
                		d = 0;
                	}


    	        //範囲攻撃
    			EntityPlayer playerIn = null;
    			Entity tagetentity = null;


    		    for (EntityLivingBase entitylivingbase : this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand(50.0D, 50.0D, 10.0D)))
    		    {
    		    	if (entitylivingbase != playerIn && entitylivingbase != tagetentity && !this.isOnSameTeam(entitylivingbase) && this.getDistanceSqToEntity(entitylivingbase) < 9.0D)
    		        {
    		            entitylivingbase.knockBack(playerIn, 0.4F, (double)MathHelper.sin(this.rotationYaw * 0.017453292F), (double)(-MathHelper.cos(this.rotationYaw * 0.017453292F)));
    		            entitylivingbase.attackEntityFrom(DamageSource.causeThrownDamage(playerIn, this.getThrower()), (float)d);
    		            entitylivingbase.attackEntityFrom(DamageSource.causeThrownDamage(playerIn, this.getThrower()), (float)i);
    		        }

                    this.worldObj.playSound((EntityPlayer)null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, this.getSoundCategory(), 1.0F, 1.0F);

            }

          }
        }

		for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
            //this.worldObj.loadedEntityList.clear();


        }



    }




}
