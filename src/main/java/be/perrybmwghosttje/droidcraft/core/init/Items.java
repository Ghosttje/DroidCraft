package be.perrybmwghosttje.droidcraft.core.init;

import be.perrybmwghosttje.droidcraft.items.ItemCoil;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Kevin on 13/07/2015.
 */
public class Items {

    public static ItemCoil Coil = new ItemCoil();

    public static void init()
    {
        GameRegistry.registerItem(Coil, ItemReferences.Coil.NAME);
    }
}
