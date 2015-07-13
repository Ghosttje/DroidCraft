package be.perrybmwghosttje.examplemod;

import be.perrybmwghosttje.examplemod.core.init.ModBlocks;
import be.perrybmwghosttje.examplemod.core.init.ModItems;
import be.perrybmwghosttje.examplemod.reference.ModReference;
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

//    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
//    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
