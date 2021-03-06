package be.perrybmwghosttje.droidcraft.client.gui;

import be.perrybmwghosttje.droidcraft.client.gui.elements.GuiUpgrades;
import be.perrybmwghosttje.droidcraft.client.renderer.models.ModelDroid;
import be.perrybmwghosttje.droidcraft.containers.ContainerDroidAssembly;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDroidAssembly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

/**
 * Created by kevin on 16-Aug-15.
 */
public class GuiDroidAssembly extends GuiContainer {
    private TileEntityDroidAssembly tileEntityDynamo;
    private GuiUpgrades guiUpgrades;

    private ModelDroid modelDroid;

    public GuiDroidAssembly(InventoryPlayer inventoryPlayer, TileEntityDroidAssembly tileEntityDynamo)
    {
        super(new ContainerDroidAssembly(inventoryPlayer, tileEntityDynamo));
        this.tileEntityDynamo = tileEntityDynamo;

        modelDroid = new ModelDroid();
        guiUpgrades = new GuiUpgrades(tileEntityDynamo);

        xSize = 256;
        ySize = 238;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        GL11.glEnable(32826);
        GL11.glEnable(2903);

        GL11.glPushMatrix();

        //This is setting the initial location.
        GL11.glTranslatef(130f, 375f, 100f);
        float scale = 200f;
        GL11.glScaled(-scale, scale, scale);
        GL11.glRotatef(180, 0f, 0f, 1f);

        // Bind texture
        this.mc.getTextureManager().bindTexture(TextureReferences.Models.DROID);

        GL11.glPushMatrix();
        modelDroid.render(null, 0f, 0f, 0f, 0f, 0f, 0.0625F);
        GL11.glPopMatrix();

        GL11.glPopMatrix();

        GL11.glDisable(32826);

        super.drawGuiContainerForegroundLayer(x, y);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float delta, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(TextureReferences.Gui.DROIDASSEMBLY);

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

        guiUpgrades.drawBackGround(delta, xStart + xSize, yStart);
    }
}
