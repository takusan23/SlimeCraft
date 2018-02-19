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
import net.minecraft.item.Item;
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



public class SlimeMultiTool extends ItemTool{


    private final float attackDamage;
    private final Item.ToolMaterial material;



public SlimeMultiTool(ToolMaterial material){
	super(10, 0, SlimeCraftItems.SlimeTool, effectiveAgainst);
    this.attackDamage = 3.0F + material.getDamageVsEntity();
    this.material = material;

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
	        SlimeCraftBlocks.SlimeIronBlock,SlimeCraftBlocks.SlimeDiamondBlock,
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
	            else
	            {
	                return EnumActionResult.PASS;
	            }

	        }


		return null;
	    }





      public float getStrVsBlock(ItemStack stack, Block block) {

          return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, (IBlockState) block);
      }

      public float getDamageVsEntity()
      {
          return this.material.getDamageVsEntity();
      }




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





      public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
      {


          worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

          if (!worldIn.isRemote)
          {
              EntitySlimeBallBall entitySlimeBallBall = new EntitySlimeBallBall(worldIn, playerIn);
              entitySlimeBallBall.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
              worldIn.spawnEntityInWorld(entitySlimeBallBall);
          }
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




}
