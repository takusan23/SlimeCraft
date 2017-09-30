package com.slimecraft.slimecraft;



import com.slimecraft.slimecraft.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = slimecraft.MOD_ID,
        name = slimecraft.MOD_NAME,
        version = slimecraft.MOD_VERSION,
        dependencies = slimecraft.MOD_DEPENDENCIES,
        acceptedMinecraftVersions = slimecraft.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true)
public class slimecraft{



    public static final String MOD_ID = "slimecraft";
    public static final String MOD_NAME = "SlimeCraft";
    public static final String MOD_VERSION = "1.3";
    public static final String MOD_DEPENDENCIES ="required-after:Forge@[1.10.2-12.18.3.2316-,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.10.2]";
    public static final String CLIENT_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.CommonProxy";
    public static final String SERVER_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.ServerProxy";

     //sword
    public static Item SlimeSword;
    public static Item SlimeIronSword;
    public static Item SlimeDiamondSword;
    public static Item SlimeDiamondSwordX;
    //tools
    public static Item SlimePickaxe;
    public static Item SlimeAxe;
    public static Item SlimeHoe;
    public static Item SlimeShovel;
    //Slime Iron Tools
    public static Item SlimeIronPickaxe;
    public static Item SlimeIronAxe;
    public static Item SlimeIronShovel;
    public static Item SlimeIronHoe;
    //Slime Diamond Tools
    public static Item SlimeDiamondPickaxe;
    public static Item SlimeDiamondAxe;
    public static Item SlimeDiamondShovel;
    public static Item SlimeDiamondHoe;
    //Slime Diamond X Tools
    public static Item SlimeDiamondPickaxeX;
    public static Item SlimeDiamondShovelX;
    public static Item SlimeDiamondAxeX;
    public static Item SlimeDiamondHoeX;
    //その他
    public static Item SlimeIron;
    public static Item SlimeDiamond;
    public static Item SlimeCookie;
    public static Item GlassStick;
    public static Block SlimeIronBlock;
    public static Block SlimeDiamondBlock;
    public static Block SlimeTrophy;
    public static Block SlimeLamp;
    public static Block SlimeLamp_Light;


    //マルチツール
    public static Item SlimeMultiTool;
    public static Item SlimeMultiToolFortune;
    //ポーションカード
    public static Item PotionCard;
    public static Item SpeedCard;
    public static Item FoodCard;
    public static Item RegenerationCard;
    public static Item HungerCard;
    public static Item FireResistanceCard;
    public static Item ResistanceCard;
    public static Item NightVisionCard;
    public static Item InvisibilityCard;
    public static Item JumpBoostCard;
    public static Item GlowingCard;

    //コンクリートブロック
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

    //スライムキット
    public static Item SlimeMakeKit;
    public static Item SlimeMakeKit_2;
    public static Item SlimeMakekit_3;
    public static Item SlimeMakekit_4;

    public static Item SlimeMakeing_1;
    public static Item SlimeMakeing_2;
    public static Item SlimeMakeing_3;
    public static Item SlimeMakeing_4;
    public static Item SlimeMakeing_5;
    public static Item SlimeMakeing_6;
    public static Item SlimeMakeing_7;
    public static Item SlimeMakeing_8;
    public static Item SlimeMakeing_9;
    public static Item SlimeMakeing_10;
    public static Item SlimeMakeing_11;

    //圧縮スライムブロック
    public static Block CompactSlimeBlock;
    public static Block CompactSlimeBlock_2;
    public static Block CompactSlimeBlock_3;
    public static Block CompactSlimeBlock_4;
    public static Block CompactSlimeBlock_5;


    //マテリアル
    public static ToolMaterial Dia_SLIME;
    public static ToolMaterial Iron_Slime;
    public static ToolMaterial SlimeTool;



    //クリエタブ追加
    public static final CreativeTabs SlimeCraftTab = new SlimeCraftTab("SlimeCraftTab");

    //実績について
    //実績項目追加はこちらからぁ。さーさーどーぞ
    public static Achievement Welcome_to_SlimeCraft;
    public static Achievement Slime_Sword;
    public static Achievement SlimeIron_Sword;
    public static Achievement SlimeDiamond_Sword;
    public static Achievement SlimeDiamond_X_Series;
    public static Achievement SlimeDiamondPickaxe_X;
    public static Achievement SlimeDiamondAxe_X;
    public static Achievement SlimeDiamondShovel_X;
    public static Achievement SlimeDiamondHoe_X;
    public static Achievement Pickaxe_Axe_Shovel_Hoe;
    public static Achievement MultiTool_Fortune;
    public static Achievement Welcome_to_ScienceClub;
    public static Achievement EasyFood;
    public static Achievement Low_performance_personal_computer;


    //実績ページ追加
    public static  AchievementPage SlimeCraft_Achievement;


    //SideProxy?
    @SidedProxy(clientSide = slimecraft.CLIENT_PROXY_CLASS, serverSide = slimecraft.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	//proxy
    	proxy.preInit(event);


   		//mob drop
    	MinecraftForge.EVENT_BUS.register(new MobDrop());
    	//実績かきかき
    	MinecraftForge.EVENT_BUS.register(new SlimeCraftAchievement());
    	//実績は一番下らへんにありますよぉ


    	//Materialいぇぇぇぇぇぇぇいぃぃぃぃ

    	SlimeTool = EnumHelper.addToolMaterial("SlimeTool", 5, 0, 40.0F, 50.0F, 30)
    			.setRepairItem(new ItemStack(slimecraft.SlimeDiamond));


    	  SlimeDiamond = new Item()
    		        .setCreativeTab(slimecraft.SlimeCraftTab)
    		        .setUnlocalizedName("Slime Diamond");
    		        GameRegistry.registerItem(SlimeDiamond,"slimediamond");

    		        if(event.getSide().isClient()){
    		        	ModelLoader.setCustomModelResourceLocation(SlimeDiamond, 0, new ModelResourceLocation(SlimeDiamond.getRegistryName(),"inventory"));


    		        Dia_SLIME = EnumHelper.addToolMaterial("Diamond Slime", 5, 0, 20.0F, 20.0F, 30)
    		        		.setRepairItem(new ItemStack(slimecraft.SlimeDiamond));

    	SlimeIron = new Item()
    			 .setUnlocalizedName("Slime Iron Ingot")
    			 .setCreativeTab(slimecraft.SlimeCraftTab);
    			 GameRegistry.registerItem(SlimeIron,"slimeiron");

    			 if(event.getSide().isClient()){
    				 ModelLoader.setCustomModelResourceLocation(SlimeIron, 0, new ModelResourceLocation(SlimeIron.getRegistryName(),"inventory"));


    			 Iron_Slime = EnumHelper.addToolMaterial("Slime Iron", 2, 512, 6.0F, 1.5F, 10)
    					 .setRepairItem(new ItemStack(slimecraft.SlimeIron));







        SlimeSword = new ItemSword(ToolMaterial.STONE)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("Slime Sword")
            	.setMaxDamage(256);
                 GameRegistry.registerItem(SlimeSword,"slimesword");




        if(event.getSide().isClient()){

            ModelLoader.setCustomModelResourceLocation(SlimeSword, 0, new ModelResourceLocation(SlimeSword.getRegistryName(), "inventory"));


        SlimeIronSword = new ItemSword(slimecraft.Iron_Slime)
        .setCreativeTab(slimecraft.SlimeCraftTab)
        .setUnlocalizedName("SlimeIron Sword");

        GameRegistry.registerItem(SlimeIronSword,"slimeironsword");

        if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(SlimeIronSword, 0, new ModelResourceLocation(SlimeIronSword.getRegistryName(),"inventory"));


        SlimeDiamondSword = new ItemSword(slimecraft.Dia_SLIME)
        .setCreativeTab(slimecraft.SlimeCraftTab)
        .setUnlocalizedName("SlimeDiamond Sword");

        GameRegistry.registerItem(SlimeDiamondSword,"slimediamondsword");

        if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(SlimeDiamondSword,0,new ModelResourceLocation(SlimeDiamondSword.getRegistryName(),"inventory"));


        SlimeDiamondSwordX = new SlimeDiamondSwordX(slimecraft.Dia_SLIME)
       	.setCreativeTab(slimecraft.SlimeCraftTab)
  		.setUnlocalizedName("SlimeDiamond Sword X");
        GameRegistry.registerItem(SlimeDiamondSwordX,"slimediamondswordx");

        if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(SlimeDiamondSwordX, 0, new ModelResourceLocation(SlimeDiamondSwordX.getRegistryName(),"inventory"));






		//	Slime tools

		SlimePickaxe = new SlimePickaxe(ToolMaterial.STONE)
				.setCreativeTab(slimecraft.SlimeCraftTab)
			    .setUnlocalizedName("Slime Pickaxe");
		        GameRegistry.registerItem(SlimePickaxe,"slimepickaxe");
		 if(event.getSide().isClient()){
			ModelLoader.setCustomModelResourceLocation(SlimePickaxe, 0, new ModelResourceLocation(SlimePickaxe.getRegistryName(),"inventory"));



		SlimeAxe = new SlimeAxe(ToolMaterial.STONE)
				.setCreativeTab(slimecraft.SlimeCraftTab)
			    .setUnlocalizedName("Slime Axe");
			    GameRegistry.registerItem(SlimeAxe,"slimeaxe");
		if(event.getSide().isClient()){
			ModelLoader.setCustomModelResourceLocation(SlimeAxe, 0, new ModelResourceLocation(SlimeAxe.getRegistryName(),"inventory"));


        SlimeHoe = new ItemHoe(ToolMaterial.STONE)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("Slime Hoe");
        		GameRegistry.registerItem(SlimeHoe,"slimehoe");
        		if(event.getSide().isClient()){
        			ModelLoader.setCustomModelResourceLocation(SlimeHoe, 0, new ModelResourceLocation(SlimeHoe.getRegistryName(),"inventory"));


        SlimeShovel = new SlimeShovel(ToolMaterial.STONE)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("Slime Shovel");
                GameRegistry.registerItem(SlimeShovel,"slimeshovel");
                if(event.getSide().isClient()){
                 ModelLoader.setCustomModelResourceLocation(SlimeShovel, 0, new ModelResourceLocation(SlimeShovel.getRegistryName(),"inventory"));

        //Slime Iron tools

        SlimeIronPickaxe = new SlimeIronPickaxe(ToolMaterial.IRON)
       		.setCreativeTab(slimecraft.SlimeCraftTab)
       		.setMaxDamage(512)
       		.setUnlocalizedName("SlimeIron Sword");
               GameRegistry.registerItem(SlimeIronPickaxe,"slimeironpickaxe");
              if(event.getSide().isClient()){
                  ModelLoader.setCustomModelResourceLocation(SlimeIronPickaxe, 0, new ModelResourceLocation(SlimeIronPickaxe.getRegistryName(),"inventory"));

        SlimeIronAxe = new SlimeIronAxe(ToolMaterial.IRON)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("SlimeIron Axe")
        		.setMaxDamage(512);
                GameRegistry.registerItem(SlimeIronAxe,"slimeironaxe");
                if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(SlimeIronAxe, 0, new ModelResourceLocation(SlimeIronAxe.getRegistryName(),"inventory"));

         SlimeIronShovel = new SlimeIronShovel(ToolMaterial.IRON)
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setUnlocalizedName("SlimeIron Shovel")
        		 .setMaxDamage(512);
                 GameRegistry.registerItem(SlimeIronShovel,"slimeironshovel");
                 if(event.getSide().isClient()){
                	 ModelLoader.setCustomModelResourceLocation(SlimeIronShovel, 0, new ModelResourceLocation(SlimeIronShovel.getRegistryName(),"inventory"));

         SlimeIronHoe = new SlimeIronHoe(ToolMaterial.IRON)
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setUnlocalizedName("SlimeIron Hoe")
        		 .setMaxDamage(512);
                 GameRegistry.registerItem(SlimeIronHoe,"slimeironhoe");
                 if(event.getSide().isClient()){
                	 ModelLoader.setCustomModelResourceLocation(SlimeIronHoe, 0, new ModelResourceLocation(SlimeIronHoe.getRegistryName(),"inventory"));



        //Slime Diamond tools

        SlimeDiamondPickaxe = new SlimeDiamondPickaxe(ToolMaterial.DIAMOND)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setMaxDamage(4096)
       		    .setUnlocalizedName("SlimeDiamond Pickaxe");
                 GameRegistry.registerItem(SlimeDiamondPickaxe,"slimediamondpickaxe");
                 if(event.getSide().isClient()){
                    ModelLoader.setCustomModelResourceLocation(SlimeDiamondPickaxe, 0, new ModelResourceLocation(SlimeDiamondPickaxe.getRegistryName(),"inventory"));

        SlimeDiamondAxe = new SlimeDiamondAxe(ToolMaterial.DIAMOND)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setMaxDamage(4096)
        		.setUnlocalizedName("SlimeDiamond Axe");
                GameRegistry.registerItem(SlimeDiamondAxe,"slimediamondaxe");
                if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(SlimeDiamondAxe, 0, new ModelResourceLocation(SlimeDiamondAxe.getRegistryName(),"inventory"));

        SlimeDiamondShovel = new SlimeDiamondShovel(ToolMaterial.DIAMOND)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("SlimeDiamond Shovel")
        		.setMaxDamage(4096);
                GameRegistry.registerItem(SlimeDiamondShovel,"slimediamondshovel");
                if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(SlimeDiamondShovel, 0, new ModelResourceLocation(SlimeDiamondShovel.getRegistryName(),"inventory"));

        SlimeDiamondHoe = new SlimeDiamondHoe(ToolMaterial.DIAMOND)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("SlimeDiamond Hoe")
        		.setMaxDamage(4096);
                GameRegistry.registerItem(SlimeDiamondHoe,"slimediamondhoe");
                if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(SlimeDiamondHoe, 0, new ModelResourceLocation(SlimeDiamondHoe.getRegistryName(),"inventory"));


        //Slime Diamond X tools

       SlimeDiamondPickaxeX = new SlimeDiamondPickaxeX(slimecraft.Dia_SLIME)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        		.setUnlocalizedName("SlimeDiamond Pickaxe X");
                GameRegistry.registerItem(SlimeDiamondPickaxeX,"slimediamondpickaxex");
                if(event.getSide().isClient()){
                    ModelLoader.setCustomModelResourceLocation(SlimeDiamondPickaxeX, 0, new ModelResourceLocation(SlimeDiamondPickaxeX.getRegistryName(),"inventory"));

       SlimeDiamondShovelX = new SlimeDiamondShovelX(slimecraft.Dia_SLIME)
    		   .setCreativeTab(slimecraft.SlimeCraftTab)
    		   .setUnlocalizedName("SlimeDiamond Shovel X");
               GameRegistry.registerItem(SlimeDiamondShovelX,"slimediamondshovelx");
               if(event.getSide().isClient()){
            	   ModelLoader.setCustomModelResourceLocation(SlimeDiamondShovelX, 0, new ModelResourceLocation(SlimeDiamondShovelX.getRegistryName(),"inventory"));

      SlimeDiamondAxeX = new SlimeDiamondAxeX(ToolMaterial.DIAMOND)
    		  .setMaxDamage(0)
    		  .setCreativeTab(slimecraft.SlimeCraftTab)
    		  .setUnlocalizedName("SlimeDiamond Axe X");
              GameRegistry.registerItem(SlimeDiamondAxeX,"slimediamondaxex");
              if(event.getSide().isClient()){
            	ModelLoader.setCustomModelResourceLocation(SlimeDiamondAxeX, 0, new ModelResourceLocation(SlimeDiamondAxeX.getRegistryName(),"inventory"));

       SlimeDiamondHoeX = new SlimeDiamondHoeX(slimecraft.Dia_SLIME)
    		   .setCreativeTab(slimecraft.SlimeCraftTab)
    		   .setUnlocalizedName("SlimeDiamond Hoe X");
    		   GameRegistry.registerItem(SlimeDiamondHoeX,"slimediamondhoex");
               if(event.getSide().isClient()){
            	   ModelLoader.setCustomModelResourceLocation(SlimeDiamondHoeX, 0,new ModelResourceLocation(SlimeDiamondHoeX.getRegistryName(),"inventory"));

       SlimeMultiTool = new SlimeMultiTool(slimecraft.SlimeTool)
    		   .setCreativeTab(slimecraft.SlimeCraftTab)
    		   .setUnlocalizedName("Slime MultiTool");
    		   GameRegistry.registerItem(SlimeMultiTool,"slimemultitool");
    		   if(event.getSide().isClient()){
            	   ModelLoader.setCustomModelResourceLocation(SlimeMultiTool, 0,new ModelResourceLocation(SlimeMultiTool.getRegistryName(),"inventory"));




        SlimeMultiToolFortune = new SlimeMultiToolFortune(slimecraft.SlimeTool)
        		.setCreativeTab(slimecraft.SlimeCraftTab)
        	    .setUnlocalizedName("Slime MultiTool(Fortune)");
        		GameRegistry.registerItem(SlimeMultiToolFortune,"slimemultitoolfortune");
        		if(event.getSide().isClient()){
             	   ModelLoader.setCustomModelResourceLocation(SlimeMultiToolFortune, 0,new ModelResourceLocation(SlimeMultiToolFortune.getRegistryName(),"inventory"));
        		}




          //item





        SlimeCookie = new SlimeCookie(10, false);
        	    GameRegistry.registerItem(SlimeCookie,"slimecookie");


                  if (event.getSide().isClient()) {
               	ModelLoader.setCustomModelResourceLocation(SlimeCookie, 0, new ModelResourceLocation(SlimeCookie.getRegistryName(),"inventory"));

       GlassStick = new Item()
           		.setCreativeTab(slimecraft.SlimeCraftTab)
           		.setUnlocalizedName("Glass Stick");
           		GameRegistry.registerItem(GlassStick,"glassstick");
           		if(event.getSide().isClient()){
           			ModelLoader.setCustomModelResourceLocation(GlassStick, 0, new ModelResourceLocation(GlassStick.getRegistryName(),"inventory"));


           		   //ブロック

       SlimeIronBlock = new SlimeIronBlock();
    		   ResourceLocation registryName = new ResourceLocation(MOD_ID,"slimeironblock");
               ItemBlock SlimeIronItemBlock = new ItemBlock(SlimeIronBlock);

               GameRegistry.register(SlimeIronBlock,registryName);
               GameRegistry.register(SlimeIronItemBlock,registryName);

               if(event.getSide().isClient()){
            	   ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeIronBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "slimeironblock", "inventory"));

       SlimeDiamondBlock = new SlimeDiamondBlock();
                ResourceLocation registryName15 = new ResourceLocation(MOD_ID,"slimediamondblock");
                ItemBlock SlimeDiamondItemBlock = new ItemBlock(SlimeDiamondBlock);



                GameRegistry.register(SlimeDiamondBlock,registryName15);
                GameRegistry.register(SlimeDiamondItemBlock,registryName15);


                if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeDiamondBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "slimediamondblock", "inventory"));


       SlimeTrophy = new SlimeTrophy();
       			ResourceLocation registryName16 = new ResourceLocation(MOD_ID,"slimetrophy");
       			ItemBlock SlimeTrophyItem = new ItemBlock(SlimeTrophy);

       			GameRegistry.register(SlimeTrophy,registryName16);
       			GameRegistry.register(SlimeTrophyItem,registryName16);
       			if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeTrophy), 0, new ModelResourceLocation(MOD_ID + ":" + "slimetrophy", "inventory"));

       SlimeLamp = new SlimeLamp();
       			ResourceLocation registryName17 = new ResourceLocation(MOD_ID,"slimelamp");
       			ItemBlock slimelampItem = new ItemBlock(SlimeLamp);

       			GameRegistry.register(SlimeLamp,registryName17);
       			GameRegistry.register(slimelampItem,registryName17);
       			if(event.getSide().isClient()){
                	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeLamp), 0, new ModelResourceLocation(MOD_ID + ":" + "slimelamp", "inventory"));

      SlimeLamp_Light = new SlimeLamp_Linght();
      		ResourceLocation registryName18 = new ResourceLocation(MOD_ID,"slimelamplight");
			ItemBlock slimelamplightItem = new ItemBlock(SlimeLamp_Light);

			GameRegistry.register(SlimeLamp_Light,registryName18);
			GameRegistry.register(slimelamplightItem,registryName18);
			if(event.getSide().isClient()){
      	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeLamp_Light), 0, new ModelResourceLocation(MOD_ID + ":" + "slimelamplight", "inventory"));





       concrete_white = new concrete_white();
       ResourceLocation registryName1 = new ResourceLocation(MOD_ID,"concrete_white");
       ItemBlock concrete_whiteItem = new ItemBlock(concrete_white);

       GameRegistry.register(concrete_white,registryName1);
       GameRegistry.register(concrete_whiteItem,registryName1);
       if(event.getSide().isClient()){
       	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_white), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_white", "inventory"));

       concrete_black = new concrete_black();
       ResourceLocation registryName2 = new ResourceLocation(MOD_ID,"concrete_black");
       ItemBlock concrete_blackItem = new ItemBlock(concrete_black);

       GameRegistry.register(concrete_black,registryName2);
       GameRegistry.register(concrete_blackItem,registryName2);
       if(event.getSide().isClient()){
          	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_black), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_black", "inventory"));

       concrete_blue = new concrete_blue();
       ResourceLocation registryName3 = new ResourceLocation(MOD_ID,"concrete_blue");
       ItemBlock concrete_blueItem = new ItemBlock(concrete_blue);

       GameRegistry.register(concrete_blue,registryName3);
       GameRegistry.register(concrete_blueItem,registryName3);
       if(event.getSide().isClient()){
         	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_blue), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_blue", "inventory"));

       concrete_brown = new concrete_brown();
       ResourceLocation registryName4 = new ResourceLocation(MOD_ID,"concrete_brown");
       ItemBlock concrete_brownItem = new ItemBlock(concrete_brown);

       GameRegistry.register(concrete_brown,registryName4);
       GameRegistry.register(concrete_brownItem,registryName4);
       if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_brown), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_brown", "inventory"));

       concrete_cyan = new concrete_cyan();
       ResourceLocation registryName5 = new ResourceLocation(MOD_ID,"concrete_cyan");
       ItemBlock concrete_cyanItem = new ItemBlock(concrete_cyan);

       GameRegistry.register(concrete_cyan,registryName5);
       GameRegistry.register(concrete_cyanItem,registryName5);
       if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_cyan), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_cyan", "inventory"));

       concrete_green = new concrete_green();
       ResourceLocation registerName6 = new ResourceLocation(MOD_ID,"concrete_green");
       ItemBlock concrete_greenItem = new ItemBlock(concrete_green);

       GameRegistry.register(concrete_green,registerName6);
       GameRegistry.register(concrete_greenItem,registerName6);
       if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_green), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_green", "inventory"));

       concrete_light_blue = new concrete_light_blue();
       ResourceLocation registryName7 = new ResourceLocation(MOD_ID,"concrete_light_blue");
       ItemBlock concrete_light_blueItem = new ItemBlock(concrete_light_blue);

       GameRegistry.register(concrete_light_blue,registryName7);
       GameRegistry.register(concrete_light_blueItem,registryName7);
       if(event.getSide().isClient()){
       	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_light_blue), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_light_blue", "inventory"));

       concrete_lime = new concrete_lime();
       ResourceLocation registryName8 = new ResourceLocation(MOD_ID,"concrete_lime");
       ItemBlock concrete_limeItem = new ItemBlock(concrete_lime);

       GameRegistry.register(concrete_lime,registryName8);
       GameRegistry.register(concrete_limeItem,registryName8);
       if(event.getSide().isClient()){
          	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_lime), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_lime", "inventory"));

       concrete_magenta = new concrete_magenta();
       ResourceLocation registryName9 = new ResourceLocation(MOD_ID,"concrete_magenta");
       ItemBlock concrete_magentaItem = new ItemBlock(concrete_magenta);

       GameRegistry.register(concrete_magenta,registryName9);
       GameRegistry.register(concrete_magentaItem,registryName9);
       if(event.getSide().isClient()){
         	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_magenta), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_magenta", "inventory"));

       concrete_orange = new concrete_orange();
       ResourceLocation registryName10 = new ResourceLocation(MOD_ID,"concrete_orange");
       ItemBlock concrete_orangeItem = new ItemBlock(concrete_orange);

       GameRegistry.register(concrete_orange,registryName10);
       GameRegistry.register(concrete_orangeItem,registryName10);
       if(event.getSide().isClient()){
        	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_orange), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_orange", "inventory"));

       concrete_pink = new concrete_pink();
       ResourceLocation registryName11 = new ResourceLocation(MOD_ID,"concrete_pink");
       ItemBlock concrete_pinkItem = new ItemBlock(concrete_pink);

       GameRegistry.register(concrete_pink,registryName11);
       GameRegistry.register(concrete_pinkItem,registryName11);
       if(event.getSide().isClient()){
       	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_pink), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_pink", "inventory"));

       	concrete_purple = new concrete_purple();
       	ResourceLocation registryName12 = new ResourceLocation(MOD_ID,"concrete_purple");
       	ItemBlock concrete_purpleItem = new ItemBlock(concrete_purple);

       	GameRegistry.register(concrete_purple,registryName12);
       	GameRegistry.register(concrete_purpleItem,registryName12);
       	if(event.getSide().isClient()){
           	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_purple), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_purple", "inventory"));

        concrete_red = new concrete_red();
        ResourceLocation registryName13 = new ResourceLocation(MOD_ID,"concrete_red");
        ItemBlock concrete_redItem = new ItemBlock(concrete_red);

        GameRegistry.register(concrete_red,registryName13);
        GameRegistry.register(concrete_redItem,registryName13);
        if(event.getSide().isClient()){
           	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_red), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_red", "inventory"));

        concrete_silver = new concrete_silver();
        ResourceLocation registryName14 = new ResourceLocation(MOD_ID,"concrete_silver");
        ItemBlock concrete_silverItem = new ItemBlock(concrete_silver);

        GameRegistry.register(concrete_silver,registryName14);
        GameRegistry.register(concrete_silverItem,registryName14);
        if(event.getSide().isClient()){
           	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_silver), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_silver", "inventory"));


        //圧縮
        CompactSlimeBlock = new compactslimeblock();
        ResourceLocation compactslimeblockregistry = new ResourceLocation(MOD_ID,"compactslimeblock");
        ItemBlock comapctslimeblockItem = new ItemBlock(CompactSlimeBlock);

        GameRegistry.register(CompactSlimeBlock,compactslimeblockregistry);
        GameRegistry.register(comapctslimeblockItem,compactslimeblockregistry);
        if(event.getSide().isClient()){
           	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock", "inventory"));

        CompactSlimeBlock_2 = new compactslimeblock_2();
            ResourceLocation compactslimeblock_2registry = new ResourceLocation(MOD_ID,"compactslimeblock_2");
            ItemBlock comapctslimeblock_2Item = new ItemBlock(CompactSlimeBlock_2);

            GameRegistry.register(CompactSlimeBlock_2,compactslimeblock_2registry);
            GameRegistry.register(comapctslimeblock_2Item,compactslimeblock_2registry);
            if(event.getSide().isClient()){
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_2), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_2", "inventory"));

        CompactSlimeBlock_3 = new compactslimeblock_3();
                ResourceLocation compactslimeblock_3registry = new ResourceLocation(MOD_ID,"compactslimeblock_3");
                ItemBlock comapctslimeblock_3Item = new ItemBlock(CompactSlimeBlock_3);

                GameRegistry.register(CompactSlimeBlock_3,compactslimeblock_3registry);
                GameRegistry.register(comapctslimeblock_3Item,compactslimeblock_3registry);
                if(event.getSide().isClient()){
                   	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_3), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_3", "inventory"));


        CompactSlimeBlock_4 = new compactslimeblock_4();
                  ResourceLocation compactslimeblock_4registry = new ResourceLocation(MOD_ID,"compactslimeblock_4");
                   ItemBlock comapctslimeblock_4Item = new ItemBlock(CompactSlimeBlock_4);

                  GameRegistry.register(CompactSlimeBlock_4,compactslimeblock_4registry);
                  GameRegistry.register(comapctslimeblock_4Item,compactslimeblock_4registry);
                 if(event.getSide().isClient()){
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_4), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_4", "inventory"));

        CompactSlimeBlock_5 = new compactslimeblock_5();
                ResourceLocation compactslimeblock_5registry = new ResourceLocation(MOD_ID,"compactslimeblock_5");
                 ItemBlock comapctslimeblock_5Item = new ItemBlock(CompactSlimeBlock_5);

                GameRegistry.register(CompactSlimeBlock_5,compactslimeblock_5registry);
                GameRegistry.register(comapctslimeblock_5Item,compactslimeblock_5registry);
               if(event.getSide().isClient()){
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_5), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_5", "inventory"));




          //Potion Card

          PotionCard = new PotionCard()
        		  .setCreativeTab(slimecraft.SlimeCraftTab)
        		  .setUnlocalizedName("Potion Card");
                  GameRegistry.registerItem(PotionCard,"potioncard");

                  if(event.getSide().isClient()){
             			ModelLoader.setCustomModelResourceLocation(PotionCard, 0, new ModelResourceLocation(PotionCard.getRegistryName(),"inventory"));


          SpeedCard = new SpeedCard()
        		  . setCreativeTab(slimecraft.SlimeCraftTab)
        		  .setMaxStackSize(1)
           		  .setUnlocalizedName("Speed Card");
                  GameRegistry.registerItem(SpeedCard,"speedcard");
                  if(event.getSide().isClient()){
             			ModelLoader.setCustomModelResourceLocation(SpeedCard, 0, new ModelResourceLocation(SpeedCard.getRegistryName(),"inventory"));

          FoodCard = new FoodCard()
        		  .setCreativeTab(slimecraft.SlimeCraftTab)
        		  .setMaxStackSize(1)
        		  .setUnlocalizedName("Food Card");
                  GameRegistry.registerItem(FoodCard,"foodcard");
                  if(event.getSide().isClient()){
                	  ModelLoader.setCustomModelResourceLocation(FoodCard, 0, new ModelResourceLocation(FoodCard.getRegistryName(),"inventory"));

         RegenerationCard = new RegenerationCard()
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setMaxStackSize(1)
        		 .setUnlocalizedName("Regeneration Card");
                 GameRegistry.registerItem(RegenerationCard,"regenerationcard");
                 if(event.getSide().isClient()){
               	  ModelLoader.setCustomModelResourceLocation(RegenerationCard, 0, new ModelResourceLocation(RegenerationCard.getRegistryName(),"inventory"));

         HungerCard = new HungerCard()
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setMaxStackSize(1)
        		 .setUnlocalizedName("Hunger Card");
                 GameRegistry.registerItem(HungerCard,"hungercard");
                 if(event.getSide().isClient()){
                  	  ModelLoader.setCustomModelResourceLocation(HungerCard, 0, new ModelResourceLocation(HungerCard.getRegistryName(),"inventory"));

           ResistanceCard = new ResistanceCard()
          		 .setCreativeTab(slimecraft.SlimeCraftTab)
          		 .setMaxStackSize(1)

          		 .setUnlocalizedName("Resistance Card");
                  GameRegistry.registerItem(ResistanceCard,"resistancecard");
                  if(event.getSide().isClient()){
                	  ModelLoader.setCustomModelResourceLocation(ResistanceCard, 0, new ModelResourceLocation(ResistanceCard.getRegistryName(),"inventory"));


         FireResistanceCard = new FireResistanceCard()
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setMaxStackSize(1)
        		 .setUnlocalizedName("Fire Resistance Card");
                 GameRegistry.registerItem(FireResistanceCard,"fireresistancecard");
                 if(event.getSide().isClient()){
                  	  ModelLoader.setCustomModelResourceLocation(FireResistanceCard, 0, new ModelResourceLocation(FireResistanceCard.getRegistryName(),"inventory"));

         NightVisionCard = new NightVisionCard()
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setMaxStackSize(1)
        		 .setUnlocalizedName("Night Vision Card");
                 GameRegistry.registerItem(NightVisionCard,"nightvisioncard");
                 if(event.getSide().isClient()){
                 	  ModelLoader.setCustomModelResourceLocation(NightVisionCard, 0, new ModelResourceLocation(NightVisionCard.getRegistryName(),"inventory"));

         InvisibilityCard = new InvisibilityCard()
        		 .setCreativeTab(slimecraft.SlimeCraftTab)
        		 .setMaxStackSize(1)
        		 .setUnlocalizedName("Invisibility Card");
                 GameRegistry.registerItem(InvisibilityCard,"invisiblilitycard");
                 if(event.getSide().isClient()){
                	  ModelLoader.setCustomModelResourceLocation(InvisibilityCard, 0, new ModelResourceLocation(InvisibilityCard.getRegistryName(),"inventory"));

          JumpBoostCard = new JumpBoostCard()
        		  .setCreativeTab(slimecraft.SlimeCraftTab)
        		  .setMaxStackSize(1)
        		  .setUnlocalizedName("Jump Boost Card");
                  GameRegistry.registerItem(JumpBoostCard,"jumpboostcard");
                  if(event.getSide().isClient()){
                	  ModelLoader.setCustomModelResourceLocation(JumpBoostCard, 0, new ModelResourceLocation(JumpBoostCard.getRegistryName(),"inventory"));

          GlowingCard = new GlowingCard()
        		  .setCreativeTab(slimecraft.SlimeCraftTab)
        		  .setMaxStackSize(1)
        		  .setUnlocalizedName("Glowing Card");
                  GameRegistry.registerItem(GlowingCard,"glowingcard");
                  if(event.getSide().isClient()){
                 	  ModelLoader.setCustomModelResourceLocation(GlowingCard, 0, new ModelResourceLocation(GlowingCard.getRegistryName(),"inventory"));

           //Slimemake

           SlimeMakeKit = new Item()
           		.setCreativeTab(slimecraft.SlimeCraftTab)
           		.setContainerItem(Items.GLASS_BOTTLE)
           		.setUnlocalizedName("SlimeMakeKit");
           		GameRegistry.registerItem(SlimeMakeKit,"slimemakekit");
           if(event.getSide().isClient()){
          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeKit, 0, new ModelResourceLocation(SlimeMakeKit.getRegistryName(),"inventory"));

            SlimeMakeKit_2 = new Item()
            		.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("SlimeMake Material 2");
            		GameRegistry.registerItem(SlimeMakeKit_2,"slimemakekit2");
            		if(event.getSide().isClient()){
                    	  ModelLoader.setCustomModelResourceLocation(SlimeMakeKit_2, 0, new ModelResourceLocation(SlimeMakeKit_2.getRegistryName(),"inventory"));

            SlimeMakekit_3 = new Item()
            		.setCreativeTab(slimecraft.SlimeCraftTab)
            		.setUnlocalizedName("SlimeMake Material 3");
            		GameRegistry.registerItem(SlimeMakekit_3,"slimemakekit3");
            		if(event.getSide().isClient()){
                  	  ModelLoader.setCustomModelResourceLocation(SlimeMakekit_3, 0, new ModelResourceLocation(SlimeMakekit_3.getRegistryName(),"inventory"));

            SlimeMakekit_4 = new Item()
            		.setCreativeTab(slimecraft.SlimeCraftTab)
            		.setUnlocalizedName("SlimeMake Material 1");
            		GameRegistry.registerItem(SlimeMakekit_4, "slimemakekit4");
            		if(event.getSide().isClient()){
                  	  ModelLoader.setCustomModelResourceLocation(SlimeMakekit_4, 0, new ModelResourceLocation(SlimeMakekit_4.getRegistryName(),"inventory"));



          	SlimeMakeing_1 = new Item()
          			.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 1/10");
          			GameRegistry.registerItem(SlimeMakeing_1,"slimemaking1");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_1, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));

          	SlimeMakeing_2 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 2/10");
          			GameRegistry.registerItem(SlimeMakeing_2,"slimemaking2");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_2, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));

          	SlimeMakeing_3 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 3/10");
          			GameRegistry.registerItem(SlimeMakeing_3,"slimemaking3");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_3, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));

          	SlimeMakeing_4 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 4/10");
          			GameRegistry.registerItem(SlimeMakeing_4,"SlimeMakeing_4");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_4, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));

          	SlimeMakeing_5 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 5/10");
          			GameRegistry.registerItem(SlimeMakeing_5,"slimemaking5");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_5, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));

          	SlimeMakeing_6 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 6/10");
          			GameRegistry.registerItem(SlimeMakeing_6,"slimemaking6");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_6, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));

          	 SlimeMakeing_7 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 7/10");
          			GameRegistry.registerItem(SlimeMakeing_7,"slimemaking7");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_7, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));

          	 SlimeMakeing_8 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 8/10");
          			GameRegistry.registerItem(SlimeMakeing_8,"slimemaking8");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_8, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));

          	  SlimeMakeing_9 = new Item()
          			//.setCreativeTab(slimecraft.SlimeCraftTab)
          			.setMaxStackSize(1)
          			.setUnlocalizedName("SlimeMakeKit(Slime) 9/10");
          			GameRegistry.registerItem(SlimeMakeing_9,"slimemaking9");
          			 if(event.getSide().isClient()){
          	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_9, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));

          	   SlimeMakeing_10 = new Item()
          			 .setCreativeTab(slimecraft.SlimeCraftTab)
           			.setMaxStackSize(1)
           			.setContainerItem(slimecraft.SlimeMakeKit)
           			.setUnlocalizedName("SlimeMakeKit(Slime) 10/10");
           			GameRegistry.registerItem(SlimeMakeing_10,"slimemaking10");
           			 if(event.getSide().isClient()){
           	          	  ModelLoader.setCustomModelResourceLocation(SlimeMakeing_10, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));



                 	 GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeIronBlock),
                     		"DDD","DDD","DDD",'D',slimecraft.SlimeIron
                     		);

                     GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondBlock),
                     		"DDD","DDD","DDD",'D',slimecraft.SlimeDiamond
                     		);

                     GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeIron,9),
                    		 new ItemStack(slimecraft.SlimeIronBlock)
                    		 );

                     GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeDiamond,9),
                    		 new ItemStack(slimecraft.SlimeDiamondBlock)
                    		 );

                 GameRegistry.addRecipe(new ItemStack(slimecraft.SpeedCard),
                	  "SES","EPE","SES",'S',Items.SUGAR,'E',Items.NETHER_STAR,'P',slimecraft.PotionCard
                	  );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.PotionCard),
                		 "DND","NIN","DND",'D',slimecraft.SlimeDiamond,'N',Items.NETHER_STAR,'I',slimecraft.SlimeIronBlock
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.FoodCard),
                		 "FNF","NIN","FNF",'I',slimecraft.HungerCard,'N',Items.NETHER_STAR,'F',Items.RABBIT_STEW
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.RegenerationCard),
                		 "RNR","NIN","RNR",'R',Items.SPECKLED_MELON,'I',slimecraft.HungerCard,'N',Items.NETHER_STAR
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.HungerCard),
                		 "FNF","NPN","FNF",'F',Items.ROTTEN_FLESH,'N',Items.NETHER_STAR,'P',slimecraft.PotionCard
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.ResistanceCard),
                 		 "INI","NPN","INI",'I',Items.SHIELD,'N',Items.NETHER_STAR,'P',slimecraft.PotionCard
                 		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.FireResistanceCard),
                		 "CNC","NPN","CNC",'C',Items.MAGMA_CREAM,'N',Items.NETHER_STAR,'P',slimecraft.PotionCard
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.NightVisionCard),
                		 "CNC","NPN","CNC",'C',Items.GOLDEN_CARROT,'N',Items.NETHER_STAR,'P',slimecraft.PotionCard
                 		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.InvisibilityCard),
                		 "ENE","NPN","ENE",'E',Items.ENDER_EYE,'N',Items.NETHER_STAR,'P',slimecraft.NightVisionCard
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.JumpBoostCard),
                		 "RNR","NPN","RNR",'R',Items.RABBIT_FOOT,'N',Items.NETHER_STAR,'P',slimecraft.PotionCard
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.GlowingCard),
                		 "GNG","NPN","GNG",'P',slimecraft.PotionCard,'N',Items.NETHER_STAR,'G',Blocks.SEA_LANTERN
                		 );


                 GameRegistry.addRecipe(new ItemStack(slimecraft.GlassStick),
            				"G","G",'G',Blocks.GLASS
            				);
                 GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeCookie),
                		 "SSS","CCC","SSS",'S',Items.SLIME_BALL,'C',Items.COOKIE
                		 );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeIron,3),
    					 "SSS","III","SSS",'I',Items.IRON_INGOT,'S',Items.SLIME_BALL
    				   );
                 GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamond,3),
 		        		"SSS","DDD","SSS",'S',Items.SLIME_BALL,'D',Items.DIAMOND
 		        		);


                 GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeShovel),
         		"S","G","G",
         		'S',Blocks.SLIME_BLOCK,'G',slimecraft.GlassStick
         		);

             	GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeHoe),
            	 "SS ", " G ", " G ",
                 'S',Blocks.SLIME_BLOCK, 'G',slimecraft.GlassStick
            	 );
             	GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeAxe),
		         "SS ", "SG ", " G ",
		         'S',Blocks.SLIME_BLOCK,'G',slimecraft.GlassStick
		         );

             	GameRegistry.addRecipe(new ItemStack(slimecraft.SlimePickaxe),
				"SSS"," G "," G ",
				'S',Blocks.SLIME_BLOCK,'G',slimecraft.GlassStick
		     	);

             		GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeSword),
             	" S "," S "," G ",'S',Blocks.SLIME_BLOCK,'G',slimecraft.GlassStick
             	);



                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondSword),
               "DBD","DSD","DBD",'S',slimecraft.SlimeIronSword,'D',SlimeDiamond,'B',slimecraft.SlimeIronBlock
               );


                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeIronSword),
                "DDD","DSD","DDD",'S',slimecraft.SlimeSword,'D',SlimeIron
                            );

                GameRegistry.addRecipe(new ItemStack(SlimeIronAxe),
                "DDD","DSD","DDD",'S',slimecraft.SlimeAxe,'D',SlimeIron
                  );
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeIronHoe),
                "DDD","DSD","DDD",'S',slimecraft.SlimeHoe,'D',SlimeIron
                   );
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeIronPickaxe),
               	"DDD","DSD","DDD",'S',slimecraft.SlimePickaxe,'D',SlimeIron
                   );
                GameRegistry.addRecipe(new ItemStack(SlimeIronShovel),
              	"DDD","DSD","DDD",'S',slimecraft.SlimeShovel,'D',SlimeIron
                   );

                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondAxe),
               	"DBD","DSD","DBD",'S',slimecraft.SlimeIronAxe,'D',SlimeDiamond,'B',slimecraft.SlimeIronBlock
                 	);
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondHoe),
                "DBD","DSD","DBD",'S',slimecraft.SlimeIronHoe,'D',slimecraft.SlimeDiamond,'B',slimecraft.SlimeIronBlock
                	);
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondPickaxe),
                "DBD","DSD","DBD",'S',slimecraft.SlimeIronPickaxe,'D',slimecraft.SlimeDiamond,'B',slimecraft.SlimeIronBlock
                  	);
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondShovel),
                "DBD","DSD","DBD",'S',slimecraft.SlimeIronShovel,'D',slimecraft.SlimeDiamond,'B',slimecraft.SlimeIronBlock
                	);

                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondSwordX),
               "DID","ISI","DID",'S',slimecraft.SlimeDiamondSword,'D',slimecraft.SlimeDiamondBlock,'I',slimecraft.SlimeIronBlock
                		);
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondAxeX),
                "DID","ISI","DID",'S',slimecraft.SlimeDiamondAxe,'D',slimecraft.SlimeDiamondBlock,'I',slimecraft.SlimeIronBlock
                    );
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondHoeX),
                "DID","ISI","DID",'S',slimecraft.SlimeDiamondHoe,'D',slimecraft.SlimeDiamondBlock,'I',slimecraft.SlimeIronBlock
                       );
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondPickaxeX),
                        "DID","ISI","DID",'S',slimecraft.SlimeDiamondPickaxe,'D',slimecraft.SlimeDiamondBlock,'I',slimecraft.SlimeIronBlock
                        );
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeDiamondShovelX),
                        "DID","ISI","DID",'S',slimecraft.SlimeDiamondShovel,'D',slimecraft.SlimeDiamondBlock,'I',slimecraft.SlimeIronBlock
                               );

                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeMultiTool),
                		"PSA","DHD","IKI",'P',slimecraft.SlimeDiamondPickaxeX,'H',slimecraft.SlimeDiamondHoeX,'A',slimecraft.SlimeDiamondAxeX,'S',slimecraft.SlimeDiamondShovelX,'I',slimecraft.SlimeIronBlock,'K',slimecraft.SlimeDiamondSwordX,'D',slimecraft.SlimeDiamondBlock
                		);
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeMultiToolFortune),
                		"PSA","IHI","DKD",'P',slimecraft.SlimeDiamondPickaxeX,'H',slimecraft.SlimeDiamondHoeX,'A',slimecraft.SlimeDiamondAxeX,'S',slimecraft.SlimeDiamondShovelX,'I',slimecraft.SlimeIronBlock,'K',slimecraft.SlimeDiamondSwordX,'D',slimecraft.SlimeDiamondBlock
                		);


                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_black,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_blue,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,4)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_brown,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,3)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_cyan,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,6)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_green,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,2)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_light_blue,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,12)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_lime,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,10)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_magenta,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,13)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_orange,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,14)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_pink,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,9)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_purple,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,5)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_red,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,1)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_silver,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,7)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.concrete_white,1),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.SAND),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.GRAVEL),
                		new ItemStack(Blocks.COBBLESTONE,1),
                		new ItemStack(Items.WATER_BUCKET,1),
                		new ItemStack(Items.DYE,1,15)
              		);

                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeLamp),
                		"GGG","GSG","GGG",'S',slimecraft.SlimeTrophy,'G',Items.GLOWSTONE_DUST
                		);


                //スライムメイク！！！
                GameRegistry.addRecipe(new ItemStack(slimecraft.SlimeMakeKit),
                		" S ","G G"," G ",'S',slimecraft.GlassStick,'G',Blocks.GLASS
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakekit_4),
                		new ItemStack(Items.SLIME_BALL),
                		new ItemStack(Items.GLASS_BOTTLE)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_1),
                		new ItemStack(slimecraft.SlimeMakeKit),
                		new ItemStack(slimecraft.SlimeMakeKit_2),
                		new ItemStack(slimecraft.SlimeMakekit_3)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_2),
                		new ItemStack(slimecraft.SlimeMakeing_1)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_3),
                		new ItemStack(slimecraft.SlimeMakeing_2)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_4),
                		new ItemStack(slimecraft.SlimeMakeing_3)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_5),
                		new ItemStack(slimecraft.SlimeMakeing_4)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_6),
                		new ItemStack(slimecraft.SlimeMakeing_5)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_7),
                		new ItemStack(slimecraft.SlimeMakeing_6)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_8),
                		new ItemStack(slimecraft.SlimeMakeing_7)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_9),
                		new ItemStack(slimecraft.SlimeMakeing_8)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(slimecraft.SlimeMakeing_10),
                		new ItemStack(slimecraft.SlimeMakeing_9)
                		);

                GameRegistry.addShapelessRecipe(new ItemStack(Items.SLIME_BALL,9),
                		new ItemStack(slimecraft.SlimeMakeing_10)
                		);

                GameRegistry.addRecipe(new ItemStack(CompactSlimeBlock),
                		"SSS","SSS","SSS",
                		'S',Blocks.SLIME_BLOCK
                		);
                GameRegistry.addRecipe(new ItemStack(CompactSlimeBlock_2),
                		"SSS","SSS","SSS",
                		'S',slimecraft.CompactSlimeBlock
                		);
                GameRegistry.addRecipe(new ItemStack(CompactSlimeBlock_3),
                		"SSS","SSS","SSS",
                		'S',slimecraft.CompactSlimeBlock_2
                		);
                GameRegistry.addRecipe(new ItemStack(CompactSlimeBlock_4),
                		"SSS","SSS","SSS",
                		'S',slimecraft.CompactSlimeBlock_3
                		);
                GameRegistry.addRecipe(new ItemStack(CompactSlimeBlock_5),
                		"SSS","SSS","SSS",
                		'S',slimecraft.CompactSlimeBlock_4
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(CompactSlimeBlock_4,9),
                		new ItemStack(CompactSlimeBlock_5)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(CompactSlimeBlock_3,9),
                		new ItemStack(CompactSlimeBlock_4)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(CompactSlimeBlock_2,9),
                		new ItemStack(CompactSlimeBlock_3)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(CompactSlimeBlock,9),
                		new ItemStack(CompactSlimeBlock_2)
                		);
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SLIME_BLOCK,9),
                		new ItemStack(CompactSlimeBlock)
                		);




                GameRegistry.addSmelting(Items.SLIME_BALL, new ItemStack(SlimeMakekit_3), 1.0f);
                GameRegistry.addSmelting(slimecraft.SlimeMakekit_4, new ItemStack(SlimeMakeKit_2), 1.0f);


                //実績の追加だって。まずは宣言してね
            	Welcome_to_SlimeCraft = new Achievement("welcome_to_slimecraft", "Welcome to SlimeCraft", 0, 0, new ItemStack(Items.SLIME_BALL),null).registerStat();
            	Slime_Sword = new Achievement("slime_sword", "Slime Sword", 2, 0, new ItemStack(slimecraft.SlimeSword) ,Welcome_to_SlimeCraft).registerStat();
            	SlimeIron_Sword = new Achievement("slimeiron_sword", "SlimeIron Sword", 4, 0, new ItemStack(slimecraft.SlimeIronSword), Slime_Sword).registerStat();
            	SlimeDiamond_Sword = new Achievement("slimediamond_sword", "SlimeDiamond Sword!?", 6, 0, new ItemStack(slimecraft.SlimeDiamondSword),SlimeIron_Sword).registerStat();
            	SlimeDiamond_X_Series = new Achievement("slimediamond_x_series", "SlimeDiamond X-Series", 8, 0, new ItemStack(slimecraft.SlimeDiamondSwordX),SlimeDiamond_Sword).registerStat();
            	SlimeDiamondPickaxe_X = new Achievement("slimediamondpickaxe_x", "SlimeDiamond Pickaxe X", 8, -2, new ItemStack(slimecraft.SlimeDiamondPickaxeX),SlimeDiamond_X_Series).registerStat();
            	SlimeDiamondAxe_X = new Achievement("slimediamondaxe_x", "SlimeDiamond Axe X", 8, -4, new ItemStack(slimecraft.SlimeDiamondAxeX),SlimeDiamond_X_Series).registerStat();
            	SlimeDiamondShovel_X = new Achievement("slimediamondshovel_x", "SlimeDiamond Shovel X", 8, 2, new ItemStack(slimecraft.SlimeDiamondShovelX), SlimeDiamond_X_Series).registerStat();
            	SlimeDiamondHoe_X = new Achievement("slimediamondhoe_x", "SlimeDiamond Hoe X", 8, 4, new ItemStack(slimecraft.SlimeDiamondHoeX),SlimeDiamond_X_Series).registerStat();
            	Pickaxe_Axe_Shovel_Hoe = new Achievement("pickaxe_axe_shovel_hoe", "Pickaxe&Axe&Shovel&Hoe?", 10, -2, new ItemStack(slimecraft.SlimeMultiTool), SlimeDiamond_X_Series).registerStat();
            	MultiTool_Fortune = new Achievement("multitool_fortune", "MultiTool+Fortune", 10, 2, new ItemStack(slimecraft.SlimeMultiToolFortune), SlimeDiamond_X_Series).registerStat();



            	Welcome_to_ScienceClub = new Achievement("welcome_to_science_club", "Welcome to ScienceClub!", 0, 5, new ItemStack(slimecraft.SlimeMakeing_1), null).registerStat();
            	EasyFood = new Achievement("easyfood", "Easy_Food", 2, 5, new ItemStack(slimecraft.SlimeCookie),null).registerStat();
            	Low_performance_personal_computer = new Achievement("Low_performance_personal_computer", "Low_Performance_Personal_Computer", 4, 5, new ItemStack(slimecraft.FoodCard), null).registerStat();



            	//実績ページ？上の工程が出来たら最後に１行目の文に,で追加してね
            	SlimeCraft_Achievement = new AchievementPage("SlimeCraft",Welcome_to_SlimeCraft,Slime_Sword,SlimeIron_Sword,SlimeDiamond_Sword,
            			SlimeDiamond_X_Series,SlimeDiamondPickaxe_X,SlimeDiamondAxe_X,SlimeDiamondHoe_X,SlimeDiamondShovel_X,Pickaxe_Axe_Shovel_Hoe,MultiTool_Fortune,Welcome_to_ScienceClub
            			,EasyFood,Low_performance_personal_computer);
            	//↑です
            	AchievementPage.registerAchievementPage(SlimeCraft_Achievement);


            //SlimeBallBall
           	EntityRegistry.registerModEntity(EntitySlimeBallBall.class, "slimeballball", 0, this , 250, 1, false);

           	RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBallBall.class, new IRenderFactory() {
        		@Override
        		public Render createRenderFor(RenderManager manager)
        		{

        			return new RenderSnowball(manager, Items.SLIME_BALL, Minecraft.getMinecraft().getRenderItem());
        		}
        	});
           	//ここまで

}

 }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
}}}
        }}}}}}}}}}}}}}}}}}}}}}
                }}}}}}}}}
        }
        }}
        }
}
    			 }}}}



    }
}


