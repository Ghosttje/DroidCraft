package be.perrybmwghosttje.droidcraft.items;

import be.perrybmwghosttje.droidcraft.core.CreativeTabs;
import be.perrybmwghosttje.droidcraft.items.base.ItemBase;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * Created by kevin on 16-Aug-15.
 */
public class ItemUpgrade extends ItemBase {

    public ItemUpgrade()
    {
        super();
        setCreativeTab(CreativeTabs.DroidCraft_TAB);
        setNoRepair();
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }

//    @Override
//    public IIcon getIconFromDamage(int i) {
//        switch (i)
//        {
//            case 0:
//                //return itemIcon
//        }
//        return super.getIconFromDamage(i);
//    }
}
