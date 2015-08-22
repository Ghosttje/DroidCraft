package be.perrybmwghosttje.droidcraft.tileentities;

import be.perrybmwghosttje.droidcraft.tileentities.base.TileEntityBase;
import be.perrybmwghosttje.droidcraft.util.InventoryHelper;
import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ChatComponentText;
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

    public long minedBlocks;

    public boolean isRunning = false;
    public boolean isReady = false;

    public void startQuarry(){

        miningX = this.xCoord - range;
        miningY = this.yCoord - 1;
        miningZ = this.zCoord + range;

        maxX = this.xCoord + range;
        maxZ = this.zCoord - range;

        minedBlocks = 0;

    }

    public void mineBlock(int x, int y, int z) {

        if (!worldObj.isAirBlock(x, y, z) && !worldObj.getBlock(x, y, z).equals(Blocks.bedrock) && !worldObj.getBlock(x, y, z).equals(changeBlockWith)) {

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

            minedBlocks++;

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

    public void writeChatMessage(EntityPlayer player){

        if (isReady == false){

            player.addChatMessage(new ChatComponentText("Auto miner already mined"));
            player.addChatMessage(new ChatComponentText(Long.toString(minedBlocks, 10) + " blocks"));

        }else{

            player.addChatMessage(new ChatComponentText("Auto miner has finished"));

        }

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

    //need to fix nbt help!!!!

    protected void writeEntityToNBT(NBTTagCompound nbt){

        super.writeToNBT(nbt);

        nbt.setInteger("miningX", miningX);

    }

    protected void readEntityFromNBT(NBTTagCompound nbt){

        super.readFromNBT(nbt);

        this.miningX = nbt.getInteger("miningX");


    }

}