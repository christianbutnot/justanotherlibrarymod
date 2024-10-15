package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

public class CustomShearsItem extends ShearsItem {

	public CustomShearsItem(Properties p_43074_) {
		super(p_43074_);
	}
	
	@Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
