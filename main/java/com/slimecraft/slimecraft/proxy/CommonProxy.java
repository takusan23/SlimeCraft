package com.slimecraft.slimecraft.proxy;

import com.slimecraft.slimecraft.EntitySlimeBallBall;
import com.slimecraft.slimecraft.SlimeBallBallRender;
import com.slimecraft.slimecraft.SlimeCraftTab;
import com.slimecraft.slimecraft.SlimeMultiTool;
import com.slimecraft.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	 private static Item SlimeDiamond;
	//sword
	 private static Item SlimeSword;
	 private static Item SlimeIronSword;
	 private static Item SlimeDiamondSword;
	 private static Item SlimeDiamondSwordX;
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

	    //test
	    public static Item TestItem;

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

	 public void preInit(FMLPreInitializationEvent event)
	 {
		 SlimeIron = new Item()
    			 .setUnlocalizedName("Slime Iron Ingot")
    			 .setCreativeTab(slimecraft.SlimeCraftTab);
    			 GameRegistry.registerItem(SlimeIron,"slimeiron");
    			 
    			 SlimeMultiTool = new SlimeMultiTool(slimecraft.SlimeTool)
    		    		   .setCreativeTab(slimecraft.SlimeCraftTab)
    		    		   .setUnlocalizedName("Slime MultiTool");
    		    		   GameRegistry.registerItem(SlimeMultiTool,"slimemultitool");
    		    		  
	 }
	 public void init(FMLInitializationEvent event)
	 //レシピ追加とーかー、テクスチャとーかー
	 {
		  	RenderingRegistry.registerEntityRenderingHandler(EntitySlimeBallBall.class, new SlimeBallBallRender(null, null, null));

		  	EntityRegistry.registerModEntity(EntitySlimeBallBall.class, "slimeballball", 0, this, 250, 1, false);



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


	 }
	 public void postInit(FMLPostInitializationEvent event)
	 {

	 }

}
