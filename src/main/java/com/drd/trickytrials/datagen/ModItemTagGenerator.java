package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import com.drd.trickytrials.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TrickyTrials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.DOORS)
                .add(ModBlocks.COPPER_DOOR.get().asItem())
                .add(ModBlocks.EXPOSED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.WEATHERED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.OXIDIZED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.WAXED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get().asItem())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get().asItem());

        this.tag(ItemTags.TRAPDOORS)
                .add(ModBlocks.COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.EXPOSED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WEATHERED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WAXED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(ModBlocks.TUFF_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_TUFF_STAIRS.get().asItem())
                .add(ModBlocks.TUFF_BRICK_STAIRS.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(ModBlocks.TUFF_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_TUFF_SLAB.get().asItem())
                .add(ModBlocks.TUFF_BRICK_SLAB.get().asItem());

        this.tag(ItemTags.WALLS)
                .add(ModBlocks.TUFF_WALL.get().asItem())
                .add(ModBlocks.POLISHED_TUFF_WALL.get().asItem())
                .add(ModBlocks.TUFF_BRICK_WALL.get().asItem());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE.get())
                .add(ModItems.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_CREATOR.get())
                .add(ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX.get())
                .add(ModItems.MUSIC_DISC_PRECIPICE.get());
    }
}
