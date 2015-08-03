package be.perrybmwghosttje.droidcraft.references;

/**
 * Created by Kevin on 13/07/2015.
 */
public final class ModReferences {

    public static final String MOD_ID = "droidcraft";
    public static final String LOWERCASE_MOD_ID = MOD_ID.toLowerCase();
    public static final String VERSION = "1.0";

    public static class Proxies
    {
        public static final String SERVER_PROXY_CLASS = "be.perrybmwghosttje.droidcraft.proxies.ServerProxy";
        public static final String CLIENT_PROXY_CLASS = "be.perrybmwghosttje.droidcraft.proxies.ClientProxy";
    }

    public static class NBT
    {
        public static final String STATE = "teState";
        public static final String DIRECTION = "teDirection";
    }
}
