package com.drd.trickytrials.init;

import com.drd.trickytrials.TrickyTrials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TrickyTrials.MOD_ID);

    public static final RegistryObject<SoundEvent> COPPER_GRATE_BREAK = registerSoundEvents("block.trickytrials.copper_grate.break");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_STEP = registerSoundEvents("block.trickytrials.copper_grate.step");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_PLACE = registerSoundEvents("block.trickytrials.copper_grate.place");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_HIT = registerSoundEvents("block.trickytrials.copper_grate.hit");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_FALL = registerSoundEvents("block.trickytrials.copper_grate.fall");
    public static final RegistryObject<SoundEvent> COPPER_DOOR_OPEN = registerSoundEvents("block.trickytrials.copper_door.open");
    public static final RegistryObject<SoundEvent> COPPER_DOOR_CLOSE = registerSoundEvents("block.trickytrials.copper_door.close");
    public static final RegistryObject<SoundEvent> COPPER_TRAPDOOR_OPEN = registerSoundEvents("block.trickytrials.copper_trapdoor.open");
    public static final RegistryObject<SoundEvent> COPPER_TRAPDOOR_CLOSE = registerSoundEvents("block.trickytrials.copper_trapdoor.close");
    public static final RegistryObject<SoundEvent> COPPER_BULB_BREAK = registerSoundEvents("block.trickytrials.copper_bulb.break");
    public static final RegistryObject<SoundEvent> COPPER_BULB_STEP = registerSoundEvents("block.trickytrials.copper_bulb.step");
    public static final RegistryObject<SoundEvent> COPPER_BULB_PLACE = registerSoundEvents("block.trickytrials.copper_bulb.place");
    public static final RegistryObject<SoundEvent> COPPER_BULB_HIT = registerSoundEvents("block.trickytrials.copper_bulb.hit");
    public static final RegistryObject<SoundEvent> COPPER_BULB_FALL = registerSoundEvents("block.trickytrials.copper_bulb.fall");
    public static final RegistryObject<SoundEvent> COPPER_BULB_TURN_ON = registerSoundEvents("block.trickytrials.copper_bulb.turn_on");
    public static final RegistryObject<SoundEvent> COPPER_BULB_TURN_OFF = registerSoundEvents("block.trickytrials.copper_bulb.turn_off");

    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR = registerSoundEvents("music_disc.trickytrials.creator");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR_MUSIC_BOX = registerSoundEvents("music_disc.trickytrials.creator_music_box");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PRECIPICE = registerSoundEvents("music_disc.trickytrials.precipice");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TrickyTrials.MOD_ID, name)));
    }

    public static final ForgeSoundType COPPER_GRATE = new ForgeSoundType(1f, 1f,
            COPPER_GRATE_BREAK, COPPER_GRATE_STEP, COPPER_GRATE_PLACE,
            COPPER_GRATE_HIT, COPPER_GRATE_FALL);

    public static final ForgeSoundType COPPER_BULB = new ForgeSoundType(1f, 1f,
            COPPER_BULB_BREAK, COPPER_BULB_STEP, COPPER_BULB_PLACE,
            COPPER_BULB_HIT, COPPER_BULB_FALL);

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
