package be.perrybmwghosttje.droidcraft.util;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

/**
 * Created by Gebruiker on 21/08/2015.
 */

public class InventoryHelper {

    public static ItemStack addToInventory(IInventory inventoryOut, ItemStack output) {

        if (output == null) return null;
        output = output.copy();

        for (int slot = 0; slot < inventoryOut.getSizeInventory(); slot++) {

            ItemStack slotStack = inventoryOut.getStackInSlot(slot);

            if (slotStack == null || slotStack.stackSize == slotStack.getMaxStackSize()) continue;

            if (slotStack.stackSize + output.stackSize > slotStack.getMaxStackSize()) {

                output.stackSize -= (slotStack.getMaxStackSize() - slotStack.stackSize);
                slotStack.stackSize = slotStack.getMaxStackSize();

            }
            else {

                slotStack.stackSize += output.stackSize;
                output.stackSize = 0;

            }

            if (output.stackSize == 0) return null;

        }

        for (int slot = 0; slot < inventoryOut.getSizeInventory(); slot++) {

            ItemStack slotStack = inventoryOut.getStackInSlot(slot);
            if (slotStack != null) continue;
            inventoryOut.setInventorySlotContents(slot, output.copy());
            return null;

        }

        return output;

    }

}
