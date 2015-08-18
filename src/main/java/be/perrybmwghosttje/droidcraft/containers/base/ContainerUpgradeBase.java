package be.perrybmwghosttje.droidcraft.containers.base;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityUpgrades;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

/**
 * Created by Kevin on 27/07/2015.
 */
public abstract class ContainerUpgradeBase extends ContainerBase {

    public TileEntityUpgrades tileEntityUpgrades;

    protected int xUpgrade;
    protected int yUpgrade;

    public ContainerUpgradeBase(InventoryPlayer inventoryPlayer, TileEntityUpgrades tileEntityUpgrades)
    {
        this(inventoryPlayer, tileEntityUpgrades, true);
    }

    public ContainerUpgradeBase(InventoryPlayer inventoryPlayer, TileEntityUpgrades tileEntityUpgrades, boolean hasInventory)
    {
        super(inventoryPlayer, hasInventory);
        this.tileEntityUpgrades = tileEntityUpgrades;

        for(int i = 0; i < tileEntityUpgrades.getSizeInventory(); i++)
        {
            this.addSlotToContainer(new Slot(tileEntityUpgrades, i, xUpgrade, yUpgrade + i * 18));
        }
    }
}
