package be.perrybmwghosttje.examplemod.proxies;

import be.perrybmwghosttje.examplemod.reference.BlockReference;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Kevin on 14/07/2015.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        BlockReference.Engine.RenderId = RenderingRegistry.getNextAvailableRenderId();
    }
}
