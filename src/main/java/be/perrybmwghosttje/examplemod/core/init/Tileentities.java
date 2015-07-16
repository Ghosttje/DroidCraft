package be.perrybmwghosttje.examplemod.core.init;

import be.perrybmwghosttje.examplemod.reference.BlockReference;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityEngine;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 16/07/2015.
 */
public class Tileentities {
    public static void Init()
    {
        GameRegistry.registerTileEntity(TileEntityEngine.class, BlockReference.Engine.NAME);
    }
}
