package com.drd.trickytrials.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WeatheringCopperDoorBlock extends DoorBlock implements CustomWeatheringCopper {
    private final WeatherState weatherState;

    public WeatheringCopperDoorBlock(WeatherState p_154925_, Properties p_273303_, BlockSetType p_272854_) {
        super(p_273303_, p_272854_);
        this.weatherState = p_154925_;
    }

    public void randomTick(BlockState p_222665_, ServerLevel p_222666_, BlockPos p_222667_, RandomSource p_222668_) {
        this.onRandomTick(p_222665_, p_222666_, p_222667_, p_222668_);
    }

    public boolean isRandomlyTicking(BlockState p_154935_) {
        return CustomWeatheringCopper.getNext(p_154935_.getBlock()).isPresent();
    }

    public WeatherState getAge() {
        return this.weatherState;
    }
}
