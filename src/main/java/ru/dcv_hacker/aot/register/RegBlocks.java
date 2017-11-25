package ru.dcv_hacker.aot.register;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ru.dcv_hacker.aot.blocks.BlockCoreSmelter;

public class RegBlocks
{
    public static Block blockcoresmelter = new BlockCoreSmelter(Material.ROCK, "blockcoresmelter", 3F, 3F, SoundType.STONE);


    public static void register()
    {
        registerBlock(blockcoresmelter);
    }

    public static void registerRender()
    {
        registerRenderBlock(blockcoresmelter);
    }

    public static void registerBlock(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    public static void registerRenderBlock(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
