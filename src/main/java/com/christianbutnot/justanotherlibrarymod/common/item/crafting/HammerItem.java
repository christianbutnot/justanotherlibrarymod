package com.christianbutnot.justanotherlibrarymod.common.item.crafting;

import java.util.List;
import java.util.function.Consumer;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.neoforged.neoforge.common.extensions.IItemExtension;

public class HammerItem extends Item implements IItemExtension {

	public HammerItem(Properties pProperties) {
		super(pProperties);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack stack) {

		stack.setDamageValue(stack.getDamageValue() + 1);
		if (stack.getDamageValue() >= stack.getMaxDamage()) stack.setCount(0);
		return stack.copy();
	}
	
	@SuppressWarnings("deprecation")
	public void appendHoverText(ItemStack stack, Item.TooltipContext worldIn, TooltipDisplay tooltip, Consumer<Component> lines, TooltipFlag flagIn)
	{
	    super.appendHoverText(stack, worldIn, tooltip, lines, flagIn);

	    tooltip.add(Component.literal("Utility Item").withStyle(ChatFormatting.RED).withStyle(ChatFormatting.ITALIC));
	}

}
