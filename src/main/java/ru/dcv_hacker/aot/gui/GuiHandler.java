package ru.dcv_hacker.aot.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import ru.dcv_hacker.aot.basic.BasicGui;

public class GuiHandler implements IGuiHandler
{
    public static final int Gui1 = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Gui1)
            return new BasicGui();
        return null;
    }
}
