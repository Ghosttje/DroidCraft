package be.perrybmwghosttje.droidcraft.proxies;

import be.perrybmwghosttje.droidcraft.client.renderer.items.ItemRendererAutoMiner;
import be.perrybmwghosttje.droidcraft.client.renderer.items.ItemRendererDynamo;
import be.perrybmwghosttje.droidcraft.client.renderer.items.ItemRendererEngine;
import be.perrybmwghosttje.droidcraft.client.renderer.items.ItemRendererWirlessCharger;
import be.perrybmwghosttje.droidcraft.client.renderer.tileentities.TileEntityRendererAutoMiner;
import be.perrybmwghosttje.droidcraft.client.renderer.tileentities.TileEntityRendererDynamo;
import be.perrybmwghosttje.droidcraft.client.renderer.tileentities.TileEntityRendererEngine;
import be.perrybmwghosttje.droidcraft.client.renderer.tileentities.TileEntityRendererWirelessCharger;
import be.perrybmwghosttje.droidcraft.core.init.Blocks;
import be.perrybmwghosttje.droidcraft.references.BlockReferences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityAutoMiner;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDynamo;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityEngine;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityWirlessCharger;
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
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.WirelessCharger), new ItemRendererWirlessCharger());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEngine.class, new TileEntityRendererEngine());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.Engine), new ItemRendererEngine());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDynamo.class, new TileEntityRendererDynamo());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.Dynamo), new ItemRendererDynamo());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAutoMiner.class, new TileEntityRendererAutoMiner());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.AutoMiner), new ItemRendererAutoMiner());
    }
}
