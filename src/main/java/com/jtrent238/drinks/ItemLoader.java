package com.jtrent238.drinks;

import com.jtrent238.drinks.items.drinks.sodas.ItemSoda;
import com.jtrent238.drinks.items.drinks.ItemDrink;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item ItemSoda;
	public static Item ItemDrink;
	public static Item ItemMoney;



	/**
	 * Load Items.
	 */
public static void LoadItems() {
	//ItemNinjaStar  = new ItemNinjaStar(0, ItemNinjaStar, null, null, null).setUnlocalizedName("ItemNinjaStar").setTextureName("ninjastarmod:ItemNinjaStar").setCreativeTab(NinjaStarMod.NinjaStarTab).setHasSubtypes(true);
	ItemSoda  = new ItemSoda(0, 0, ItemSoda).setUnlocalizedName("ItemSoda").setTextureName(Main.MODID + ":" + "ItemSoda").setCreativeTab(Main.DrinksTab);
	ItemDrink  = new ItemDrink(0, 0, ItemDrink).setUnlocalizedName("ItemDrink").setTextureName(Main.MODID + ":" + "ItemDrink").setCreativeTab(Main.DrinksTab);
	ItemMoney  = new ItemMoney(0, 0, ItemMoney).setUnlocalizedName("ItemMoney").setTextureName(Main.MODID + ":" + "ItemMoney").setCreativeTab(Main.DrinksTab);
		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	//GameRegistry.registerItem(ItemNinjaStar, ItemNinjaStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemSoda, ItemSoda.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemDrink, ItemDrink.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemMoney, ItemMoney.getUnlocalizedName().substring(5));
}

}
