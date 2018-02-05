package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SlimeCraftBlocks {
    public static Block SlimeIronBlock;
    public static Item SlimeIronBlockItem;
    public static Block SlimeDiamondBlock;
    public static Item SlimeDiamondBlockItem;
    public static Block SlimeTrophy;
    public static Item SlimeTrophyItem;
    public static Block SlimeLamp;
    public static Item SlimeLampItem;
    public static Block SlimeLamp_Light;
    public static Item SlimeLamp_LightItem;
    //圧縮
    public static Block CompactSlimeBlock;
    public static Item CompactSlimeBlockItem;
    public static Block CompactSlimeBlock_2;
    public static Item CompactSlimeBlock_2Item;
    public static Block CompactSlimeBlock_3;
    public static Item CompactSlimeBlock_3Item;
    public static Block CompactSlimeBlock_4;
    public static Item CompactSlimeBlock_4Item;
    public static Block CompactSlimeBlock_5;
    public static Item CompactSlimeBlock_5Item;

    public static Block SlimeTable;
    public static Block SlimeXpTable;
//    public static Block SlimeExchangeTable;
    public static Block UltimateBallBlock;
    public static Block SlimeMatterBlock;

	public static void init() {
/*		SlimeIronBlockItem = new ItemBlock(SlimeIronBlock)
             	.setRegistryName(slimecraft.MOD_ID,"slimeironblock");
		SlimeDiamondBlockItem = new ItemBlock(SlimeDiamondBlock)
				.setRegistryName(slimecraft.MOD_ID,"slimediamondblock");
		SlimeTrophyItem = new ItemBlock(SlimeTrophy)
				.setRegistryName(slimecraft.MOD_ID,"slimetrophy");
		SlimeLampItem = new ItemBlock(SlimeLamp)
				.setRegistryName(slimecraft.MOD_ID,"slimelamp");
		SlimeLamp_LightItem = new ItemBlock(SlimeLamp_Light)
				.setRegistryName(slimecraft.MOD_ID,"slimelamp_light");
		CompactSlimeBlockItem = new ItemBlock(CompactSlimeBlock)
				.setRegistryName(slimecraft.MOD_ID,"compactslimeblock");
		CompactSlimeBlock_2Item = new ItemBlock(CompactSlimeBlock_2)
				.setRegistryName(slimecraft.MOD_ID,"compactslimeblock2");
		CompactSlimeBlock_3Item = new ItemBlock(CompactSlimeBlock_3)
				.setRegistryName(slimecraft.MOD_ID,"compactslimeblock3");
		CompactSlimeBlock_4Item = new ItemBlock(CompactSlimeBlock_4)
				.setRegistryName(slimecraft.MOD_ID,"compactslimeblock4");
		CompactSlimeBlock_5Item = new ItemBlock(CompactSlimeBlock_5)
				.setRegistryName(slimecraft.MOD_ID,"compactslimeblock5");
*/
		SlimeIronBlock = new SlimeIronBlock();
	    SlimeDiamondBlock = new SlimeDiamondBlock();
	   	SlimeTrophy = new SlimeTrophy();
 		SlimeLamp = new SlimeLamp();
	   	SlimeLamp_Light = new SlimeLamp_Linght();
	   	CompactSlimeBlock = new compactslimeblock();
	   	CompactSlimeBlock_2 = new compactslimeblock_2();
	   	CompactSlimeBlock_3 = new compactslimeblock_3();
	   	CompactSlimeBlock_4 = new compactslimeblock_4();
	   	CompactSlimeBlock_5 = new compactslimeblock_5();
		SlimeTable = new SlimeTable();
		SlimeXpTable = new SlimeXpTable();
		UltimateBallBlock = new UltimateBallBlock();
		SlimeMatterBlock = new SlimeMatterBlock();





	}

	public static void register() {
		registerItemBlock(SlimeIronBlock);
		registerItemBlock(SlimeDiamondBlock);
		registerItemBlock(SlimeTrophy);
		registerItemBlock(SlimeLamp);
		registerItemBlock(SlimeLamp_Light);
		registerItemBlock(CompactSlimeBlock);
		registerItemBlock(CompactSlimeBlock_2);
		registerItemBlock(CompactSlimeBlock_3);
		registerItemBlock(CompactSlimeBlock_4);
		registerItemBlock(CompactSlimeBlock_5);
		registerItemBlock(SlimeTable);
		registerItemBlock(SlimeXpTable);
		registerItemBlock(UltimateBallBlock);
		registerItemBlock(SlimeMatterBlock);


	}

	public static void registerItemBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	public static void registerRenders() {
    	regiserRender(SlimeIronBlock);
		regiserRender(SlimeDiamondBlock);
		regiserRender(SlimeTrophy);
		regiserRender(SlimeLamp);
		regiserRender(SlimeLamp_Light);
		regiserRender(CompactSlimeBlock);
		regiserRender(CompactSlimeBlock_2);
		regiserRender(CompactSlimeBlock_3);
		regiserRender(CompactSlimeBlock_4);
		regiserRender(CompactSlimeBlock_5);
		regiserRender(SlimeTable);
		regiserRender(SlimeXpTable);
		regiserRender(UltimateBallBlock);
		regiserRender(SlimeMatterBlock);

	}

	public static void regiserRender(net.minecraft.block.Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block),0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

}
