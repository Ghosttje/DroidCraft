package be.perrybmwghosttje.examplemod.client.gui.base;

import be.perrybmwghosttje.examplemod.references.TextureReferences;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 29/07/2015.
 */
public class GuiUpgrades extends GuiScreen {

    private int xSize = 30;
    private int ySize = 103;

    @Override
    public void drawScreen(int x, int y, float z) {
        super.drawScreen(x, y, z);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(TextureReferences.Gui.UPGRADESLOT);

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

        this.drawTexturedModalRect(xStart + 80, yStart + 40, 176, 14, 1, 16);

        super.drawScreen(x, y, z);
    }
}
