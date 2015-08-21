package be.perrybmwghosttje.droidcraft.tileentities;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityBase;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Kevin on 22/07/2015.
 */

public class TileEntityAutoMiner extends TileEntityBase implements IEnergyReceiver {

    public EnergyStorage energy = new EnergyStorage(10000000);

    public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {

        return this.energy.receiveEnergy(maxReceive, simulate);

    }

    public int getEnergyStored(ForgeDirection from) {

        return this.energy.getEnergyStored();

    }

    public int getMaxEnergyStored(ForgeDirection from) {

        return this.energy.getMaxEnergyStored();

    }

    public boolean canConnectEnergy(ForgeDirection from) {
        return true;
    }

    public int timer = 0;
    public int autoMinerSpeed = 1;
    public int range = 2;
    public int fortuneLevel = 0;

    public int miningX;
    public int miningY;
    public int miningZ;

    public int maxX;
    public int maxZ;

    public boolean isRunning = false;
    public boolean isReady = false;

    public void startQuarry(){

        miningX = this.xCoord - range;
        miningY = this.yCoord - 1;
        miningZ = this.zCoord + range;

        maxX = this.xCoord + range;
        maxZ = this.zCoord - range;

    }

    public void mineBlock(int x, int y, int z) {

        if (!worldObj.isAirBlock(x, y, z)) {

            ArrayList eff = worldObj.getBlock(x, y, z).getDrops(worldObj, x, y, z, worldObj.getBlockMetadata(x, y, z), fortuneLevel);
            Iterator i = eff.iterator();

            while(i.hasNext()) {
                ItemStack item = (ItemStack)i.next();

                EntityItem eItem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, item);

                if(!worldObj.isRemote){
                    worldObj.spawnEntityInWorld(eItem);
                }

               //if there is an inventory then add them there

            }

            worldObj.setBlockToAir(x, y, z);

        }

    }

    public void  updateCoords(int x, int y, int z){

        //Mines until it touches bedrock or y =< 0
        if (y > 0 && !worldObj.getBlock(x, y - 1, z).equals(Blocks.bedrock)){

            y--;

        }else{

            y = this.yCoord - 1;

            if (x < maxX){

                x++;

            }else{

                x = this.xCoord - range;

                if (z > maxZ){

                    z--;

                }else{

                    isRunning = false;
                    isReady = true;

                }

            }

        }

        miningX = x;
        miningY = y;
        miningZ = z;

    }

    @Override
    public void updateEntity() {

        if (isRunning == false){
            isRunning = true;
            startQuarry();
        }

        timer++;

        if (timer == autoMinerSpeed && isReady == false){

            mineBlock(miningX, miningY, miningZ);
            updateCoords(miningX, miningY, miningZ);
            timer = 0;

        }

    }

}