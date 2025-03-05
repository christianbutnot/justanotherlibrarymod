package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class CustomTiers {
	   public static final ToolMaterial WOOD;
	   public static final ToolMaterial STONE;
	   public static final ToolMaterial IRON;
	   public static final ToolMaterial AMETHYST;
	   public static final ToolMaterial REDSTONE;
	   public static final ToolMaterial QUARTZ;
	   public static final ToolMaterial BLAZING;
	   public static final ToolMaterial DIAMOND;
	   public static final ToolMaterial GOLD;
	   public static final ToolMaterial EMERALD;
	   public static final ToolMaterial OBSIDIAN;
	   public static final ToolMaterial REFORGED_OBSIDIAN;
	   public static final ToolMaterial NETHERITE;
	   public static final ToolMaterial NETHERITEPLUS;
	   public static final ToolMaterial RUBY;
	   public static final ToolMaterial SAPPHIRE;
	   public static final ToolMaterial OPAL;
	   public static final ToolMaterial AQUATIC;
	   public static final ToolMaterial WITHERED;
	   public static final ToolMaterial DRAGONBORN;
	   public static final ToolMaterial BROKONIUM;
	   public static final ToolMaterial CHRONIUM;
	   public static final ToolMaterial ROSIUM;
	   public static final ToolMaterial LUCIUM;
	   public static final ToolMaterial MOCYLITE;
	   public static final ToolMaterial ENDERITE;
	   public static final ToolMaterial ALUMINUM;
	   public static final ToolMaterial TIN;
	   public static final ToolMaterial SILVER;
	   public static final ToolMaterial BRONZE;
	   public static final ToolMaterial COPPER;
	   public static final ToolMaterial NICKEL;
	   public static final ToolMaterial LEAD;
	   public static final ToolMaterial ELECTRUM;
	   public static final ToolMaterial ZINC;
	   public static final ToolMaterial STEEL;

	   static {
	      WOOD = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, ItemTags.PLANKS);
	      STONE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, ItemTags.STONE_TOOL_MATERIALS);
	      IRON = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, ItemTags.IRON_TOOL_MATERIALS);
	      AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 11.0F, 2.0F, 21, CustomTags.AMETHYST);
	      REDSTONE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 11, CustomTags.REDSTONE);
	      QUARTZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 18, CustomTags.QUARTZ);
	      BLAZING = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1536, 11.0F, 2.0F, 21, CustomTags.BLAZING);
	      DIAMOND = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);
	      GOLD = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 32, 12.0F, 0.0F, 22, ItemTags.GOLD_TOOL_MATERIALS);
	      EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 450, 12.0F, 0.0F, 17, CustomTags.EMERALD);
	      OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 3072, 6.0F, 4.0F, 7, CustomTags.OBSIDIAN);
	      REFORGED_OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 4200, 7.0F, 4.0F, 7, CustomTags.OBSIDIAN);
	      NETHERITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9.0F, 4.0F, 15, ItemTags.NETHERITE_TOOL_MATERIALS);
	      NETHERITEPLUS = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 10.0F, 5.0F, 15, ItemTags.NETHERITE_TOOL_MATERIALS);
	      RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, CustomTags.RUBY);
	      SAPPHIRE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, CustomTags.SAPPHIRE);
	      OPAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 425, 6.0F, 2.0F, 35, CustomTags.OPAL);
	      AQUATIC = new ToolMaterial(CustomTags.NEEDS_AQUATIC_TOOL, 600, 6.0F, 2.0F, 8, CustomTags.AQUATIC);
	      WITHERED = new ToolMaterial(CustomTags.NEEDS_WITHERED_TOOL, 1561, 7.0F, 3.0F, 29, CustomTags.WITHERED);
	      DRAGONBORN = new ToolMaterial(CustomTags.NEEDS_DRAGONBORN_TOOL, 1561, 8.0F, 3.0F, 16, CustomTags.DRAGONBORN);
	      BROKONIUM = new ToolMaterial(CustomTags.NEEDS_BROKONIUM_TOOL, 2031, 6.0F, 3.0F, 10, CustomTags.BROKONIUM);
	      CHRONIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 600, 6.0F, 2.0F, 8, CustomTags.CHRONIUM);
	      ROSIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 7.0F, 3.0F, 29, CustomTags.ROSIUM);
	      LUCIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1561, 8.0F, 3.0F, 16, CustomTags.LUCIUM);
	      MOCYLITE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 2031, 6.0F, 3.0F, 10, CustomTags.MOCYLITE);
	      ENDERITE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 2571, 10.0F, 4.0F, 12, CustomTags.ENDERITE);
	      ALUMINUM = new ToolMaterial(CustomTags.NEEDS_AQUATIC_TOOL, 199, 6.0F, 2.0F, 8, CustomTags.ALUMINUM);
	      TIN = new ToolMaterial(CustomTags.NEEDS_WITHERED_TOOL, 221, 6.0F, 2.0F, 16, CustomTags.TIN);
	      SILVER = new ToolMaterial(CustomTags.NEEDS_DRAGONBORN_TOOL, 245, 6.0F, 2.0F, 25, CustomTags.SILVER);
	      BRONZE = new ToolMaterial(CustomTags.NEEDS_BROKONIUM_TOOL, 210, 6.0F, 2.0F, 16, CustomTags.BRONZE);
	      COPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 190, 6.0F, 2.0F, 14, CustomTags.COPPER);
	      NICKEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 6.0F, 2.0F, 20, CustomTags.NICKEL);
	      LEAD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 12, CustomTags.LEAD);
	      ELECTRUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, CustomTags.ELECTRUM);
	      ZINC = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 499, 6.0F, 2.0F, 25, CustomTags.ZINC);
	      STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 750, 6.0F, 2.0F, 12, CustomTags.STEEL);
	   }
	}