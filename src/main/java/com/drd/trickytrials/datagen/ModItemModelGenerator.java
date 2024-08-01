package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TrickyTrials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simplerBlockItem(ModBlocks.COPPER_DOOR);
        simplerBlockItem(ModBlocks.EXPOSED_COPPER_DOOR);
        simplerBlockItem(ModBlocks.WEATHERED_COPPER_DOOR);
        simplerBlockItem(ModBlocks.OXIDIZED_COPPER_DOOR);
        waxedBlockItem(ModBlocks.WAXED_COPPER_DOOR, ModBlocks.COPPER_DOOR);
        waxedBlockItem(ModBlocks.WAXED_EXPOSED_COPPER_DOOR, ModBlocks.EXPOSED_COPPER_DOOR);
        waxedBlockItem(ModBlocks.WAXED_WEATHERED_COPPER_DOOR, ModBlocks.WEATHERED_COPPER_DOOR);
        waxedBlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR, ModBlocks.OXIDIZED_COPPER_DOOR);
        trapdoorItem(ModBlocks.COPPER_TRAPDOOR);
        trapdoorItem(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        trapdoorItem(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        trapdoorItem(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
        waxedBlockItem(ModBlocks.WAXED_COPPER_TRAPDOOR, ModBlocks.COPPER_TRAPDOOR);
        waxedBlockItem(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        waxedBlockItem(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        waxedBlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
        simpleBlockItem(ModBlocks.COPPER_BULB);
        simpleBlockItem(ModBlocks.EXPOSED_COPPER_BULB);
        simpleBlockItem(ModBlocks.WEATHERED_COPPER_BULB);
        simpleBlockItem(ModBlocks.OXIDIZED_COPPER_BULB);
        waxedBlockItem(ModBlocks.WAXED_COPPER_BULB, ModBlocks.COPPER_BULB);
        waxedBlockItem(ModBlocks.WAXED_EXPOSED_COPPER_BULB, ModBlocks.EXPOSED_COPPER_BULB);
        waxedBlockItem(ModBlocks.WAXED_WEATHERED_COPPER_BULB, ModBlocks.WEATHERED_COPPER_BULB);
        waxedBlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_BULB, ModBlocks.OXIDIZED_COPPER_BULB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TrickyTrials.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(TrickyTrials.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simplerBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TrickyTrials.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder trapdoorItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(TrickyTrials.MOD_ID, "block/" + item.getId().getPath() + "_bottom"));
    }

    private ItemModelBuilder waxedBlockItem(RegistryObject<Block> waxedItem, RegistryObject<Block> unwaxedItem) {
        return withExistingParent(waxedItem.getId().getPath(),
                new ResourceLocation(TrickyTrials.MOD_ID, "item/" + unwaxedItem.getId().getPath()));
    }
}
