package be.perrybmwghosttje.droidcraft.containers.base;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityUpgrade;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

/**
 * Created by Kevin on 27/07/2015.
 */
public abstract class ContainerUpgradeBase extends ContainerBase {

    public TileEntityUpgrade tileEntityUpgrade;

    protected int xUpgrade;
    protected int yUpgrade;

    public ContainerUpgradeBase(InventoryPlayer inventoryPlayer, TileEntityUpgrade tileEntityUpgrade)
    {
        this(inventoryPlayer, tileEntityUpgrade, true);
    }

    public ContainerUpgradeBase(InventoryPlayer inventoryPlayer, TileEntityUpgrade tileEntityUpgrade, boolean hasInventory)
    {
        super(inventoryPlayer, hasInventory);
        this.tileEntityUpgrade = tileEntityUpgrade;

        for(int i = 0; i < tileEntityUpgrade.getSizeInventory(); i++)
        {
            this.addSlotToContainer(new Slot(tileEntityUpgrade, i, xUpgrade, yUpgrade + i * 18));
        }
    }
}
