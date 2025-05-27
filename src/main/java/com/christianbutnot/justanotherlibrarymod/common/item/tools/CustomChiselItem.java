package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;

public class CustomChiselItem extends DiggerItem {
	public CustomChiselItem(ToolMaterial pTier, float pAttackDamageModifier, float pAttackSpeedModifier,
			Properties pProperties) {
		super(pTier, CustomTags.PAXEL_MINEABLE, 0.0F, 0.0F, pProperties);
	}

	public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
			TooltipFlag flag) {
		components.add(Component.literal("Blocks broken may break down into other materials...")
				.withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		components
				.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED).withStyle(ChatFormatting.ITALIC));
		super.appendHoverText(stack, level, components, flag);
	}
}