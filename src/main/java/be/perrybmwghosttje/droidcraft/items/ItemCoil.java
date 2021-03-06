package be.perrybmwghosttje.droidcraft.items;

import be.perrybmwghosttje.droidcraft.core.CreativeTabs;
import be.perrybmwghosttje.droidcraft.items.base.ItemBase;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;

/**
 * Created by Kevin on 28/07/2015.
 */
public class ItemCoil extends ItemBase {

    public ItemCoil()
    {
        super();
        setCreativeTab(CreativeTabs.DroidCraft_TAB);
        setNoRepair();
        setUnlocalizedName(ItemReferences.Coil.NAME);
    }
}
