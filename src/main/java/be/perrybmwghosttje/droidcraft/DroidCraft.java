package be.perrybmwghosttje.droidcraft;

import be.perrybmwghosttje.droidcraft.core.init.Blocks;
import be.perrybmwghosttje.droidcraft.core.init.Items;
import be.perrybmwghosttje.droidcraft.handlers.GuiHandler;
import be.perrybmwghosttje.droidcraft.proxies.IProxy;
import be.perrybmwghosttje.droidcraft.references.ModReferences;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = ModReferences.MOD_ID, version = ModReferences.VERSION)
public class DroidCraft
{
    @Mod.Instance(ModReferences.MOD_ID)
    public static DroidCraft instance;

    @SidedProxy(clientSide = ModReferences.Proxies.CLIENT_PROXY_CLASS, serverSide = ModReferences.Proxies.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Blocks.init();
        Items.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        proxy.initRenderingAndTextures();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
