package dev.jackaboi.advancedtech.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class TitanOre extends Block {
    public TitanOre() {
        super(Block.Properties.of(Material.AMETHYST)
                .strength(12f)
                .sound(SoundType.AMETHYST)
                .requiresCorrectToolForDrops()
        );
    }
}
