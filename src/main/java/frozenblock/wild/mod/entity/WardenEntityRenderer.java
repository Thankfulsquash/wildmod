package frozenblock.wild.mod.entity;

import frozenblock.wild.mod.WildMod;
import frozenblock.wild.mod.WildModClient;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WardenEntityRenderer extends GeoEntityRenderer<WardenEntity> {
    public ExampleGeoRenderer(EntityRenderDispatcher renderManager)
    {
        super(renderManager, new WardenEntityModel());
        this.shadowRadius = 0.7F; //change 0.7 to the desired shadow size.
    }
    private static final Identifier WARDEN_TEXTURE = new Identifier(WildMod.MOD_ID, "textures/entity/warden/warden.png");
    private static final Identifier SECRET_WARDEN_TEXTURE = new Identifier(WildMod.MOD_ID, "textures/entity/warden/secret_warden.png");


    public WardenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new WardenEntityModel(context.getPart(WildModClient.MODEL_WARDEN_LAYER)), 0.5f);
        this.addFeature(new WardenEntitySoulsFeatureRenderer(this));
        this.addFeature(new WardenEntityOverlayFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(WardenEntity entity) {
        String string = Formatting.strip(entity.getName().getString());
        if (string != null && "Osmiooo".equals(string)) {
            return SECRET_WARDEN_TEXTURE;
        }
            return WARDEN_TEXTURE;
    }
}
