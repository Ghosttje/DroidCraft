package be.perrybmwghosttje.examplemod.blocks;

import be.perrybmwghosttje.examplemod.reference.BlockReference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kevin on 14/07/2015.
 */
public class BlockEngine extends BlockContainer {

    public BlockEngine() {
        super(Material.rock);
        setBlockName(BlockReference.Engine.NAME);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return null;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return super.getRenderType();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
