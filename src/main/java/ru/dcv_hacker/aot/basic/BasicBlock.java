package ru.dcv_hacker.aot.basic;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import ru.dcv_hacker.aot.aotCore;


public class BasicBlock extends Block {

	public BasicBlock(final Material materialIn, final String name, float hardness,float resistanse, SoundType soundtype) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setSoundType(soundtype);
		this.setHardness(hardness);
		this.setResistance(resistanse);
		this.setCreativeTab(aotCore.CTAB);
	}
}