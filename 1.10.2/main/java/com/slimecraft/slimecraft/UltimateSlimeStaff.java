package com.slimecraft.slimecraft;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;


public class UltimateSlimeStaff extends ItemTool{

		public UltimateSlimeStaff(ToolMaterial toolMaterial) {
		//super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
			super(10, 20, SlimeCraftItems.UltimateTool, effectiveAgainst);
			// TODO 自動生成されたコンストラクター・スタブ
	}

		@Override
		public Set<String> getToolClasses(ItemStack stack) {
		    return ImmutableSet.of("pickaxe","spade","axe","hoe");
		}

		//private static Set effectiveAgainst;

		private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
			    Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL,Blocks.GLASS,Blocks.REDSTONE_LAMP,Blocks.WEB,
			    Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND,
			    Blocks.SOUL_SAND, Blocks.MYCELIUM,Blocks.COBBLESTONE,Blocks.STONE,
		        Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE,Blocks.IRON_BLOCK,Blocks.OBSIDIAN,
		        Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE,Blocks.CRAFTING_TABLE,
		        SlimeCraftBlocks.SlimeIronBlock,SlimeCraftBlocks.SlimeDiamondBlock,
		});

		 public boolean canHarvestBlock(IBlockState blockIn)
	    {
			return true;
	    }

/*	        if (block == Blocks.OBSIDIAN)
	        {
	            return this.toolMaterial.getHarvestLevel() == 3;
	        }


	        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
	        {
	            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
	            {

	            		if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
	            		{
	            			if (block != Blocks.SNOW_LAYER && block != Blocks.SNOW)
	                		{
	            				if (block != Blocks.WEB && block != Blocks.WEB)
	                    		{

	            			if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
	            			{

	            				if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
	            				{

	            					if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
	            					{
	                                Material material = blockIn.getMaterial();
	                                return material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL);
	                            }




	                            else
	                            {
	                                return this.toolMaterial.getHarvestLevel() >= 2;
	                            }
	                        }
	                        else
	                        {
	                            return this.toolMaterial.getHarvestLevel() >= 1;
	                        }
	                    }
	                    else
	                    {
	                        return this.toolMaterial.getHarvestLevel() >= 1;
	                    }
	                }
	                else
	                {
	                    return this.toolMaterial.getHarvestLevel() >= 2;
	                }
	            }
	            else
	            {
	                return this.toolMaterial.getHarvestLevel() >= 2;
	            }
	        }
	        else
	        {
	            return this.toolMaterial.getHarvestLevel() >= 2;
	        }
	        }
			return true;}
			return true;}
*/


		 @SuppressWarnings("incomplete-switch")
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

		            if (facing != EnumFacing.DOWN && worldIn.getBlockState(pos.up()).getMaterial() == Material.AIR && block == Blocks.GRASS)
		            {
		                IBlockState iblockstate1 = Blocks.GRASS_PATH.getDefaultState();
		                worldIn.playSound(playerIn, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

		                if (!worldIn.isRemote)
		                {
		                    worldIn.setBlockState(pos, iblockstate1, 11);
		                    stack.damageItem(1, playerIn);
		                }

		                return EnumActionResult.SUCCESS;
		            }



		            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
		            {
		                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
		                {
		                    this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                   return EnumActionResult.SUCCESS;
		                }

		                if (block == Blocks.DIRT)
		                {
		                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
		                    {
		                        case DIRT:
		                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
		                            return EnumActionResult.SUCCESS;
		                        case COARSE_DIRT:
		                            this.setBlock(stack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
		                            return EnumActionResult.SUCCESS;
		                    }
		                	}
		            	}
		                //UltimateSlimeBall変換
		                if (block == SlimeCraftBlocks.SlimeTrophy)
		                {
		    	        	playerIn.dropItem(new ItemStack(Items.SLIME_BALL), true);
		    	        	worldIn.destroyBlock(pos, false);
		    	        	playerIn.addStat(slimecraft.SlimeTrophy_New_usage);
		                }
/*		                //SlimeMatter変換
 						//削除
		                if (block == SlimeCraftBlocks.UltimateBallBlock)
		                {
		    	        	playerIn.dropItem(new ItemStack(SlimeCraftItems.SlimeMatter), true);
		    	        	worldIn.destroyBlock(pos, false);
		    	        	playerIn.addStat(slimecraft.SlimeMatter);
		                }
*/

		    	        if(playerIn.isSneaking()) {
		    	        	if(block == Blocks.STONE)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeDrill));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.COBBLESTONE)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeDrill));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.LOG)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeChainsaw));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.LOG2)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeChainsaw));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.PLANKS)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeChainsaw));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.DIRT)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeHoe));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.GRASS_PATH)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeHoe));
		    	        		--stack.stackSize;
		          			}
		    	        	if(block == Blocks.FARMLAND)
		          			{
		    	        		playerIn.setHeldItem(hand,new ItemStack(SlimeCraftItems.UltimateSlimeHoe));
		    	        		--stack.stackSize;
		          			}





		    	        }


		            else
		         	{
		        	 return EnumActionResult.PASS;
		         	}

		        }
			 return null;
		    }

	      public float getStrVsBlock(ItemStack stack, Block block) {

	          //return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, (IBlockState) block);
	    	  return 10.0F;
	      }

/*	      public float getDamageVsEntity()
	      {
	          return this.Item.ToolMaterial.getDamageVsEntity();
	      }
*/



	      public float getStrVsBlock(ItemStack stack, IBlockState state)
	      {
	          Material material = state.getMaterial();

	           return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE &&
	           material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;

	    	  }



	      protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
	      {
	          worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

	          if (!worldIn.isRemote)
	          {
	              worldIn.setBlockState(pos, state, 11);
	              stack.damageItem(1, player);
	          }
	      }



	      public void spawnSweepParticles(EntityPlayer entityPlayer)
	      {
	          double d0 = (double)(-MathHelper.sin(entityPlayer.rotationYaw * 0.017453292F));
	          double d1 = (double)MathHelper.cos(entityPlayer.rotationYaw * 0.017453292F);

	          if (entityPlayer.worldObj instanceof WorldServer)
	          {
	              ((WorldServer)entityPlayer.worldObj).spawnParticle(EnumParticleTypes.SWEEP_ATTACK, entityPlayer.posX + d0, entityPlayer.posY + (double)entityPlayer.height * 0.5D, entityPlayer.posZ + d1, 0, d0, 0.0D, d1, 0.0D, new int[0]);
	          }
	      }



	      public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	      {

	          worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	          if (!worldIn.isRemote)
	          {
	              EntityUltimateSlimeBallBall entityUltimateSlimeBallBall = new EntityUltimateSlimeBallBall(worldIn, playerIn);
	              entityUltimateSlimeBallBall.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
	              worldIn.spawnEntityInWorld(entityUltimateSlimeBallBall);
	          }
	          playerIn.addStat(slimecraft.Range_attack);

	          playerIn.addStat(StatList.getObjectUseStats(this));
	          return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
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

}