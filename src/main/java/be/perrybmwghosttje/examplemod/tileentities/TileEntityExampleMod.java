package be.perrybmwghosttje.examplemod.tileentities;

import be.perrybmwghosttje.examplemod.references.ModReferences;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.UsernameCache;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.UUID;

/**
 * Created by Kevin on 19/07/2015.
 */
public class TileEntityExampleMod extends TileEntity {

    protected ForgeDirection orientation;
    protected byte state;
    protected String customName;

    public TileEntityExampleMod()
    {
        orientation = ForgeDirection.SOUTH;
        state = 0;
        customName = "";
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

    public String getCustomName()
    {
        return customName;
    }

    public void setCustomName(String customName)
    {
        this.customName = customName;
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

        if (nbtTagCompound.hasKey(ModReferences.NBT.CUSTOM_NAME))
        {
            this.customName = nbtTagCompound.getString(ModReferences.NBT.CUSTOM_NAME);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte(ModReferences.NBT.DIRECTION, (byte) orientation.ordinal());
        nbtTagCompound.setByte(ModReferences.NBT.STATE, state);

        if (this.hasCustomName())
        {
            nbtTagCompound.setString(ModReferences.NBT.CUSTOM_NAME, customName);
        }
    }

    public boolean hasCustomName()
    {
        return customName != null && customName.length() > 0;
    }
}
