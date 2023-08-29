package net.mcreator.testsize.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.testsize.entity.GiganotosaurusEntity;

public class GiganotosaurusModel extends GeoModel<GiganotosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(GiganotosaurusEntity entity) {
		return new ResourceLocation("jwgiganotosaurus", "animations/jwgiganotosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GiganotosaurusEntity entity) {
		return new ResourceLocation("jwgiganotosaurus", "geo/jwgiganotosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GiganotosaurusEntity entity) {
		return new ResourceLocation("jwgiganotosaurus", "textures/entities/" + entity.getTexture() + ".png");
	}

}
