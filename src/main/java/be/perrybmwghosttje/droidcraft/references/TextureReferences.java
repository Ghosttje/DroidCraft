package be.perrybmwghosttje.droidcraft.references;

import be.perrybmwghosttje.droidcraft.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kevin on 16/07/2015.
 */
public final class TextureReferences {

    public static final String RESOURCE_PREFIX = ModReferences.LOWERCASE_MOD_ID + ":";

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
        public static final ResourceLocation WIRLESSCHARGER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "wirelesscharger.png");
        public static final ResourceLocation ENGINE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "engine.png");
        public static final ResourceLocation DYNAMO = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "dynamo.png");
        public static final ResourceLocation AUTOMINER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "autominer.png");
		public static final ResourceLocation DROID = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "droid.png");
    }

    public static final class Gui
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/gui/";
        private static final String MODEL_TEXTURE_ELEMENTS_LOCATION = MODEL_TEXTURE_LOCATION + "elements/";
        public static final ResourceLocation UPGRADESLOT = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_ELEMENTS_LOCATION + "upgradeslot.png");
        public static final ResourceLocation ENGINE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "blankgui.png");
        public static final ResourceLocation DYNAMO = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "generatorgui.png");
		public static final ResourceLocation ENGINE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "enginegui.png");
    }

    public static final class Items
    {
        public static final String UPGRADES = "upgrades/";
    }
}
