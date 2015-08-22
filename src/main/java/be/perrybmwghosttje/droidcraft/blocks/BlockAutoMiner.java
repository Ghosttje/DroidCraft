package be.perrybmwghosttje.droidcraft.blocks;

import be.perrybmwghosttje.droidcraft.DroidCraft;
import be.perrybmwghosttje.droidcraft.blocks.base.BlockTileEntityBase;
import be.perrybmwghosttje.droidcraft.references.BlockReferences;
import be.perrybmwghosttje.droidcraft.references.GuiRefences;
import be.perrybmwghosttje.droidcraft.tileentities.TileEntityAutoMiner;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kevin on 22/07/2015.
 */

public class BlockAutoMiner extends BlockTileEntityBase {

    public BlockAutoMiner() {
        super(Material.anvil);
        setHardness(5.0f);

        setBlockName(BlockReferences.AutoMiner.NAME);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return BlockReferences.AutoMiner.RenderId;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityAutoMiner();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float offX, float offY, float offZ) {
        player.openGui(DroidCraft.instance, GuiRefences.AUTOMINER.ordinal(), world, x, y, z);

        if (!world.isRemote && player.isSneaking()) {
            //Player is Sneak + Right Clicking
            TileEntity tile;
            if ((tile = world.getTileEntity(x, y, z)) instanceof TileEntityAutoMiner) {

                ((TileEntityAutoMiner) tile).writeChatMessage(player);

            } else {
                //Player is just clicking
            }

            return true;

        }

        return true;

    }
}