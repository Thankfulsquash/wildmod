package frozenblock.wild.mod.entity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class WardenEntityRenderer extends GeoEntityRenderer<WardenEntity> {

    public WardenEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new WardenEntityModel());
        this.shadowRadius = 0.7F;
    }


    @Override
    public RenderLayer getRenderType(WardenEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer, @Nullable VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityCutout(this.getTextureLocation(animatable));
    }
}
