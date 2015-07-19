package be.perrybmwghosttje.examplemod.handlers;

import be.perrybmwghosttje.examplemod.client.gui.GuiEngine;
import be.perrybmwghosttje.examplemod.references.GuiRefences;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Kevin on 19/07/2015.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int i, EntityPlayer entityPlayer, World world, int i1, int i2, int i3) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        if (id == GuiRefences.ENGINE.ordinal())
        {
            return new GuiEngine();
        }
        return null;
    }
}
