
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testsize.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.testsize.entity.GiganotosaurusEntity;
import net.mcreator.testsize.JwgiganotosaurusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JwgiganotosaurusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JwgiganotosaurusMod.MODID);
	public static final RegistryObject<EntityType<GiganotosaurusEntity>> GIGANOTOSAURUS = register("giganotosaurus",
			EntityType.Builder.<GiganotosaurusEntity>of(GiganotosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GiganotosaurusEntity::new)

					.sized(2.5f, 4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GiganotosaurusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GIGANOTOSAURUS.get(), GiganotosaurusEntity.createAttributes().build());
	}
}
