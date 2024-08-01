package com.drd.trickytrials.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class CustomWeatheringCopperBlock extends Block implements CustomWeatheringCopper {
    private final CustomWeatheringCopper.WeatherState weatherState;

    public CustomWeatheringCopperBlock(CustomWeatheringCopper.WeatherState p_154925_, BlockBehaviour.Properties p_154926_) {
        super(p_154926_);
        this.weatherState = p_154925_;
    }

    public void randomTick(BlockState p_222665_, ServerLevel p_222666_, BlockPos p_222667_, RandomSource p_222668_) {
        this.onRandomTick(p_222665_, p_222666_, p_222667_, p_222668_);
    }

    public boolean isRandomlyTicking(BlockState p_154935_) {
        return CustomWeatheringCopper.getNext(p_154935_.getBlock()).isPresent();
    }

    public CustomWeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
