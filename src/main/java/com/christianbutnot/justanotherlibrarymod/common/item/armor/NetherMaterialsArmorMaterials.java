package com.christianbutnot.justanotherlibrarymod.common.item.armor;

import java.util.EnumMap;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class NetherMaterialsArmorMaterials {
	public static final ArmorMaterial SCORCHED_ARMOR_MATERIAL;
	public static final ArmorMaterial CRYSTAL_ARMOR_MATERIAL;
	public static final ArmorMaterial INFERNO_ARMOR_MATERIAL;

	private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection,
			int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness,
			float knockbackResistance) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("nethermaterials", name);
		ResourceKey<EquipmentAsset> layers = ResourceKey.create(EquipmentAssets.ROOT_ID, location);
		EnumMap<ArmorType, Integer> typeMap = new EnumMap(ArmorType.class);
		ArmorType[] var11 = ArmorType.values();
		int var12 = var11.length;

		for (int var13 = 0; var13 < var12; ++var13) {
			ArmorType type = var11[var13];
			typeMap.put(type, (Integer) typeProtection.get(type));
		}

		return new ArmorMaterial(durability, typeMap, enchantmentValue, equipSound, toughness, knockbackResistance,
				ingredient, layers);
	}

	static {
		SCORCHED_ARMOR_MATERIAL = register("scorched", 15, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 2);
			map.put(ArmorType.LEGGINGS, 5);
			map.put(ArmorType.CHESTPLATE, 6);
			map.put(ArmorType.HELMET, 2);
			map.put(ArmorType.BODY, 5);
		}), 18, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.SCORCHED, 1.0F, 0.0F);
		CRYSTAL_ARMOR_MATERIAL = register("crystal", 33, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 6);
			map.put(ArmorType.CHESTPLATE, 8);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 15, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.CRYSTAL, 1.0F, 0.0F);
		INFERNO_ARMOR_MATERIAL = register("inferno", 33, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 5);
			map.put(ArmorType.CHESTPLATE, 7);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 25, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.INFERNO, 1.0F, 0.0F);
	}
}