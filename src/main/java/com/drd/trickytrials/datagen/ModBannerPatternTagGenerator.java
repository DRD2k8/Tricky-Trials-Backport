package com.drd.trickytrials.datagen;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.datagen.tag.ModBannerPatternTags;
import com.drd.trickytrials.init.ModBannerPatterns;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BannerPatternTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBannerPatternTagGenerator extends BannerPatternTagsProvider {
    public ModBannerPatternTagGenerator(PackOutput p_256451_, CompletableFuture<HolderLookup.Provider> p_256420_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_256451_, p_256420_, TrickyTrials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModBannerPatternTags.PATTERN_ITEM_FLOW)
                .add(ModBannerPatterns.FLOW.getKey());
        this.tag(ModBannerPatternTags.PATTERN_ITEM_GUSTER)
                .add(ModBannerPatterns.GUSTER.getKey());
    }
}
