package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import com.drd.trickytrials.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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
        simpleBlockItem(ModBlocks.TUFF_STAIRS);
        simpleBlockItem(ModBlocks.TUFF_SLAB);
        vanillaWallItem(ModBlocks.TUFF_WALL, Blocks.TUFF);
        simpleBlockItem(ModBlocks.CHISELED_TUFF);
        simpleBlockItem(ModBlocks.POLISHED_TUFF_STAIRS);
        simpleBlockItem(ModBlocks.POLISHED_TUFF_SLAB);
        wallItem(ModBlocks.POLISHED_TUFF_WALL, ModBlocks.POLISHED_TUFF);
        simpleBlockItem(ModBlocks.TUFF_BRICK_STAIRS);
        simpleBlockItem(ModBlocks.TUFF_BRICK_SLAB);
        wallItem(ModBlocks.TUFF_BRICK_WALL, ModBlocks.TUFF_BRICKS);
        simpleBlockItem(ModBlocks.CHISELED_TUFF_BRICKS);
        simpleItem(ModItems.FLOW_BANNER_PATTERN);
        simpleItem(ModItems.GUSTER_BANNER_PATTERN);
        simpleItem(ModItems.FLOW_POTTERY_SHERD);
        simpleItem(ModItems.GUSTER_POTTERY_SHERD);
        simpleItem(ModItems.SCRAPE_POTTERY_SHERD);
        simpleItem(ModItems.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE);
        simpleItem(ModItems.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE);
        simpleItem(ModItems.MUSIC_DISC_CREATOR);
        simpleItem(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX);
        simpleItem(ModItems.MUSIC_DISC_PRECIPICE);
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

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TrickyTrials.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void vanillaWallItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }
}
