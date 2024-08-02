package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TrickyTrials.MOD_ID);

    public static final RegistryObject<PaintingVariant> MEDITATIVE =
            PAINTINGS.register("meditative", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> PRAIRIE_RIDE =
            PAINTINGS.register("prairie_ride", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> BAROQUE =
            PAINTINGS.register("baroque", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> HUMBLE =
            PAINTINGS.register("humble", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> BOUQUET =
            PAINTINGS.register("bouquet", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> CAVEBIRD =
            PAINTINGS.register("cavebird", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> COTAN =
            PAINTINGS.register("cotan", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> ENDBOSS =
            PAINTINGS.register("endboss", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> FERN =
            PAINTINGS.register("fern", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> OWLEMONS =
            PAINTINGS.register("owlemons", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> SUNFLOWERS =
            PAINTINGS.register("sunflowers", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> TIDES =
            PAINTINGS.register("tides", () -> new PaintingVariant(48, 48));
    public static final RegistryObject<PaintingVariant> BACKYARD =
            PAINTINGS.register("backyard", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> POND =
            PAINTINGS.register("pond", () -> new PaintingVariant(48, 64));
    public static final RegistryObject<PaintingVariant> CHANGING =
            PAINTINGS.register("changing", () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> FINDING =
            PAINTINGS.register("finding", () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> LOWMIST =
            PAINTINGS.register("lowmist", () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> PASSAGE =
            PAINTINGS.register("passage", () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> UNPACKED =
            PAINTINGS.register("unpacked", () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> ORB =
            PAINTINGS.register("orb", () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }
}
