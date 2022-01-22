package dev.jackaboi.advancedtech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AdvancedTech_ORES = new CreativeModeTab("advancedTechOres") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITAN_SHARD.get());
        }
    };
    public static final CreativeModeTab AdvancedTech_Tech = new CreativeModeTab("advancedTechTech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITAN_INGOT.get());
        }
    };
}
