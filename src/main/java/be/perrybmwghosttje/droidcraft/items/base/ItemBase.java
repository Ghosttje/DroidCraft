package be.perrybmwghosttje.droidcraft.items.base;

import be.perrybmwghosttje.droidcraft.references.TextureReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by kevin on 16-Aug-15.
 */
public class ItemBase extends Item {

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(TextureReferences.RESOURCE_PREFIX + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
