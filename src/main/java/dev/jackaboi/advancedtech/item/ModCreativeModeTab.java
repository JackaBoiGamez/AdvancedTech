package dev.jackaboi.advancedtech.item;

import dev.jackaboi.advancedtech.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AdvancedTech_ORES = new CreativeModeTab("advancedTechOres") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TITAN_ORE.get());
        }
    };
    public static final CreativeModeTab AdvancedTech_Tech = new CreativeModeTab("advancedTechTech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MINI_SERVER.get());
        }
    };
}
