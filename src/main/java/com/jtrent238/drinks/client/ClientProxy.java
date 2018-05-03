package com.jtrent238.drinks.client;

import com.jtrent238.drinks.common.CommonProxy;
import com.jtrent238.drinks.entity.tileentity.TileEntityBlockVendingMachine;
import com.jtrent238.drinks.render.tileentity.RenderTileEntityBlockVendingMachine;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
  
    private static Minecraft theMinecraft;
 
    // Version checking instance
 	//public static VersionChecker versionChecker;
 	//public static boolean haveWarnedVersionOutOfDate = false;
 
	
 	
	public void init(FMLInitializationEvent e) {
    super.init (e);
    //System.out.print("client init fired!");
    
    // Register client-specific stuff (e.g. renderer & packet-handler callback etc)
  }
  

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(PlayerTickEvent event)
  {
    
    
  }
  
  @Override
  public void registerRenderThings()
  {
	  GameRegistry.registerTileEntity(TileEntityBlockVendingMachine.class, "tileBlockVendingMachine");
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockVendingMachine.class, new RenderTileEntityBlockVendingMachine());
  }

  }
