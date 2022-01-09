package net.frozenblock.wild.mod.entity.client.event;


import net.frozenblock.wild.mod.WildMod;
import net.frozenblock.wild.mod.entity.client.renderer.WardenEntityRenderer;
import net.frozenblock.wild.mod.entity.client.renderer.model.WardenEntityModel;
import net.frozenblock.wild.mod.entity.event.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents() {


    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WardenEntityModel.LAYER_LOCATION, WardenEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.WARDEN_ENTITY.get(), WardenEntityRenderer::new);
    }
 }
