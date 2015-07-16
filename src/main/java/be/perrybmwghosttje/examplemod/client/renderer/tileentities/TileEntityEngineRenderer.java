package be.perrybmwghosttje.examplemod.client.renderer.tileentities;

import be.perrybmwghosttje.examplemod.client.renderer.models.ModelEngine;
import be.perrybmwghosttje.examplemod.reference.TextureReference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 16/07/2015.
 */
public class TileEntityEngineRenderer extends TileEntitySpecialRenderer {

    private final ModelEngine modelEngine = new ModelEngine();

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        GL11.glPushMatrix();

        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 0.5F, (float) z + 0.5F);

        // Bind texture
        this.bindTexture(TextureReference.Model.ENGINE);

        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!
        //GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);

        //A reference to your Model file. Again, very important.
        modelEngine.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
    }
}
