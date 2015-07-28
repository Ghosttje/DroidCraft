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

    public static BlockWirelessCharger WirelessCharger = new BlockWirelessCharger();
    public static BlockEngine Engine = new BlockEngine();
    public static BlockDynamo Dynamo = new BlockDynamo();
    public static BlockAutoMiner AutoMiner = new BlockAutoMiner();

    public static void init()
    {
        GameRegistry.registerBlock(WirelessCharger, BlockReferences.WirelessCharger.NAME);
        GameRegistry.registerBlock(Engine, BlockReferences.Engine.NAME);
        GameRegistry.registerBlock(Dynamo, BlockReferences.Dynamo.NAME);
        GameRegistry.registerBlock(AutoMiner, BlockReferences.AutoMiner.NAME);
    }
}
