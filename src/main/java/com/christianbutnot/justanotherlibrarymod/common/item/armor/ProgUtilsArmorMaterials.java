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
public class ProgUtilsArmorMaterials {
	public static final ArmorMaterial AQUATIC_ARMOR_MATERIAL;
	public static final ArmorMaterial WITHERED_ARMOR_MATERIAL;
	public static final ArmorMaterial DRAGONBORN_ARMOR_MATERIAL;
	public static final ArmorMaterial BROKONIUM_ARMOR_MATERIAL;

	private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection,
			int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness,
			float knockbackResistance) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("progressionutils", name);
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
		AQUATIC_ARMOR_MATERIAL = register("aquatic", 33, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 6);
			map.put(ArmorType.CHESTPLATE, 8);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 25, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.AQUATIC, 0.0F, 0.0F);
		WITHERED_ARMOR_MATERIAL = register("withered", 48, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 6);
			map.put(ArmorType.CHESTPLATE, 8);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 9, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.WITHERED, 2.0F, 0.2F);
		DRAGONBORN_ARMOR_MATERIAL = register("dragonborn", 66,
				(EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
					map.put(ArmorType.BOOTS, 3);
					map.put(ArmorType.LEGGINGS, 6);
					map.put(ArmorType.CHESTPLATE, 8);
					map.put(ArmorType.HELMET, 3);
					map.put(ArmorType.BODY, 5);
				}), 9, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.DRAGONBORN, 2.0F, 0.2F);
		BROKONIUM_ARMOR_MATERIAL = register("brokonium", 110, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 4);
			map.put(ArmorType.LEGGINGS, 6);
			map.put(ArmorType.CHESTPLATE, 8);
			map.put(ArmorType.HELMET, 4);
			map.put(ArmorType.BODY, 5);
		}), 15, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.BROKONIUM, 2.0F, 1.0F);
	}
}