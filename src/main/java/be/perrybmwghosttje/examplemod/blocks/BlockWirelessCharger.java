package be.perrybmwghosttje.examplemod.blocks;

import be.perrybmwghosttje.examplemod.core.CreativeTabs;
import be.perrybmwghosttje.examplemod.references.BlockReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by Kevin on 11/07/2015.
 */
public class BlockWirelessCharger extends Block {

    public BlockWirelessCharger() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.Example_TAB);
        setBlockName(BlockReferences.WirelessCharger.NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        switch (side)
        {
            case 0:

        }
        return null;
    }
}