package be.perrybmwghosttje.droidcraft.items;

import be.perrybmwghosttje.droidcraft.core.CreativeTabs;
import be.perrybmwghosttje.droidcraft.references.ItemReferences;
import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * Created by Kevin on 28/07/2015.
 */
public class ItemCoil extends Item {

    @SideOnly(Side.CLIENT)
    private IIcon icon;

    public ItemCoil()
    {
        super();
        setCreativeTab(CreativeTabs.Example_TAB);
        setNoRepair();
        setUnlocalizedName(ItemReferences.Coil.NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        icon = iconRegister.registerIcon(TextureReferences.RESOURCE_PREFIX + ItemReferences.Coil.NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(ItemStack stack, int pass) {
        return icon;
    }
}
