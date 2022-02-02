package dev.jackaboi.advancedtech.blocks.stairs;

import dev.jackaboi.advancedtech.AdvancedTech;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.StairBlock;

public class StairItemBase extends BlockItem {

    public StairItemBase(StairBlock block){
        super(block, new Item.Properties().tab(AdvancedTech.TAB));
    }
}
