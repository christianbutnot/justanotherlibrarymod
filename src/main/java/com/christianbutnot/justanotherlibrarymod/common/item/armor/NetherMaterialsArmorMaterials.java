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

public class NetherMaterialsArmorMaterials {

	public static final Holder<ArmorMaterial> SCORCHED, CRYSTAL, INFERNO;

    static {
    	SCORCHED = register("scorched", createMap(new int[]{2, 6, 5, 2}),
                18, SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(CustomTags.SCORCHED));
    }
    static {
    	CRYSTAL = register("crystal", createMap(new int[]{3, 8, 6, 3}),
                15, SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(CustomTags.CRYSTAL));
    }
    static {
    	INFERNO = register("inferno", createMap(new int[]{3, 7, 5, 3}),
                25, SoundEvents.ARMOR_EQUIP_IRON, 2f, 0f, () -> Ingredient.of(CustomTags.INFERNO));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
    	ResourceLocation location = ResourceLocation.fromNamespaceAndPath("nethermaterials", name);
    	List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));
    	
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location, new ArmorMaterial(defense, i, holder, supplier, layers, f, g));
    }
}
