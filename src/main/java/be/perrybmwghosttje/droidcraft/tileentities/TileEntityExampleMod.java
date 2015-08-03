package be.perrybmwghosttje.droidcraft.tileentities;

import be.perrybmwghosttje.droidcraft.references.ModReferences;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Kevin on 19/07/2015.
 */
public class TileEntityExampleMod extends TileEntity {

    protected ForgeDirection orientation;
    protected byte state;

    public TileEntityExampleMod()
    {
        orientation = ForgeDirection.SOUTH;
        state = 0;
    }

    public ForgeDirection getOrientation()
    {
        return orientation;
    }

    public void setOrientation(ForgeDirection orientation)
    {
        this.orientation = orientation;
    }

    public void setOrientation(int orientation)
    {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    public short getState()
    {
        return state;
    }

    public void setState(byte state)
    {
        this.state = state;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(ModReferences.NBT.DIRECTION))
        {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(ModReferences.NBT.DIRECTION));
        }

        if (nbtTagCompound.hasKey(ModReferences.NBT.STATE))
        {
            this.state = nbtTagCompound.getByte(ModReferences.NBT.STATE);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte(ModReferences.NBT.DIRECTION, (byte) orientation.ordinal());
        nbtTagCompound.setByte(ModReferences.NBT.STATE, state);
    }
}
