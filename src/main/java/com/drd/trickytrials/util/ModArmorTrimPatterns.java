package com.drd.trickytrials.util;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.init.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmorTrimPatterns {
    public static final ResourceKey<TrimPattern> FLOW = createKey("flow");
    public static final ResourceKey<TrimPattern> BOLT = createKey("bolt");

    public static void bootstrap(BootstapContext<TrimPattern> context) {
        register(context, FLOW, ModItems.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE.get());
        register(context, BOLT, ModItems.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE.get());
    }

    public static ResourceKey<TrimPattern> createKey(String name) {
        return ResourceKey.create(Registries.TRIM_PATTERN, new ResourceLocation(TrickyTrials.MOD_ID, name));
    }

    private static void register(BootstapContext<TrimPattern> context, ResourceKey<TrimPattern> key, Item item) {
        context.register(key, new TrimPattern(key.location(), ForgeRegistries.ITEMS.getHolder(item).get(), Component.translatable(Util.makeDescriptionId("trim_pattern", key.location()))));
    }
}
