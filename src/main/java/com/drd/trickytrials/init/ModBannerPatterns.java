package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModBannerPatterns {
    public static final DeferredRegister<BannerPattern> BANNER_PATTERNS =
            DeferredRegister.create(Registries.BANNER_PATTERN, TrickyTrials.MOD_ID);
    
    public static final RegistryObject<BannerPattern> FLOW = BANNER_PATTERNS.register("flow", () -> new BannerPattern("trickytrials_flow"));
    public static final RegistryObject<BannerPattern> GUSTER = BANNER_PATTERNS.register("guster", () -> new BannerPattern("trickytrials_guster"));

    public static void register(IEventBus eventBus) {
        BANNER_PATTERNS.register(eventBus);
    }
}
