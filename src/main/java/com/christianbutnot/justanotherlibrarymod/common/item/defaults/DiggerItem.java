package com.christianbutnot.justanotherlibrarymod.common.item.defaults;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

public class DiggerItem extends Item {
    public DiggerItem(ToolMaterial material, TagKey<Block> mineableBlocks, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material.applyToolProperties(properties, mineableBlocks, attackDamage, attackSpeed, 0));
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise the damage on the stack.
     */
    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return;
    }

    @Override
    public void postHurtEnemy(ItemStack p_346200_, LivingEntity p_345855_, LivingEntity p_346191_) {
        p_346200_.hurtAndBreak(2, p_346191_, EquipmentSlot.MAINHAND);
    }
}
