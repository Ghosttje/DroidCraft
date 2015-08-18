package be.perrybmwghosttje.droidcraft.containers;

import be.perrybmwghosttje.droidcraft.containers.base.ContainerUpgradeBase;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDroidAssembly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Kevin on 24/07/2015.
 */
public class ContainerDroidAssembly extends ContainerUpgradeBase {

    private TileEntityDroidAssembly tileEntityDynamo;

    public ContainerDroidAssembly(InventoryPlayer inventoryPlayer, TileEntityDroidAssembly tileEntityDynamo)
    {
        super(inventoryPlayer, tileEntityDynamo, false);
        xInventory = 8;
        yInventory = 140;
        xUpgrade = 189;
        yUpgrade = 8;
        this.tileEntityDynamo = tileEntityDynamo;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}
