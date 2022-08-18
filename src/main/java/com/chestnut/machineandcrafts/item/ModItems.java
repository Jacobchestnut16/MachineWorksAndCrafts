package com.chestnut.machineandcrafts.item;

import com.chestnut.machineandcrafts.MachineAndCrafts;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MachineAndCrafts.MODID);

    public static final RegistryObject<Item> PULVERIZED_IRON = ITEMS.register("pulverized_iron",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTag.PULVERIZED_DUST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
