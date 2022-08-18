package com.chestnut.machineandcrafts.item;

import com.chestnut.machineandcrafts.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTag {
    public static final CreativeModeTab PULVERIZED_DUST = new CreativeModeTab("pulverized_dust") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PULVERIZED_IRON.get());
        }
    };

    public static final CreativeModeTab PULVERIZED_ORE = new CreativeModeTab("pulverized_ore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.PULVERIZED_IRON_ORE.get());
        }
    };
}
