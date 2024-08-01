package com.drd.trickytrials.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TransparentBlock extends HalfTransparentBlock {
    public TransparentBlock(Properties p_53970_) {
        super(p_53970_);
    }

    public VoxelShape getVisualShape(BlockState p_312193_, BlockGetter p_310654_, BlockPos p_310658_, CollisionContext p_311129_) {
        return Shapes.empty();
    }

    public float getShadeBrightness(BlockState p_312407_, BlockGetter p_310193_, BlockPos p_311965_) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState p_312717_, BlockGetter p_312877_, BlockPos p_312899_) {
        return true;
    }
}
