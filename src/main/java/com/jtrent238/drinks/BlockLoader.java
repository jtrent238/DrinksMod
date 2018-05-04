package com.jtrent238.drinks;

import com.jtrent238.drinks.blocks.BlockVendingMachine;
import com.jtrent238.drinks.blocks.fluids.BlockFluidDrink;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockLoader {

	public static Block BlockVendingMachine;
	public static Block BlockFluidDrink;

	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		BlockVendingMachine = new BlockVendingMachine(Material.rock).setBlockName("BlockVendingMachine").setBlockTextureName(Main.MODID + ":BlockVendingMachine").setCreativeTab(Main.DrinksTab).setHardness(5F);
		//BlockFluidDrink = new BlockFluidClassic(FluidLoader.FluidDrink, Material.water).setCreativeTab(Main.DrinksTab);

		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {
		
		GameRegistry.registerBlock(BlockVendingMachine, "BlockVendingMachine");
		//GameRegistry.registerBlock(BlockFluidDrink, "BlockFluidDrink");

	}

}
