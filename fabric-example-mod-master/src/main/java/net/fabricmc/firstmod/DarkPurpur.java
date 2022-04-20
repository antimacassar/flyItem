package net.fabricmc.firstmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DarkPurpur extends Block {
    public DarkPurpur(){
        super(FabricBlockSettings.of(Material.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.ANCIENT_DEBRIS)
                .strength(2, 0.2f));
    }
}
