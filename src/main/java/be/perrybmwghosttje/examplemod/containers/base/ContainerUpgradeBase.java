package be.perrybmwghosttje.examplemod.containers.base;

import be.perrybmwghosttje.examplemod.tileentities.base.TileEntityUpgrades;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Kevin on 27/07/2015.
 */
public abstract class ContainerUpgradeBase extends ContainerBase {

    public TileEntityUpgrades tileEntityUpgrades;

    public ContainerUpgradeBase(InventoryPlayer inventoryPlayer, TileEntityUpgrades tileEntityUpgrades)
    {
        super(inventoryPlayer);
        this.tileEntityUpgrades = tileEntityUpgrades;

        // Add the Alchemical Chest slots to the container
        /*for (int bagRowIndex = 0; bagRowIndex < bagInventoryRows; ++bagRowIndex)
        {
            for (int bagColumnIndex = 0; bagColumnIndex < bagInventoryColumns; ++bagColumnIndex)
            {
                if (inventoryAlchemicalBag.parentItemStack.getItemDamage() == 0)
                {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryAlchemicalBag, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 18 + bagRowIndex * 18));
                }
                else if (inventoryAlchemicalBag.parentItemStack.getItemDamage() == 1)
                {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryAlchemicalBag, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 18 + bagRowIndex * 18));
                }
                else if (inventoryAlchemicalBag.parentItemStack.getItemDamage() == 2)
                {
                    this.addSlotToContainer(new SlotAlchemicalBag(this, inventoryAlchemicalBag, entityPlayer, bagColumnIndex + bagRowIndex * bagInventoryColumns, 8 + bagColumnIndex * 18, 8 + bagRowIndex * 18));
                }
            }
        }*/
    }
}
