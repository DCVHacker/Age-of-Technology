package ru.dcv_hacker.aot.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import ru.dcv_hacker.aot.aotCore;
import ru.dcv_hacker.aot.register.RegKeys;

public class EventsHandler
{
    @SubscribeEvent
    public void onTick(TickEvent e)
    {
        Minecraft mc = Minecraft.getMinecraft();
        if(RegKeys.opengui.isPressed())
        {
            mc.player.openGui(aotCore.instance, 0, mc.player.world, (int) mc.player.posX, (int) mc.player.posY, (int) mc.player.posZ);
        }
    }
}
