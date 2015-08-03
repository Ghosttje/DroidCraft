package be.perrybmwghosttje.droidcraft.blocks;

import be.perrybmwghosttje.droidcraft.DroidCraft;
import be.perrybmwghosttje.droidcraft.references.BlockReferences;
import be.perrybmwghosttje.droidcraft.references.GuiRefences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityWirlessCharger;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kevin on 11/07/2015.
 */
public class BlockWirelessCharger extends BlockTileEntityBase {

    public BlockWirelessCharger() {
        super(Material.anvil);
        setHardness(5.0f);
        setBlockName(BlockReferences.WirelessCharger.NAME);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return BlockReferences.WirelessCharger.RenderId;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityWirlessCharger();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float offX, float offY, float offZ) {
        player.openGui(DroidCraft.instance, GuiRefences.WIRLESSCHARGER.ordinal(), world, x, y, z);
        return true;
    }
}