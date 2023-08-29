
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testsize.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.testsize.JwgiganotosaurusMod;

public class JwgiganotosaurusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JwgiganotosaurusMod.MODID);
	public static final RegistryObject<Item> GIGANOTOSAURUS_SPAWN_EGG = REGISTRY.register("giganotosaurus_spawn_egg", () -> new ForgeSpawnEggItem(JwgiganotosaurusModEntities.GIGANOTOSAURUS, -16777216, -10066432, new Item.Properties()));
}
