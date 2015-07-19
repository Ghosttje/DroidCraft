package be.perrybmwghosttje.examplemod.references;

/**
 * Created by Kevin on 13/07/2015.
 */
public final class ModReferences {

    public static final String MOD_ID = "examplemod";
    public static final String LOWERCASE_MOD_ID = MOD_ID.toLowerCase();
    public static final String VERSION = "1.0";

    public static class Proxies
    {
        public static final String SERVER_PROXY_CLASS = "be.perrybmwghosttje.examplemod.proxies.ServerProxy";
        public static final String CLIENT_PROXY_CLASS = "be.perrybmwghosttje.examplemod.proxies.ClientProxy";
    }

    public static class NBT
    {
        public static final String ITEMS = "Items";
        public static final String ITEM_TRANSMUTATION_KNOWLEDGE = "transmutationKnowledge";
        public static final String CHARGE_LEVEL = "chargeLevel";
        public static final String MODE = "mode";
        public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
        public static final String TRANSMUTATION_GUI_OPEN = "transmutationGuiOpen";
        public static final String ALCHEMICAL_BAG_GUI_OPEN = "alchemicalBagGuiOpen";
        public static final String UUID_MOST_SIG = "UUIDMostSig";
        public static final String UUID_LEAST_SIG = "UUIDLeastSig";
        public static final String DISPLAY = "display";
        public static final String COLOR = "color";
        public static final String STATE = "teState";
        public static final String CUSTOM_NAME = "CustomName";
        public static final String DIRECTION = "teDirection";
    }
}
