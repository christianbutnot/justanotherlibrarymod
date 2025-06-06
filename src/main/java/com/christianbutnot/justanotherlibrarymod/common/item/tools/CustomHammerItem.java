package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class CustomHammerItem extends Item {
	public CustomHammerItem(Properties properties) {
		super(properties);
	}

	public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayer player) {
		List<BlockPos> positions = new ArrayList<>();

		BlockHitResult traceResult = player.level()
				.clip(new ClipContext(player.getEyePosition(1f),
						(player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))), ClipContext.Block.COLLIDER,
						ClipContext.Fluid.NONE, player));
		if (traceResult.getType() == HitResult.Type.MISS) {
			return positions;
		}

		if (traceResult.getDirection() == Direction.DOWN || traceResult.getDirection() == Direction.UP) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(
							new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
				}
			}
		}

		if (traceResult.getDirection() == Direction.NORTH || traceResult.getDirection() == Direction.SOUTH) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(
							new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
				}
			}
		}

		if (traceResult.getDirection() == Direction.EAST || traceResult.getDirection() == Direction.WEST) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(
							new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
				}
			}
		}

		return positions;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void appendHoverText(ItemStack stack, @Nullable TooltipContext level, TooltipDisplay tooltipDisplay, Consumer<Component> components, TooltipFlag flag) {
		{
			components.accept(
					Component.literal("Tool Item").withStyle(ChatFormatting.BLUE).withStyle(ChatFormatting.ITALIC));
		}

		super.appendHoverText(stack, level, tooltipDisplay, components, flag);
	}
}