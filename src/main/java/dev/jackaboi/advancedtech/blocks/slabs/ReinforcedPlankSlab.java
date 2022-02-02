package dev.jackaboi.advancedtech.blocks.slabs;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ReinforcedPlankSlab extends SlabBlock {

    public ReinforcedPlankSlab(){
        super(Properties.of(Material.HEAVY_METAL)
                .strength(12f)
                .explosionResistance(15f)
                .sound(SoundType.WOOD)
                .requiresCorrectToolForDrops()
        );
    }

}
