package com.drd.trickytrials;

import com.drd.trickytrials.datagen.*;
import com.drd.trickytrials.init.*;
import com.drd.trickytrials.util.ModPotterySherds;
import dev.thomasglasser.sherdsapi.SherdsApi;
import dev.thomasglasser.sherdsapi.api.data.ForgeSherdDatagenSuite;
import dev.thomasglasser.sherdsapi.impl.Sherd;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@Mod(TrickyTrials.MOD_ID)
public class TrickyTrials {
    public static final String MOD_ID = "trickytrials";

    public TrickyTrials() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBannerPatterns.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        private static final Function<ItemLike, ItemStack> FUNCTION = ItemStack::new;

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EXPOSED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEATHERED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OXIDIZED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WAXED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), RenderType.cutoutMipped());
        }

        private static void addAfter(MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> map, ItemLike after, ItemLike block) {
            map.putAfter(FUNCTION.apply(after), FUNCTION.apply(block), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        @SubscribeEvent
        public static void buildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
            MutableHashedLinkedMap<ItemStack, CreativeModeTab.TabVisibility> entries = event.getEntries();
            ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
            if (tabKey.equals(CreativeModeTabs.BUILDING_BLOCKS)) {
                addAfter(entries, Items.COPPER_BLOCK, ModBlocks.CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.CHISELED_COPPER.get(), ModBlocks.COPPER_GRATE.get());
                addAfter(entries, Items.CUT_COPPER_SLAB, ModBlocks.COPPER_DOOR.get());
                addAfter(entries, ModBlocks.COPPER_DOOR.get(), ModBlocks.COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.COPPER_TRAPDOOR.get(), ModBlocks.COPPER_BULB.get());
                addAfter(entries, Items.EXPOSED_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.EXPOSED_CHISELED_COPPER.get(), ModBlocks.EXPOSED_COPPER_GRATE.get());
                addAfter(entries, Items.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.EXPOSED_COPPER_DOOR.get(), ModBlocks.EXPOSED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.EXPOSED_COPPER_TRAPDOOR.get(), ModBlocks.EXPOSED_COPPER_BULB.get());
                addAfter(entries, Items.WEATHERED_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.WEATHERED_CHISELED_COPPER.get(), ModBlocks.WEATHERED_COPPER_GRATE.get());
                addAfter(entries, Items.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.WEATHERED_COPPER_DOOR.get(), ModBlocks.WEATHERED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.WEATHERED_COPPER_TRAPDOOR.get(), ModBlocks.WEATHERED_COPPER_BULB.get());
                addAfter(entries, Items.OXIDIZED_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.OXIDIZED_CHISELED_COPPER.get(), ModBlocks.OXIDIZED_COPPER_GRATE.get());
                addAfter(entries, Items.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.OXIDIZED_COPPER_DOOR.get(), ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.OXIDIZED_COPPER_TRAPDOOR.get(), ModBlocks.OXIDIZED_COPPER_BULB.get());
                addAfter(entries, Items.WAXED_COPPER_BLOCK, ModBlocks.WAXED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.WAXED_CHISELED_COPPER.get(), ModBlocks.WAXED_COPPER_GRATE.get());
                addAfter(entries, Items.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.WAXED_COPPER_DOOR.get(), ModBlocks.WAXED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.WAXED_COPPER_TRAPDOOR.get(), ModBlocks.WAXED_COPPER_BULB.get());
                addAfter(entries, Items.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER.get(), ModBlocks.WAXED_EXPOSED_COPPER_GRATE.get());
                addAfter(entries, Items.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.WAXED_EXPOSED_COPPER_DOOR.get(), ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR.get(), ModBlocks.WAXED_EXPOSED_COPPER_BULB.get());
                addAfter(entries, Items.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER.get(), ModBlocks.WAXED_WEATHERED_COPPER_GRATE.get());
                addAfter(entries, Items.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.WAXED_WEATHERED_COPPER_DOOR.get(), ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR.get(), ModBlocks.WAXED_WEATHERED_COPPER_BULB.get());
                addAfter(entries, Items.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get());
                addAfter(entries, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER.get(), ModBlocks.WAXED_OXIDIZED_COPPER_GRATE.get());
                addAfter(entries, Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get());
                addAfter(entries, ModBlocks.WAXED_OXIDIZED_COPPER_DOOR.get(), ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get());
                addAfter(entries, ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR.get(), ModBlocks.WAXED_OXIDIZED_COPPER_BULB.get());
                addAfter(entries, Items.REINFORCED_DEEPSLATE, Items.TUFF);
                addAfter(entries, Items.TUFF, ModBlocks.TUFF_STAIRS.get());
                addAfter(entries, ModBlocks.TUFF_STAIRS.get(), ModBlocks.TUFF_SLAB.get());
                addAfter(entries, ModBlocks.TUFF_SLAB.get(), ModBlocks.TUFF_WALL.get());
                addAfter(entries, ModBlocks.TUFF_WALL.get(), ModBlocks.CHISELED_TUFF.get());
                addAfter(entries, ModBlocks.CHISELED_TUFF.get(), ModBlocks.POLISHED_TUFF.get());
                addAfter(entries, ModBlocks.POLISHED_TUFF.get(), ModBlocks.POLISHED_TUFF_STAIRS.get());
                addAfter(entries, ModBlocks.POLISHED_TUFF_STAIRS.get(), ModBlocks.POLISHED_TUFF_SLAB.get());
                addAfter(entries, ModBlocks.POLISHED_TUFF_SLAB.get(), ModBlocks.POLISHED_TUFF_WALL.get());
                addAfter(entries, ModBlocks.POLISHED_TUFF_WALL.get(), ModBlocks.TUFF_BRICKS.get());
                addAfter(entries, ModBlocks.TUFF_BRICKS.get(), ModBlocks.TUFF_BRICK_STAIRS.get());
                addAfter(entries, ModBlocks.TUFF_BRICK_STAIRS.get(), ModBlocks.TUFF_BRICK_SLAB.get());
                addAfter(entries, ModBlocks.TUFF_BRICK_SLAB.get(), ModBlocks.TUFF_BRICK_WALL.get());
                addAfter(entries, ModBlocks.TUFF_BRICK_WALL.get(), ModBlocks.CHISELED_TUFF_BRICKS.get());
            }
            if (tabKey.equals(CreativeModeTabs.INGREDIENTS)) {
                addAfter(entries, Items.PIGLIN_BANNER_PATTERN, ModItems.FLOW_BANNER_PATTERN.get());
                addAfter(entries, ModItems.FLOW_BANNER_PATTERN.get(), ModItems.GUSTER_BANNER_PATTERN.get());

                addAfter(entries, Items.DANGER_POTTERY_SHERD, ModItems.FLOW_POTTERY_SHERD.get());
                addAfter(entries, Items.FRIEND_POTTERY_SHERD, ModItems.GUSTER_POTTERY_SHERD.get());
                addAfter(entries, Items.PRIZE_POTTERY_SHERD, ModItems.SCRAPE_POTTERY_SHERD.get());

                addAfter(entries, Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, ModItems.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE.get());
                addAfter(entries, ModItems.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ModItems.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE.get());
            }
            if (tabKey.equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
                addAfter(entries, Items.MUSIC_DISC_11, ModItems.MUSIC_DISC_CREATOR_MUSIC_BOX.get());
                addAfter(entries, Items.MUSIC_DISC_WAIT, ModItems.MUSIC_DISC_CREATOR.get());
                addAfter(entries, ModItems.MUSIC_DISC_CREATOR.get(), ModItems.MUSIC_DISC_PRECIPICE.get());
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class DataGenerators {
        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            DataGenerator generator = event.getGenerator();
            PackOutput packOutput = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            generator.addProvider(event.includeServer(), new ModRecipeGenerator(packOutput));
            generator.addProvider(event.includeServer(), ModLootTableGenerator.create(packOutput));

            generator.addProvider(event.includeClient(), new ModBlockStateGenerator(packOutput, existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelGenerator(packOutput, existingFileHelper));
            generator.addProvider(event.includeServer(), new ModBannerPatternTagGenerator(packOutput, lookupProvider, existingFileHelper));

            ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                    new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
            generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

            (new ForgeSherdDatagenSuite(event, TrickyTrials.MOD_ID))
                    .makeSherdSuite(ModPotterySherds.FLOW, new Sherd(() -> {
                        return ModItems.FLOW_POTTERY_SHERD.get();
                    }, new ResourceLocation(TrickyTrials.MOD_ID, "flow_pottery_pattern")))
                    .makeSherdSuite(ModPotterySherds.GUSTER, new Sherd(() -> {
                        return ModItems.GUSTER_POTTERY_SHERD.get();
                    }, new ResourceLocation(TrickyTrials.MOD_ID, "guster_pottery_pattern")))
                    .makeSherdSuite(ModPotterySherds.SCRAPE, new Sherd(() -> {
                        return ModItems.SCRAPE_POTTERY_SHERD.get();
                    }, new ResourceLocation(TrickyTrials.MOD_ID, "scrape_pottery_pattern")));
        }
    }
}
