package net.frozenblock.wild.mod.entity.client.renderer;

import net.frozenblock.wild.mod.WildMod;
import net.frozenblock.wild.mod.entity.client.renderer.model.FrogEntityModel;
import net.frozenblock.wild.mod.entity.client.renderer.model.WardenEntityModel;
import net.frozenblock.wild.mod.entity.common.entity.FrogEntity;
import net.frozenblock.wild.mod.entity.common.entity.WardenEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FrogEntityRenderer <Type extends FrogEntity> extends MobRenderer<Type, FrogEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WildMod.MOD_ID, "textures/entities/frog_entity.png");

    public FrogEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new FrogEntityModel<>(context.bakeLayer(FrogEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {return TEXTURE;}
}

