package be.perrybmwghosttje.examplemod.core.init;

import be.perrybmwghosttje.examplemod.items.ItemCoil;
import be.perrybmwghosttje.examplemod.references.ItemReferences;
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
