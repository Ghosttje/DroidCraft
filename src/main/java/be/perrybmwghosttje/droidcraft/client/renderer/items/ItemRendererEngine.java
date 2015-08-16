package be.perrybmwghosttje.droidcraft.client.renderer.items;

import be.perrybmwghosttje.droidcraft.client.renderer.models.ModelEngine;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 18/07/2015.
 */
public class ItemRendererEngine implements IItemRenderer {

    private ModelEngine modelEngine = new ModelEngine();

    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType itemRenderType) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType itemRenderType, ItemStack itemStack, ItemRendererHelper itemRendererHelper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... objects) {
                switch (itemRenderType)
        {
            case ENTITY:
            {
                render(0F, 1.0F, 0F);
                return;
            }
            case EQUIPPED:
            {
                render(0.5F, 1.5F, 0.5F);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                render(0.5F, 1.5F, 0.5F);
                return;
            }
            case INVENTORY:
            {
                render(0F, 1.0F, 0F);
                return;
            }
            default:
        }
    }

    private void render(float x, float y, float z)
    {
        GL11.glPushMatrix();

        // Scale, Translate, Rotate
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(180, 0f, 0f, 1f);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(TextureReferences.Models.ENGINE);

        // Render
        modelEngine.render(null, 0f, 0f, 0f, 0f, 0f, 0.0625F);

        GL11.glPopMatrix();
    }
}
