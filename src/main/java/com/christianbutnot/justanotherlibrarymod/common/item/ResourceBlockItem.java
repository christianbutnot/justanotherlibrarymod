package com.christianbutnot.justanotherlibrarymod.common.item;
	
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

public class ResourceBlockItem extends BlockItem {

	public ResourceBlockItem(Block p_41579_, Properties p_41580_) {
		super(p_41579_, p_41580_);
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