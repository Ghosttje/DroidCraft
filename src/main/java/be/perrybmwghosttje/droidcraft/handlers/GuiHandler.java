package be.perrybmwghosttje.droidcraft.handlers;

import be.perrybmwghosttje.droidcraft.client.gui.GuiDroidAssembly;
import be.perrybmwghosttje.droidcraft.client.gui.GuiDynamo;
import be.perrybmwghosttje.droidcraft.client.gui.GuiEngine;
import be.perrybmwghosttje.droidcraft.containers.ContainerDroidAssembly;
import be.perrybmwghosttje.droidcraft.containers.ContainerDynamo;
import be.perrybmwghosttje.droidcraft.references.GuiRefences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDroidAssembly;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDynamo;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Kevin on 19/07/2015.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        if (id == GuiRefences.DYNAMO.ordinal())
        {
            TileEntityDynamo tileEntityDynamo = (TileEntityDynamo) world.getTileEntity(x, y, z);
            return new ContainerDynamo(entityPlayer.inventory, tileEntityDynamo);
        }
        else if (id == GuiRefences.DROIDASSEMBLY.ordinal())
        {
            TileEntityDroidAssembly tileEntityDynamo = (TileEntityDroidAssembly) world.getTileEntity(x, y, z);
            return new ContainerDroidAssembly(entityPlayer.inventory, tileEntityDynamo);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        if (id == GuiRefences.ENGINE.ordinal())
        {
            return new GuiEngine();
        }
        else if (id == GuiRefences.DYNAMO.ordinal())
        {
            TileEntityDynamo tileEntityDynamo = (TileEntityDynamo) world.getTileEntity(x, y, z);
            return new GuiDynamo(entityPlayer.inventory, tileEntityDynamo);
        }
        else if (id == GuiRefences.DROIDASSEMBLY.ordinal())
        {
            TileEntityDroidAssembly tileEntityDynamo = (TileEntityDroidAssembly) world.getTileEntity(x, y, z);
            return new GuiDroidAssembly(entityPlayer.inventory, tileEntityDynamo);
        }
        return null;
    }
}
