package be.perrybmwghosttje.droidcraft.core.init;

import be.perrybmwghosttje.droidcraft.blocks.*;
import be.perrybmwghosttje.droidcraft.references.BlockReferences;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 11/07/2015.
 */
public class Blocks {

    public static BlockWirelessCharger WirelessCharger = new BlockWirelessCharger();
    public static BlockEngine Engine = new BlockEngine();
    public static BlockDynamo Dynamo = new BlockDynamo();
    public static BlockAutoMiner AutoMiner = new BlockAutoMiner();
    public static BlockDroidAssembly DroidAssembly = new BlockDroidAssembly();

    public static void init()
    {
        GameRegistry.registerBlock(WirelessCharger, BlockReferences.WirelessCharger.NAME);
        GameRegistry.registerBlock(Engine, BlockReferences.Engine.NAME);
        GameRegistry.registerBlock(Dynamo, BlockReferences.Dynamo.NAME);
        GameRegistry.registerBlock(AutoMiner, BlockReferences.AutoMiner.NAME);
        GameRegistry.registerBlock(DroidAssembly, BlockReferences.DroidAssembly.NAME);
    }
}
