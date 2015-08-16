package be.perrybmwghosttje.droidcraft.core;

import be.perrybmwghosttje.droidcraft.core.init.Items;
import be.perrybmwghosttje.droidcraft.references.ModReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

/**
 * Created by Kevin on 13/07/2015.
 */
public class CreativeTabs {
        public static final net.minecraft.creativetab.CreativeTabs DroidCraft_TAB = new net.minecraft.creativetab.CreativeTabs(ModReferences.LOWERCASE_MOD_ID)
        {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Items.Coil;
            }
        };
}
