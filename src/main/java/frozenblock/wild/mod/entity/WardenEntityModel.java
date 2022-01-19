package frozenblock.wild.mod.entity;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WardenEntityModel extends AnimatedGeoModel<WardenEntity> {

    @Override
    public Identifier getModelLocation(WardenEntity object) {
        return new Identifier("twm", "geo/entity/warden.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WardenEntity object) {
        return new Identifier("twm", "textures/entity/warden/warden.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WardenEntity animatable) {
        return new Identifier("twm", "animations/entity/warden.animation.json");
    }
}
