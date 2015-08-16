package be.perrybmwghosttje.droidcraft.items;

import be.perrybmwghosttje.droidcraft.core.CreativeTabs;
import be.perrybmwghosttje.droidcraft.items.base.ItemBase;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;

/**
 * Created by kevin on 16-Aug-15.
 */
public class ItemUpgrade extends ItemBase {

    public ItemUpgrade()
    {
        super();
        setCreativeTab(CreativeTabs.DroidCraft_TAB);
        setNoRepair();
        setUnlocalizedName(ItemReferences.Upgrade.NAME);
    }
}
