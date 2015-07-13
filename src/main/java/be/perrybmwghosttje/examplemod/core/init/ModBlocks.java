package be.perrybmwghosttje.examplemod.core.init;

import be.perrybmwghosttje.examplemod.blocks.BlockWirelessCharger;
import be.perrybmwghosttje.examplemod.reference.BlockReference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 11/07/2015.
 */
public class ModBlocks {

    public static BlockWirelessCharger wirelessCharger = new BlockWirelessCharger();

    public static void init()
    {
        GameRegistry.registerBlock(wirelessCharger, BlockReference.WirelessCharger.UNLOCALIZED_NAME);
    }
}
