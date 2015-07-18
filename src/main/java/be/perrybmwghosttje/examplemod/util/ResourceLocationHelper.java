package be.perrybmwghosttje.examplemod.util;

import be.perrybmwghosttje.examplemod.references.ModReferences;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kevin on 16/07/2015.
 */
public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(ModReferences.LOWERCASE_MOD_ID, path);
    }
}
