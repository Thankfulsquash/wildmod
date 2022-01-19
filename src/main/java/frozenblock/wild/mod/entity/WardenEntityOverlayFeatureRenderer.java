package frozenblock.wild.mod.entity;

import frozenblock.wild.mod.WildMod;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

@SuppressWarnings("rawtypes")
public class WardenEntityOverlayFeatureRenderer extends GeoLayerRenderer {
    private static final Identifier MODEL = new Identifier(WildMod.MOD_ID, "geo/entity/warden.geo.json");
    private static final Identifier OVERLAY = new Identifier(WildMod.MOD_ID, "textures/entity/warden/warden_overlay.png");
    public WardenEntityOverlayFeatureRenderer(IGeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, Entity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        RenderLayer eyes =  RenderLayer.getEyes(OVERLAY);
        matrixStackIn.push();
        //Move or scale the model as you see fit
        matrixStackIn.scale(1.0f, 1.0f, 1.0f);
        matrixStackIn.translate(0.0d, 0.0d, 0.0d);
        this.getRenderer().render(this.getEntityModel().getModel(MODEL), entitylivingbaseIn, partialTicks, eyes, matrixStackIn, bufferIn,
                bufferIn.getBuffer(eyes), packedLightIn, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
        matrixStackIn.pop();
    }

}
