package com.jtrent238.drinks;

import com.jtrent238.drinks.blocks.BlockVendingMachine;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block BlockVendingMachine;

	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		BlockVendingMachine = new BlockVendingMachine(Material.rock).setBlockName("BlockVendingMachine").setBlockTextureName(Main.MODID + ":BlockVendingMachine").setCreativeTab(Main.DrinksTab).setHardness(5F);

		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {
		
		GameRegistry.registerBlock(BlockVendingMachine, "BlockVendingMachine");

	}

}
