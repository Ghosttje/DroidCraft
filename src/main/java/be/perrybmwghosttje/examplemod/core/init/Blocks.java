package be.perrybmwghosttje.examplemod.core.init;

import be.perrybmwghosttje.examplemod.blocks.BlockAutoMiner;
import be.perrybmwghosttje.examplemod.blocks.BlockDynamo;
import be.perrybmwghosttje.examplemod.blocks.BlockEngine;
import be.perrybmwghosttje.examplemod.blocks.BlockWirelessCharger;
import be.perrybmwghosttje.examplemod.references.BlockReferences;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 11/07/2015.
 */
public class Blocks {

    public static BlockWirelessCharger wirelessCharger = new BlockWirelessCharger();
    public static BlockEngine engine = new BlockEngine();
    public static BlockDynamo dynamo = new BlockDynamo();
    public static BlockAutoMiner autoMiner = new BlockAutoMiner();

    public static void init()
    {
        GameRegistry.registerBlock(wirelessCharger, BlockReferences.WirelessCharger.NAME);
        GameRegistry.registerBlock(engine, BlockReferences.Engine.NAME);
        GameRegistry.registerBlock(dynamo, BlockReferences.Dynamo.NAME);
        GameRegistry.registerBlock(autoMiner, BlockReferences.AutoMiner.NAME);
    }
}
