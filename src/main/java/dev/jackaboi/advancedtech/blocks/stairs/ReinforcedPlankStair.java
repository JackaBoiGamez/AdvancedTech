package dev.jackaboi.advancedtech.blocks.stairs;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class ReinforcedPlankStair extends StairBlock {
    public ReinforcedPlankStair(BlockState pBaseState) {
        super(pBaseState,
                (Properties.of(Material.HEAVY_METAL)
                        .strength(12f)
                        .explosionResistance(15f)
                        .sound(SoundType.WOOD)
                        .requiresCorrectToolForDrops()
                ));
    }
}
