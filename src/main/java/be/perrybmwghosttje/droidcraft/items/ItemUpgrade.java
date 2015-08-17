package be.perrybmwghosttje.droidcraft.items;

import be.perrybmwghosttje.droidcraft.core.CreativeTabs;
import be.perrybmwghosttje.droidcraft.items.base.ItemBase;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;
import be.perrybmwghosttje.droidcraft.references.ModReferences;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import javax.swing.*;
import java.util.List;

/**
 * Created by kevin on 16-Aug-15.
 */
public class ItemUpgrade extends ItemBase {

    private IIcon[] icons = new IIcon[ItemReferences.Upgrade.NAMES.length];

    public ItemUpgrade() {
        super();
        setCreativeTab(CreativeTabs.DroidCraft_TAB);
        setUnlocalizedName(ItemReferences.Upgrade.NAME);
        setNoRepair();
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + ItemReferences.Upgrade.NAMES[stack.getItemDamage()];
    }

    @Override
    public void getSubItems(Item item, net.minecraft.creativetab.CreativeTabs tab, List list) {
        for (int i = 0; i < ItemReferences.Upgrade.NAMES.length; i ++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        for (int i = 0; i < ItemReferences.Upgrade.NAMES.length; i++) {
            icons[i] = iconRegister.registerIcon(ModReferences.MOD_ID + ":upgrades/" + ItemReferences.Upgrade.NAMES[i]);
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta) {
        return icons[meta];
    }
}
