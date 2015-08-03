package be.perrybmwghosttje.droidcraft.client.renderer.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAutoMiner extends ModelBase {
    //fields
    ModelRenderer QuarryBase;
    ModelRenderer Pick1;
    ModelRenderer Pick2;
    ModelRenderer Pick3;
    ModelRenderer Pick4;
    ModelRenderer Pick5;
    ModelRenderer Pick6;
    ModelRenderer Pick7;
    ModelRenderer Pick8;
    ModelRenderer Pick9;
    ModelRenderer Pick10;
    ModelRenderer Pick11;
    ModelRenderer Pick12;
    ModelRenderer Pick13;
    ModelRenderer Pick14;
    ModelRenderer Pick15;
    ModelRenderer Pick16;
    ModelRenderer Pick17;
    ModelRenderer Pick18;

    public ModelAutoMiner() {
        textureWidth = 128;
        textureHeight = 64;

        QuarryBase = new ModelRenderer(this, 0, 0);
        QuarryBase.addBox(0F, 0F, 0F, 16, 15, 16);
        QuarryBase.setRotationPoint(-8F, 9F, -8F);
        QuarryBase.setTextureSize(128, 64);
        QuarryBase.mirror = true;
        setRotation(QuarryBase, 0F, 0F, 0F);
        Pick1 = new ModelRenderer(this, 64, 0);
        Pick1.addBox(0F, 0F, 6F, 1, 1, 2);
        Pick1.setRotationPoint(-7F, 8F, -13F);
        Pick1.setTextureSize(128, 64);
        Pick1.mirror = true;
        setRotation(Pick1, 0F, 0F, 0F);
        Pick2 = new ModelRenderer(this, 64, 10);
        Pick2.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick2.setRotationPoint(-6F, 8F, -7F);
        Pick2.setTextureSize(128, 64);
        Pick2.mirror = true;
        setRotation(Pick2, 0F, 0F, 0F);
        Pick3 = new ModelRenderer(this, 64, 14);
        Pick3.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick3.setRotationPoint(-5F, 8F, -6F);
        Pick3.setTextureSize(128, 64);
        Pick3.mirror = true;
        setRotation(Pick3, 0F, 0F, 0F);
        Pick4 = new ModelRenderer(this, 64, 18);
        Pick4.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick4.setRotationPoint(-4F, 8F, -5F);
        Pick4.setTextureSize(128, 64);
        Pick4.mirror = true;
        setRotation(Pick4, 0F, 0F, 0F);
        Pick5 = new ModelRenderer(this, 64, 22);
        Pick5.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick5.setRotationPoint(-3F, 8F, -4F);
        Pick5.setTextureSize(128, 64);
        Pick5.mirror = true;
        setRotation(Pick5, 0F, 0F, 0F);
        Pick6 = new ModelRenderer(this, 64, 26);
        Pick6.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick6.setRotationPoint(-2F, 8F, -3F);
        Pick6.setTextureSize(128, 64);
        Pick6.mirror = true;
        setRotation(Pick6, 0F, 0F, 0F);
        Pick7 = new ModelRenderer(this, 64, 30);
        Pick7.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick7.setRotationPoint(-1F, 8F, -2F);
        Pick7.setTextureSize(128, 64);
        Pick7.mirror = true;
        setRotation(Pick7, 0F, 0F, 0F);
        Pick8 = new ModelRenderer(this, 64, 34);
        Pick8.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick8.setRotationPoint(0F, 8F, -1F);
        Pick8.setTextureSize(128, 64);
        Pick8.mirror = true;
        setRotation(Pick8, 0F, 0F, 0F);
        Pick9 = new ModelRenderer(this, 64, 38);
        Pick9.addBox(0F, 0F, 0F, 1, 1, 3);
        Pick9.setRotationPoint(1F, 8F, 0F);
        Pick9.setTextureSize(128, 64);
        Pick9.mirror = true;
        setRotation(Pick9, 0F, 0F, 0F);
        Pick10 = new ModelRenderer(this, 64, 42);
        Pick10.addBox(0F, 0F, 0F, 1, 1, 2);
        Pick10.setRotationPoint(2F, 8F, 1F);
        Pick10.setTextureSize(128, 64);
        Pick10.mirror = true;
        setRotation(Pick10, 0F, 0F, 0F);
        Pick11 = new ModelRenderer(this, 64, 47);
        Pick11.addBox(0F, 0F, 0F, 1, 1, 1);
        Pick11.setRotationPoint(3F, 8F, 3F);
        Pick11.setTextureSize(128, 64);
        Pick11.mirror = true;
        setRotation(Pick11, 0F, 0F, 0F);
        Pick12 = new ModelRenderer(this, 64, 49);
        Pick12.addBox(0F, 0F, 0F, 1, 1, 1);
        Pick12.setRotationPoint(4F, 8F, 4F);
        Pick12.setTextureSize(128, 64);
        Pick12.mirror = true;
        setRotation(Pick12, 0F, 0F, 0F);
        Pick13 = new ModelRenderer(this, 76, 5);
        Pick13.addBox(0F, 0F, 0F, 1, 1, 8);
        Pick13.setRotationPoint(4F, 8F, -4F);
        Pick13.setTextureSize(128, 64);
        Pick13.mirror = true;
        setRotation(Pick13, 0F, 0F, 0F);
        Pick14 = new ModelRenderer(this, 75, 2);
        Pick14.addBox(0F, 0F, 0F, 8, 1, 1);
        Pick14.setRotationPoint(-4F, 8F, 4F);
        Pick14.setTextureSize(128, 64);
        Pick14.mirror = true;
        setRotation(Pick14, 0F, 0F, 0F);
        Pick15 = new ModelRenderer(this, 4, 33);
        Pick15.addBox(0F, 0F, 0F, 1, 1, 5);
        Pick15.setRotationPoint(5F, 8F, -3F);
        Pick15.setTextureSize(128, 64);
        Pick15.mirror = true;
        setRotation(Pick15, 0F, 0F, 0F);
        Pick16 = new ModelRenderer(this, 4, 41);
        Pick16.addBox(0F, 0F, 0F, 5, 1, 1);
        Pick16.setRotationPoint(-3F, 8F, 5F);
        Pick16.setTextureSize(128, 64);
        Pick16.mirror = true;
        setRotation(Pick16, 0F, 0F, 0F);
        Pick17 = new ModelRenderer(this, 2, 45);
        Pick17.addBox(0F, 0F, 0F, 1, 1, 6);
        Pick17.setRotationPoint(3F, 8F, -3F);
        Pick17.setTextureSize(128, 64);
        Pick17.mirror = true;
        setRotation(Pick17, 0F, 0F, 0F);
        Pick18 = new ModelRenderer(this, 19, 33);
        Pick18.addBox(0F, 0F, 0F, 5, 1, 1);
        Pick18.setRotationPoint(-2F, 8F, 3F);
        Pick18.setTextureSize(128, 64);
        Pick18.mirror = true;
        setRotation(Pick18, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        QuarryBase.render(f5);
        Pick1.render(f5);
        Pick2.render(f5);
        Pick3.render(f5);
        Pick4.render(f5);
        Pick5.render(f5);
        Pick6.render(f5);
        Pick7.render(f5);
        Pick8.render(f5);
        Pick9.render(f5);
        Pick10.render(f5);
        Pick11.render(f5);
        Pick12.render(f5);
        Pick13.render(f5);
        Pick14.render(f5);
        Pick15.render(f5);
        Pick16.render(f5);
        Pick17.render(f5);
        Pick18.render(f5);
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
