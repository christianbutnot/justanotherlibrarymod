package com.christianbutnot.justanotherlibrarymod.common.item.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;

public class ArmorItem extends Item {

	public ArmorItem(ArmorMaterial material, ArmorType armorType, Item.Properties properties) {
        super(properties.humanoidArmor(material, armorType));
    }
	
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
    }
}