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
public class ResourcefulArmorMaterials {
	public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL;
	public static final ArmorMaterial REDSTONE_ARMOR_MATERIAL;
	public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL;
	public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL;
	public static final ArmorMaterial REFORGED_OBSIDIAN_ARMOR_MATERIAL;
	public static final ArmorMaterial BLAZING_ARMOR_MATERIAL;
	public static final ArmorMaterial EMERALD_ARMOR_MATERIAL;

	private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection,
			int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness,
			float knockbackResistance) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("resourceful", name);
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
		AMETHYST_ARMOR_MATERIAL = register("amethyst", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 1);
			map.put(ArmorType.LEGGINGS, 3);
			map.put(ArmorType.CHESTPLATE, 5);
			map.put(ArmorType.HELMET, 1);
			map.put(ArmorType.BODY, 5);
		}), 22, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.AMETHYST, 0.5F, 0.0F);
		REDSTONE_ARMOR_MATERIAL = register("redstone", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 2);
			map.put(ArmorType.LEGGINGS, 3);
			map.put(ArmorType.CHESTPLATE, 5);
			map.put(ArmorType.HELMET, 2);
			map.put(ArmorType.BODY, 5);
		}), 11, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.REDSTONE, 0.0F, 0.0F);
		QUARTZ_ARMOR_MATERIAL = register("quartz", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 2);
			map.put(ArmorType.LEGGINGS, 4);
			map.put(ArmorType.CHESTPLATE, 5);
			map.put(ArmorType.HELMET, 2);
			map.put(ArmorType.BODY, 5);
		}), 21, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.QUARTZ, 0.0F, 0.0F);
		OBSIDIAN_ARMOR_MATERIAL = register("obsidian", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 6);
			map.put(ArmorType.CHESTPLATE, 8);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 12, SoundEvents.ARMOR_EQUIP_NETHERITE, CustomTags.REFORGED_OBSIDIAN, 1.0F, 1.0F);
		REFORGED_OBSIDIAN_ARMOR_MATERIAL = register("reforged_obsidian", 25,
				(EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
					map.put(ArmorType.BOOTS, 3);
					map.put(ArmorType.LEGGINGS, 6);
					map.put(ArmorType.CHESTPLATE, 8);
					map.put(ArmorType.HELMET, 3);
					map.put(ArmorType.BODY, 5);
				}), 7, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.OBSIDIAN, 0.5F, 0.0F);
		BLAZING_ARMOR_MATERIAL = register("blazing", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 5);
			map.put(ArmorType.CHESTPLATE, 7);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.BLAZING, 0.0F, 0.0F);
		EMERALD_ARMOR_MATERIAL = register("emerald", 25, (EnumMap) Util.make(new EnumMap(ArmorType.class), (map) -> {
			map.put(ArmorType.BOOTS, 3);
			map.put(ArmorType.LEGGINGS, 5);
			map.put(ArmorType.CHESTPLATE, 7);
			map.put(ArmorType.HELMET, 3);
			map.put(ArmorType.BODY, 5);
		}), 19, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.EMERALD, 0.0F, 0.0F);
	}
}