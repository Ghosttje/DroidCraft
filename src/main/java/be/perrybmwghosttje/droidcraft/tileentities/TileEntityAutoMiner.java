package be.perrybmwghosttje.droidcraft.tileentities;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityBase;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Kevin on 22/07/2015.
 */
public class TileEntityAutoMiner extends TileEntityBase implements IEnergyHandler {

    public EnergyStorage energy = new EnergyStorage(10000000);

    public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {

        return this.energy.receiveEnergy(maxReceive, simulate);

    }

    public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate){

        return this.energy.extractEnergy(maxExtract, simulate);

    }

    public int getEnergyStored(ForgeDirection from){

        return this.energy.getEnergyStored();

    }

    public int getMaxEnergyStored(ForgeDirection from){

        return this.energy.getMaxEnergyStored();

    }

    public boolean canConnectEnergy(ForgeDirection from) {
        return true;
    }

}
