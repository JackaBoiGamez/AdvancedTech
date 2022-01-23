package dev.jackaboi.advancedtech.block;

import dev.jackaboi.advancedtech.AdvancedTech;
import dev.jackaboi.advancedtech.item.ModCreativeModeTab;
import dev.jackaboi.advancedtech.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdvancedTech.MOD_ID);

    //Titan
    public static final RegistryObject<Block> TITAN_BLOCK = registerBlock("titan_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(30f)), ModCreativeModeTab.AdvancedTech_ORES);
    public static final RegistryObject<Block> TITAN_ORE = registerBlock("titan_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(15f)), ModCreativeModeTab.AdvancedTech_ORES);

    //Server
    public static final RegistryObject<SlabBlock> MINI_SERVER = registerSlabBlock("mini_server",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(50f)), ModCreativeModeTab.AdvancedTech_Tech);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block>void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    private static <T extends SlabBlock>RegistryObject<T> registerSlabBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerSlabBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends SlabBlock>void registerSlabBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
