package net.frozenblock.wild.mod.entity.event;

import net.frozenblock.wild.mod.WildMod;
import net.frozenblock.wild.mod.entity.common.entity.FrogEntity;
import net.frozenblock.wild.mod.entity.common.entity.WardenEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    private ModEntityTypes() {
    }

    public static DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, WildMod.MOD_ID);


    public static final RegistryObject<EntityType<WardenEntity>> WARDEN_ENTITY = ENTITIES.register("warden_entity",
            () -> EntityType.Builder.of(WardenEntity::new, MobCategory.MONSTER).sized(4f, 4f)
                    .build(new ResourceLocation(WildMod.MOD_ID, "warden_entity").toString()));


    public static final RegistryObject<EntityType<FrogEntity>> FROG_ENTITY = ENTITIES.register("frog_entity",
            () -> EntityType.Builder.of(FrogEntity::new, MobCategory.AMBIENT).sized(4f, 4f)
                    .build(new ResourceLocation(WildMod.MOD_ID, "frog_entity").toString()));

}
