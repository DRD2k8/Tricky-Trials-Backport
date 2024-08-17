package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.datagen.tag.ModBannerPatternTags;
import com.drd.trickytrials.util.ModArmorTrimPatterns;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> MUSIC_DISC_CREATOR = ITEMS.register("music_disc_creator",
            () -> new RecordItem(12, ModSounds.MUSIC_DISC_CREATOR, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3520));
    public static final RegistryObject<Item> MUSIC_DISC_CREATOR_MUSIC_BOX = ITEMS.register("music_disc_creator_music_box",
            () -> new RecordItem(11, ModSounds.MUSIC_DISC_CREATOR_MUSIC_BOX, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1460));
    public static final RegistryObject<Item> MUSIC_DISC_PRECIPICE = ITEMS.register("music_disc_precipice",
            () -> new RecordItem(13, ModSounds.MUSIC_DISC_PRECIPICE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5980));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
