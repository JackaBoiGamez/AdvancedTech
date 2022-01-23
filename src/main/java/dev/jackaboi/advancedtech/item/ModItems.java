package dev.jackaboi.advancedtech.item;

import dev.jackaboi.advancedtech.AdvancedTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedTech.MOD_ID);

    //Titan
    public static final RegistryObject<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AdvancedTech_ORES)));
    public static final RegistryObject<Item> TITAN_SHARD = ITEMS.register("titan_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AdvancedTech_ORES)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
