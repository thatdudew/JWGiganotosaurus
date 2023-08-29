
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testsize.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.testsize.client.model.Modeltest1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JwgiganotosaurusModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltest1.LAYER_LOCATION, Modeltest1::createBodyLayer);
	}
}
