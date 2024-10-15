package com.christianbutnot.justanotherlibrarymod.util;

import com.christianbutnot.justanotherlibrarymod.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CustomTags {

		public static final TagKey<Block> NEEDS_BROKONIUM_TOOL = modBlockTag("needs_brokonium_tool");
		public static final TagKey<Block> NEEDS_WITHERED_TOOL = modBlockTag("needs_withered_tool");
		public static final TagKey<Block> NEEDS_AQUATIC_TOOL = modBlockTag("needs_aquatic_tool");
		public static final TagKey<Block> NEEDS_DRAGONBORN_TOOL = modBlockTag("needs_dragonborn_tool");

		public static final TagKey<Block> MINEABLE_BY_MULTI_TOOL = modBlockTag("mineable/multi_tool");

		public static final TagKey<Item> COMMON = modItemTag("common");
		public static final TagKey<Item> RARE = modItemTag("rare");
		public static final TagKey<Item> EPIC = modItemTag("epic");
		public static final TagKey<Item> LEGENDARY = modItemTag("legendary");
		public static final TagKey<Item> MYTHIC = modItemTag("mythic");
		public static final TagKey<Item> CRYSTALS = modItemTag("crystals");
		public static final TagKey<Item> GEMS = modItemTag("gems");
		public static final TagKey<Item> MOB_DROPS = modItemTag("mob_drops");
		public static final TagKey<Item> UTILITY = modItemTag("utility");
		public static final TagKey<Item> TREASURE = modItemTag("treasure");
		public static final TagKey<Item> RESOURCES = modItemTag("resources");
		
		public static final TagKey<Item> RUBY = modItemTag("ruby");
		public static final TagKey<Item> SAPPHIRE = modItemTag("sapphire");
		public static final TagKey<Item> OPAL = modItemTag("opal");
		
		public static final TagKey<Item> ALUMINUM = modItemTag("aluminum");
		public static final TagKey<Item> NICKEL = modItemTag("nickel");
		public static final TagKey<Item> SILVER = modItemTag("silver");
		public static final TagKey<Item> TIN = modItemTag("tin");
		public static final TagKey<Item> LEAD = modItemTag("lead");
		public static final TagKey<Item> ZINC = modItemTag("zinc");
		public static final TagKey<Item> BRONZE = modItemTag("bronze");
		public static final TagKey<Item> ELECTRUM = modItemTag("electrum");
		public static final TagKey<Item> STEEL = modItemTag("steel");
		
		public static final TagKey<Item> AQUATIC = modItemTag("aquatic");
		public static final TagKey<Item> WITHERED = modItemTag("withered");
		public static final TagKey<Item> DRAGONBORN = modItemTag("dragonborn");
		public static final TagKey<Item> BROKONIUM = modItemTag("brokonium");
		
		public static final TagKey<Block> PAXEL_MINEABLE = modBlockTag("mineable/paxel");

		public static TagKey<Block> blockTag(ResourceLocation tagLocaction) {
			return TagKey.create(Registries.BLOCK, tagLocaction);
		}

		public static TagKey<Item> itemTag(ResourceLocation tagLocaction) {
			return TagKey.create(Registries.ITEM, tagLocaction);
		}

		public static TagKey<Block> modBlockTag(String tagName) {
			return CustomTags.blockTag(ResourceLocation.fromNamespaceAndPath(Main.MODID, tagName));
		}

		public static TagKey<Item> modItemTag(String tagLocaction) {
			return CustomTags.itemTag(ResourceLocation.fromNamespaceAndPath(Main.MODID, tagLocaction));
		}
}