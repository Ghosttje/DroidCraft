package be.perrybmwghosttje.examplemod.core;

import be.perrybmwghosttje.examplemod.references.ModReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Kevin on 13/07/2015.
 */
public class CreativeTabs {
        public static final net.minecraft.creativetab.CreativeTabs Example_TAB = new net.minecraft.creativetab.CreativeTabs(ModReferences.LOWERCASE_MOD_ID)
        {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Items.redstone;
            }
        };
}
