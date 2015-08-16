package be.perrybmwghosttje.droidcraft.blocks;

import be.perrybmwghosttje.droidcraft.DroidCraft;
import be.perrybmwghosttje.droidcraft.blocks.base.BlockTileEntityBase;
import be.perrybmwghosttje.droidcraft.references.BlockReferences;
import be.perrybmwghosttje.droidcraft.references.GuiRefences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityDroidAssembly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by kevin on 16-Aug-15.
 */
public class BlockDroidAssembly extends BlockTileEntityBase {

    public BlockDroidAssembly() {
        super(Material.anvil);
        setHardness(5.0f);
        setBlockName(BlockReferences.DroidAssembly.NAME);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return BlockReferences.DroidAssembly.RenderId;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityDroidAssembly();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float offX, float offY, float offZ) {
        player.openGui(DroidCraft.instance, GuiRefences.DROIDASSEMBLY.ordinal(), world, x, y, z);
        return true;
    }
}
