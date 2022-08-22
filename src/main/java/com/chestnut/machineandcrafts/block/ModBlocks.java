package com.chestnut.machineandcrafts.block;

import com.chestnut.machineandcrafts.MachineAndCrafts;
import com.chestnut.machineandcrafts.item.ModCreativeModeTag;
import com.chestnut.machineandcrafts.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MachineAndCrafts.MODID);

    public  static final RegistryObject<Block> PULVERIZED_COPPER_ORE = registryBlock("pulverized_copper_ore",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(1f).sound(SoundType.SAND)),
            ModCreativeModeTag.PULVERIZED_ORE);

    public  static final RegistryObject<Block> PULVERIZED_GOLD_ORE = registryBlock("pulverized_gold_ore",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(1f).sound(SoundType.SAND)),
            ModCreativeModeTag.PULVERIZED_ORE);

    public  static final RegistryObject<Block> PULVERIZED_IRON_ORE = registryBlock("pulverized_iron_ore",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(1f).sound(SoundType.SAND)),
            ModCreativeModeTag.PULVERIZED_ORE);
    
    public  static final RegistryObject<Block> PULVERIZED_NICKEL_ORE = registryBlock("pulverized_nickel_ore",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(1f).sound(SoundType.SAND)),
            ModCreativeModeTag.PULVERIZED_ORE);

    public  static final RegistryObject<Block> PULVERIZED_SILVER_ORE = registryBlock("pulverized_silver_ore",
            ()-> new GravelBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(1f).sound(SoundType.SAND)),
            ModCreativeModeTag.PULVERIZED_ORE);



    private static <T extends Block>RegistryObject<T>registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item>registerBlockItem(String name, RegistryObject<T> block , CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
