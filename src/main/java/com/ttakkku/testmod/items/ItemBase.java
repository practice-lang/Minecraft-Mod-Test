package com.ttakkku.testmod.items;

import com.ttakkku.testmod.init.Moditems;
import com.ttakkku.testmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
	}
	
	
	public void registerModels() {
		
	}

}
