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
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SlimeMultiToolFortune extends ItemTool{





public SlimeMultiToolFortune(ToolMaterial toolMaterial){
	super(10, 0, SlimeCraftItems.SlimeTool, effectiveAgainst);
 }
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe","spade","axe","hoe");
	}

	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.GRASS, Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL,
		    Blocks.SNOW_LAYER, Blocks.SNOW, Blocks.CLAY, Blocks.FARMLAND,
		    Blocks.SOUL_SAND, Blocks.MYCELIUM,Blocks.COBBLESTONE,Blocks.STONE,
	        Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE,Blocks.IRON_BLOCK,Blocks.OBSIDIAN,
	        Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE,Blocks.CRAFTING_TABLE,

	});





	 public boolean canHarvestBlock(IBlockState blockIn)
    {


        Block block = blockIn.getBlock();


        if (block == Blocks.OBSIDIAN)
        {

            return this.toolMaterial.getHarvestLevel() == 5;
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

	 @SuppressWarnings("incomplete-switch")
	 public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	            {
	                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
	                {
	                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                    return EnumActionResult.SUCCESS;
	                }

	                if (block == Blocks.DIRT)
	                {
	                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
	                    {
	                        case DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                            return EnumActionResult.SUCCESS;
	                        case COARSE_DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	                            return EnumActionResult.SUCCESS;
	                    }
	                }
	            }

	            return EnumActionResult.PASS;
	        }
	    }


/*
      public float getStrVsBlock(ItemStack stack, Block block) {

          return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, (IBlockState) block);
      }
*/



	    public float getDestroySpeed(ItemStack stack, IBlockState state)
	    {
        Material material = state.getMaterial();

         return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE &&
         material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
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


      public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
      {
          ItemStack itemstack = playerIn.getHeldItem(handIn);

          worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

          if (!worldIn.isRemote)
          {
              EntitySlimeBallBall entitySlimeBallBall = new EntitySlimeBallBall(worldIn, playerIn);
              entitySlimeBallBall.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
              worldIn.spawnEntity(entitySlimeBallBall);
          }

          playerIn.addStat(StatList.getObjectUseStats(this));
          return new ActionResult(EnumActionResult.SUCCESS, itemstack);
      }












      @Override
      public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean isHeld) {
    	  if (itemStack.isItemEnchanted() == false) {
    		  	 itemStack.addEnchantment(Enchantments.LOOTING,10);
				 itemStack.addEnchantment(Enchantments.EFFICIENCY, 10);
				 itemStack.addEnchantment(Enchantments.UNBREAKING,10);
	             itemStack.addEnchantment(Enchantments.FORTUNE,10);
	             itemStack.addEnchantment(Enchantments.SHARPNESS,10);
	             itemStack.addEnchantment(Enchantments.MENDING,1);

			 }


      }



	}




