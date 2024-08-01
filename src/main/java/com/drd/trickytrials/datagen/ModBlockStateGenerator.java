package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateGenerator extends BlockStateProvider {
    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TrickyTrials.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CHISELED_COPPER);
        blockWithItem(ModBlocks.EXPOSED_CHISELED_COPPER);
        blockWithItem(ModBlocks.WEATHERED_CHISELED_COPPER);
        blockWithItem(ModBlocks.OXIDIZED_CHISELED_COPPER);
        waxedBlockWithItem(ModBlocks.WAXED_CHISELED_COPPER, ModBlocks.CHISELED_COPPER);
        waxedBlockWithItem(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER);
        waxedBlockWithItem(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER);
        waxedBlockWithItem(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER);
        blockWithItem(ModBlocks.COPPER_GRATE);
        blockWithItem(ModBlocks.EXPOSED_COPPER_GRATE);
        blockWithItem(ModBlocks.WEATHERED_COPPER_GRATE);
        blockWithItem(ModBlocks.OXIDIZED_COPPER_GRATE);
        waxedBlockWithItem(ModBlocks.WAXED_COPPER_GRATE, ModBlocks.COPPER_GRATE);
        waxedBlockWithItem(ModBlocks.WAXED_EXPOSED_COPPER_GRATE, ModBlocks.EXPOSED_COPPER_GRATE);
        waxedBlockWithItem(ModBlocks.WAXED_WEATHERED_COPPER_GRATE, ModBlocks.WEATHERED_COPPER_GRATE);
        waxedBlockWithItem(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE, ModBlocks.OXIDIZED_COPPER_GRATE);
        doorBlockWithRenderType(((DoorBlock) ModBlocks.COPPER_DOOR.get()), modLoc("block/copper_door_bottom"), modLoc("block/copper_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.EXPOSED_COPPER_DOOR.get()), modLoc("block/exposed_copper_door_bottom"), modLoc("block/exposed_copper_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.WEATHERED_COPPER_DOOR.get()), modLoc("block/weathered_copper_door_bottom"), modLoc("block/weathered_copper_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.OXIDIZED_COPPER_DOOR.get()), modLoc("block/oxidized_copper_door_bottom"), modLoc("block/oxidized_copper_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.COPPER_TRAPDOOR.get()), modLoc("block/copper_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.EXPOSED_COPPER_TRAPDOOR.get()), modLoc("block/exposed_copper_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WEATHERED_COPPER_TRAPDOOR.get()), modLoc("block/weathered_copper_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get()), modLoc("block/oxidized_copper_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void waxedBlockWithItem(RegistryObject<Block> waxedBlock, RegistryObject<Block> unwaxedBlock) {
        simpleBlockWithItem(waxedBlock.get(), cubeAll(unwaxedBlock.get()));
    }
}
