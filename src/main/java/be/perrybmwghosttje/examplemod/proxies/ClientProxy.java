package be.perrybmwghosttje.examplemod.proxies;

import be.perrybmwghosttje.examplemod.client.renderer.items.ItemRendererEngine;
import be.perrybmwghosttje.examplemod.client.renderer.tileentities.TileEntityRendererEngine;
import be.perrybmwghosttje.examplemod.core.init.Blocks;
import be.perrybmwghosttje.examplemod.references.BlockReferences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityEngine;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by Kevin on 14/07/2015.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        BlockReferences.Engine.RenderId = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEngine.class, new TileEntityRendererEngine());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.engine), new ItemRendererEngine());
    }
}
