package com.jtrent238.drinks.blocks;

import com.jtrent238.drinks.ItemLoader;
import com.jtrent238.drinks.entity.tileentity.TileEntityBlockVendingMachine;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
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
    
    protected void func_149941_e(World p_149941_1_, int p_149941_2_, int p_149941_3_, int p_149941_4_)
    {
        BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);
        TileEntityBlockVendingMachine TileEntityBlockVendingMachine = (TileEntityBlockVendingMachine)blocksourceimpl.getBlockTileEntity();

        if (TileEntityBlockVendingMachine != null)
        {
            //int l = TileEntityBlockVendingMachine.func_146017_i();

            //if (l < 0)
            //{
                p_149941_1_.playAuxSFX(1001, p_149941_2_, p_149941_3_, p_149941_4_, 0);
            //}
            //else
            //{
                ItemStack itemstack = new ItemStack(ItemLoader.ItemSoda);
                IBehaviorDispenseItem ibehaviordispenseitem = this.func_149940_a(itemstack);

                if (ibehaviordispenseitem != IBehaviorDispenseItem.itemDispenseBehaviorProvider)
                {
                    ItemStack itemstack1 = ibehaviordispenseitem.dispense(blocksourceimpl, itemstack);
                    //TileEntityBlockVendingMachine.setInventorySlotContents(l, itemstack1.stackSize == 0 ? null : itemstack1);
                }
            }
        }
    //}

    protected IBehaviorDispenseItem func_149940_a(ItemStack p_149940_1_)
    {
        return (IBehaviorDispenseItem)dispenseBehaviorRegistry.getObject(p_149940_1_.getItem());
    }
    
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {

    	System.out.println("TEST");
        return true;
    }
    
}
 