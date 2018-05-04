package com.jtrent238.drinks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> drinks = new ArrayList<ItemStack>();

	LootRegistry(){
		addDrinksasLoot();
		addToChests();
	}

	public static void registerLoot() {
		addDrinksasLoot();
		addToChests();
	}
	public static void addDrinksasLoot() {
		
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 0));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 1));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 2));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 3));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 4));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 5));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 6));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 7));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 8));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 9));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 10));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 11));
		drinks.add(new ItemStack(ItemLoader.ItemDrink, 12));
		
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 0));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 1));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 2));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 3));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 4));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 5));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 6));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 7));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 8));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 9));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 10));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 11));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 12));
		drinks.add(new ItemStack(ItemLoader.ItemSoda, 13));
		
		
	}

	public static void addToChests() {
		int numDrinks = Main.totaldrinkcount;
		for (int i = 0; i < numDrinks ; i++) {
			
				if(Main.DEBUG_MODE == true) {
					System.out.println("DEBUG: Injected Drink with ID " + i + " into the Minecraft LootChests.");
				}
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(drinks.get(i), 0, 1, 1));
		}
		
	}
	
}