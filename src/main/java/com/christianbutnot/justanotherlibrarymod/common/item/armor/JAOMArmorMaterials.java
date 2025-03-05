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

public class JAOMArmorMaterials {
	   public static final ArmorMaterial CHRONIUM_ARMOR_MATERIAL;
	   public static final ArmorMaterial ROSIUM_ARMOR_MATERIAL;
	   public static final ArmorMaterial LUCIUM_ARMOR_MATERIAL;
	   public static final ArmorMaterial MOCYLITE_ARMOR_MATERIAL;
	   public static final ArmorMaterial ENDERITE_ARMOR_MATERIAL;

	   private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection, int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
	      ResourceLocation location = ResourceLocation.fromNamespaceAndPath("justanotheroresmod", name);
	      ResourceKey<EquipmentAsset> layers = ResourceKey.create(EquipmentAssets.ROOT_ID, location);
	      EnumMap<ArmorType, Integer> typeMap = new EnumMap(ArmorType.class);
	      ArmorType[] var11 = ArmorType.values();
	      int var12 = var11.length;

	      for(int var13 = 0; var13 < var12; ++var13) {
	         ArmorType type = var11[var13];
	         typeMap.put(type, (Integer)typeProtection.get(type));
	      }

	      return new ArmorMaterial(durability, typeMap, enchantmentValue, equipSound, toughness, knockbackResistance, ingredient, layers);
	   }

	   static {
	      CHRONIUM_ARMOR_MATERIAL = register("chronium", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 3);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 6);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 8, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.CHRONIUM, 0.0F, 0.0F);
	      ROSIUM_ARMOR_MATERIAL = register("rosium", 33, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 3);
	         map.put(ArmorType.LEGGINGS, 6);
	         map.put(ArmorType.CHESTPLATE, 8);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 29, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.ROSIUM, 0.0F, 0.0F);
	      LUCIUM_ARMOR_MATERIAL = register("lucium", 33, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 3);
	         map.put(ArmorType.LEGGINGS, 6);
	         map.put(ArmorType.CHESTPLATE, 8);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 16, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.LUCIUM, 0.0F, 0.0F);
	      MOCYLITE_ARMOR_MATERIAL = register("mocylite", 39, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 3);
	         map.put(ArmorType.LEGGINGS, 6);
	         map.put(ArmorType.CHESTPLATE, 8);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.MOCYLITE, 3.0F, 0.5F);
	      ENDERITE_ARMOR_MATERIAL = register("enderite", 55, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 4);
	         map.put(ArmorType.LEGGINGS, 6);
	         map.put(ArmorType.CHESTPLATE, 8);
	         map.put(ArmorType.HELMET, 4);
	         map.put(ArmorType.BODY, 5);
	      }), 12, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.ENDERITE, 3.0F, 0.0F);
	   }
	}