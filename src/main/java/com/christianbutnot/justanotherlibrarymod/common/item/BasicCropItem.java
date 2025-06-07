package com.christianbutnot.justanotherlibrarymod.common.item;
	
import java.util.function.Consumer;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;

public class BasicCropItem extends BlockItem {

	public BasicCropItem(Block p_41579_, Properties p_41580_) {
		super(p_41579_, p_41580_);
	}

		@SuppressWarnings("deprecation")
		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, TooltipDisplay tooltipDisplay, Consumer<Component> components,
				TooltipFlag flag) {
			{
				components.accept(Component.literal("Crop Item").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, tooltipDisplay, components, flag);
	}

}