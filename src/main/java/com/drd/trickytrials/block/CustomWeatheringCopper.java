package com.drd.trickytrials.block;

import com.drd.trickytrials.init.ModBlocks;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface CustomWeatheringCopper extends ChangeOverTimeBlock<CustomWeatheringCopper.WeatherState> {
    Supplier<ImmutableBiMap<Object, Object>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.builder()
                .put(ModBlocks.CHISELED_COPPER.get(), ModBlocks.EXPOSED_CHISELED_COPPER.get())
                .put(ModBlocks.EXPOSED_CHISELED_COPPER.get(), ModBlocks.WEATHERED_CHISELED_COPPER.get())
                .put(ModBlocks.WEATHERED_CHISELED_COPPER.get(), ModBlocks.OXIDIZED_CHISELED_COPPER.get())
                .put(ModBlocks.COPPER_GRATE.get(), ModBlocks.EXPOSED_COPPER_GRATE.get())
                .put(ModBlocks.EXPOSED_COPPER_GRATE.get(), ModBlocks.WEATHERED_COPPER_GRATE.get())
                .put(ModBlocks.WEATHERED_COPPER_GRATE.get(), ModBlocks.OXIDIZED_COPPER_GRATE.get())
                .put(ModBlocks.COPPER_DOOR.get(), ModBlocks.EXPOSED_COPPER_DOOR.get())
                .put(ModBlocks.EXPOSED_COPPER_DOOR.get(), ModBlocks.WEATHERED_COPPER_DOOR.get())
                .put(ModBlocks.WEATHERED_COPPER_DOOR.get(), ModBlocks.OXIDIZED_COPPER_DOOR.get())
                .put(ModBlocks.COPPER_TRAPDOOR.get(), ModBlocks.EXPOSED_COPPER_TRAPDOOR.get())
                .put(ModBlocks.EXPOSED_COPPER_TRAPDOOR.get(), ModBlocks.WEATHERED_COPPER_TRAPDOOR.get())
                .put(ModBlocks.WEATHERED_COPPER_TRAPDOOR.get(), ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get())
                .put(ModBlocks.COPPER_BULB.get(), ModBlocks.EXPOSED_COPPER_BULB.get())
                .put(ModBlocks.EXPOSED_COPPER_BULB.get(), ModBlocks.WEATHERED_COPPER_BULB.get())
                .put(ModBlocks.WEATHERED_COPPER_BULB.get(), ModBlocks.OXIDIZED_COPPER_BULB.get()).build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return ((BiMap)NEXT_BY_BLOCK.get()).inverse();
    });

    static Optional<Block> getPrevious(Block p_154891_) {
        return Optional.ofNullable((Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(p_154891_));
    }

    static Block getFirst(Block p_154898_) {
        Block $$1 = p_154898_;

        for(Block $$2 = (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get($$1); $$2 != null; $$2 = (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get($$1)) {
            $$1 = $$2;
        }

        return $$1;
    }

    static Optional<BlockState> getPrevious(BlockState p_154900_) {
        return getPrevious(p_154900_.getBlock()).map((p_154903_) -> {
            return p_154903_.withPropertiesOf(p_154900_);
        });
    }

    static Optional<Block> getNext(Block p_154905_) {
        return Optional.ofNullable((Block)((BiMap)NEXT_BY_BLOCK.get()).get(p_154905_));
    }

    static BlockState getFirst(BlockState p_154907_) {
        return getFirst(p_154907_.getBlock()).withPropertiesOf(p_154907_);
    }

    default Optional<BlockState> getNext(BlockState p_154893_) {
        return getNext(p_154893_.getBlock()).map((p_154896_) -> {
            return p_154896_.withPropertiesOf(p_154893_);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == CustomWeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;

        WeatherState() {
        }
    }
}
