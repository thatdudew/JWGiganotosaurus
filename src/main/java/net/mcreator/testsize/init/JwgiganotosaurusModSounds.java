
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testsize.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.testsize.JwgiganotosaurusMod;

public class JwgiganotosaurusModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JwgiganotosaurusMod.MODID);
	public static final RegistryObject<SoundEvent> HURTGIG = REGISTRY.register("hurtgig", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jwgiganotosaurus", "hurtgig")));
	public static final RegistryObject<SoundEvent> IDEL3 = REGISTRY.register("idel3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jwgiganotosaurus", "idel3")));
	public static final RegistryObject<SoundEvent> WALKSOAND = REGISTRY.register("walksoand", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jwgiganotosaurus", "walksoand")));
}
