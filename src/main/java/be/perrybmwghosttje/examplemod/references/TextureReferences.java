package be.perrybmwghosttje.examplemod.references;

import be.perrybmwghosttje.examplemod.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kevin on 16/07/2015.
 */
public final class TextureReferences {

    public static final String RESOURCE_PREFIX = ModReferences.LOWERCASE_MOD_ID + ":";

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
        public static final ResourceLocation ENGINE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "engine.png");
    }
}
