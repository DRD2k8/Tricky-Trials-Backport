package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import com.drd.trickytrials.block.*;
import com.drd.trickytrials.block.properties.ModBlockSetTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TrickyTrials.MOD_ID);

    public static final RegistryObject<Block> CHISELED_COPPER = registerBlock("chiseled_copper",
            () -> new CustomWeatheringCopperBlock(CustomWeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> EXPOSED_CHISELED_COPPER = registerBlock("exposed_chiseled_copper",
            () -> new CustomWeatheringCopperBlock(CustomWeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> WEATHERED_CHISELED_COPPER = registerBlock("weathered_chiseled_copper",
            () -> new CustomWeatheringCopperBlock(CustomWeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> OXIDIZED_CHISELED_COPPER = registerBlock("oxidized_chiseled_copper",
            () -> new CustomWeatheringCopperBlock(CustomWeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> WAXED_CHISELED_COPPER = registerBlock("waxed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(CHISELED_COPPER.get())));
    public static final RegistryObject<Block> WAXED_EXPOSED_CHISELED_COPPER = registerBlock("waxed_exposed_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(EXPOSED_CHISELED_COPPER.get())));
    public static final RegistryObject<Block> WAXED_WEATHERED_CHISELED_COPPER = registerBlock("waxed_weathered_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(WEATHERED_CHISELED_COPPER.get())));
    public static final RegistryObject<Block> WAXED_OXIDIZED_CHISELED_COPPER = registerBlock("waxed_oxidized_chiseled_copper",
            () -> new Block(BlockBehaviour.Properties.copy(OXIDIZED_CHISELED_COPPER.get())));
    public static final RegistryObject<Block> COPPER_GRATE = registerBlock("copper_grate",
            () -> new WeatheringCopperGrateBlock(CustomWeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE)));
    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate",
            () -> new WeatheringCopperGrateBlock(CustomWeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE)));
    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate",
            () -> new WeatheringCopperGrateBlock(CustomWeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate",
            () -> new WeatheringCopperGrateBlock(CustomWeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_GRATE)));
    public static final RegistryObject<Block> WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate",
            () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.copy(COPPER_GRATE.get())));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate",
            () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_GRATE.get())));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate",
            () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_GRATE.get())));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate",
            () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_GRATE.get())));
    public static final RegistryObject<Block> COPPER_DOOR = registerBlock("copper_door",
            () -> new WeatheringCopperDoorBlock(CustomWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_DOOR = registerBlock("exposed_copper_door",
            () -> new WeatheringCopperDoorBlock(CustomWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_DOOR = registerBlock("weathered_copper_door",
            () -> new WeatheringCopperDoorBlock(CustomWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_DOOR = registerBlock("oxidized_copper_door",
            () -> new WeatheringCopperDoorBlock(CustomWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_COPPER_DOOR = registerBlock("waxed_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_DOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
            () -> new WeatheringCopperTrapDoorBlock(CustomWeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion(), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor",
            () -> new WeatheringCopperTrapDoorBlock(CustomWeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion(), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor",
            () -> new WeatheringCopperTrapDoorBlock(CustomWeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion(), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor",
            () -> new WeatheringCopperTrapDoorBlock(CustomWeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).noOcclusion(), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_TRAPDOOR.get()), ModBlockSetTypes.COPPER));
    public static final RegistryObject<Block> COPPER_BULB = registerBlock("copper_bulb",
            () -> new WeatheringCopperBulbBlock(CustomWeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB)));
    public static final RegistryObject<Block> EXPOSED_COPPER_BULB = registerBlock("exposed_copper_bulb",
            () -> new WeatheringCopperBulbBlock(CustomWeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WEATHERED_COPPER_BULB = registerBlock("weathered_copper_bulb",
            () -> new WeatheringCopperBulbBlock(CustomWeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_BULB = registerBlock("oxidized_copper_bulb",
            () -> new WeatheringCopperBulbBlock(CustomWeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(ModSounds.COPPER_BULB)));
    public static final RegistryObject<Block> WAXED_COPPER_BULB = registerBlock("waxed_copper_bulb",
            () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(COPPER_BULB.get())));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_BULB = registerBlock("waxed_exposed_copper_bulb",
            () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(EXPOSED_COPPER_BULB.get())));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_BULB = registerBlock("waxed_weathered_copper_bulb",
            () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(WEATHERED_COPPER_BULB.get())));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_BULB = registerBlock("waxed_oxidized_copper_bulb",
            () -> new CopperBulbBlock(BlockBehaviour.Properties.copy(OXIDIZED_COPPER_BULB.get())));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
