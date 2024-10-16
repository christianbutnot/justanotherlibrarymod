package com.christianbutnot.justanotherlibrarymod.common.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

public class ItemTypes {

	public static class CommonItem extends Item {

		public CommonItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Common Item").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class UtilityItem extends Item {

		public UtilityItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class AquaticTemplateItem extends Item {

		public AquaticTemplateItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
				components.add(Component.literal("Applicable to Diamond Armor/Tools").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class WitheredTemplateItem extends Item {

		public WitheredTemplateItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
				components.add(Component.literal("Applicable to Netherite Armor/Tools").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class DragonbornTemplateItem extends Item {

		public DragonbornTemplateItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
				components.add(Component.literal("Applicable to Withered Armor/Tools").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class BrokoniumTemplateItem extends Item {

		public BrokoniumTemplateItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
				components.add(Component.literal("Applicable to Dragonborn Armor/Tools").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class TreasureItem extends Item {

		public TreasureItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Treasure Item").withStyle(ChatFormatting.GOLD)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class ResourceItem extends Item {

		public ResourceItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Resource Item").withStyle(ChatFormatting.LIGHT_PURPLE)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class RareItem extends Item {

		public RareItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(
						Component.literal("Rare Item").withStyle(ChatFormatting.AQUA).withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}

	}

	public static class MythicItem extends Item {

		public MythicItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Mythic Item").withStyle(ChatFormatting.RED)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}

	}

	public static class MobItem extends Item {

		public MobItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Mob Item").withStyle(ChatFormatting.DARK_RED)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class LegendaryItem extends Item {

		public LegendaryItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Legendary Item").withStyle(ChatFormatting.GOLD)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}

	}

	public static class EpicItem extends Item {

		public EpicItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Epic Item").withStyle(ChatFormatting.DARK_PURPLE)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}

	}

	public static class EdibleItem extends Item {

		public EdibleItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Edible Item").withStyle(ChatFormatting.DARK_AQUA)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
		}
	}

	public static class CosmeticItem extends Item {

		public CosmeticItem(Properties p_i48487_1_) {
			super(p_i48487_1_);
		}

		@Override
	    public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components, TooltipFlag flag) {
			{
	            components.add(Component.literal("Cosmetic Item").withStyle(ChatFormatting.GREEN).withStyle(ChatFormatting.ITALIC));
	        } 

	        super.appendHoverText(stack, level, components, flag);
	    }
		
		public static class CurrencyItem extends Item {

			public CurrencyItem(Properties p_i48487_1_) {
				super(p_i48487_1_);
			}

			@Override
			public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
					TooltipFlag flag) {
				{
					components.add(Component.literal("Currency Item").withStyle(ChatFormatting.DARK_AQUA)
							.withStyle(ChatFormatting.ITALIC));
				}

				super.appendHoverText(stack, level, components, flag);
			}
	}
}
}
