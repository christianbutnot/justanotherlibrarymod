package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.function.Supplier;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum CustomTiersEnum implements Tier { 
	
	WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(ItemTags.PLANKS)),
    STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    AMETHYST(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 11.0F, 2.0F, 21, () -> Ingredient.of(Items.AMETHYST_SHARD)),
	REDSTONE(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 11, () -> Ingredient.of(Items.REDSTONE)),
	QUARTZ(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 18, () -> Ingredient.of(Items.QUARTZ)),
    BLAZING(BlockTags.INCORRECT_FOR_IRON_TOOL, 1536, 11.0F, 2.0F, 21, () -> Ingredient.of(Items.BLAZE_ROD)),
    DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> Ingredient.of(Items.DIAMOND)),
    GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 32, 12.0F, 0.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    EMERALD(BlockTags.INCORRECT_FOR_IRON_TOOL, 450, 12.0F, 0.0F, 17, () -> Ingredient.of(Items.EMERALD)),
    OBSIDIAN(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3072, 6.0F, 4.0F, 7, () -> Ingredient.of(Items.OBSIDIAN)),
    NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9.0F, 4.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    NETHERITEPLUS(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 10.0F, 5.0F, 15, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    
    ALUMINUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 199, 6.0F, 2.0F, 8, () -> Ingredient.of(CustomTags.ALUMINUM)),
	TIN(BlockTags.INCORRECT_FOR_IRON_TOOL, 221, 6.0F, 2.0F, 16, () -> Ingredient.of(CustomTags.TIN)),
	SILVER(BlockTags.INCORRECT_FOR_IRON_TOOL, 245, 6.0F, 2.0F, 25, () -> Ingredient.of(CustomTags.SILVER)),
	BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 6.0F, 2.0F, 16, () -> Ingredient.of(CustomTags.BRONZE)),
	COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 190, 6.0F, 2.0F, 14, () -> Ingredient.of(Items.COPPER_INGOT)),
	NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 6.0F, 2.0F, 20, () -> Ingredient.of(CustomTags.NICKEL)),
	LEAD(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 12, () -> Ingredient.of(CustomTags.LEAD)),
	ELECTRUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, () -> Ingredient.of(CustomTags.ELECTRUM)),
	ZINC(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, () -> Ingredient.of(CustomTags.ZINC)),
	STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 6.0F, 2.0F, 12, () -> Ingredient.of(CustomTags.STEEL)),
    
    RUBY(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, () -> Ingredient.of(CustomTags.RUBY)),
	SAPPHIRE(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, () -> Ingredient.of(CustomTags.SAPPHIRE)),
	OPAL(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, () -> Ingredient.of(CustomTags.OPAL)),
	
	AQUATIC(CustomTags.NEEDS_AQUATIC_TOOL, 1000, 6.0F, 3.0F, 45, () -> Ingredient.of(CustomTags.AQUATIC)),
    WITHERED(CustomTags.NEEDS_WITHERED_TOOL, 1750, 7.0F, 4.0F, 22, () -> Ingredient.of(CustomTags.WITHERED)),
    DRAGONBORN(CustomTags.NEEDS_DRAGONBORN_TOOL, 2000, 8.0F, 5.0F, 15, () -> Ingredient.of(CustomTags.DRAGONBORN)),
    BROKONIUM(CustomTags.NEEDS_BROKONIUM_TOOL, 2500, 9.0F, 6.0F, 10, () -> Ingredient.of(CustomTags.BROKONIUM));

    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    CustomTiersEnum(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}