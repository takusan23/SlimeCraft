package com.slimecraft.slimecraft;



import com.slimecraft.slimecraft.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = slimecraft.MOD_ID,
        name = slimecraft.MOD_NAME,
        version = slimecraft.MOD_VERSION,
        dependencies = slimecraft.MOD_DEPENDENCIES,
        acceptedMinecraftVersions = slimecraft.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true)
@EventBusSubscriber
public class slimecraft{
    public static final String MOD_ID = "slimecraft";
    public static final String MOD_NAME = "SlimeCraft";
    public static final String MOD_VERSION = "1.3";
    public static final String MOD_DEPENDENCIES ="required-after:forge@[1.12-14.21.1.2426,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12]";
    public static final String CLIENT_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.CommonProxy";
    public static final String SERVER_PROXY_CLASS = "com.slimecraft.slimecraft.proxy.ServerProxy";


    public static CreativeTabs SlimeCraftTab = new SlimeCraftTab("SlimeCraftTab");


/*    //items
    public static Item SlimeDiamond;
    public static Item SlimeIron;
    public static Item GlassStick;
    public static Item SlimeCookie;
    //sword
    public static Item SlimeSword;
    public static Item SlimeIronSword;
    public static Item SlimeDiamondSword;
    public static Item SlimeDiamondSwordX;
    //SlimeTool
    public static Item SlimePickaxe;
    public static Item SlimeAxe;
    public static Item SlimeShovel;
    public static Item SlimeHoe;
    //Slime Iron Tools
    public static Item SlimeIronPickaxe;
    public static Item SlimeIronAxe;
    public static Item SlimeIronShovel;
    public static Item SlimeIronHoe;
    //Slime Diamond Tools
    public static Item SlimeDiamondPickaxe;
    public static Item SlimeDiamondAxe;
    public static Item SlimeDiamondShovel;
    public static Item Sli
    meDiamondHoe;
    //Slime Diamond X Tools
    public static Item SlimeDiamondPickaxeX;
    public static Item SlimeDiamondShovelX;
    public static Item SlimeDiamondAxeX;
    public static Item SlimeDiamondHoeX;
    //SlimeMultiTool
    public static Item SlimeMultiTool;
    public static Item SlimeMultiToolFortune;
    //PotionCard
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
*/    //Blocks
 /*
    public static Block SlimeIronBlock;
    public static Item SlimeIronBlockItem;
    public static Block SlimeDiamondBlock;
    public static Item SlimeDamondBlockItem;
    public static Block SlimeTrophy;
    public static Item SlimeTrophyItem;
    public static Block SlimeLamp;
    public static Item SlimeLampItem;
    public static Block SlimeLamp_Light;
    public static Item SlimeLamp_LightItem;
*/
    //スライムキット
/*    public static Item SlimeMakeKit;
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
*/
    //コンクリートブロック
/*    public static Block concrete_white;
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


  //圧縮スライムブロック
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
*/




    //マテリアル
  /*  public static ToolMaterial Dia_SLIME = EnumHelper.addToolMaterial("Diamond Slime", 5, 0, 20.0F, 20.0F, 30);;
    public static ToolMaterial Iron_Slime =EnumHelper.addToolMaterial("Slime Iron", 2, 512, 6.0F, 1.5F, 10);
    public static ToolMaterial SlimeTool = EnumHelper.addToolMaterial("SlimeTool", 5, 0, 40.0F, 50.0F, 30);;
*/
    @SidedProxy(clientSide = slimecraft.CLIENT_PROXY_CLASS, serverSide = slimecraft.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Instance(MOD_ID)
    public static slimecraft Instance;

    @Mod.EventHandler

    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    private void preInit(FMLPreInitializationEvent event){
    	//Item
    	SlimeCraftItems.init();
    	SlimeCraftItems.register();
    	SlimeCraftBlocks.init();
    	SlimeCraftBlocks.register();
    	//mob drop
    	MinecraftForge.EVENT_BUS.register(new MobDrop());
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    	SlimeCraftEntity.register();
    }

    @SubscribeEvent
    protected static void registerItems(RegistryEvent.Register<Item> event){
    	event.getRegistry().registerAll(
/*
        SlimeDiamond = new Item()
    			.setCreativeTab(SlimeCraftTab)
    			.setUnlocalizedName("Slime Diamond")
    			.setRegistryName(MOD_ID,"slimediamond"),

    	SlimeIron = new Item()
    			.setCreativeTab(SlimeCraftTab)
    			.setUnlocalizedName("Slime Iron")
    			.setRegistryName(MOD_ID,"slimeiron"),

        GlassStick = new Item()
    			.setCreativeTab(SlimeCraftTab)
    			.setUnlocalizedName("Glass Stick")
    			.setRegistryName(MOD_ID,"glassstick"),

        SlimeCookie = new ItemFood(10, false)
    	 		.setCreativeTab(SlimeCraftTab)
    	 		.setUnlocalizedName("Slime Cookie")
    	 		.setRegistryName(MOD_ID,"slimecookie"),



       SlimeSword = new ItemSword(slimecraft.Iron_Slime)
    	   		.setCreativeTab(SlimeCraftTab)
    	   		.setUnlocalizedName("Slime Sword")
    	   		.setRegistryName(MOD_ID,"slimesword"),



        SlimeIronSword = new ItemSword(ToolMaterial.IRON)

    	 		.setCreativeTab(slimecraft.SlimeCraftTab)
    	 		.setRegistryName(MOD_ID,"slimeironsword")
    	 		.setUnlocalizedName("SlimeIron Sword"),

    	SlimeDiamondSword = new ItemSword(slimecraft.Dia_SLIME)
    	       .setCreativeTab(slimecraft.SlimeCraftTab)
    	       .setUnlocalizedName("SlimeDiamond Sword")
    	       .setRegistryName(MOD_ID,"slimediamondsword"),

    	SlimeDiamondSwordX = new SlimeDiamondSwordX(slimecraft.Dia_SLIME)
    	       .setCreativeTab(slimecraft.SlimeCraftTab)
        	   .setUnlocalizedName("SlimeDiamond Sword X")
        	   .setRegistryName(MOD_ID,"slimediamondswordx"),


//     	Slime tools

        SlimePickaxe = new SlimePickaxe(ToolMaterial.STONE)
       			    .setUnlocalizedName("Slime Pickaxe")
       			    .setCreativeTab(slimecraft.SlimeCraftTab)
    	            .setRegistryName(MOD_ID,"slimepickaxe"),


    	SlimeAxe = new SlimeAxe(ToolMaterial.STONE)
       				.setCreativeTab(slimecraft.SlimeCraftTab)
       			    .setUnlocalizedName("Slime Axe")
       			    .setRegistryName(MOD_ID,"slimeaxe"),


       SlimeHoe = new ItemHoe(ToolMaterial.STONE)
               		.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("Slime Hoe")
               		.setRegistryName(MOD_ID,"slimehoe"),


       SlimeShovel = new SlimeShovel(ToolMaterial.STONE)
               		.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("Slime Shovel")
               		.setRegistryName(MOD_ID,"slimeshovel"),

               	  //Slime Iron tools

      SlimeIronPickaxe = new SlimeIronPickaxe(ToolMaterial.IRON)
               		.setCreativeTab(slimecraft.SlimeCraftTab)
                  	.setMaxDamage(512)
               		.setUnlocalizedName("SlimeIron Sword")
               		.setRegistryName(MOD_ID,"slimeironpickaxe"),

      SlimeIronAxe = new SlimeIronAxe(ToolMaterial.IRON)
                    .setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("SlimeIron Axe")
               		.setMaxDamage(512)
               		.setRegistryName(MOD_ID,"slimeironaxe"),

      SlimeIronShovel = new SlimeIronShovel(ToolMaterial.IRON)
              		 .setCreativeTab(slimecraft.SlimeCraftTab)
               		 .setUnlocalizedName("SlimeIron Shovel")
               		 .setMaxDamage(512)
               		 .setRegistryName(MOD_ID,"slimeironshovel"),

      SlimeIronHoe = new SlimeIronHoe(ToolMaterial.IRON)
               		 .setCreativeTab(slimecraft.SlimeCraftTab)
               		 .setUnlocalizedName("SlimeIron Hoe")
              		 .setMaxDamage(512)
              		 .setRegistryName(MOD_ID,"slimeironhoe"),

         //Slime Diamond tools

      SlimeDiamondPickaxe = new SlimeDiamondPickaxe(ToolMaterial.DIAMOND)
         			.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setMaxDamage(4096)
           		    .setUnlocalizedName("SlimeDiamond Pickaxe")
           		    .setRegistryName(MOD_ID,"slimediamondpickaxe"),

      SlimeDiamondAxe = new SlimeDiamondAxe(ToolMaterial.DIAMOND)
              		.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setMaxDamage(4096)
               		.setUnlocalizedName("SlimeDiamond Axe")
               		.setRegistryName(MOD_ID,"slimediamondaxe"),

      SlimeDiamondShovel = new SlimeDiamondShovel(ToolMaterial.DIAMOND)
                   	.setCreativeTab(slimecraft.SlimeCraftTab)
                   	.setUnlocalizedName("SlimeDiamond Axe")
                    .setMaxDamage(4096)
                    .setRegistryName(MOD_ID,"slimediamondshovel"),

         SlimeDiamondHoe = new SlimeDiamondHoe(ToolMaterial.DIAMOND)
                    .setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("SlimeDiamond Hoe")
               		.setMaxDamage(4096)
               		.setRegistryName(MOD_ID,"slimediamondhoe"),

                    //Slime Diamond X tools

          SlimeDiamondPickaxeX = new SlimeDiamondPickaxeX(slimecraft.Dia_SLIME)
              		.setCreativeTab(slimecraft.SlimeCraftTab)
               		.setUnlocalizedName("SlimeDiamond Pickaxe X")
               		.setRegistryName(MOD_ID,"slimediamondpickaxex"),

          SlimeDiamondShovelX = new SlimeDiamondShovelX(slimecraft.Dia_SLIME)
              	    .setCreativeTab(slimecraft.SlimeCraftTab)
                    .setUnlocalizedName("SlimeDiamond Shovel X")
                    .setRegistryName(MOD_ID,"slimediamondshovelx"),

          SlimeDiamondAxeX = new SlimeDiamondAxeX(ToolMaterial.DIAMOND)
            		.setMaxDamage(0)
                    .setCreativeTab(slimecraft.SlimeCraftTab)
                    .setUnlocalizedName("SlimeDiamond Axe X")
                    .setRegistryName(MOD_ID,"slimediamondaxex"),

          SlimeDiamondHoeX = new SlimeDiamondHoeX(slimecraft.Dia_SLIME)
           	   	    .setCreativeTab(slimecraft.SlimeCraftTab)
               	    .setUnlocalizedName("SlimeDiamond Hoe X")
               	    .setRegistryName(MOD_ID,"slimediamondhoex"),

           SlimeMultiTool = new SlimeMultiTool(slimecraft.SlimeTool)
                    .setCreativeTab(slimecraft.SlimeCraftTab)
                    .setUnlocalizedName("Slime MultiTool")
                    .setRegistryName(MOD_ID,"slimemultitool"),

           SlimeMultiToolFortune = new SlimeMultiToolFortune(slimecraft.SlimeTool)
                    .setCreativeTab(slimecraft.SlimeCraftTab)
                    .setUnlocalizedName("Slime MultiTool(Fortune)")
                    .setRegistryName(MOD_ID,"slimemultitoolfortune"),

                    //Potion Card

             PotionCard = new PotionCard()
                		  .setCreativeTab(slimecraft.SlimeCraftTab)
                  		  .setUnlocalizedName("Potion Card")
                  		  .setRegistryName(MOD_ID,"potioncard"),

                    SpeedCard = new SpeedCard()
                    	  .setCreativeTab(slimecraft.SlimeCraftTab)
                  		  .setMaxStackSize(1)
                     	  .setUnlocalizedName("Speed Card")
                     	  .setRegistryName(MOD_ID,"speedcard"),

                    FoodCard = new FoodCard()
                  		  .setCreativeTab(slimecraft.SlimeCraftTab)
                  		  .setMaxStackSize(1)
                  		  .setUnlocalizedName("Food Card")
                  		  .setRegistryName(MOD_ID,"foodcard"),

                   RegenerationCard = new RegenerationCard()
                  		 .setCreativeTab(slimecraft.SlimeCraftTab)
                  		 .setMaxStackSize(1)
                  		 .setUnlocalizedName("Regeneration Card")
                  		 .setRegistryName(MOD_ID,"regenerationcard"),

                   HungerCard = new HungerCard()
                  		 .setCreativeTab(slimecraft.SlimeCraftTab)
                  		 .setMaxStackSize(1)
                  		 .setUnlocalizedName("Hunger Card")
                  		 .setRegistryName(MOD_ID,"hungercard"),

                     ResistanceCard = new ResistanceCard()
                    		 .setCreativeTab(slimecraft.SlimeCraftTab)
                    		 .setMaxStackSize(1)
                    		 .setUnlocalizedName("Resistance Card")
                    		 .setRegistryName(MOD_ID,"resistancecard"),


                   FireResistanceCard = new FireResistanceCard()
                  		 .setCreativeTab(slimecraft.SlimeCraftTab)
                  		 .setMaxStackSize(1)
                  		 .setUnlocalizedName("Fire Resistance Card")
                  		 .setRegistryName(MOD_ID,"fireresistancecard"),

                   NightVisionCard = new NightVisionCard()
                  		 .setCreativeTab(slimecraft.SlimeCraftTab)
                  		 .setMaxStackSize(1)
                  		 .setUnlocalizedName("Night Vision Card")
                  		 .setRegistryName(MOD_ID,"nightvisioncard"),

                   InvisibilityCard = new InvisibilityCard()
                  		 .setCreativeTab(slimecraft.SlimeCraftTab)
                  		 .setMaxStackSize(1)
                  		 .setUnlocalizedName("Invisibility Card")
                  		 .setRegistryName(MOD_ID,"invisiblilitycard"),

                    JumpBoostCard = new JumpBoostCard()
                  		  .setCreativeTab(slimecraft.SlimeCraftTab)
                  		  .setMaxStackSize(1)
                  		  .setUnlocalizedName("Jump Boost Card")
                  		  .setRegistryName(MOD_ID,"jumpboostcard"),

                    GlowingCard = new GlowingCard()
                  		  .setCreativeTab(slimecraft.SlimeCraftTab)
                  		  .setMaxStackSize(1)
                  		  .setUnlocalizedName("Glowing Card")
                  		  .setRegistryName(MOD_ID,"glowingcard"),

                  		//SlimeMake

                        SlimeMakeKit = new Item()
                         		.setCreativeTab(slimecraft.SlimeCraftTab)
                         		.setContainerItem(Items.GLASS_BOTTLE)
                         		.setUnlocalizedName("SlimeMakeKit")
                         		.setRegistryName(MOD_ID,"slimemakekit"),

                         SlimeMakeKit_2 = new Item()
                      		.setCreativeTab(slimecraft.SlimeCraftTab)
                         		.setUnlocalizedName("SlimeMake Material 2")
                         		.setRegistryName(MOD_ID,"slimemakekit2"),

                         SlimeMakekit_3 = new Item()
                      		.setCreativeTab(slimecraft.SlimeCraftTab)
                      		.setUnlocalizedName("SlimeMake Material 3")
                      		.setRegistryName(MOD_ID,"slimemakekit3"),

                      	SlimeMakekit_4 = new Item()
                      		.setCreativeTab(slimecraft.SlimeCraftTab)
                      		.setUnlocalizedName("SlimeMake Material 1")
                        		.setRegistryName(MOD_ID,"slimemakekit4") ,

                        SlimeMakeing_1 = new Item()
                    			.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking1")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 1/10"),

                    	SlimeMakeing_2 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking2")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 2/10"),

                    	SlimeMakeing_3 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking3")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 3/10"),

                    	SlimeMakeing_4 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking4")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 4/10"),

                    	SlimeMakeing_5 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking5")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 5/10"),

                    	SlimeMakeing_6 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking6")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 6/10"),

                    	 SlimeMakeing_7 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking7")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 7/10"),

                    	 SlimeMakeing_8 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking8")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 8/10"),

                    	  SlimeMakeing_9 = new Item()
                    			//.setCreativeTab(slimecraft.SlimeCraftTab)
                    			.setMaxStackSize(1)
                    			.setRegistryName(MOD_ID,"slimemaking9")
                    			.setUnlocalizedName("SlimeMakeKit(Slime) 9/10"),

                    	   SlimeMakeing_10 = new Item()
                    			 .setCreativeTab(slimecraft.SlimeCraftTab)
                     			.setMaxStackSize(1)
                     			.setContainerItem(slimecraft.SlimeMakeKit)
                     			.setRegistryName(MOD_ID,"slimemaking10")
                     			.setUnlocalizedName("SlimeMakeKit(Slime) 10/10"),
*/
/*
                     	SlimeIronBlockItem = new ItemBlock(SlimeIronBlock)
                     	.setRegistryName(MOD_ID,"slimeironblock"),

                     	SlimeDamondBlockItem = new ItemBlock(SlimeDiamondBlock)
                     	.setRegistryName(MOD_ID,"slimediamondblock"),

                     	SlimeTrophyItem = new ItemBlock(SlimeTrophy)
                     	.setRegistryName(MOD_ID,"slimetrophy"),

                     	SlimeLampItem = new ItemBlock(SlimeLamp)
                     	.setRegistryName(MOD_ID,"slimelamp"),

                     	SlimeLamp_LightItem = new ItemBlock(SlimeLamp_Light)
                     	.setRegistryName(MOD_ID,"slimelamp_light"),

                     	CompactSlimeBlockItem = new ItemBlock(CompactSlimeBlock)
                     	.setRegistryName(MOD_ID,"compactslimeblock"),

                     	CompactSlimeBlock_2Item = new ItemBlock(CompactSlimeBlock_2)
                     	.setRegistryName(MOD_ID,"compactslimeblock2"),

                     	CompactSlimeBlock_3Item = new ItemBlock(CompactSlimeBlock_3)
                     	.setRegistryName(MOD_ID,"compactslimeblock3"),

                     	CompactSlimeBlock_4Item = new ItemBlock(CompactSlimeBlock_4)
                     	.setRegistryName(MOD_ID,"compactslimeblock4"),

                     	CompactSlimeBlock_5Item = new ItemBlock(CompactSlimeBlock_5)
                     	.setRegistryName(MOD_ID,"compactslimeblock5")

*/

    			);
    	}
    @SubscribeEvent
    protected static void registerBlocks(RegistryEvent.Register<Block> event) {

    	event.getRegistry().registerAll(
/*
    			//レシストリーネームをクラスに登録して
    			SlimeIronBlock = new SlimeIronBlock(),
    			SlimeDiamondBlock = new SlimeDiamondBlock(),
    			SlimeTrophy = new SlimeTrophy(),
    			SlimeLamp = new SlimeLamp(),
    			SlimeLamp_Light = new SlimeLamp_Linght(),

    			CompactSlimeBlock = new compactslimeblock(),
    			CompactSlimeBlock_2 = new compactslimeblock_2(),
    			CompactSlimeBlock_3 = new compactslimeblock_3(),
    			CompactSlimeBlock_4 = new compactslimeblock_4(),
    			CompactSlimeBlock_5 = new compactslimeblock_5()
*/

    			);
    }


    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {


    	MinecraftForge.EVENT_BUS.register(new MobDrop());
/*



        		ModelLoader.setCustomModelResourceLocation(SlimeDiamond,0,new ModelResourceLocation(new ResourceLocation("slimecraft","slimediamond"),"inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeIron, 0, new ModelResourceLocation(SlimeIron.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeCookie, 0, new ModelResourceLocation(SlimeCookie.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(GlassStick, 0, new ModelResourceLocation(GlassStick.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimeSword, 0, new ModelResourceLocation(SlimeSword.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeIronSword, 0, new ModelResourceLocation(SlimeIronSword.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondSword, 0, new ModelResourceLocation(SlimeDiamondSword.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondSwordX, 0, new ModelResourceLocation(SlimeDiamondSwordX.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimePickaxe, 0, new ModelResourceLocation(SlimePickaxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeAxe, 0, new ModelResourceLocation(SlimeAxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeHoe, 0, new ModelResourceLocation(SlimeHoe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeShovel, 0, new ModelResourceLocation(SlimeShovel.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimeIronPickaxe, 0, new ModelResourceLocation(SlimeIronPickaxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeIronAxe, 0, new ModelResourceLocation(SlimeIronAxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeIronShovel, 0, new ModelResourceLocation(SlimeIronShovel.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeIronHoe, 0, new ModelResourceLocation(SlimeIronHoe.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimeDiamondAxe, 0, new ModelResourceLocation(SlimeDiamondAxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondHoe, 0, new ModelResourceLocation(SlimeDiamondHoe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondPickaxe, 0, new ModelResourceLocation(SlimeDiamondPickaxe.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondShovel, 0, new ModelResourceLocation(SlimeDiamondShovel.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimeDiamondAxeX, 0, new ModelResourceLocation(SlimeDiamondAxeX.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondHoeX, 0, new ModelResourceLocation(SlimeDiamondHoeX.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondPickaxeX, 0, new ModelResourceLocation(SlimeDiamondPickaxeX.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeDiamondShovelX, 0, new ModelResourceLocation(SlimeDiamondShovelX.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(SlimeMultiTool, 0, new ModelResourceLocation(SlimeMultiTool.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SlimeMultiToolFortune, 0, new ModelResourceLocation(SlimeMultiToolFortune.getRegistryName(), "inventory"));

                ModelLoader.setCustomModelResourceLocation(PotionCard, 0, new ModelResourceLocation(PotionCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(FireResistanceCard, 0, new ModelResourceLocation(FireResistanceCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(FoodCard, 0, new ModelResourceLocation(FoodCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(GlowingCard, 0, new ModelResourceLocation(GlowingCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(HungerCard, 0, new ModelResourceLocation(HungerCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(InvisibilityCard, 0, new ModelResourceLocation(InvisibilityCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(JumpBoostCard, 0, new ModelResourceLocation(JumpBoostCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(NightVisionCard, 0, new ModelResourceLocation(NightVisionCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(RegenerationCard, 0, new ModelResourceLocation(RegenerationCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(ResistanceCard, 0, new ModelResourceLocation(ResistanceCard.getRegistryName(), "inventory"));
                ModelLoader.setCustomModelResourceLocation(SpeedCard, 0, new ModelResourceLocation(SpeedCard.getRegistryName(), "inventory"));


                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeIronBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "slimeironblock", "inventory"));
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeDiamondBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "slimediamondblock", "inventory"));
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeTrophy),0, new ModelResourceLocation(MOD_ID + ":" + "slimetrophy", "inventory" ));

                ModelLoader.setCustomModelResourceLocation(SlimeMakeKit, 0, new ModelResourceLocation(SlimeMakeKit.getRegistryName(),"inventory"));
           	    ModelLoader.setCustomModelResourceLocation(SlimeMakeKit_2, 0, new ModelResourceLocation(SlimeMakeKit_2.getRegistryName(),"inventory"));
           	    ModelLoader.setCustomModelResourceLocation(SlimeMakekit_3, 0, new ModelResourceLocation(SlimeMakekit_3.getRegistryName(),"inventory"));
            	ModelLoader.setCustomModelResourceLocation(SlimeMakekit_4, 0, new ModelResourceLocation(SlimeMakekit_4.getRegistryName(),"inventory"));

            	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_1, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_2, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_3, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_4, 0, new ModelResourceLocation(SlimeMakeing_1.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_5, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_6, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_7, 0, new ModelResourceLocation(SlimeMakeing_5.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_8, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));
              	ModelLoader.setCustomModelResourceLocation(SlimeMakeing_9, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));
    	        ModelLoader.setCustomModelResourceLocation(SlimeMakeing_10, 0, new ModelResourceLocation(SlimeMakeing_7.getRegistryName(),"inventory"));
*//*
    	        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeLamp), 0, new ModelResourceLocation(MOD_ID + ":" + "slimelamp", "inventory"));
              	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(SlimeLamp_Light), 0, new ModelResourceLocation(MOD_ID + ":" + "slimelamplight", "inventory"));


             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock", "inventory"));
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_2), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_2", "inventory"));
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_3), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_3", "inventory"));
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_4), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_4", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CompactSlimeBlock_5), 0, new ModelResourceLocation(MOD_ID + ":" + "compactslimeblock_5", "inventory"));
*/

    	        //GameRegistry.addSmelting(Items.SLIME_BALL, new ItemStack(SlimeMakekit_3), 1.0f);
                //GameRegistry.addSmelting(slimecraft.SlimeMakekit_4, new ItemStack(SlimeMakeKit_2), 1.0f);


                /*
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_silver), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_silver", "inventory"));
              	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_green), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_green", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_red), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_red", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_purple), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_purple", "inventory"));
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_magenta), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_magenta", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_pink), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_pink", "inventory"));
              	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_orange), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_orange", "inventory"));
            	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_lime), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_lime", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_light_blue), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_light_blue", "inventory"));
              	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_cyan), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_cyan", "inventory"));
              	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_brown), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_brown", "inventory"));
               	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_blue), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_blue", "inventory"));
            	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_black), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_black", "inventory"));
             	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(concrete_white), 0, new ModelResourceLocation(MOD_ID + ":" + "concrete_white", "inventory"));









    	 SlimeIronBlock = new SlimeIronBlock();
         ResourceLocation registryName = new ResourceLocation(MOD_ID,"slimeironblock");
         ItemBlock SlimeIronItemBlock = new ItemBlock(SlimeIronBlock);

         GameRegistry.register(SlimeIronBlock,registryName);
         GameRegistry.register(SlimeIronItemBlock,registryName);

         SlimeDiamondBlock = new SlimeDiamondBlock();
         ResourceLocation registeryName = new ResourceLocation(MOD_ID,"slimediamondblock");
         ItemBlock SlimeDiamondItemBlock = new ItemBlock(SlimeDiamondBlock);

         GameRegistry.register(SlimeDiamondBlock,registeryName);
         GameRegistry.register(SlimeDiamondItemBlock,registeryName);

         concrete_white = new concrete_white();
         ResourceLocation registeryName1 = new ResourceLocation(MOD_ID,"concrete_white");
         ItemBlock concrete_whiteItem = new ItemBlock(concrete_white);

         GameRegistry.register(concrete_white,registeryName1);
         GameRegistry.register(concrete_whiteItem,registeryName1);

         concrete_black = new concrete_black();
         ResourceLocation registeryName2 = new ResourceLocation(MOD_ID,"concrete_black");
         ItemBlock concrete_blackItem = new ItemBlock(concrete_black);

         GameRegistry.register(concrete_black,registeryName2);
         GameRegistry.register(concrete_blackItem,registeryName2);

         concrete_blue = new concrete_blue();
         ResourceLocation registeryName3 = new ResourceLocation(MOD_ID,"concrete_blue");
         ItemBlock concrete_blueItem = new ItemBlock(concrete_blue);

         GameRegistry.register(concrete_blue,registeryName3);
         GameRegistry.register(concrete_blueItem,registeryName3);

         concrete_brown = new concrete_brown();
         ResourceLocation registeryName4 = new ResourceLocation(MOD_ID,"concrete_brown");
         ItemBlock concrete_brownItem = new ItemBlock(concrete_brown);

         GameRegistry.register(concrete_brown,registeryName4);
         GameRegistry.register(concrete_brownItem,registeryName4);

         concrete_cyan = new concrete_cyan();
         ResourceLocation registeryName5 = new ResourceLocation(MOD_ID,"concrete_cyan");
         ItemBlock concrete_cyanItem = new ItemBlock(concrete_cyan);

         GameRegistry.register(concrete_cyan,registeryName5);
         GameRegistry.register(concrete_cyanItem,registeryName5);

         concrete_green = new concrete_green();
         ResourceLocation registeryName6 = new ResourceLocation(MOD_ID,"concrete_green");
         ItemBlock concrete_greenItem = new ItemBlock(concrete_green);

         GameRegistry.register(concrete_green,registeryName6);
         GameRegistry.register(concrete_greenItem,registeryName6);


         concrete_light_blue = new concrete_light_blue();
         ResourceLocation registeryName7 = new ResourceLocation(MOD_ID,"concrete_light_blue");
         ItemBlock concrete_light_blueItem = new ItemBlock(concrete_light_blue);

         GameRegistry.register(concrete_light_blue,registeryName7);
         GameRegistry.register(concrete_light_blueItem,registeryName7);

         concrete_lime = new concrete_lime();
         ResourceLocation registeryName8 = new ResourceLocation(MOD_ID,"concrete_lime");
         ItemBlock concrete_limeItem = new ItemBlock(concrete_lime);

         GameRegistry.register(concrete_lime,registeryName8);
         GameRegistry.register(concrete_limeItem,registeryName8);

         concrete_magenta = new concrete_magenta();
         ResourceLocation registeryName9 = new ResourceLocation(MOD_ID,"concrete_magenta");
         ItemBlock concrete_magentaItem = new ItemBlock(concrete_magenta);

         GameRegistry.register(concrete_magenta,registeryName9);
         GameRegistry.register(concrete_magentaItem,registeryName9);

         concrete_orange = new concrete_orange();
         ResourceLocation registeryName10 = new ResourceLocation(MOD_ID,"concrete_orange");
         ItemBlock concrete_orangeItem = new ItemBlock(concrete_orange);

         GameRegistry.register(concrete_orange,registeryName10);
         GameRegistry.register(concrete_orangeItem,registeryName10);

         concrete_pink = new concrete_pink();
         ResourceLocation registeryName11 = new ResourceLocation(MOD_ID,"concrete_pink");
         ItemBlock concrete_pinkItem = new ItemBlock(concrete_pink);

         GameRegistry.register(concrete_pink,registeryName11);
         GameRegistry.register(concrete_pinkItem,registeryName11);

         concrete_purple = new concrete_purple();
         ResourceLocation registeryName12 = new ResourceLocation(MOD_ID,"concrete_purple");
         ItemBlock concrete_purpleItem = new ItemBlock(concrete_purple);

         GameRegistry.register(concrete_purple,registeryName12);
       	 GameRegistry.register(concrete_purpleItem,registeryName12);


         concrete_red = new concrete_red();
         ResourceLocation registeryName13 = new ResourceLocation(MOD_ID,"concrete_red");
         ItemBlock concrete_redItem = new ItemBlock(concrete_red);

         GameRegistry.register(concrete_red,registeryName13);
         GameRegistry.register(concrete_redItem,registeryName13);

         concrete_silver = new concrete_silver();
         ResourceLocation registeryName14 = new ResourceLocation(MOD_ID,"concrete_silver");
         ItemBlock concrete_silverItem = new ItemBlock(concrete_silver);

         GameRegistry.register(concrete_silver,registeryName14);
         GameRegistry.register(concrete_silverItem,registeryName14);



    }

*/

    }
}










