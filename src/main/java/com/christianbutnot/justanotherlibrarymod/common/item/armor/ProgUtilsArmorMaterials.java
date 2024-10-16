package com.christianbutnot.justanotherlibrarymod.common.item.armor;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ProgUtilsArmorMaterials {
	
	public static final Holder<ArmorMaterial> AQUATIC, WITHERED, DRAGONBORN, BROKONIUM;
	
	static {
		AQUATIC = register("aquatic", createMap(new int[] { 3, 8, 6, 3 }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f,
				0f, () -> Ingredient.of(CustomTags.AQUATIC));
	}

	static {
		WITHERED = register("withered", createMap(new int[] { 3, 8, 6, 3 }), 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 2f,
				0.2f, () -> Ingredient.of(CustomTags.WITHERED));
	}

	static {
		DRAGONBORN = register("dragonborn", createMap(new int[] { 3, 8, 6, 3 }), 9, SoundEvents.ARMOR_EQUIP_NETHERITE,
				2f, 0.2f, () -> Ingredient.of(CustomTags.DRAGONBORN));
	}

	static {
		BROKONIUM = register("brokonium", createMap(new int[] { 4, 8, 6, 4 }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
				2f, 1.0f, () -> Ingredient.of(CustomTags.BROKONIUM));
	}

	private static EnumMap<Type, Integer> createMap(int[] values) {
		EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
		for (int i = 0; i < values.length; i++)
			enumMap.put(Type.values()[i], values[i]);
		return enumMap;
	}

	private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
			Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("progressionutils", name);
		List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

		return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
				new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
	}
}