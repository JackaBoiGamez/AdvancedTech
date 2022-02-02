package dev.jackaboi.advancedtech.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ReinforcedPlankBlock extends Block {

    public ReinforcedPlankBlock(){
        super(Block.Properties.of(Material.HEAVY_METAL)
                .strength(12f)
                .explosionResistance(15f)
                .sound(SoundType.WOOD)
                .requiresCorrectToolForDrops()
        );
    }

}
