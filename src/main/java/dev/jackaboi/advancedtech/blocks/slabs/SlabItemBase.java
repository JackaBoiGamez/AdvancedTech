package dev.jackaboi.advancedtech.blocks.slabs;

import dev.jackaboi.advancedtech.AdvancedTech;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SlabBlock;

public class SlabItemBase extends BlockItem {

    public SlabItemBase(SlabBlock block){
        super(block, new Item.Properties().tab(AdvancedTech.TAB));
    }
}
