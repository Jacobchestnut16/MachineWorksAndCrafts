package com.chestnut.machineandcrafts.item;

import com.chestnut.machineandcrafts.MachineAndCrafts;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MachineAndCrafts.MODID);


    //Stone age
    public static final RegistryObject<Item> CHICKEN_WIRE = ITEMS.register("chicken_wire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.STONE_AGE)));

    public static final RegistryObject<Item> ORE_BUCKET = ITEMS.register("ore_bucket",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.STONE_AGE)));

    public static final RegistryObject<Item> ORE_BUCKET_UNFIRED = ITEMS.register("ore_bucket_unfired",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.STONE_AGE)));

    public static final RegistryObject<Item> SIFTING_FRAME = ITEMS.register("sifting_frame",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.STONE_AGE)));


    //Metal
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> CUPRONICKEL = ITEMS.register("cupronickel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> CUPRONICKEL_INGOT = ITEMS.register("cupronickel_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));


    //Electricity
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.ELECTRICITY)));

    public static final RegistryObject<Item> WIRE = ITEMS.register("wire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.ELECTRICITY)));


    //Pulverized
    public static final RegistryObject<Item> PULVERIZED_IRON = ITEMS.register("pulverized_iron",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static final RegistryObject<Item> PULVERIZED_COPPER = ITEMS.register("pulverized_copper",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static final RegistryObject<Item> PULVERIZED_GOLD = ITEMS.register("pulverized_gold",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static final RegistryObject<Item> PULVERIZED_NICKEL = ITEMS.register("pulverized_nickel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static final RegistryObject<Item> PULVERIZED_SILVER = ITEMS.register("pulverized_silver",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
