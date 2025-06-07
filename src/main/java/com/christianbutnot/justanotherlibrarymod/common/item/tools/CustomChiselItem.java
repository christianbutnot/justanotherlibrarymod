package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

public class CustomChiselItem extends Item {

	public CustomChiselItem(Properties properties) {
		super(properties);
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