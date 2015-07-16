package be.perrybmwghosttje.examplemod;

import be.perrybmwghosttje.examplemod.core.init.Blocks;
import be.perrybmwghosttje.examplemod.core.init.Items;
import be.perrybmwghosttje.examplemod.proxies.IProxy;
import be.perrybmwghosttje.examplemod.reference.ModReference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModReference.MOD_ID, version = ModReference.VERSION)
public class ExampleMod
{
    @Mod.Instance(ModReference.MOD_ID)
    public static ExampleMod instance;

    @SidedProxy(clientSide = ModReference.Proxies.CLIENT_PROXY_CLASS, serverSide = ModReference.Proxies.SERVER_PROXY_CLASS)
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
        proxy.initRenderingAndTextures();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
