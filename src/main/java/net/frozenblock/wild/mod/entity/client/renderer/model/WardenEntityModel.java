package net.frozenblock.wild.mod.entity.client.renderer.model;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.frozenblock.wild.mod.entity.common.entity.WardenEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class WardenEntityModel<Type extends WardenEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wardenentitymodel"), "main");
	private final ModelPart rig;
	private final ModelPart arms;
	private final ModelPart bone;

	public WardenEntityModel(ModelPart root) {
		this.rig = root.getChild("rig");
		this.arms = root.getChild("arms");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rig = partdefinition.addOrReplaceChild("rig", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = rig.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-9.0F, -21.0F, -5.0F, 18.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, 0.0F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(106, 46).addBox(0.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -12.5F, 0.0F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(106, 36).addBox(-10.0F, -6.5F, 0.0F, 10.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -12.5F, 0.0F));

		PartDefinition left_leg = rig.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(82, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -13.0F, 0.0F));

		PartDefinition right_leg = rig.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(58, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -13.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition right_arm = arms.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(52, 0).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -17.0F, 0.0F));

		PartDefinition left_arm = arms.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(84, 0).addBox(-2.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, -17.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rig.render(poseStack, buffer, packedLight, packedOverlay);
		arms.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}