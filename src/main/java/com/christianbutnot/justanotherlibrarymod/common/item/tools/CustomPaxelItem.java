package com.christianbutnot.justanotherlibrarymod.common.item.tools;

import java.util.Map;

import com.christianbutnot.justanotherlibrarymod.util.CustomTags;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Maps;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class CustomPaxelItem {

	public static class PaxelItem extends DiggerItem {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		protected static final Map<Block, BlockState> FLATTENABLES = Maps
				.newHashMap(new Builder().put(Blocks.GRASS_BLOCK, Blocks.DIRT_PATH.defaultBlockState())
						.put(Blocks.DIRT, Blocks.DIRT_PATH.defaultBlockState())
						.put(Blocks.PODZOL, Blocks.DIRT_PATH.defaultBlockState())
						.put(Blocks.COARSE_DIRT, Blocks.DIRT_PATH.defaultBlockState())
						.put(Blocks.MYCELIUM, Blocks.DIRT_PATH.defaultBlockState())
						.put(Blocks.ROOTED_DIRT, Blocks.DIRT_PATH.defaultBlockState()).build());

		public PaxelItem(ToolMaterial pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
			super(pTier, CustomTags.PAXEL_MINEABLE, 2F, -3F, pProperties);
		}

		@Override
		public InteractionResult useOn(UseOnContext context) {
			Level level = context.getLevel();
			BlockPos blockpos = context.getClickedPos();
			BlockState blockstate = level.getBlockState(blockpos);
			if (context.getClickedFace() == Direction.DOWN) {
				return InteractionResult.PASS;
			} else {
				Player player = context.getPlayer();
				BlockState blockstate1 = blockstate.getToolModifiedState(context,
						net.neoforged.neoforge.common.ItemAbilities.SHOVEL_FLATTEN, false);
				BlockState blockstate2 = null;
				if (blockstate1 != null && level.getBlockState(blockpos.above()).isAir()) {
					level.playSound(player, blockpos, SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0F, 1.0F);
					blockstate2 = blockstate1;
				} else if ((blockstate2 = blockstate.getToolModifiedState(context,
						net.neoforged.neoforge.common.ItemAbilities.SHOVEL_DOUSE, false)) != null) {
					if (!level.isClientSide()) {
						level.levelEvent(null, 1009, blockpos, 0);
					}

				}

				if (blockstate2 != null) {
					if (!level.isClientSide) {
						level.setBlock(blockpos, blockstate2, 11);
						level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, blockstate2));
						if (player != null) {
							context.getItemInHand().hurtAndBreak(1, player,
									LivingEntity.getSlotForHand(context.getHand()));
						}
					}

					return InteractionResult.SUCCESS;
				}
			}
			return InteractionResult.PASS;
		}
	}
}