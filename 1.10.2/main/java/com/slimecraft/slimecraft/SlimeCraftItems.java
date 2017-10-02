package com.slimecraft.slimecraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlimeCraftItems {

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

    //圧縮スライムブロック
    public static Block CompactSlimeBlock;
    public static Block CompactSlimeBlock_2;
    public static Block CompactSlimeBlock_3;
    public static Block CompactSlimeBlock_4;
    public static Block CompactSlimeBlock_5;

    //material
 	public static ToolMaterial Dia_SLIME;
    public static ToolMaterial Iron_Slime;
    public static ToolMaterial SlimeTool;

	public static void init() {
		SlimeTool = EnumHelper.addToolMaterial("SlimeTool", 5, 0, 40.0F, 50.0F, 30)
				.setRepairItem(new ItemStack(SlimeCraftItems.SlimeDiamond));

	    Dia_SLIME = EnumHelper.addToolMaterial("Diamond Slime", 5, 0, 20.0F, 20.0F, 30)
	    		.setRepairItem(new ItemStack(SlimeCraftItems.SlimeDiamond));

		Iron_Slime = EnumHelper.addToolMaterial("Slime Iron", 2, 512, 6.0F, 1.5F, 10)
				.setRepairItem(new ItemStack(SlimeCraftItems.SlimeIron));

		SlimeDiamond = new Item().setUnlocalizedName("Slime Diamond").setCreativeTab(slimecraft.SlimeCraftTab);
		SlimeIron = new Item().setUnlocalizedName("Slime Iron Ingot").setCreativeTab(slimecraft.SlimeCraftTab);
		SlimeCookie = new SlimeCookie(10, false);
		GlassStick = new Item().setUnlocalizedName("Glass Stick").setCreativeTab(slimecraft.SlimeCraftTab);
		//sword
		SlimeSword = new ItemSword(ToolMaterial.STONE).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime Sword").setMaxDamage(256);
		SlimeIronSword = new ItemSword(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeIron Sword");
		SlimeDiamondSword = new ItemSword(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Sword");
		SlimeDiamondSwordX = new ItemSword(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Sword X");
		//pickaxe
		SlimePickaxe = new SlimePickaxe(ToolMaterial.STONE).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime Pickaxe");
		SlimeIronPickaxe = new SlimeIronPickaxe(ToolMaterial.IRON).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeIron Pickaxe").setMaxDamage(512);
		SlimeDiamondPickaxe = new SlimeDiamondPickaxe(ToolMaterial.DIAMOND).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Pickaxe").setMaxDamage(4096);
		SlimeDiamondPickaxeX = new SlimeDiamondPickaxeX(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Pickaxe X");
		//axe
		SlimeAxe = new SlimeAxe(ToolMaterial.STONE).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime Axe");
		SlimeIronAxe = new SlimeIronAxe(ToolMaterial.IRON).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeIron Axe").setMaxDamage(512);
		SlimeDiamondAxe = new SlimeDiamondAxe(ToolMaterial.DIAMOND).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Axe").setMaxDamage(4096);
		SlimeDiamondAxeX = new SlimeDiamondAxeX(ToolMaterial.DIAMOND).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Axe X").setMaxDamage(0);
		//shovel
		SlimeShovel = new SlimeShovel(ToolMaterial.STONE).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime Shovel");
		SlimeIronShovel = new SlimeIronShovel(ToolMaterial.IRON).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeIron Shovel").setMaxDamage(512);
		SlimeDiamondShovel = new SlimeDiamondShovel(ToolMaterial.DIAMOND).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Shovel").setMaxDamage(4096);
		SlimeDiamondShovelX  = new SlimeDiamondShovelX(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Shovel X");
		//hoe
		SlimeHoe = new ItemHoe(ToolMaterial.STONE).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime Hoe");
        SlimeIronHoe = new SlimeIronHoe(ToolMaterial.IRON).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeIron Hoe").setMaxDamage(512);
        SlimeDiamondHoe = new SlimeDiamondHoe(ToolMaterial.DIAMOND).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Hoe").setMaxDamage(4096);
        SlimeDiamondHoeX = new SlimeDiamondHoeX(SlimeCraftItems.Dia_SLIME).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeDiamond Hoe X");
        //multitool
        SlimeMultiTool = new SlimeMultiTool(SlimeCraftItems.SlimeTool).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime MultiTool");
        SlimeMultiToolFortune = new SlimeMultiToolFortune(SlimeCraftItems.SlimeTool).setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Slime MultiTool(Fortune)");
        //potioncard
        PotionCard = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Potion Card");
        SpeedCard = new SpeedCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Speed Card").setMaxStackSize(1);
        FoodCard = new FoodCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Food Card").setMaxStackSize(1);
        RegenerationCard = new RegenerationCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Regeneration Card").setMaxStackSize(1);
        HungerCard = new HungerCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Hunger Card").setMaxStackSize(1);
        ResistanceCard = new ResistanceCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Resistance Card").setMaxStackSize(1);
        FireResistanceCard = new FireResistanceCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Fire Registance Card").setMaxStackSize(1);
        NightVisionCard = new NightVisionCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Night Vision Card").setMaxStackSize(1);
        InvisibilityCard = new InvisibilityCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Invisibility Card").setMaxStackSize(1);
        JumpBoostCard = new JumpBoostCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Jump Boost Card").setMaxStackSize(1);
        GlowingCard = new GlowingCard().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("Glowing Card").setMaxStackSize(1);
        //slimemake
        SlimeMakeKit = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeMakeKit").setContainerItem(Items.GLASS_BOTTLE);
        SlimeMakeKit_2 = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeMake Material 2");
        SlimeMakekit_3 = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeMake Material 3");
        SlimeMakekit_4 = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setUnlocalizedName("SlimeMake Material 1");
        SlimeMakeing_1 = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 1/10");;
        SlimeMakeing_2 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 2/10");
        SlimeMakeing_3 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 3/10");
        SlimeMakeing_4 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 4/10");
        SlimeMakeing_5 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 5/10");
        SlimeMakeing_6 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 6/10");
        SlimeMakeing_7 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 7/10");
        SlimeMakeing_8 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 8/10");
        SlimeMakeing_9 = new Item().setMaxStackSize(1).setUnlocalizedName("SlimeMakeKit(Slime) 9/10");
        SlimeMakeing_10 = new Item().setCreativeTab(slimecraft.SlimeCraftTab).setMaxStackSize(1).setContainerItem(SlimeCraftItems.SlimeMakeKit).setUnlocalizedName("SlimeMakeKit(Slime) 10/10");;


	}

	public static void register() {
		registerItem(SlimeDiamond,"slimediamond");
		registerItem(SlimeIron,"slimeiron");
		registerItem(SlimeCookie,"slimecookie");
		registerItem(GlassStick, "glassstick");
		//sword
		registerItem(SlimeSword, "slimesword");
		registerItem(SlimeIronSword, "slimeironsword");
		registerItem(SlimeDiamondSword, "slimediamondsword");
		registerItem(SlimeDiamondSwordX, "slimediamondswordx");
		//pickaxe
		registerItem(SlimePickaxe, "slimepickaxe");
		registerItem(SlimeIronPickaxe, "slimeironpickaxe");
		registerItem(SlimeDiamondPickaxe, "slimediamondpickaxe");
		registerItem(SlimeDiamondPickaxeX, "slimediamondpickaxex");
		//axe
		registerItem(SlimeAxe, "slimeaxe");
		registerItem(SlimeIronAxe, "slimeironaxe");
		registerItem(SlimeDiamondAxe, "slimediamondaxe");
		registerItem(SlimeDiamondAxeX, "slimediamondaxex");
		//shovel
		registerItem(SlimeShovel, "slimeshovel");
		registerItem(SlimeIronShovel, "slimeironshovel");
		registerItem(SlimeDiamondShovel, "slimediamondshovel");
		registerItem(SlimeDiamondShovelX, "slimediamondshovelx");
		//hoe
		registerItem(SlimeHoe, "slimehoe");
		registerItem(SlimeIronHoe, "slimeironhoe");
		registerItem(SlimeDiamondHoe, "slimediamondhoe");
		registerItem(SlimeDiamondHoeX, "slimediamondhoex");
		//multitool
		registerItem(SlimeMultiTool, "slimemultitool");
		registerItem(SlimeMultiToolFortune, "slimemultitoolfortune");
		//potioncard
		registerItem(PotionCard, "potioncard");
		registerItem(SpeedCard, "speedcard");
		registerItem(FoodCard, "foodcard");
		registerItem(RegenerationCard, "regenerationcard");
		registerItem(HungerCard, "hungercard");
		registerItem(FireResistanceCard, "fireresistancecard");
		registerItem(ResistanceCard, "resistancecard");
		registerItem(NightVisionCard, "nightvisioncard");
		registerItem(InvisibilityCard, "invisiblilitycard");
		registerItem(JumpBoostCard, "jumpboostcard");
		registerItem(GlowingCard, "glowingcard");
		//slimemake
		registerItem(SlimeMakeKit, "slimemakekit");
		registerItem(SlimeMakeKit_2, "slimemakekit2");
		registerItem(SlimeMakekit_3, "slimemakekit3");
		registerItem(SlimeMakekit_4, "slimemakekit4");
		registerItem(SlimeMakeing_1, "slimemaking1");
		registerItem(SlimeMakeing_2, "slimemaking2");
		registerItem(SlimeMakeing_3, "slimemaking3");
		registerItem(SlimeMakeing_4, "slimemaking4");
		registerItem(SlimeMakeing_5, "slimemaking5");
		registerItem(SlimeMakeing_6, "slimemaking6");
		registerItem(SlimeMakeing_7, "slimemaking7");
		registerItem(SlimeMakeing_8, "slimemaking8");
		registerItem(SlimeMakeing_9, "slimemaking9");
		registerItem(SlimeMakeing_10, "slimemaking10");

	}

	public static void registerItem(Item item, String registryName) {
		GameRegistry.register(item, new ResourceLocation(slimecraft.MOD_ID,registryName));
	}

	public static void registerRenders() {
		registerRender(SlimeDiamond);
		registerRender(SlimeIron);
		registerRender(SlimeCookie);
		registerRender(GlassStick);
		//sword
		registerRender(SlimeSword);
		registerRender(SlimeIronSword);
		registerRender(SlimeDiamondSword);
		registerRender(SlimeDiamondSwordX);
		//pickaxe
		registerRender(SlimePickaxe);
		registerRender(SlimeIronPickaxe);
		registerRender(SlimeDiamondPickaxe);
		registerRender(SlimeDiamondPickaxeX);
		//axe
		registerRender(SlimeAxe);
		registerRender(SlimeIronAxe);
		registerRender(SlimeDiamondAxe);
		registerRender(SlimeDiamondAxeX);
		//shovel
		registerRender(SlimeShovel);
		registerRender(SlimeIronShovel);
		registerRender(SlimeDiamondShovel);
		registerRender(SlimeDiamondShovelX);
		//hoe
		registerRender(SlimeHoe);
		registerRender(SlimeIronHoe);
		registerRender(SlimeDiamondHoe);
		registerRender(SlimeDiamondHoeX);
		//multitool
		registerRender(SlimeMultiTool);
		registerRender(SlimeMultiToolFortune);
		//potioncard
		registerRender(PotionCard);
		registerRender(SpeedCard);
		registerRender(FoodCard);
		registerRender(RegenerationCard);
		registerRender(HungerCard);
		registerRender(FireResistanceCard);
		registerRender(ResistanceCard);
		registerRender(NightVisionCard);
		registerRender(InvisibilityCard);
		registerRender(JumpBoostCard);
		registerRender(GlowingCard);

		registerRender(SlimeMakeKit);
		registerRender(SlimeMakeKit_2);
		registerRender(SlimeMakekit_3);
		registerRender(SlimeMakekit_4);

		registerRender(SlimeMakeing_1);
		registerRender(SlimeMakeing_2);
		registerRender(SlimeMakeing_3);
		registerRender(SlimeMakeing_4);
		registerRender(SlimeMakeing_5);
		registerRender(SlimeMakeing_6);
		registerRender(SlimeMakeing_7);
		registerRender(SlimeMakeing_8);
		registerRender(SlimeMakeing_9);
		registerRender(SlimeMakeing_10);

	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}


}
