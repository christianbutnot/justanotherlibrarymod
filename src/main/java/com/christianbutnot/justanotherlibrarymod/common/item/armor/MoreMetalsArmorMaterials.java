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
public class MoreMetalsArmorMaterials {
	   public static final ArmorMaterial COPPER_ARMOR_MATERIAL;
	   public static final ArmorMaterial TIN_ARMOR_MATERIAL;
	   public static final ArmorMaterial BRONZE_ARMOR_MATERIAL;
	   public static final ArmorMaterial ALUMINUM_ARMOR_MATERIAL;
	   public static final ArmorMaterial NICKEL_ARMOR_MATERIAL;
	   public static final ArmorMaterial SILVER_ARMOR_MATERIAL;
	   public static final ArmorMaterial LEAD_ARMOR_MATERIAL;
	   public static final ArmorMaterial ZINC_ARMOR_MATERIAL;
	   public static final ArmorMaterial ELECTRUM_ARMOR_MATERIAL;
	   public static final ArmorMaterial STEEL_ARMOR_MATERIAL;

	   private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection, int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
	      ResourceLocation location = ResourceLocation.fromNamespaceAndPath("moremetals", name);
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
	      COPPER_ARMOR_MATERIAL = register("copper", 15, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 1);
	         map.put(ArmorType.LEGGINGS, 3);
	         map.put(ArmorType.CHESTPLATE, 5);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 14, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.COPPER, 0.0F, 0.0F);
	      TIN_ARMOR_MATERIAL = register("tin", 15, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 3);
	         map.put(ArmorType.CHESTPLATE, 5);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 14, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.TIN, 0.0F, 0.0F);
	      BRONZE_ARMOR_MATERIAL = register("bronze", 15, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 3);
	         map.put(ArmorType.CHESTPLATE, 5);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 14, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.BRONZE, 0.0F, 0.0F);
	      ALUMINUM_ARMOR_MATERIAL = register("aluminum", 15, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 3);
	         map.put(ArmorType.CHESTPLATE, 5);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 14, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.ALUMINUM, 0.0F, 0.0F);
	      NICKEL_ARMOR_MATERIAL = register("nickel", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 6);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 20, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.NICKEL, 0.0F, 0.0F);
	      SILVER_ARMOR_MATERIAL = register("silver", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 6);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 25, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.SILVER, 0.5F, 0.0F);
	      LEAD_ARMOR_MATERIAL = register("lead", 33, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 6);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 12, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.LEAD, 1.0F, 0.0F);
	      ZINC_ARMOR_MATERIAL = register("zinc", 33, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 6);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 12, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.ZINC, 0.5F, 0.0F);
	      ELECTRUM_ARMOR_MATERIAL = register("electrum", 33, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 2);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 7);
	         map.put(ArmorType.HELMET, 2);
	         map.put(ArmorType.BODY, 5);
	      }), 25, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.ELECTRUM, 0.0F, 0.0F);
	      STEEL_ARMOR_MATERIAL = register("steel", 37, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
	         map.put(ArmorType.BOOTS, 3);
	         map.put(ArmorType.LEGGINGS, 5);
	         map.put(ArmorType.CHESTPLATE, 7);
	         map.put(ArmorType.HELMET, 3);
	         map.put(ArmorType.BODY, 5);
	      }), 12, SoundEvents.ARMOR_EQUIP_GOLD, CustomTags.STEEL, 1.0F, 0.0F);
	   }
	}