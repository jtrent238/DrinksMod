package com.jtrent238.drinks.common;

import com.jtrent238.drinks.FluidLoader;
import com.jtrent238.drinks.Main;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;

public class CommonProxy {
	
	
	private static final String modid = Main.MODID;
	private String owner;
	
	public void init(FMLInitializationEvent e) {
	    //GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	    //FMLCommonHandler.instance().bus().register(new MyEventHandler());
        //MinecraftForge.EVENT_BUS.register(new MyEventHandler());
        //System.out.print("common init fired!");
	
		//LogHelper.init();
		
		}
	
	
	
	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		return null;
	}

	public void registerRenderThings() {
		// TODO Auto-generated method stub
		
	}

}