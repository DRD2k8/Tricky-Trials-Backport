package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.datagen.tag.ModBannerPatternTags;
import com.drd.trickytrials.util.ModArmorTrimPatterns;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrickyTrials.MOD_ID);

    public static final RegistryObject<Item> FLOW_BANNER_PATTERN = ITEMS.register("flow_banner_pattern",
            () -> new BannerPatternItem(ModBannerPatternTags.PATTERN_ITEM_FLOW, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<Item> GUSTER_BANNER_PATTERN = ITEMS.register("guster_banner_pattern",
            () -> new BannerPatternItem(ModBannerPatternTags.PATTERN_ITEM_GUSTER, (new Item.Properties()).stacksTo(1)));

    public static final RegistryObject<Item> FLOW_POTTERY_SHERD = ITEMS.register("flow_pottery_sherd",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUSTER_POTTERY_SHERD = ITEMS.register("guster_pottery_sherd",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRAPE_POTTERY_SHERD = ITEMS.register("scrape_pottery_sherd",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLOW_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("flow_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ModArmorTrimPatterns.FLOW));
    public static final RegistryObject<Item> BOLT_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("bolt_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ModArmorTrimPatterns.BOLT));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
