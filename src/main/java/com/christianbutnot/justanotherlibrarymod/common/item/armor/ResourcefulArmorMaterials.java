package com.christianbutnot.justanotherlibrarymod.common.item.armor;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ResourcefulArmorMaterials {

	public static final Holder<ArmorMaterial> BLAZING, OBSIDIAN, QUARTZ, EMERALD, REDSTONE, AMETHYST;

	static {
		AMETHYST = register("amethyst", createMap(new int[] { 1, 5, 3, 1 }), 22, SoundEvents.ARMOR_EQUIP_NETHERITE,
				0.5f, 0f, () -> Ingredient.of(Items.AMETHYST_SHARD));
	}
	static {
		REDSTONE = register("redstone", createMap(new int[] { 2, 5, 3, 2 }), 11, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f,
				0f, () -> Ingredient.of(Items.REDSTONE));
	}
	static {
		QUARTZ = register("quartz", createMap(new int[] { 2, 5, 4, 2 }), 21, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f,
				() -> Ingredient.of(Items.QUARTZ));
	}
	static {
		OBSIDIAN = register("obsidian", createMap(new int[] { 3, 8, 6, 3 }), 7, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f,
				0f, () -> Ingredient.of(Items.OBSIDIAN));
	}
	static {
		BLAZING = register("blazing", createMap(new int[] { 3, 7, 5, 3 }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f,
				0f, () -> Ingredient.of(Items.BLAZE_ROD));
	}
	static {
		EMERALD = register("emerald", createMap(new int[] { 3, 7, 5, 3 }), 19, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f,
				0f, () -> Ingredient.of(Items.EMERALD));
	}

	private static EnumMap<Type, Integer> createMap(int[] values) {
		EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
		for (int i = 0; i < values.length; i++)
			enumMap.put(Type.values()[i], values[i]);
		return enumMap;
	}

	private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
			Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("resourceful", name);
		List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

		return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
				new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
	}
}