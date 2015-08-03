package be.perrybmwghosttje.droidcraft.containers.base;

import be.perrybmwghosttje.droidcraft.util.ItemHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by Kevin on 24/07/2015.
 */
public abstract class ContainerBase extends Container {

    protected final int PLAYER_INVENTORY_ROWS = 3;
    protected final int PLAYER_INVENTORY_COLUMNS = 9;

    protected ContainerBase(InventoryPlayer inventoryPlayer)
    {
        // Add the player's inventory slots to the container
        for (int inventoryRowIndex = 0; inventoryRowIndex < PLAYER_INVENTORY_ROWS; ++inventoryRowIndex)
        {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < PLAYER_INVENTORY_COLUMNS; ++inventoryColumnIndex)
            {
                this.addSlotToContainer(new Slot(inventoryPlayer, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 8 + inventoryColumnIndex * 18, 140 + inventoryRowIndex * 18));
            }
        }

        // Add the player's action bar slots to the container
        for (int actionBarSlotIndex = 0; actionBarSlotIndex < PLAYER_INVENTORY_COLUMNS; ++actionBarSlotIndex)
        {
            this.addSlotToContainer(new Slot(inventoryPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 198));
        }
    }

    @Override
    protected boolean mergeItemStack(ItemStack itemStack, int slotMin, int slotMax, boolean ascending)
    {
        boolean slotFound = false;
        int currentSlotIndex = ascending ? slotMax - 1 : slotMin;

        Slot slot;
        ItemStack stackInSlot;

        if (itemStack.isStackable())
        {
            while (itemStack.stackSize > 0 && (!ascending && currentSlotIndex < slotMax || ascending && currentSlotIndex >= slotMin))
            {
                slot = (Slot) this.inventorySlots.get(currentSlotIndex);
                stackInSlot = slot.getStack();

                if (slot.isItemValid(itemStack) && ItemHelper.equalsIgnoreStackSize(itemStack, stackInSlot))
                {
                    int combinedStackSize = stackInSlot.stackSize + itemStack.stackSize;
                    int slotStackSizeLimit = Math.min(stackInSlot.getMaxStackSize(), slot.getSlotStackLimit());

                    if (combinedStackSize <= slotStackSizeLimit)
                    {
                        itemStack.stackSize = 0;
                        stackInSlot.stackSize = combinedStackSize;
                        slot.onSlotChanged();
                        slotFound = true;
                    }
                    else if (stackInSlot.stackSize < slotStackSizeLimit)
                    {
                        itemStack.stackSize -= slotStackSizeLimit - stackInSlot.stackSize;
                        stackInSlot.stackSize = slotStackSizeLimit;
                        slot.onSlotChanged();
                        slotFound = true;
                    }
                }

                currentSlotIndex += ascending ? -1 : 1;
            }
        }

        if (itemStack.stackSize > 0)
        {
            currentSlotIndex = ascending ? slotMax - 1 : slotMin;

            while (!ascending && currentSlotIndex < slotMax || ascending && currentSlotIndex >= slotMin)
            {
                slot = (Slot) this.inventorySlots.get(currentSlotIndex);
                stackInSlot = slot.getStack();

                if (slot.isItemValid(itemStack) && stackInSlot == null)
                {
                    slot.putStack(ItemHelper.cloneItemStack(itemStack, Math.min(itemStack.stackSize, slot.getSlotStackLimit())));
                    slot.onSlotChanged();

                    if (slot.getStack() != null)
                    {
                        itemStack.stackSize -= slot.getStack().stackSize;
                        slotFound = true;
                    }

                    break;
                }

                currentSlotIndex += ascending ? -1 : 1;
            }
        }

        return slotFound;
    }

}
