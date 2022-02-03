package dev.jackaboi.advancedtech.util;

import dev.jackaboi.advancedtech.AdvancedTech;
import dev.jackaboi.advancedtech.blocks.BlockItemBase;
import dev.jackaboi.advancedtech.blocks.MiniServer;
import dev.jackaboi.advancedtech.blocks.ReinforcedPlankBlock;
import dev.jackaboi.advancedtech.blocks.TitanOre;
import dev.jackaboi.advancedtech.blocks.slabs.ReinforcedPlankSlab;
import dev.jackaboi.advancedtech.blocks.slabs.SlabItemBase;
import dev.jackaboi.advancedtech.blocks.stairs.ReinforcedPlankStair;
import dev.jackaboi.advancedtech.blocks.stairs.StairItemBase;
import dev.jackaboi.advancedtech.items.ItemBase;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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

    // --[ITEMS]--

    public static final RegistryObject<Item> titan_shard = ITEMS.register("titan_shard", ItemBase::new);
    public static final RegistryObject<Item> titan_processor = ITEMS.register("titan_processor",ItemBase::new);
    public static final RegistryObject<Item> iron_frame = ITEMS.register("iron_frame",ItemBase::new);
    public static final RegistryObject<Item> motherboard = ITEMS.register("motherboard",ItemBase::new);
    public static final RegistryObject<Item> server_fan = ITEMS.register("server_fan",ItemBase::new);
    public static final RegistryObject<Item> block_drive = ITEMS.register("block_drive",ItemBase::new);
    public static final RegistryObject<Item> power_supply = ITEMS.register("power_supply",ItemBase::new);

    // -------------------------[BLOCKS]--------------------------

    // [Ore]
    public static final RegistryObject<Block> titan_ore = BLOCKS.register("titan_ore", TitanOre::new);
    public static final RegistryObject<Item> item_titan_ore = ITEMS.register("titan_ore", () -> new BlockItemBase(titan_ore.get()));

    // [Server]
    public static final RegistryObject<Block> mini_server = BLOCKS.register("mini_server", MiniServer::new);
    public static final RegistryObject<Item> item_mini_server = ITEMS.register("mini_server", () -> new BlockItemBase(mini_server.get()));

    // [Auto]


    // [Reinforced]
    public static final RegistryObject<Block> reinforced_oak_planks = BLOCKS.register("reinforced_oak_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_oak_planks = ITEMS.register("reinforced_oak_planks", () -> new BlockItemBase(reinforced_oak_planks.get()));
    public static final RegistryObject<Block> reinforced_spruce_planks = BLOCKS.register("reinforced_spruce_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_spruce_planks = ITEMS.register("reinforced_spruce_planks", () -> new BlockItemBase(reinforced_spruce_planks.get()));
    public static final RegistryObject<Block> reinforced_birch_planks = BLOCKS.register("reinforced_birch_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_birch_planks = ITEMS.register("reinforced_birch_planks", () -> new BlockItemBase(reinforced_birch_planks.get()));
    public static final RegistryObject<Block> reinforced_jungle_planks = BLOCKS.register("reinforced_jungle_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_jungle_planks = ITEMS.register("reinforced_jungle_planks", () -> new BlockItemBase(reinforced_jungle_planks.get()));
    public static final RegistryObject<Block> reinforced_acacia_planks = BLOCKS.register("reinforced_acacia_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_acacia_planks = ITEMS.register("reinforced_acacia_planks", () -> new BlockItemBase(reinforced_acacia_planks.get()));
    public static final RegistryObject<Block> reinforced_dark_oak_planks = BLOCKS.register("reinforced_dark_oak_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_dark_oak_planks = ITEMS.register("reinforced_dark_oak_planks", () -> new BlockItemBase(reinforced_dark_oak_planks.get()));
    public static final RegistryObject<Block> reinforced_crimson_planks = BLOCKS.register("reinforced_crimson_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_crimson_planks = ITEMS.register("reinforced_crimson_planks", () -> new BlockItemBase(reinforced_crimson_planks.get()));
    public static final RegistryObject<Block> reinforced_warped_planks = BLOCKS.register("reinforced_warped_planks", ReinforcedPlankBlock::new);
    public static final RegistryObject<Item> item_reinforced_warped_planks = ITEMS.register("reinforced_warped_planks", () -> new BlockItemBase(reinforced_warped_planks.get()));

    public static final RegistryObject<SlabBlock> reinforced_oak_slab = BLOCKS.register("reinforced_oak_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_oak_slab = ITEMS.register("reinforced_oak_slab", () -> new SlabItemBase(reinforced_oak_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_spruce_slab = BLOCKS.register("reinforced_spruce_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_spruce_slab = ITEMS.register("reinforced_spruce_slab", () -> new SlabItemBase(reinforced_spruce_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_birch_slab = BLOCKS.register("reinforced_birch_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_birch_slab = ITEMS.register("reinforced_birch_slab", () -> new SlabItemBase(reinforced_birch_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_jungle_slab = BLOCKS.register("reinforced_jungle_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_jungle_slab = ITEMS.register("reinforced_jungle_slab", () -> new SlabItemBase(reinforced_jungle_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_acacia_slab = BLOCKS.register("reinforced_acacia_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_acacia_slab = ITEMS.register("reinforced_acacia_slab", () -> new SlabItemBase(reinforced_acacia_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_dark_oak_slab = BLOCKS.register("reinforced_dark_oak_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_dark_oak_slab = ITEMS.register("reinforced_dark_oak_slab", () -> new SlabItemBase(reinforced_dark_oak_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_crimson_slab = BLOCKS.register("reinforced_crimson_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_crimson_slab = ITEMS.register("reinforced_crimson_slab", () -> new SlabItemBase(reinforced_crimson_slab.get()));
    public static final RegistryObject<SlabBlock> reinforced_warped_slab = BLOCKS.register("reinforced_warped_slab", ReinforcedPlankSlab::new);
    public static final RegistryObject<Item> item_reinforced_warped_slab = ITEMS.register("reinforced_warped_slab", () -> new SlabItemBase(reinforced_warped_slab.get()));

    public static final RegistryObject<StairBlock> reinforced_oak_stairs = BLOCKS.register("reinforced_oak_stairs", () -> new ReinforcedPlankStair(
            reinforced_oak_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_oak_stairs = ITEMS.register("reinforced_oak_stairs", () -> new StairItemBase((reinforced_oak_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_spruce_stairs = BLOCKS.register("reinforced_spruce_stairs", () -> new ReinforcedPlankStair(
            reinforced_spruce_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_spruce_stairs = ITEMS.register("reinforced_spruce_stairs", () -> new StairItemBase((reinforced_spruce_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_birch_stairs = BLOCKS.register("reinforced_birch_stairs", () -> new ReinforcedPlankStair(
            reinforced_birch_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_birch_stairs = ITEMS.register("reinforced_birch_stairs", () -> new StairItemBase((reinforced_birch_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_jungle_stairs = BLOCKS.register("reinforced_jungle_stairs", () -> new ReinforcedPlankStair(
            reinforced_jungle_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_jungle_stairs = ITEMS.register("reinforced_jungle_stairs", () -> new StairItemBase((reinforced_jungle_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_acacia_stairs = BLOCKS.register("reinforced_acacia_stairs", () -> new ReinforcedPlankStair(
            reinforced_acacia_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_acacia_stairs = ITEMS.register("reinforced_acacia_stairs", () -> new StairItemBase((reinforced_acacia_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_dark_oak_stairs = BLOCKS.register("reinforced_dark_oak_stairs", () -> new ReinforcedPlankStair(
            reinforced_dark_oak_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_dark_oak_stairs = ITEMS.register("reinforced_dark_oak_stairs", () -> new StairItemBase((reinforced_dark_oak_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_crimson_stairs = BLOCKS.register("reinforced_crimson_stairs", () -> new ReinforcedPlankStair(
            reinforced_crimson_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_crimson_stairs = ITEMS.register("reinforced_crimson_stairs", () -> new StairItemBase((reinforced_crimson_stairs.get())));
    public static final RegistryObject<StairBlock> reinforced_warped_stairs = BLOCKS.register("reinforced_warped_stairs", () -> new ReinforcedPlankStair(
            reinforced_warped_planks.get().defaultBlockState()));
    public static final RegistryObject<Item> item_reinforced_warped_stairs = ITEMS.register("reinforced_warped_stairs", () -> new StairItemBase((reinforced_warped_stairs.get())));

}
