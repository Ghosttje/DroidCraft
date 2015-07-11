package be.perrybmwghosttje.examplemod.block;

import net.minecraft.block.material.Material;

/**
 * Created by Kevin on 11/07/2015.
 */
public class Blocks {

    public static BlockWirelessCharger wirelessCharger;

    public static void initBlocks()
    {
        wirelessCharger = new BlockWirelessCharger(Material.rock);
    }

    public static void addNames()
    {

    }
}
