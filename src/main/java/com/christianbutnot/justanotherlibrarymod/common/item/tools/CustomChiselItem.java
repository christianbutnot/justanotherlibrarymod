package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

import com.christianbutnot.justanotherlibrarymod.common.item.defaults.DiggerItem;
import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

public class CustomChiselItem extends DiggerItem {

	public CustomChiselItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material, CustomTags.MINEABLE_BY_MULTI_TOOL, attackDamage, attackSpeed, properties);
	}

	@SuppressWarnings("deprecation")
	public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, TooltipDisplay tooltipDisplay,
			Consumer<Component> components, TooltipFlag flag) {
		components.accept(Component.literal("Blocks broken may break down into other materials...")
				.withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		components.accept(
				Component.literal("Utility Item").withStyle(ChatFormatting.RED).withStyle(ChatFormatting.ITALIC));
		super.appendHoverText(stack, level, tooltipDisplay, components, flag);
	}
}