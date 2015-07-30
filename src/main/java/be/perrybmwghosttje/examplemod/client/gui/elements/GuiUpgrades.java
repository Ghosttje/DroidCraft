package be.perrybmwghosttje.examplemod.client.gui.elements;

import be.perrybmwghosttje.examplemod.client.gui.elements.base.GuiElementBase;
import be.perrybmwghosttje.examplemod.references.TextureReferences;
import be.perrybmwghosttje.examplemod.tileentities.base.TileEntityUpgrades;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 29/07/2015.
 */
public class GuiUpgrades extends GuiElementBase {

    private final int xSize = 32;
    private final int ySize = 104;
    private final int Margin = 5;

    private TileEntityUpgrades tileEntityUpgrades;

    public GuiUpgrades(TileEntityUpgrades tileEntityUpgrades)
    {
        this.tileEntityUpgrades = tileEntityUpgrades;
    }

    @Override
    public void drawBackGround(float delta, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        Minecraft.getMinecraft().renderEngine.bindTexture(TextureReferences.Gui.UPGRADESLOT);
        drawTexturedModalRect(x + Margin, y, 0, 0, xSize, ySize);
    }
}
