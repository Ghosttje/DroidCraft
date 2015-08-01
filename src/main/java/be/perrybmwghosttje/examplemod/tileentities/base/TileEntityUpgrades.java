package be.perrybmwghosttje.examplemod.tileentities.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Kevin on 29/07/2015.
 */
public class TileEntityUpgrades extends TileEntity implements IInventory {

    protected ItemStack[] upgrades;

    public TileEntityUpgrades(int upgradeSlotCount)
    {
        upgrades = new ItemStack[upgradeSlotCount];
    }

    @Override
    public int getSizeInventory() {
        return upgrades.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return upgrades[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int i1) {
        ItemStack itemStack = getStackInSlot(i);

        return itemStack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemStack) {

    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        //TODO: upgrade stack limit
        return 10;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return entityPlayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemStack) {
        //TODO: Check for upgrade
        return true;
    }
}
