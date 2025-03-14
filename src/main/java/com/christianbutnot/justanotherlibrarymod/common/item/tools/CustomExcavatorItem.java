package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class CustomExcavatorItem extends DiggerItem {
	
	public CustomExcavatorItem(ToolMaterial pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
		super(pTier, BlockTags.MINEABLE_WITH_SHOVEL,  2F, -3F, pProperties);
	}

	public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayer player) {
		List<BlockPos> positions = new ArrayList<>();

		BlockHitResult traceResult = player.level()
				.clip(new ClipContext(player.getEyePosition(1f),
						(player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
						ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));
		if (traceResult.getType() == HitResult.Type.MISS) {
			return positions;
		}

		if (traceResult.getDirection() == Direction.DOWN || traceResult.getDirection() == Direction.UP) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(),
							initalBlockPos.getZ() + y));
				}
			}
		}

		if (traceResult.getDirection() == Direction.NORTH || traceResult.getDirection() == Direction.SOUTH) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y,
							initalBlockPos.getZ()));
				}
			}
		}

		if (traceResult.getDirection() == Direction.EAST || traceResult.getDirection() == Direction.WEST) {
			for (int x = -range; x <= range; x++) {
				for (int y = -range; y <= range; y++) {
					positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y,
							initalBlockPos.getZ() + x));
				}
			}
		}

		return positions;
	}
}

