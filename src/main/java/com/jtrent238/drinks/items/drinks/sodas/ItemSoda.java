package com.jtrent238.drinks.items.drinks.sodas;

import java.util.Collection;
import java.util.List;

import com.jtrent238.drinks.Main;
import com.jtrent238.drinks.items.drinks.ItemDrink;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemSoda extends ItemDrink
{
	public static final String[] field_150923_a = new String[] {"cokereg", "cokediet", "drpepperdiet", "mirindareg", "mtndewreg", "awdiet", "orangecurshreg", "spritereg", "ccreg", "pepsimax", "pepsidiet", "jollyranchgreenapplereg", "chubbyorangereg"};
    public static final String[] field_150921_b = new String[] {"cokereg", "cokediet", "drpepperdiet", "mirindareg", "mtndewreg", "awdiet", "orangecurshreg", "spritereg", "ccreg", "pepsimax", "pepsidiet", "jollyranchgreenapplereg", "chubbyorangereg"};
    public static final int[] field_150922_c = new int[] {1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;
	private IInventory Inventory;
    private static final String __OBFID = "CL_00000022";
    
	public ItemSoda(int par1,int p_77647_1_, Item p_150895_1_)
	{
		super(p_77647_1_, p_77647_1_, p_150895_1_);
		// ItemStacks that store an NBT Tag Compound are limited to stack size of 1
		//setMaxStackSize(1);
		// you'll want to set a creative tab as well, so you can get your item
		setCreativeTab(Main.DrinksTab);
		this.getMetadata(p_77647_1_);
        //this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	  /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
    	//for (int i = 0; i < [AmountOfDoritos]; ++i)
        for (int i = 0; i < Main.sodacount; ++i)
        {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack p_77667_1_)
    {
        int i = MathHelper.clamp_int(p_77667_1_.getItemDamage(), 0, 18);
        return super.getUnlocalizedName() + "." + field_150923_a[i];
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_)
    {
        int j = MathHelper.clamp_int(p_77617_1_, 0, 17);
        return this.field_150920_d[j];
    }
    	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.field_150920_d = new IIcon[field_150921_b.length];

        for (int i = 0; i < field_150921_b.length; ++i)
        {
            this.field_150920_d[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + field_150921_b[i]);
        }
    }


}