package com.drd.trickytrials.util;

import com.drd.trickytrials.TrickyTrials;
import dev.thomasglasser.sherdsapi.impl.Sherd;
import dev.thomasglasser.sherdsapi.impl.SherdsApiRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class ModPotterySherds {
    public static final ResourceKey<Sherd> FLOW = create("flow");
    public static final ResourceKey<Sherd> GUSTER = create("guster");
    public static final ResourceKey<Sherd> SCRAPE = create("scrape");

    public ModPotterySherds() {
    }

    private static ResourceKey<Sherd> create(String id) {
        return ResourceKey.create(SherdsApiRegistries.SHERD, new ResourceLocation(TrickyTrials.MOD_ID, id));
    }

    public static void init() {
    }
}
