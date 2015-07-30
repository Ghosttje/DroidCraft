package be.perrybmwghosttje.examplemod.client.gui.elements.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by Kevin on 30/07/2015.
 */

@SideOnly(Side.CLIENT)
public interface IGuiElement {
    void drawBackGround(float delta, int x, int y);
}
