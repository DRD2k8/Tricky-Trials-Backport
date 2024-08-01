package com.drd.trickytrials.datagen.loot;

import com.drd.trickytrials.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.EXPOSED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.WEATHERED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.OXIDIZED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.WAXED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.COPPER_GRATE.get());
        this.dropSelf(ModBlocks.EXPOSED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.WEATHERED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.OXIDIZED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.EXPOSED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WEATHERED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get());
        this.add(ModBlocks.COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.COPPER_DOOR.get()));
        this.add(ModBlocks.EXPOSED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.EXPOSED_COPPER_DOOR.get()));
        this.add(ModBlocks.WEATHERED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WEATHERED_COPPER_DOOR.get()));
        this.add(ModBlocks.OXIDIZED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.OXIDIZED_COPPER_DOOR.get()));
        this.add(ModBlocks.WAXED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WAXED_COPPER_DOOR.get()));
        this.add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get()));
        this.add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get()));
        this.add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get()));
        this.dropSelf(ModBlocks.COPPER_BULB.get());
        this.dropSelf(ModBlocks.EXPOSED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.WEATHERED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.OXIDIZED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.WAXED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.WAXED_EXPOSED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.WAXED_WEATHERED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.WAXED_OXIDIZED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.TUFF_STAIRS.get());
        this.add(ModBlocks.TUFF_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TUFF_SLAB.get()));
        this.dropSelf(ModBlocks.TUFF_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_TUFF.get());
        this.dropSelf(ModBlocks.POLISHED_TUFF.get());
        this.dropSelf(ModBlocks.POLISHED_TUFF_STAIRS.get());
        this.add(ModBlocks.POLISHED_TUFF_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_TUFF_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_TUFF_WALL.get());
        this.dropSelf(ModBlocks.TUFF_BRICKS.get());
        this.dropSelf(ModBlocks.TUFF_BRICK_STAIRS.get());
        this.add(ModBlocks.TUFF_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TUFF_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.TUFF_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_TUFF_BRICKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
