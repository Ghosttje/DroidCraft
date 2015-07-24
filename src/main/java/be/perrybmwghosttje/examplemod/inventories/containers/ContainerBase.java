package be.perrybmwghosttje.examplemod.inventories.containers;

import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import java.awt.*;

/**
 * Created by Kevin on 24/07/2015.
 */
public class ContainerBase extends Container {

    protected final int PLAYER_INVENTORY_ROWS = 3;
    protected final int PLAYER_INVENTORY_COLUMNS = 9;

    @Override
    protected boolean mergeItemStack(ItemStack itemStack, int slotMin, int slotMax, boolean ascending)
    {

    }
}
