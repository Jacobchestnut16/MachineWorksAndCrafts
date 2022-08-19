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

    public static final RegistryObject<Item> SIFTING_FRAME = ITEMS.register("sifting_frame",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.STONE_AGE)));


    //Metal
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));

    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.METAL)));


    //Electricity
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.ELECTRICITY)));

    public static final RegistryObject<Item> WIRE = ITEMS.register("wire",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.ELECTRICITY)));


    //Pulverized
    public static final RegistryObject<Item> PULVERIZED_IRON = ITEMS.register("pulverized_iron",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
