package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TrickyTrials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.DOORS)
                .add(ModBlocks.COPPER_DOOR.get())
                .add(ModBlocks.EXPOSED_COPPER_DOOR.get())
                .add(ModBlocks.WEATHERED_COPPER_DOOR.get())
                .add(ModBlocks.OXIDIZED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get());

        this.tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.COPPER_TRAPDOOR.get())
                .add(ModBlocks.EXPOSED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WEATHERED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CHISELED_COPPER.get())
                .add(ModBlocks.EXPOSED_CHISELED_COPPER.get())
                .add(ModBlocks.WEATHERED_CHISELED_COPPER.get())
                .add(ModBlocks.OXIDIZED_CHISELED_COPPER.get())
                .add(ModBlocks.WAXED_CHISELED_COPPER.get())
                .add(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get())
                .add(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get())
                .add(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get())
                .add(ModBlocks.COPPER_GRATE.get())
                .add(ModBlocks.EXPOSED_COPPER_GRATE.get())
                .add(ModBlocks.WEATHERED_COPPER_GRATE.get())
                .add(ModBlocks.OXIDIZED_COPPER_GRATE.get())
                .add(ModBlocks.WAXED_COPPER_GRATE.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get())
                .add(ModBlocks.COPPER_DOOR.get())
                .add(ModBlocks.EXPOSED_COPPER_DOOR.get())
                .add(ModBlocks.WEATHERED_COPPER_DOOR.get())
                .add(ModBlocks.OXIDIZED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get())
                .add(ModBlocks.COPPER_TRAPDOOR.get())
                .add(ModBlocks.EXPOSED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WEATHERED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get())
                .add(ModBlocks.COPPER_BULB.get())
                .add(ModBlocks.EXPOSED_COPPER_BULB.get())
                .add(ModBlocks.WEATHERED_COPPER_BULB.get())
                .add(ModBlocks.OXIDIZED_COPPER_BULB.get())
                .add(ModBlocks.WAXED_COPPER_BULB.get())
                .add(ModBlocks.WAXED_EXPOSED_COPPER_BULB.get())
                .add(ModBlocks.WAXED_WEATHERED_COPPER_BULB.get())
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_BULB.get());
    }
}
