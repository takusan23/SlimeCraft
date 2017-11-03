package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlimeCraftBlocks {

	public static Block SlimeIronBlock;
    public static Block SlimeDiamondBlock;
    public static Block SlimeTrophy;
    public static Block SlimeLamp;
    public static Block SlimeLamp_Light;
    public static Block concrete_white;
    public static Block concrete_black;
    public static Block concrete_blue;
    public static Block concrete_brown;
    public static Block concrete_cyan;
    public static Block concrete_green;
    public static Block concrete_light_blue;
    public static Block concrete_lime;
    public static Block concrete_magenta;
    public static Block concrete_orange;
    public static Block concrete_pink;
    public static Block concrete_purple;
    public static Block concrete_red;
    public static Block concrete_silver;
    public static Block CompactSlimeBlock;
    public static Block CompactSlimeBlock_2;
    public static Block CompactSlimeBlock_3;
    public static Block CompactSlimeBlock_4;
    public static Block CompactSlimeBlock_5;
    public static Block SlimeTable;
    public static Block SlimeXpTable;
    public static Block SlimeExchangeTable;



	public static void init() {
		SlimeIronBlock = new SlimeIronBlock();
		SlimeDiamondBlock = new SlimeDiamondBlock();
		SlimeTrophy = new SlimeTrophy();
		SlimeLamp = new SlimeLamp();
		SlimeLamp_Light = new SlimeLamp_Linght();
		concrete_white = new concrete_white();
		concrete_black = new concrete_black();
		concrete_blue = new concrete_blue();
		concrete_brown = new concrete_brown();
		concrete_cyan = new concrete_cyan();
		concrete_green = new concrete_green();
		concrete_light_blue = new concrete_light_blue();
		concrete_lime = new concrete_lime();
		concrete_magenta = new concrete_magenta();
		concrete_orange = new concrete_orange();
		concrete_pink = new concrete_pink();
		concrete_purple = new concrete_purple();
		concrete_red = new concrete_red();
		concrete_silver = new concrete_silver();
		CompactSlimeBlock = new compactslimeblock();
		CompactSlimeBlock_2 = new compactslimeblock_2();
		CompactSlimeBlock_3 = new compactslimeblock_3();
		CompactSlimeBlock_4 = new compactslimeblock_4();
		CompactSlimeBlock_5 = new compactslimeblock_5();
		SlimeTable = new SlimeTable();
		SlimeXpTable = new SlimeXpTable();
		SlimeExchangeTable = new SlimeExchangeTable();
	}
	public static void register() {
		registerBlock(SlimeIronBlock);
		registerBlock(SlimeDiamondBlock);
		registerBlock(SlimeTrophy);
		registerBlock(SlimeLamp);
		registerBlock(SlimeLamp_Light);
		registerBlock(concrete_white);
		registerBlock(concrete_black);
		registerBlock(concrete_blue);
		registerBlock(concrete_brown);
		registerBlock(concrete_cyan);
		registerBlock(concrete_green);
		registerBlock(concrete_light_blue);
		registerBlock(concrete_lime);
		registerBlock(concrete_magenta);
		registerBlock(concrete_orange);
		registerBlock(concrete_pink);
		registerBlock(concrete_purple);
		registerBlock(concrete_red);
		registerBlock(concrete_silver);
		registerBlock(CompactSlimeBlock);
		registerBlock(CompactSlimeBlock_2);
		registerBlock(CompactSlimeBlock_3);
		registerBlock(CompactSlimeBlock_4);
		registerBlock(CompactSlimeBlock_5);
		registerBlock(SlimeTable);
		registerBlock(SlimeXpTable);
		registerBlock(SlimeExchangeTable);

	}

	public static void registerBlock(net.minecraft.block.Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.registerItem(item);

	}

	public static void registerRenders() {
		regiserRender(SlimeIronBlock);
		regiserRender(SlimeDiamondBlock);
		regiserRender(SlimeTrophy);
		regiserRender(SlimeLamp);
		regiserRender(SlimeLamp_Light);
		regiserRender(concrete_white);
		regiserRender(concrete_black);
		regiserRender(concrete_blue);
		regiserRender(concrete_brown);
		regiserRender(concrete_cyan);
		regiserRender(concrete_green);
		regiserRender(concrete_light_blue);
		regiserRender(concrete_lime);
		regiserRender(concrete_magenta);
		regiserRender(concrete_orange);
		regiserRender(concrete_pink);
		regiserRender(concrete_purple);
		regiserRender(concrete_red);
		regiserRender(concrete_silver);
		regiserRender(CompactSlimeBlock);
		regiserRender(CompactSlimeBlock_2);
		regiserRender(CompactSlimeBlock_3);
		regiserRender(CompactSlimeBlock_4);
		regiserRender(CompactSlimeBlock_5);
		regiserRender(SlimeTable);
		regiserRender(SlimeXpTable);
		regiserRender(SlimeExchangeTable);
	}

	public static void regiserRender(net.minecraft.block.Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block),0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}
}
