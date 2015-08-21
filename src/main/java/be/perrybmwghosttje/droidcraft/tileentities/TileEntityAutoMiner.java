package be.perrybmwghosttje.droidcraft.tileentities;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityBase;
import be.perrybmwghosttje.droidcraft.util.InventoryHelper;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
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

    public Block changeBlockWith = Blocks.cobblestone;

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

        if (!worldObj.isAirBlock(x, y, z) && !worldObj.getBlock(x, y, z).equals(Blocks.bedrock)) {

            ArrayList eff = worldObj.getBlock(x, y, z).getDrops(worldObj, x, y, z, worldObj.getBlockMetadata(x, y, z), fortuneLevel) ;
            Iterator i = eff.iterator();

            while(i.hasNext()) {

                ItemStack item = (ItemStack)i.next();

                TileEntity tileEntity = worldObj.getTileEntity(this.xCoord, this.yCoord + 1, this.zCoord);

                if(tileEntity instanceof TileEntityChest) {

                   InventoryHelper.addToInventory(((TileEntityChest) tileEntity), item);

                }else if(!worldObj.isRemote){

                    EntityItem eItem = new EntityItem(worldObj, this.xCoord + 0.5, this.yCoord + 1, this.zCoord + 0.5, item);
                    worldObj.spawnEntityInWorld(eItem);

                }

            }

            worldObj.setBlockToAir(x, y, z);

            worldObj.setBlock(x, y, z, changeBlockWith);

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

        //If redstone signal is false then it will mine else it will not
        boolean redstone = false;
        for(ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS) {
            int redstoneSide = worldObj.getIndirectPowerLevelTo(this.xCoord + dir.offsetX, this.yCoord + dir.offsetY, this.zCoord + dir.offsetZ, dir.ordinal());
            if(redstoneSide > 0) {
                redstone = true;
                break;
            }
        }

        if (redstone == false) {

            if (isRunning == false) {
                isRunning = true;
                startQuarry();
            }

            timer++;

            if (timer == autoMinerSpeed && isReady == false) {

                mineBlock(miningX, miningY, miningZ);
                updateCoords(miningX, miningY, miningZ);
                timer = 0;

            }

        }

    }

    //need to fix nbt

    protected void writeEntityToNBT(NBTTagCompound nbt){

        super.writeToNBT(nbt);
        nbt.setInteger("miningX", miningX);
        nbt.setInteger("miningY", miningY);
        nbt.setInteger("miningZ", miningZ);
        nbt.setInteger("maxX", maxX);
        nbt.setInteger("maxZ", maxZ);

    }

    protected void readEntityFromNBT(NBTTagCompound nbt){

        super.readFromNBT(nbt);
        this.miningX = nbt.getInteger("miningX");
        this.miningY = nbt.getInteger("miningY");
        this.miningZ = nbt.getInteger("miningZ");
        this.maxX = nbt.getInteger("maxX");
        this.maxZ = nbt.getInteger("maxZ");

    }

}