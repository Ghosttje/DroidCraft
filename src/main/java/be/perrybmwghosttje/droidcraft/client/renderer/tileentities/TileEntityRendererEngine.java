package be.perrybmwghosttje.droidcraft.client.renderer.tileentities;

import be.perrybmwghosttje.droidcraft.client.renderer.models.ModelEngine;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 18/07/2015.
 */
public class TileEntityRendererEngine extends TileEntitySpecialRenderer {

    private ModelEngine model = new ModelEngine();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();

        //This is setting the initial location.
        GL11.glTranslatef((float)x + 0.5f, (float)y + 1.5f, (float)z + 0.5f);
        GL11.glRotatef(180, 0f, 0f, 1f);

        // Bind texture
        this.bindTexture(TextureReferences.Model.ENGINE);

        GL11.glPushMatrix();
        model.render(null, 0f, 0f, 0f, 0f, 0f, 0.0625F);
        GL11.glPopMatrix();

        GL11.glPopMatrix();
    }
}
