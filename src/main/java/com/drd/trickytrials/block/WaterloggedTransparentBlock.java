package com.drd.trickytrials.block;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class WaterloggedTransparentBlock extends TransparentBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED;

    public WaterloggedTransparentBlock(BlockBehaviour.Properties p_312891_) {
        super(p_312891_);
        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_311201_) {
        FluidState $$1 = p_311201_.getLevel().getFluidState(p_311201_.getClickedPos());
        return (BlockState)super.getStateForPlacement(p_311201_).setValue(WATERLOGGED, $$1.is(Fluids.WATER));
    }

    public BlockState updateShape(BlockState p_312220_, Direction p_310752_, BlockState p_310063_, LevelAccessor p_311410_, BlockPos p_310038_, BlockPos p_309617_) {
        if ((Boolean)p_312220_.getValue(WATERLOGGED)) {
            p_311410_.scheduleTick(p_310038_, Fluids.WATER, Fluids.WATER.getTickDelay(p_311410_));
        }

        return super.updateShape(p_312220_, p_310752_, p_310063_, p_311410_, p_310038_, p_309617_);
    }

    public FluidState getFluidState(BlockState p_312084_) {
        return (Boolean)p_312084_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(true) : super.getFluidState(p_312084_);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_311516_) {
        p_311516_.add(new Property[]{WATERLOGGED});
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
