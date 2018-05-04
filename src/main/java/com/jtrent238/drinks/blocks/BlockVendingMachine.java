package com.jtrent238.drinks.blocks;

import com.jtrent238.drinks.ItemLoader;
import com.jtrent238.drinks.Main;
import com.jtrent238.drinks.entity.tileentity.TileEntityBlockVendingMachine;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IRegistry;
import net.minecraft.util.RegistryDefaulted;
import net.minecraft.world.World;

public class BlockVendingMachine extends BlockContainer{

	/** Registry for all dispense behaviors. */
    public static final IRegistry dispenseBehaviorRegistry = new RegistryDefaulted(new BehaviorDefaultDispenseItem());
    
    private World p_149941_1_;
	private int p_149941_2_;
	private int p_149941_3_;
	private int p_149941_4_;
	
	BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);

	public BlockVendingMachine(Material material) {
        super(material);

        this.setBlockName("BlockVendingMachine");
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBlockVendingMachine();
    }
    

    
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World p_149941_1_, int p_149941_2_, int p_149941_3_, int p_149941_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {

		//if(Minecraft.getMinecraft().thePlayer.inventory.currentItem == Item.getIdFromItem(Items.diamond)){
			
			BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);
            TileEntityBlockVendingMachine TileEntityBlockVendingMachine = (TileEntityBlockVendingMachine)blocksourceimpl.getBlockTileEntity();

            if (TileEntityBlockVendingMachine != null)
            {
                
                    //p_149941_1_.playAuxSFX(1001, p_149941_2_, p_149941_3_, p_149941_4_, 0);
            	p_149941_1_.playSoundAtEntity(p_149727_5_, Main.MODID + ":vending_machine_coin", 1.0F, 1.0F);

                    ItemStack itemstack = new ItemStack(ItemLoader.ItemSoda);
                    IBehaviorDispenseItem ibehaviordispenseitem = this.func_149940_a(itemstack);

                    if (ibehaviordispenseitem != IBehaviorDispenseItem.itemDispenseBehaviorProvider)
                    {
                        ItemStack itemstack1 = ibehaviordispenseitem.dispense(blocksourceimpl, itemstack);
                        //TileEntityBlockVendingMachine.setInventorySlotContents(l, itemstack1.stackSize == 0 ? null : itemstack1);
                    }
                }
    	
    	System.out.println("Successful");
            
		//}
			/*
		else {
			System.out.println("Failed");
		}
            */
        return true;
    }

        protected IBehaviorDispenseItem func_149940_a(ItemStack p_149940_1_)
        {
            return (IBehaviorDispenseItem)dispenseBehaviorRegistry.getObject(p_149940_1_.getItem());
        }
    
        /**
         * If this returns true, then comparators facing away from this block will use the value from
         * getComparatorInputOverride instead of the actual redstone signal strength.
         */
        public boolean hasComparatorInputOverride()
        {
            return true;
        }

        /**
         * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
         * strength when this block inputs to a comparator.
         */
        public int getComparatorInputOverride(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_)
        {
            return Container.calcRedstoneFromInventory((IInventory)p_149736_1_.getTileEntity(p_149736_2_, p_149736_3_, p_149736_4_));
        }
        
}
 