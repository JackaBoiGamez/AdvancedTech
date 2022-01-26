package dev.jackaboi.advancedtech.blocks;

import dev.jackaboi.advancedtech.AdvancedTech;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block pBlock) {
        super(pBlock, new Item.Properties().tab(AdvancedTech.TAB));
    }
}
