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

public class CustomArmorMaterials {

	public static class EssentiallyOpalMaterials {

		public static final Holder<ArmorMaterial> OPAL;

		static {
			OPAL = register("opal", createMap(new int[] { 2, 7, 5, 2 }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f,
					() -> Ingredient.of(CustomTags.OPAL));
		}

		private static EnumMap<Type, Integer> createMap(int[] values) {
			EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
			for (int i = 0; i < values.length; i++)
				enumMap.put(Type.values()[i], values[i]);
			return enumMap;
		}

		private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
				Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
			ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallyopal", name);
			List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

			return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
					new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
		}

	}

	public static class EssentiallySapphireMaterials {

		public static final Holder<ArmorMaterial> SAPPHIRE;

		static {
			SAPPHIRE = register("sapphire", createMap(new int[] { 2, 7, 5, 2 }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f,
					() -> Ingredient.of(CustomTags.SAPPHIRE));
		}

		private static EnumMap<Type, Integer> createMap(int[] values) {
			EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
			for (int i = 0; i < values.length; i++)
				enumMap.put(Type.values()[i], values[i]);
			return enumMap;
		}

		private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
				Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
			ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallysapphire", name);
			List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

			return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
					new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
		}

	}

	public static class EssentiallyRubyMaterials {

		public static final Holder<ArmorMaterial> RUBY;

		static {
			RUBY = register("ruby", createMap(new int[] { 2, 7, 5, 2 }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f,
					() -> Ingredient.of(CustomTags.OPAL));
		}

		private static EnumMap<Type, Integer> createMap(int[] values) {
			EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
			for (int i = 0; i < values.length; i++)
				enumMap.put(Type.values()[i], values[i]);
			return enumMap;
		}

		private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
				Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
			ResourceLocation location = ResourceLocation.fromNamespaceAndPath("essentiallyruby", name);
			List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

			return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
					new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
		}
	}
}