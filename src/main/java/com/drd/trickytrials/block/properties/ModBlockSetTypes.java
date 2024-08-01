package com.drd.trickytrials.block.properties;

import com.drd.trickytrials.init.ModSounds;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.Set;

public record ModBlockSetTypes() {
    private static final Set<BlockSetType> VALUES = new ObjectArraySet();
    public static final BlockSetType COPPER = register(new BlockSetType("copper", false, SoundType.COPPER, ModSounds.COPPER_DOOR_CLOSE.get(), ModSounds.COPPER_DOOR_OPEN.get(), ModSounds.COPPER_TRAPDOOR_CLOSE.get(), ModSounds.COPPER_TRAPDOOR_OPEN.get(), SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));

    public static BlockSetType register(BlockSetType p_273033_) {
        VALUES.add(p_273033_);
        return p_273033_;
    }
}
