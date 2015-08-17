package be.perrybmwghosttje.droidcraft.client.gui.elements;

import be.perrybmwghosttje.droidcraft.client.gui.elements.base.GuiElementBase;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityUpgrades;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 29/07/2015.
 */
public class GuiUpgrades extends GuiElementBase {

    private final int xSize = 32;
    private final int ySize = 32;
    private final int Margin = 5;
    private final int SlotSize = 18;

    private TileEntityUpgrades tileEntityUpgrades;

    public GuiUpgrades(TileEntityUpgrades tileEntityUpgrades)
    {
        this.tileEntityUpgrades = tileEntityUpgrades;
    }

    @Override
    public void drawBackGround(float delta, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        int xSlotMarginHeight = (ySize - SlotSize) / 2;

        Minecraft.getMinecraft().renderEngine.bindTexture(TextureReferences.Gui.UPGRADESLOT);
        drawTexturedModalRect(x + Margin, y, 0, 0, xSize, xSlotMarginHeight);

        for (int i = 0; i < tileEntityUpgrades.getSizeInventory(); i++)
        {
            drawTexturedModalRect(x + Margin, y + xSlotMarginHeight + i * SlotSize, 0, xSlotMarginHeight, xSize, SlotSize);
        }

        drawTexturedModalRect(x + Margin, y + xSlotMarginHeight + tileEntityUpgrades.getSizeInventory() * SlotSize, 0, SlotSize + xSlotMarginHeight, xSize, xSlotMarginHeight);
    }
}
