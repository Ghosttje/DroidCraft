package be.perrybmwghosttje.droidcraft.client.gui;

import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 19/07/2015.
 */
@SideOnly(Side.CLIENT)
public class GuiEngine extends GuiScreen {

    private int xSize = 176;
    private int ySize = 187;

    @Override
    public void drawScreen(int x, int y, float z) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(TextureReferences.Gui.ENGINE);

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

        this.drawTexturedModalRect(xStart + 80, yStart + 40, 176, 14, 1, 16);

        super.drawScreen(x, y, z);
    }
}
