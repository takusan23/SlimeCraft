package com.slimecraft.slimecraft;



import com.slimecraft.slimecraft.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
//    public static Item SlimeSword;
//    public static Item SlimeIronSword;
//    public static Item SlimeDiamondSword;
//    public static Item SlimeDiamondSwordX;
    //tools
//    public static Item SlimePickaxe;
//    public static Item SlimeAxe;
//    public static Item SlimeHoe;
//    public static Item SlimeShovel;
    //Slime Iron Tools
//    public static Item SlimeIronPickaxe;
//    public static Item SlimeIronAxe;
//    public static Item SlimeIronShovel;
//    public static Item SlimeIronHoe;
    //Slime Diamond Tools
//    public static Item SlimeDiamondPickaxe;
//    public static Item SlimeDiamondAxe;
//    public static Item SlimeDiamondShovel;
//    public static Item SlimeDiamondHoe;
  //Slime Diamond X Tools
//    public static Item SlimeDiamondPickaxeX;
//    public static Item SlimeDiamondShovelX;
//    public static Item SlimeDiamondAxeX;
//    public static Item SlimeDiamondHoeX;
    //その他
//    public static Item SlimeIron;
//    public static Item SlimeDiamond;
//    public static Item SlimeCookie;
//    public static Item GlassStick;
//    public static Block SlimeIronBlock;
//    public static Block SlimeDiamondBlock;
//    public static Block SlimeTrophy;
//    public static Block SlimeLamp;
//    public static Block SlimeLamp_Light;


    //マルチツール
//    public static Item SlimeMultiTool;
//    public static Item SlimeMultiToolFortune;
//    //ポーションカード
//    public static Item PotionCard;
//    public static Item SpeedCard;
//    public static Item FoodCard;
//    public static Item RegenerationCard;
//    public static Item HungerCard;
//    public static Item FireResistanceCard;
//    public static Item ResistanceCard;
//    public static Item NightVisionCard;
//    public static Item InvisibilityCard;
//    public static Item JumpBoostCard;
//    public static Item GlowingCard;

    //コンクリートブロック
//    public static Block concrete_white;
//    public static Block concrete_black;
//    public static Block concrete_blue;
//    public static Block concrete_brown;
//    public static Block concrete_cyan;
//    public static Block concrete_green;
//    public static Block concrete_light_blue;
//    public static Block concrete_lime;
//    public static Block concrete_magenta;
//    public static Block concrete_orange;
//    public static Block concrete_pink;
//    public static Block concrete_purple;
//    public static Block concrete_red;
//    public static Block concrete_silver;

    //スライムキット
//    public static Item SlimeMakeKit;
//    public static Item SlimeMakeKit_2;
//    public static Item SlimeMakekit_3;
//    public static Item SlimeMakekit_4;
//
//    public static Item SlimeMakeing_1;
//    public static Item SlimeMakeing_2;
//    public static Item SlimeMakeing_3;
//    public static Item SlimeMakeing_4;
//    public static Item SlimeMakeing_5;
//    public static Item SlimeMakeing_6;
//    public static Item SlimeMakeing_7;
//    public static Item SlimeMakeing_8;
//    public static Item SlimeMakeing_9;
//    public static Item SlimeMakeing_10;

    //圧縮スライムブロック
//    public static Block CompactSlimeBlock;
//    public static Block CompactSlimeBlock_2;
//    public static Block CompactSlimeBlock_3;
//    public static Block CompactSlimeBlock_4;
//    public static Block CompactSlimeBlock_5;


//    //マテリアル
//    public static ToolMaterial Dia_SLIME;
//    public static ToolMaterial Iron_Slime;
//    public static ToolMaterial SlimeTool;



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
    //public static Achievement SlimeDiamondAxe_X;
    public static Achievement SlimeDiamondShovel_X;
    //public static Achievement SlimeDiamondHoe_X;
    public static Achievement Pickaxe_Axe_Shovel_Hoe;
    public static Achievement MultiTool_Fortune;
    public static Achievement Welcome_to_ScienceClub;
    public static Achievement EasyFood;
    public static Achievement Low_performance_personal_computer;
    public static Achievement SlimeStaff;
    public static Achievement Range_attack;
    public static Achievement SlimeCraft_New_Crafting_System;
    public static Achievement SlimeXpTable;
    public static Achievement SlimeExchangeTable;


    //実績ページ追加
    public static  AchievementPage SlimeCraft_Achievement;


    //SideProxy?
    @SidedProxy(clientSide = slimecraft.CLIENT_PROXY_CLASS, serverSide = slimecraft.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Instance(MOD_ID)
    public static slimecraft Instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	SlimeCraftItems.init();
    	SlimeCraftItems.register();
    	SlimeCraftBlocks.init();
    	SlimeCraftBlocks.register();

   		//mob drop
    	MinecraftForge.EVENT_BUS.register(new MobDrop());
    	//実績かきかき
    	MinecraftForge.EVENT_BUS.register(new SlimeCraftAchievement());
    	//実績は一番下らへんにありますよぉ



                //実績の追加だって。まずは宣言してね
            	Welcome_to_SlimeCraft = new Achievement("welcome_to_slimecraft", "Welcome to SlimeCraft", 0, 0, new ItemStack(Items.SLIME_BALL),null).registerStat();
            	Slime_Sword = new Achievement("slime_sword", "Slime Sword", 2, 0, new ItemStack(SlimeCraftItems.SlimeSword) ,Welcome_to_SlimeCraft).registerStat();
            	SlimeIron_Sword = new Achievement("slimeiron_sword", "SlimeIron Sword", 4, 0, new ItemStack(SlimeCraftItems.SlimeIronSword), Slime_Sword).registerStat();
            	SlimeDiamond_Sword = new Achievement("slimediamond_sword", "SlimeDiamond Sword!?", 6, 0, new ItemStack(SlimeCraftItems.SlimeDiamondSword),SlimeIron_Sword).registerStat();
            	SlimeDiamond_X_Series = new Achievement("slimediamond_x_series", "SlimeDiamond X-Series", 8, 0, new ItemStack(SlimeCraftItems.SlimeDiamondSwordX),SlimeDiamond_Sword).registerStat();
            	SlimeDiamondPickaxe_X = new Achievement("slimediamondpickaxe_x", "SlimeDiamond Pickaxe X", 8, -2, new ItemStack(SlimeCraftItems.SlimeDiamondPickaxeX),SlimeDiamond_X_Series).registerStat();
            	//SlimeDiamondAxe_X = new Achievement("slimediamondaxe_x", "SlimeDiamond Axe X", 8, -4, new ItemStack(SlimeCraftItems.SlimeDiamondAxeX),SlimeDiamond_X_Series).registerStat();
            	SlimeDiamondShovel_X = new Achievement("slimediamondshovel_x", "SlimeDiamond Shovel X", 8, 2, new ItemStack(SlimeCraftItems.SlimeDiamondShovelX), SlimeDiamond_X_Series).registerStat();
            	//SlimeDiamondHoe_X = new Achievement("slimediamondhoe_x", "SlimeDiamond Hoe X", 8, 4, new ItemStack(SlimeCraftItems.SlimeDiamondHoeX),SlimeDiamond_X_Series).registerStat();
            	Pickaxe_Axe_Shovel_Hoe = new Achievement("pickaxe_axe_shovel_hoe", "Pickaxe&Axe&Shovel&Hoe?", 10, -2, new ItemStack(SlimeCraftItems.SlimeMultiTool), SlimeDiamond_X_Series).registerStat();
            	MultiTool_Fortune = new Achievement("multitool_fortune", "MultiTool+Fortune", 10, 2, new ItemStack(SlimeCraftItems.SlimeMultiToolFortune), SlimeDiamond_X_Series).registerStat();

            	Welcome_to_ScienceClub = new Achievement("welcome_to_science_club", "Welcome to ScienceClub!", 0, 5, new ItemStack(SlimeCraftItems.SlimeMakeing_1), null).registerStat();
            	EasyFood = new Achievement("easyfood", "Easy_Food", 2, 5, new ItemStack(SlimeCraftItems.SlimeCookie),null).registerStat();
            	Low_performance_personal_computer = new Achievement("Low_performance_personal_computer", "Low_Performance_Personal_Computer", 4, 5, new ItemStack(SlimeCraftItems.FoodCard), null).registerStat();

            	SlimeStaff = new Achievement("slimestaff", "SlimeStaff", -5, 0, new ItemStack(SlimeCraftItems.UltimateSlimeStaff), null).registerStat();
            	Range_attack = new Achievement("range_attack", "Range Attack", -7, 0, new ItemStack(SlimeCraftItems.UltimateSlimeBall), SlimeStaff).registerStat();

            	SlimeCraft_New_Crafting_System = new Achievement("slimecraft_newcrafting_system", "SlimeCraft New Crafting System", -5, -4, new ItemStack(SlimeCraftBlocks.SlimeTable), null).registerStat();
            	SlimeXpTable = new Achievement("slimexptable", "Slime XpTable", -7, -5, new ItemStack(SlimeCraftBlocks.SlimeXpTable), SlimeCraft_New_Crafting_System).registerStat();
            	SlimeExchangeTable = new Achievement("slimeexchangetable", "Slime ExchangeTable", -3, -5, new ItemStack(SlimeCraftBlocks.SlimeExchangeTable), SlimeCraft_New_Crafting_System).registerStat();

            	//実績ページ？上の工程が出来たら最後に１行目の文に,で追加してね
            	SlimeCraft_Achievement = new AchievementPage("SlimeCraft",Welcome_to_SlimeCraft,Slime_Sword,SlimeIron_Sword,SlimeDiamond_Sword,
            			SlimeDiamond_X_Series,SlimeDiamondPickaxe_X,SlimeDiamondShovel_X,Pickaxe_Axe_Shovel_Hoe,MultiTool_Fortune,Welcome_to_ScienceClub
            			,EasyFood,Low_performance_personal_computer,SlimeStaff,Range_attack,SlimeCraft_New_Crafting_System,SlimeXpTable,SlimeExchangeTable);
            	//↑です
            	AchievementPage.registerAchievementPage(SlimeCraft_Achievement);



    }











    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    	SlimeCraftEntity.register();



    	GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.SlimeIronBlock),
        		"DDD","DDD","DDD",'D',SlimeCraftItems.SlimeIron
        		);

    	 GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.SlimeDiamondBlock),
        		"DDD","DDD","DDD",'D',SlimeCraftItems.SlimeDiamond
        		);

        GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeIron,9),
       		 new ItemStack(SlimeCraftBlocks.SlimeIronBlock)
       		 );

        GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeDiamond,9),
       		 new ItemStack(SlimeCraftBlocks.SlimeDiamondBlock)
       		 );

    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SpeedCard),
   	  "SES","EPE","SES",'S',Items.SUGAR,'E',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
   	  );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.PotionCard),
   		 "DND","NIN","DND",'D',SlimeCraftItems.SlimeDiamond,'N',Items.NETHER_STAR,'I',SlimeCraftBlocks.SlimeIronBlock
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.FoodCard),
   		 "FNF","NIN","FNF",'I',SlimeCraftItems.HungerCard,'N',Items.NETHER_STAR,'F',Items.RABBIT_STEW
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.RegenerationCard),
   		 "RNR","NIN","RNR",'R',Items.SPECKLED_MELON,'I',SlimeCraftItems.HungerCard,'N',Items.NETHER_STAR
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.HungerCard),
   		 "FNF","NPN","FNF",'F',Items.ROTTEN_FLESH,'N',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.ResistanceCard),
    		 "INI","NPN","INI",'I',Items.SHIELD,'N',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
    		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.FireResistanceCard),
   		 "CNC","NPN","CNC",'C',Items.MAGMA_CREAM,'N',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.NightVisionCard),
   		 "CNC","NPN","CNC",'C',Items.GOLDEN_CARROT,'N',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
    		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.InvisibilityCard),
   		 "ENE","NPN","ENE",'E',Items.ENDER_EYE,'N',Items.NETHER_STAR,'P',SlimeCraftItems.NightVisionCard
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.JumpBoostCard),
   		 "RNR","NPN","RNR",'R',Items.RABBIT_FOOT,'N',Items.NETHER_STAR,'P',SlimeCraftItems.PotionCard
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.GlowingCard),
   		 "GNG","NPN","GNG",'P',SlimeCraftItems.PotionCard,'N',Items.NETHER_STAR,'G',Blocks.SEA_LANTERN
   		 );


    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.GlassStick),
				"G","G",'G',Blocks.GLASS
				);
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeCookie),
   		 "SSS","CCC","SSS",'S',Items.SLIME_BALL,'C',Items.COOKIE
   		 );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIron,3),
			 "SSS","III","SSS",'I',Items.IRON_INGOT,'S',Items.SLIME_BALL
		   );
    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamond,3),
    		"SSS","DDD","SSS",'S',Items.SLIME_BALL,'D',Items.DIAMOND
    		);


    GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeShovel),
	"S","G","G",
	'S',Blocks.SLIME_BLOCK,'G',SlimeCraftItems.GlassStick
	);

	GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeHoe),
	 "SS ", " G ", " G ",
    'S',Blocks.SLIME_BLOCK, 'G',SlimeCraftItems.GlassStick
	 );
	GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeAxe),
    "SS ", "SG ", " G ",
    'S',Blocks.SLIME_BLOCK,'G',SlimeCraftItems.GlassStick
    );

	GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimePickaxe),
	"SSS"," G "," G ",
	'S',Blocks.SLIME_BLOCK,'G',SlimeCraftItems.GlassStick
	);

		GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeSword),
	" S "," S "," G ",'S',Blocks.SLIME_BLOCK,'G',SlimeCraftItems.GlassStick
	);



   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondSword),
  "DBD","DSD","DBD",'S',SlimeCraftItems.SlimeIronSword,'D',SlimeCraftItems.SlimeDiamond,'B',SlimeCraftBlocks.SlimeIronBlock
  );


   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIronSword),
   "DDD","DSD","DDD",'S',SlimeCraftItems.SlimeSword,'D',SlimeCraftItems.SlimeIron
               );

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIronAxe),
   "DDD","DSD","DDD",'S',SlimeCraftItems.SlimeAxe,'D',SlimeCraftItems.SlimeIron
     );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIronHoe),
   "DDD","DSD","DDD",'S',SlimeCraftItems.SlimeHoe,'D',SlimeCraftItems.SlimeIron
      );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIronPickaxe),
  	"DDD","DSD","DDD",'S',SlimeCraftItems.SlimePickaxe,'D',SlimeCraftItems.SlimeIron
      );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeIronShovel),
 	"DDD","DSD","DDD",'S',SlimeCraftItems.SlimeShovel,'D',SlimeCraftItems.SlimeIron
      );

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondAxe),
  	"DBD","DSD","DBD",'S',SlimeCraftItems.SlimeIronAxe,'D',SlimeCraftItems.SlimeDiamond,'B',SlimeCraftBlocks.SlimeIronBlock
    	);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondHoe),
   "DBD","DSD","DBD",'S',SlimeCraftItems.SlimeIronHoe,'D',SlimeCraftItems.SlimeDiamond,'B',SlimeCraftBlocks.SlimeIronBlock
   	);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondPickaxe),
   "DBD","DSD","DBD",'S',SlimeCraftItems.SlimeIronPickaxe,'D',SlimeCraftItems.SlimeDiamond,'B',SlimeCraftBlocks.SlimeIronBlock
     	);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondShovel),
   "DBD","DSD","DBD",'S',SlimeCraftItems.SlimeIronShovel,'D',SlimeCraftItems.SlimeDiamond,'B',SlimeCraftBlocks.SlimeIronBlock
   	);

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondSwordX),
  "DID","ISI","DID",'S',SlimeCraftItems.SlimeDiamondSword,'D',SlimeCraftBlocks.SlimeDiamondBlock,'I',SlimeCraftBlocks.SlimeIronBlock
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondAxeX),
   "DID","ISI","DID",'S',SlimeCraftItems.SlimeDiamondAxe,'D',SlimeCraftBlocks.SlimeDiamondBlock,'I',SlimeCraftBlocks.SlimeIronBlock
       );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondHoeX),
   "DID","ISI","DID",'S',SlimeCraftItems.SlimeDiamondHoe,'D',SlimeCraftBlocks.SlimeDiamondBlock,'I',SlimeCraftBlocks.SlimeIronBlock
          );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondPickaxeX),
           "DID","ISI","DID",'S',SlimeCraftItems.SlimeDiamondPickaxe,'D',SlimeCraftBlocks.SlimeDiamondBlock,'I',SlimeCraftBlocks.SlimeIronBlock
           );
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeDiamondShovelX),
           "DID","ISI","DID",'S',SlimeCraftItems.SlimeDiamondShovel,'D',SlimeCraftBlocks.SlimeDiamondBlock,'I',SlimeCraftBlocks.SlimeIronBlock
                  );

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeMultiTool),
   		"PSA","DHD","IKI",'P',SlimeCraftItems.SlimeDiamondPickaxeX,'H',SlimeCraftItems.SlimeDiamondHoeX,'A',SlimeCraftItems.SlimeDiamondAxeX,'S',SlimeCraftItems.SlimeDiamondShovelX,'I',SlimeCraftBlocks.SlimeIronBlock,'K',SlimeCraftItems.SlimeDiamondSwordX,'D',SlimeCraftBlocks.SlimeDiamondBlock
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeMultiToolFortune),
   		"PSA","IHI","DKD",'P',SlimeCraftItems.SlimeDiamondPickaxeX,'H',SlimeCraftItems.SlimeDiamondHoeX,'A',SlimeCraftItems.SlimeDiamondAxeX,'S',SlimeCraftItems.SlimeDiamondShovelX,'I',SlimeCraftBlocks.SlimeIronBlock,'K',SlimeCraftItems.SlimeDiamondSwordX,'D',SlimeCraftBlocks.SlimeDiamondBlock
   		);


   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_black,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_blue,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_brown,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_cyan,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_green,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_light_blue,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_lime,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_magenta,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_orange,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_pink,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_purple,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_red,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_silver,1),
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
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.concrete_white,1),
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

   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.SlimeLamp),
   		"GGG","GSG","GGG",'S',SlimeCraftBlocks.SlimeTrophy,'G',Items.GLOWSTONE_DUST
   		);


   //スライムメイク！！！
   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.SlimeMakeKit),
   		" S ","G G"," G ",'S',SlimeCraftItems.GlassStick,'G',Blocks.GLASS
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakekit_4),
   		new ItemStack(Items.SLIME_BALL),
   		new ItemStack(Items.GLASS_BOTTLE)
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_1),
   		new ItemStack(SlimeCraftItems.SlimeMakeKit),
   		new ItemStack(SlimeCraftItems.SlimeMakeKit_2),
   		new ItemStack(SlimeCraftItems.SlimeMakekit_3)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_2),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_1)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_3),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_2)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_4),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_3)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_5),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_4)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_6),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_5)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_7),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_6)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_8),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_7)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_9),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_8)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftItems.SlimeMakeing_10),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_9)
   		);

   GameRegistry.addShapelessRecipe(new ItemStack(Items.SLIME_BALL,9),
   		new ItemStack(SlimeCraftItems.SlimeMakeing_10)
   		);

   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock),
   		"SSS","SSS","SSS",
   		'S',Blocks.SLIME_BLOCK
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_2),
   		"SSS","SSS","SSS",
   		'S',SlimeCraftBlocks.CompactSlimeBlock
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_3),
   		"SSS","SSS","SSS",
   		'S',SlimeCraftBlocks.CompactSlimeBlock_2
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_4),
   		"SSS","SSS","SSS",
   		'S',SlimeCraftBlocks.CompactSlimeBlock_3
   		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_5),
   		"SSS","SSS","SSS",
   		'S',SlimeCraftBlocks.CompactSlimeBlock_4
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_4,9),
   		new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_5)
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_3,9),
   		new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_4)
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_2,9),
   		new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_3)
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(SlimeCraftBlocks.CompactSlimeBlock,9),
   		new ItemStack(SlimeCraftBlocks.CompactSlimeBlock_2)
   		);
   GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SLIME_BLOCK,9),
   		new ItemStack(SlimeCraftBlocks.CompactSlimeBlock)
   		);

   GameRegistry.addRecipe(new ItemStack(Items.DIAMOND),
   		"III","GGG","III",'I',Items.IRON_INGOT,'G',Items.GOLD_INGOT
   		);

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.UltimateSlimeStaff),
		"QBS","EMB","SEQ",'S',SlimeCraftBlocks.CompactSlimeBlock_5,'M',SlimeCraftItems.SlimeMultiTool
		);

   GameRegistry.addRecipe(new ItemStack(SlimeCraftItems.UltimateSlimeStaff),
		"QBS","EMB","SEQ",'S',SlimeCraftBlocks.CompactSlimeBlock_5,'M',SlimeCraftItems.SlimeMultiToolFortune
		);
   GameRegistry.addRecipe(new ItemStack(SlimeCraftBlocks.SlimeTable),
		"III","ICI","III",'I',SlimeCraftItems.SlimeIron,'C',Blocks.CRAFTING_TABLE
		);


   GameRegistry.addSmelting(Items.SLIME_BALL, new ItemStack(SlimeCraftItems.SlimeMakekit_3), 1.0f);
   GameRegistry.addSmelting(SlimeCraftItems.SlimeMakekit_4, new ItemStack(SlimeCraftItems.SlimeMakeKit_2), 1.0f);



    }

}









