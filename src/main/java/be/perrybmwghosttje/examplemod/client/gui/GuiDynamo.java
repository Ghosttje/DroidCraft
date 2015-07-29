package be.perrybmwghosttje.examplemod.client.gui;

import be.perrybmwghosttje.examplemod.client.gui.base.GuiUpgrades;
import be.perrybmwghosttje.examplemod.containers.ContainerDynamo;
import be.perrybmwghosttje.examplemod.references.TextureReferences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityDynamo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 24/07/2015.
 */
@SideOnly(Side.CLIENT)
public class GuiDynamo extends GuiContainer {

    private TileEntityDynamo tileEntityDynamo;
    private GuiUpgrades upgrades;

    public GuiDynamo(InventoryPlayer inventoryPlayer, TileEntityDynamo tileEntityDynamo)
    {
        super(new ContainerDynamo(inventoryPlayer, tileEntityDynamo));
        this.tileEntityDynamo = tileEntityDynamo;

        upgrades = new GuiUpgrades();

        xSize = 176;
        ySize = 222;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float v, int i, int i1) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(TextureReferences.Gui.DYNAMO);

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
}
