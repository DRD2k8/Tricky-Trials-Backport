package com.drd.trickytrials.datagen.tag;

import com.drd.trickytrials.TrickyTrials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ModBannerPatternTags {
    public static final TagKey<BannerPattern> PATTERN_ITEM_FLOW = tag(TrickyTrials.MOD_ID, "pattern_item/flow");
    public static final TagKey<BannerPattern> PATTERN_ITEM_GUSTER = tag(TrickyTrials.MOD_ID, "pattern_item/guster");

    private static TagKey<BannerPattern> tag(String modid, String name) {
        return TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(modid, name));
    }
}
