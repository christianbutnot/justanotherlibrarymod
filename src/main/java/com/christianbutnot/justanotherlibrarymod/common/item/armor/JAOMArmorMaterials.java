package com.christianbutnot.justanotherlibrarymod.common.item.armor;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import com.christianbutnot.justanotherlibrarymod.Main;
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

public class JAOMArmorMaterials {

	public static final Holder<ArmorMaterial> CHRONIUM, ROSIUM, LUCIUM, MOCYLITE, ENDERITE;

    static {
        CHRONIUM = register("chronium", createMap(new int[]{3, 6, 5, 3}),
                8, SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.of(CustomTags.CHRONIUM));
    }
    static {
    	ROSIUM = register("rosium", createMap(new int[]{3, 8, 6, 3}),
                29, SoundEvents.ARMOR_EQUIP_DIAMOND, 2f, 0.2f, () -> Ingredient.of(CustomTags.ROSIUM));
    }
    static {
    	LUCIUM = register("lucium", createMap(new int[]{3, 8, 6, 3}),
                16, SoundEvents.ARMOR_EQUIP_DIAMOND, 3f, 0f, () -> Ingredient.of(CustomTags.LUCIUM));
    }
    static {
    	MOCYLITE = register("mocylite", createMap(new int[]{3, 8, 6, 3}),
                10, SoundEvents.ARMOR_EQUIP_DIAMOND, 3f, 0.5f, () -> Ingredient.of(CustomTags.MOCYLITE));
    }
    static {
    	ENDERITE = register("enderite", createMap(new int[]{4, 8, 6, 4}),
                12, SoundEvents.ARMOR_EQUIP_DIAMOND, 3f, 0.0f, () -> Ingredient.of(CustomTags.ENDERITE));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
    	ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Main.MODID, name);
    	List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));
    	
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location, new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
    }
}