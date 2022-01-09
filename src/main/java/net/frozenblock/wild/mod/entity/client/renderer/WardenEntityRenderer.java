package net.frozenblock.wild.mod.entity.client.renderer;

import net.frozenblock.wild.mod.WildMod;
import net.frozenblock.wild.mod.entity.client.renderer.model.WardenEntityModel;
import net.frozenblock.wild.mod.entity.common.entity.WardenEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WardenEntityRenderer<Type extends WardenEntity> extends MobRenderer<Type, WardenEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WildMod.MOD_ID, "textures/entities/warden_entity.png");

    public WardenEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new WardenEntityModel<>(context.bakeLayer(WardenEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {return TEXTURE;}
}
