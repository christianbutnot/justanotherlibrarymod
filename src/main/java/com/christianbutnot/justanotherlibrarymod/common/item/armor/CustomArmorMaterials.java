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

public class CustomArmorMaterials {
	   public static class EssentiallyRubyMaterials {
		      public static final ArmorMaterial RUBY_ARMOR_MATERIAL;

		      private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection, int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
		         ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallyruby", name);
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
		         RUBY_ARMOR_MATERIAL = register("ruby", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
		            map.put(ArmorType.BOOTS, 3);
		            map.put(ArmorType.LEGGINGS, 5);
		            map.put(ArmorType.CHESTPLATE, 7);
		            map.put(ArmorType.HELMET, 3);
		            map.put(ArmorType.BODY, 5);
		         }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.RUBY, 0.0F, 0.0F);
		      }
		   }

		   public static class EssentiallySapphireMaterials {
		      public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL;

		      private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection, int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
		         ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallysapphire", name);
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
		         SAPPHIRE_ARMOR_MATERIAL = register("sapphire", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
		            map.put(ArmorType.BOOTS, 3);
		            map.put(ArmorType.LEGGINGS, 5);
		            map.put(ArmorType.CHESTPLATE, 7);
		            map.put(ArmorType.HELMET, 3);
		            map.put(ArmorType.BODY, 5);
		         }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.SAPPHIRE, 0.0F, 0.0F);
		      }
		   }

		   public static class EssentiallyOpalMaterials {
		      public static final ArmorMaterial OPAL_ARMOR_MATERIAL;

		      private static ArmorMaterial register(String name, int durability, EnumMap<ArmorType, Integer> typeProtection, int enchantmentValue, Holder<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
		         ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallyopal", name);
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
		         OPAL_ARMOR_MATERIAL = register("opal", 25, (EnumMap)Util.make(new EnumMap(ArmorType.class), (map) -> {
		            map.put(ArmorType.BOOTS, 3);
		            map.put(ArmorType.LEGGINGS, 5);
		            map.put(ArmorType.CHESTPLATE, 7);
		            map.put(ArmorType.HELMET, 3);
		            map.put(ArmorType.BODY, 5);
		         }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, CustomTags.OPAL, 0.0F, 0.0F);
		      }
		   }
		}