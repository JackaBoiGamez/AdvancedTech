package dev.jackaboi.advancedtech.items;

import dev.jackaboi.advancedtech.AdvancedTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(AdvancedTech.TAB));
    }
}
