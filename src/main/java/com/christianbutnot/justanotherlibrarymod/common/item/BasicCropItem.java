package com.christianbutnot.justanotherlibrarymod.common.item;
	
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

public class BasicCropItem extends ItemNameBlockItem {

	public BasicCropItem(Block p_41579_, Properties p_41580_) {
		super(p_41579_, p_41580_);
	}

		@Override
		public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, List<Component> components,
				TooltipFlag flag) {
			{
				components.add(Component.literal("Crop Item").withStyle(ChatFormatting.GRAY)
						.withStyle(ChatFormatting.ITALIC));
			}

			super.appendHoverText(stack, level, components, flag);
	}

}