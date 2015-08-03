package be.perrybmwghosttje.droidcraft.containers;

import be.perrybmwghosttje.droidcraft.containers.base.ContainerUpgradeBase;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDynamo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Kevin on 24/07/2015.
 */
public class ContainerDynamo extends ContainerUpgradeBase {

    private TileEntityDynamo tileEntityDynamo;

    public ContainerDynamo(InventoryPlayer inventoryPlayer, TileEntityDynamo tileEntityDynamo)
    {
        super(inventoryPlayer, tileEntityDynamo);
        this.tileEntityDynamo = tileEntityDynamo;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}
