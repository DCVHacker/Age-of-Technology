package ru.dcv_hacker.aot.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import ru.dcv_hacker.aot.aotCore;
import ru.dcv_hacker.aot.gui.GuiHandler;
import ru.dcv_hacker.aot.event.EventsHandler;
import ru.dcv_hacker.aot.register.RegBlocks;
import ru.dcv_hacker.aot.register.RegItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new EventsHandler());
        RegBlocks.register();
        RegItems.register();
    }

    public void init(FMLInitializationEvent e)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(aotCore.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
