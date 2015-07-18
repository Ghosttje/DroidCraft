package be.perrybmwghosttje.examplemod.blocks;

import be.perrybmwghosttje.examplemod.references.BlockReferences;
import be.perrybmwghosttje.examplemod.tileentities.TileEntityEngine;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Kevin on 14/07/2015.
 */
public class BlockEngine extends BlockTileEntityBase {

    public BlockEngine() {
        super(Material.anvil);
        setHardness(5.0f);
        setBlockName(BlockReferences.Engine.NAME);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return BlockReferences.Engine.RenderId;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityEngine();
    }
}
