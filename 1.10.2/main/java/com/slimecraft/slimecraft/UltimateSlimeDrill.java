package com.slimecraft.slimecraft;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UltimateSlimeDrill extends ItemTool {

	public UltimateSlimeDrill(ToolMaterial toolMaterial) {
	//super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
		super(10, 20, SlimeCraftItems.UltimateTool, effectiveAgainst);
	}
		private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		});


    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {

		 if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            //Shiftと右クリックでStaffにする
		        if(playerIn.isSneaking()) {
		        	if(block == Blocks.STONE)
		        	{
		        		--stack.stackSize;
		        		//playerIn.inventory.addItemStackToInventory(new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
		        		playerIn.setHeldItem(hand, (new ItemStack(SlimeCraftItems.UltimateSlimeStaff)));
		        	}
		        	if(block == Blocks.COBBLESTONE)
		        	{
		        		--stack.stackSize;
		        		//playerIn.inventory.setInventorySlotContents(0, new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
		        		playerIn.setHeldItem(hand, (new ItemStack(SlimeCraftItems.UltimateSlimeStaff)));
		        	}
		        }
	        	if(block == Blocks.BEDROCK)
      			{
	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeStaff));
	        		--stack.stackSize;
      			}

		        	if(block != Blocks.BEDROCK)
		        	{
		        		worldIn.destroyBlock(pos, false);
		        		TileEntity tileEntity = null;
		        		block.harvestBlock(worldIn, playerIn, pos, iblockstate, tileEntity, stack);
		        	}
	      }
		return null;
	    }
    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
  	  if (itemStack.isItemEnchanted() == false) {
				 itemStack.addEnchantment(Enchantments.EFFICIENCY, 10);
				 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
	             itemStack.addEnchantment(Enchantments.SILK_TOUCH,1);
	             itemStack.addEnchantment(Enchantments.SHARPNESS,10);
	             itemStack.addEnchantment(Enchantments.LOOTING,10);
	             itemStack.addEnchantment(Enchantments.MENDING,1);

			 }
    }

    }


 /*
 public boolean attackEntityFrom(DamageSource source, float amount)
      {
          if (this.isEntityInvulnerable(source))
          {
              return false;
          }
          else
          {
              boolean flag = this.mcServer.isDedicatedServer() && this.canPlayersAttack() && "fall".equals(source.damageType);

              if (!flag && this.respawnInvulnerabilityTicks > 0 && source != DamageSource.outOfWorld)
              {
                  return false;
              }
              else
              {
                  if (source instanceof EntityDamageSource)
                  {
                      Entity entity = source.getEntity();

                      if (entity instanceof EntityPlayer && !this.canAttackPlayer((EntityPlayer)entity))
                      {
                          return false;
                      }

                      if (entity instanceof EntityArrow)
                      {
                          EntityArrow entityarrow = (EntityArrow)entity;

                          if (entityarrow.shootingEntity instanceof EntityPlayer && !this.canAttackPlayer((EntityPlayer)entityarrow.shootingEntity))
                          {
                              return false;
                          }
                      }
                  }

                  return super.attackEntityFrom(source, amount);
              }
          }
      }



      public boolean isEntityInvulnerable(DamageSource source)
      {
          return this.invulnerable && source != DamageSource.outOfWorld && !source.isCreativePlayer();
      }

	      private boolean canPlayersAttack()
      {
          return this.mcServer.isPVPEnabled();
      }


	      public boolean canAttackPlayer1(EntityPlayer other)
	      {
	          Team team = this.getTeam();
	          Team team1 = other.getTeam();
	          return team == null ? true : (!team.isSameTeam(team1) ? true : team.getAllowFriendlyFire());
	      }

	      public boolean canAttackPlayer(EntityPlayer other)
	      {
	          return !this.canPlayersAttack() ? false : super.canAttackPlayerPlayer(other);
	      }

	      public Team getTeam()
	      {
	          return this.getWorldScoreboard().getPlayersTeam(this.getName());
	      }

	      public Scoreboard getWorldScoreboard()
	      {
	          return this.worldObj.getScoreboard();
	      }

	      public String getName()
	      {
	          return this.gameProfile.getName();
	      }

/*      public void attackTargetEntityWithCurrentItem(Entity targetEntity,EntityPlayer entityPlayer)
      {
          if (!net.minecraftforge.common.ForgeHooks.onPlayerAttackTarget(entityPlayer, targetEntity)) return;
          if (targetEntity.canBeAttackedWithItem())
          {
              if (!targetEntity.hitByEntity(entityPlayer))
              {
                  float f = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
                  float f1;

                  if (targetEntity instanceof EntityLivingBase)
                  {
                      f1 = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), ((EntityLivingBase)targetEntity).getCreatureAttribute());
                  }
                  else
                  {
                      f1 = EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), EnumCreatureAttribute.UNDEFINED);
                  }


                   boolean flag3 = false;
                    double d0 = (double)(this.distanceWalkedModified - this.prevDistanceWalkedModified);

                    if (flag && !flag2 && !flag1 && this.onGround && d0 < (double)this.getAIMoveSpeed())
                    {
                        ItemStack itemstack = this.getHeldItem(EnumHand.MAIN_HAND);

                        if (itemstack != null && itemstack.getItem() instanceof ItemSword)
                        {
                            flag3 = true;
                        }
                    }

              }
          }
      }*/





