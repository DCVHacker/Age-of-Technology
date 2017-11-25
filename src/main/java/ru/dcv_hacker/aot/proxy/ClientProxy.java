package ru.dcv_hacker.aot.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.dcv_hacker.aot.register.RegBlocks;
import ru.dcv_hacker.aot.register.RegItems;
import ru.dcv_hacker.aot.register.RegKeys;

public class ClientProxy extends CommonProxy
{

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        RegKeys.register();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        RegBlocks.registerRender();
        RegItems.registerRender();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

}
