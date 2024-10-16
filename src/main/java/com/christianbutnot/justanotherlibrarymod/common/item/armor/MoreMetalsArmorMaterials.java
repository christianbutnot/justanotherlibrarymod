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
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class MoreMetalsArmorMaterials {
	
	public static final Holder<ArmorMaterial> COPPER, TIN, BRONZE, ALUMINUM, NICKEL, SILVER, LEAD, ZINC, STEEL, ELECTRUM;
	
	static {
        COPPER = register("copper", createMap(new int[]{2, 5, 3, 1}),
                14, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT));
    }
    
    static {
        TIN = register("tin", createMap(new int[]{2, 5, 3, 2}),
                16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(CustomTags.TIN));
    }
    
    static {
        BRONZE = register("bronze", createMap(new int[]{2, 5, 3, 2}),
                16, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(CustomTags.BRONZE));
    }
    
    static {
        ALUMINUM = register("aluminum", createMap(new int[]{2, 5, 3, 2}),
                8, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.ALUMINUM));
    }
    
    static {
        NICKEL = register("nickel", createMap(new int[]{2, 6, 5, 2}),
                20, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.NICKEL));
    }
    
    static {
        SILVER = register("silver", createMap(new int[]{2, 6, 5, 2}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.SILVER));
    }
    static {
        LEAD = register("lead", createMap(new int[]{3, 6, 5, 2}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.LEAD));
    }
    static {
        ZINC = register("zinc", createMap(new int[]{2, 6, 5, 2}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.ZINC));
    }
    static {
        ELECTRUM = register("electrum", createMap(new int[]{2, 7, 5, 2}),
                25, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.ELECTRUM));
    }
    static {
        STEEL = register("steel", createMap(new int[]{3, 7, 5, 3}),
                12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5f, 0f, () -> Ingredient.of(CustomTags.STEEL));
    }
	

	private static EnumMap<Type, Integer> createMap(int[] values) {
		EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
		for (int i = 0; i < values.length; i++)
			enumMap.put(Type.values()[i], values[i]);
		return enumMap;
	}

	private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i,
			Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
		ResourceLocation location = ResourceLocation.fromNamespaceAndPath("moremetals", name);
		List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

		return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
				new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
	}
}