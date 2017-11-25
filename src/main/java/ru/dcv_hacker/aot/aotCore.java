package ru.dcv_hacker.aot;

import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.dcv_hacker.aot.proxy.CommonProxy;


@Mod(modid = aotCore.MODID, name = aotCore.NAME, version = aotCore.VERSION)
public class aotCore
{
    public static final String
            MODID = "aot",
            NAME = "Age of Technology",
            VERSION = "0.0.1";

    @Instance
    public static aotCore instance = new aotCore();

    @SidedProxy(clientSide = "ru.dcv_hacker.aot.proxy.ClientProxy", serverSide = "ru.dcv_hacker.aot.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Преинициализация
        System.out.println("\u001B[32m" + "[Starting AoT PRE-INITIALIZATION]" + "\u001B[0m");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting AoT INITIALIZATION]" + "\u001B[0m");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Инициализация
        System.out.println("\u001B[32m" + "[Starting AoT POST-INITIALIZATION]" + "\u001B[0m");
        proxy.postInit(event);
    }

    public static final CreativeTabs CTAB = new CreativeTabs("aottab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.APPLE);
        }
    };
}
