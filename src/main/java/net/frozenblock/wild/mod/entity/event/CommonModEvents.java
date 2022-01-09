package net.frozenblock.wild.mod.entity.event;

import net.frozenblock.wild.mod.WildMod;
import net.frozenblock.wild.mod.entity.common.entity.WardenEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.WARDEN_ENTITY.get(), WardenEntity.createAttributes().build());
    }
}
