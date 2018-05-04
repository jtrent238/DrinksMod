package com.jtrent238.drinks.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidDrink extends Fluid
{
    protected static int mapColor = 0xFFFFFFFF;
    protected static float overlayAlpha = 0.2F;
    //protected static SoundEvent emptySound = SoundEvents.ITEM_BUCKET_EMPTY;
    //protected static SoundEvent fillSound = SoundEvents.ITEM_BUCKET_FILL;
    protected static Material material = Material.water;
    public static String fluidname = "FluidDrink";
    
    public FluidDrink(String fluidName, ResourceLocation still, ResourceLocation flowing) 
    {
        super(fluidName);
    }
 
    public FluidDrink(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor) 
    {
        this(fluidName, still, flowing);
        setColor(mapColor);
    }
 
    public FluidDrink(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor, float overlayAlpha) 
    {
        this(fluidName, still, flowing, mapColor);
        setAlpha(overlayAlpha);
    }
 
    @Override
    public int getColor()
    {
        return mapColor;
    }
 
    public FluidDrink setColor(int parColor)
    {
        mapColor = parColor;
        return this;
    }
 
    public float getAlpha()
    {
        return overlayAlpha;
    }
 
    public FluidDrink setAlpha(float parOverlayAlpha)
    {
        overlayAlpha = parOverlayAlpha;
        return this;
    }
 
    	/*
     public FluidDrink setEmptySound(SoundEvent parSound)
    {
        emptySound = parSound;
        return this;
    }
 
    public SoundEvent getEmptySound()
    {
        return emptySound;
    }
 
    public FluidDrink setFillSound(SoundEvent parSound)
    {
        fillSound = parSound;
        return this;
    }
 
    public SoundEvent getFillSound()
    {
        return fillSound;
    }
    	 	*/
    public FluidDrink setMaterial(Material parMaterial)
    {
        material = parMaterial;
        return this;
    }
 
    public Material getMaterial()
    {
        return material;
    }
 /*
    public boolean doesVaporize(FluidStack fluidStack)
    {
        if (block == null)
            return false;
        return block.getDefaultState().getMaterial() == getMaterial();
    }*/
}