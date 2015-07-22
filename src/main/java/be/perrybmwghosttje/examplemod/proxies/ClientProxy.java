package be.perrybmwghosttje.examplemod.proxies;

import be.perrybmwghosttje.examplemod.client.renderer.items.ItemRendererAutoMiner;
import be.perrybmwghosttje.examplemod.client.renderer.items.ItemRendererDynamo;
import be.perrybmwghosttje.examplemod.client.renderer.items.ItemRendererEngine;
import be.perrybmwghosttje.examplemod.client.renderer.items.ItemRendererWirlessCharger;
import be.perrybmwghosttje.examplemod.client.renderer.tileentities.TileEntityRendererAutoMiner;
import be.perrybmwghosttje.examplemod.client.renderer.tileentities.TileEntityRendererDynamo;
import be.perrybmwghosttje.examplemod.client.renderer.tileentities.TileEntityRendererEngine;
import be.perrybmwghosttje.examplemod.client.renderer.tileentities.TileEntityRendererWirelessCharger;
import be.perrybmwghosttje.examplemod.core.init.Blocks;
import be.perrybmwghosttje.examplemod.references.BlockReferences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityAutoMiner;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityDynamo;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityEngine;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityWirlessCharger;
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
        BlockReferences.WirelessCharger.RenderId = RenderingRegistry.getNextAvailableRenderId();
        BlockReferences.Engine.RenderId = RenderingRegistry.getNextAvailableRenderId();
        BlockReferences.Dynamo.RenderId = RenderingRegistry.getNextAvailableRenderId();
        BlockReferences.AutoMiner.RenderId = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWirlessCharger.class, new TileEntityRendererWirelessCharger());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.wirelessCharger), new ItemRendererWirlessCharger());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEngine.class, new TileEntityRendererEngine());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.engine), new ItemRendererEngine());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDynamo.class, new TileEntityRendererDynamo());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.dynamo), new ItemRendererDynamo());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAutoMiner.class, new TileEntityRendererAutoMiner());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.autoMiner), new ItemRendererAutoMiner());
    }
}
