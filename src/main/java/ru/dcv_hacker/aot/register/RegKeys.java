package ru.dcv_hacker.aot.register;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class RegKeys
{
    private static final String catergory = "The My KeyBinds for Mcmodding";
    public static final KeyBinding
            opengui = new KeyBinding("key.first", Keyboard.KEY_F, catergory),
            MY_KEY_SECOND = new KeyBinding("key.second", Keyboard.KEY_DELETE, catergory);

    public static void register()
    {
        setRegister(opengui);
        setRegister(MY_KEY_SECOND);
    }

    private static void setRegister(KeyBinding binding)
    {
        ClientRegistry.registerKeyBinding(binding);
    }
}
