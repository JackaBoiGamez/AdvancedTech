package dev.jackaboi.advancedtech.util;

import dev.jackaboi.advancedtech.AdvancedTech;
import dev.jackaboi.advancedtech.blocks.BlockItemBase;
import dev.jackaboi.advancedtech.blocks.MiniServer;
import dev.jackaboi.advancedtech.blocks.TitanOre;
import dev.jackaboi.advancedtech.items.ItemBase;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdvancedTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedTech.MOD_ID);

    public static void init(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    // [ITEMS]

    public static final RegistryObject<Item> titan_shard = ITEMS.register("titan_shard", ItemBase::new);
    public static final RegistryObject<Item> titan_processor = ITEMS.register("titan_processor",ItemBase::new);
    public static final RegistryObject<Item> iron_frame = ITEMS.register("iron_frame",ItemBase::new);
    public static final RegistryObject<Item> motherboard = ITEMS.register("motherboard",ItemBase::new);
    public static final RegistryObject<Item> server_fan = ITEMS.register("server_fan",ItemBase::new);
    public static final RegistryObject<Item> block_drive = ITEMS.register("block_drive",ItemBase::new);
    public static final RegistryObject<Item> power_supply = ITEMS.register("power_supply",ItemBase::new);

    // [BLOCKS]

    public static final RegistryObject<Block> titan_ore = BLOCKS.register("titan_ore", TitanOre::new);
    public static final RegistryObject<Item> item_titan_ore = ITEMS.register("titan_ore", () -> new BlockItemBase(titan_ore.get()));
    public static final RegistryObject<Block> mini_server = BLOCKS.register("mini_server", MiniServer::new);
    public static final RegistryObject<Item> item_mini_server = ITEMS.register("mini_server", () -> new BlockItemBase(mini_server.get()));

}
