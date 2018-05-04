package com.jtrent238.drinks;

import com.jtrent238.drinks.fluids.FluidDrink;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidLoader {

	public static Fluid FluidDrink;
	private static ResourceLocation FluidDrinkres_still = new ResourceLocation(Main.MODID,":FluidDrink_still");
	private static ResourceLocation FluidDrinkres_flow = new ResourceLocation(Main.MODID, ":FluidDrink_flow");
	
	
	public static void LoadFluids() {
		FluidDrink = new FluidDrink("FluidDrink", FluidDrinkres_still , FluidDrinkres_flow).setMaterial(Material.water).setUnlocalizedName("FluidDrink").setDensity(22000).setGaseous(false).setTemperature(200) .setViscosity(25000).setLuminosity(9);
		
		
		registerFluids();
	}

	private static void registerFluids() {
		
		FluidRegistry.registerFluid(FluidDrink);
	}

}
