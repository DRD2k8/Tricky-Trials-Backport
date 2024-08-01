package com.drd.trickytrials.block;

import com.drd.trickytrials.init.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class CopperBulbBlock extends Block {
    public static final BooleanProperty POWERED;
    public static final BooleanProperty LIT;

    public CopperBulbBlock(BlockBehaviour.Properties p_311115_) {
        super(p_311115_);
        this.registerDefaultState((BlockState)((BlockState)this.defaultBlockState().setValue(LIT, false)).setValue(POWERED, false));
    }

    public void onPlace(BlockState p_309678_, Level p_311953_, BlockPos p_309986_, BlockState p_310956_, boolean p_311576_) {
        if (p_310956_.getBlock() != p_309678_.getBlock() && p_311953_ instanceof ServerLevel $$5) {
            this.checkAndFlip(p_309678_, $$5, p_309986_);
        }
    }

    public void neighborChanged(BlockState p_312656_, Level p_310732_, BlockPos p_312930_, Block p_310377_, BlockPos p_312667_, boolean p_310529_) {
        if (p_310732_ instanceof ServerLevel $$6) {
            this.checkAndFlip(p_312656_, $$6, p_312930_);
        }
    }

    public void checkAndFlip(BlockState p_309989_, ServerLevel p_310260_, BlockPos p_310537_) {
        boolean $$3 = p_310260_.hasNeighborSignal(p_310537_);
        if ($$3 != (Boolean)p_309989_.getValue(POWERED)) {
            BlockState $$4 = p_309989_;
            if (!(Boolean)p_309989_.getValue(POWERED)) {
                $$4 = (BlockState)$$4.cycle(LIT);
                p_310260_.playSound((Player)null, p_310537_, (Boolean)$$4.getValue(LIT) ? ModSounds.COPPER_BULB_TURN_ON.get() : ModSounds.COPPER_BULB_TURN_OFF.get(), SoundSource.BLOCKS);
            }
            p_310260_.setBlock(p_310537_, (BlockState)$$4.setValue(POWERED, $$3), 3);
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_312159_) {
        p_312159_.add(new Property[]{LIT, POWERED});
    }

    public boolean hasAnalogOutputSignal(BlockState p_313187_) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState p_311902_, Level p_311245_, BlockPos p_313180_) {
        return (Boolean)p_311245_.getBlockState(p_313180_).getValue(LIT) ? 15 : 0;
    }

    static {
        POWERED = BlockStateProperties.POWERED;
        LIT = BlockStateProperties.LIT;
    }
}
