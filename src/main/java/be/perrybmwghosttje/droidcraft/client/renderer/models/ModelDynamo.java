package be.perrybmwghosttje.droidcraft.client.renderer.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDynamo extends ModelBase {
    //fields
    ModelRenderer BottomBase;
    ModelRenderer RightBackSupport;
    ModelRenderer LeftBackSupport;
    ModelRenderer LeftFrontSupport;
    ModelRenderer RightFrontSupport;
    ModelRenderer LeftBackLeg;
    ModelRenderer LeftFrontLeg;
    ModelRenderer RightFrontLeg;
    ModelRenderer RightBackLeg;
    ModelRenderer MiddleCoil;
    ModelRenderer ProtectingBaseOfTheCoil;
    ModelRenderer FrontDisk;
    ModelRenderer BackDisk;
    ModelRenderer FrontHorizontalSupport;
    ModelRenderer BackHorizontalSupport;
    ModelRenderer LeftHorizontalSupport;
    ModelRenderer RightHorizontalSupport;
    ModelRenderer ElecSafety;
    ModelRenderer HorSafety;
    ModelRenderer HorizontalSafty;

    public ModelDynamo() {
        textureWidth = 256;
        textureHeight = 128;

        BottomBase = new ModelRenderer(this, 0, 0);
        BottomBase.addBox(0F, 0F, 0F, 16, 1, 16);
        BottomBase.setRotationPoint(-8F, 23F, -8F);
        BottomBase.setTextureSize(256, 128);
        BottomBase.mirror = true;
        setRotation(BottomBase, 0F, 0F, 0F);
        RightBackSupport = new ModelRenderer(this, 0, 18);
        RightBackSupport.addBox(0F, 0F, 0F, 1, 15, 1);
        RightBackSupport.setRotationPoint(7F, 8F, -8F);
        RightBackSupport.setTextureSize(256, 128);
        RightBackSupport.mirror = true;
        setRotation(RightBackSupport, 0F, 0F, 0F);
        LeftBackSupport = new ModelRenderer(this, 5, 18);
        LeftBackSupport.addBox(0F, 0F, 0F, 1, 15, 1);
        LeftBackSupport.setRotationPoint(7F, 8F, 7F);
        LeftBackSupport.setTextureSize(256, 128);
        LeftBackSupport.mirror = true;
        setRotation(LeftBackSupport, 0F, 0F, 0F);
        LeftFrontSupport = new ModelRenderer(this, 0, 35);
        LeftFrontSupport.addBox(0F, 0F, 0F, 1, 15, 1);
        LeftFrontSupport.setRotationPoint(-8F, 8F, 7F);
        LeftFrontSupport.setTextureSize(256, 128);
        LeftFrontSupport.mirror = true;
        setRotation(LeftFrontSupport, 0F, 0F, 0F);
        RightFrontSupport = new ModelRenderer(this, 5, 35);
        RightFrontSupport.addBox(0F, 0F, 0F, 1, 15, 1);
        RightFrontSupport.setRotationPoint(-8F, 8F, -8F);
        RightFrontSupport.setTextureSize(256, 128);
        RightFrontSupport.mirror = true;
        setRotation(RightFrontSupport, 0F, 0F, 0F);
        LeftBackLeg = new ModelRenderer(this, 67, 0);
        LeftBackLeg.addBox(0F, 0F, 0F, 1, 2, 1);
        LeftBackLeg.setRotationPoint(2F, 21F, 2F);
        LeftBackLeg.setTextureSize(256, 128);
        LeftBackLeg.mirror = true;
        setRotation(LeftBackLeg, 0F, 0F, 0F);
        LeftFrontLeg = new ModelRenderer(this, 67, 5);
        LeftFrontLeg.addBox(0F, 0F, 0F, 1, 2, 1);
        LeftFrontLeg.setRotationPoint(-3F, 21F, 2F);
        LeftFrontLeg.setTextureSize(256, 128);
        LeftFrontLeg.mirror = true;
        setRotation(LeftFrontLeg, 0F, 0F, 0F);
        RightFrontLeg = new ModelRenderer(this, 67, 16);
        RightFrontLeg.addBox(0F, 0F, 0F, 1, 2, 1);
        RightFrontLeg.setRotationPoint(-3F, 21F, -3F);
        RightFrontLeg.setTextureSize(256, 128);
        RightFrontLeg.mirror = true;
        setRotation(RightFrontLeg, 0F, 0F, 0F);
        RightBackLeg = new ModelRenderer(this, 67, 10);
        RightBackLeg.addBox(0F, 0F, 0F, 1, 2, 1);
        RightBackLeg.setRotationPoint(2F, 21F, -3F);
        RightBackLeg.setTextureSize(256, 128);
        RightBackLeg.mirror = true;
        setRotation(RightBackLeg, 0F, 0F, 0F);
        MiddleCoil = new ModelRenderer(this, 15, 20);
        MiddleCoil.addBox(0F, 0F, 0F, 16, 2, 2);
        MiddleCoil.setRotationPoint(-8F, 16F, -1F);
        MiddleCoil.setTextureSize(256, 128);
        MiddleCoil.mirror = true;
        setRotation(MiddleCoil, 0F, 0F, 0F);
        ProtectingBaseOfTheCoil = new ModelRenderer(this, 77, 0);
        ProtectingBaseOfTheCoil.addBox(0F, 0F, 0F, 12, 8, 8);
        ProtectingBaseOfTheCoil.setRotationPoint(-6F, 13F, -4F);
        ProtectingBaseOfTheCoil.setTextureSize(256, 128);
        ProtectingBaseOfTheCoil.mirror = true;
        setRotation(ProtectingBaseOfTheCoil, 0F, 0F, 0F);
        FrontDisk = new ModelRenderer(this, 155, 0);
        FrontDisk.addBox(0F, 0F, 0F, 1, 4, 4);
        FrontDisk.setRotationPoint(-7F, 15F, -2F);
        FrontDisk.setTextureSize(256, 128);
        FrontDisk.mirror = true;
        setRotation(FrontDisk, 0F, 0F, 0F);
        BackDisk = new ModelRenderer(this, 155, 10);
        BackDisk.addBox(0F, 0F, 0F, 1, 4, 4);
        BackDisk.setRotationPoint(6F, 15F, -2F);
        BackDisk.setTextureSize(256, 128);
        BackDisk.mirror = true;
        setRotation(BackDisk, 0F, 0F, 0F);
        FrontHorizontalSupport = new ModelRenderer(this, 120, 50);
        FrontHorizontalSupport.addBox(0F, 0F, 0F, 1, 3, 14);
        FrontHorizontalSupport.setRotationPoint(-8F, 8F, -7F);
        FrontHorizontalSupport.setTextureSize(256, 128);
        FrontHorizontalSupport.mirror = true;
        setRotation(FrontHorizontalSupport, 0F, 0F, 0F);
        BackHorizontalSupport = new ModelRenderer(this, 120, 0);
        BackHorizontalSupport.addBox(0F, 0F, 0F, 1, 1, 14);
        BackHorizontalSupport.setRotationPoint(7F, 8F, -7F);
        BackHorizontalSupport.setTextureSize(256, 128);
        BackHorizontalSupport.mirror = true;
        setRotation(BackHorizontalSupport, 0F, 0F, 0F);
        LeftHorizontalSupport = new ModelRenderer(this, 120, 20);
        LeftHorizontalSupport.addBox(0F, 0F, 0F, 14, 1, 1);
        LeftHorizontalSupport.setRotationPoint(-7F, 8F, 7F);
        LeftHorizontalSupport.setTextureSize(256, 128);
        LeftHorizontalSupport.mirror = true;
        setRotation(LeftHorizontalSupport, 0F, 0F, 0F);
        RightHorizontalSupport = new ModelRenderer(this, 120, 28);
        RightHorizontalSupport.addBox(0F, 0F, 0F, 14, 1, 1);
        RightHorizontalSupport.setRotationPoint(-7F, 8F, -8F);
        RightHorizontalSupport.setTextureSize(256, 128);
        RightHorizontalSupport.mirror = true;
        setRotation(RightHorizontalSupport, 0F, 0F, 0F);
        ElecSafety = new ModelRenderer(this, 100, 50);
        ElecSafety.addBox(0F, 0F, 0F, 2, 5, 2);
        ElecSafety.setRotationPoint(-1F, 8F, -1F);
        ElecSafety.setTextureSize(256, 128);
        ElecSafety.mirror = true;
        setRotation(ElecSafety, 0F, 0F, 0F);
        HorSafety = new ModelRenderer(this, 220, 0);
        HorSafety.addBox(0F, 0F, 0F, 4, 1, 4);
        HorSafety.setRotationPoint(-2F, 9F, -2F);
        HorSafety.setTextureSize(256, 128);
        HorSafety.mirror = true;
        setRotation(HorSafety, 0F, 0F, 0F);
        HorizontalSafty = new ModelRenderer(this, 220, 35);
        HorizontalSafty.addBox(0F, 0F, 0F, 4, 1, 4);
        HorizontalSafty.setRotationPoint(-2F, 11F, -2F);
        HorizontalSafty.setTextureSize(256, 128);
        HorizontalSafty.mirror = true;
        setRotation(HorizontalSafty, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        BottomBase.render(f5);
        RightBackSupport.render(f5);
        LeftBackSupport.render(f5);
        LeftFrontSupport.render(f5);
        RightFrontSupport.render(f5);
        LeftBackLeg.render(f5);
        LeftFrontLeg.render(f5);
        RightFrontLeg.render(f5);
        RightBackLeg.render(f5);
        MiddleCoil.render(f5);
        ProtectingBaseOfTheCoil.render(f5);
        FrontDisk.render(f5);
        BackDisk.render(f5);
        FrontHorizontalSupport.render(f5);
        BackHorizontalSupport.render(f5);
        LeftHorizontalSupport.render(f5);
        RightHorizontalSupport.render(f5);
        ElecSafety.render(f5);
        HorSafety.render(f5);
        HorizontalSafty.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
