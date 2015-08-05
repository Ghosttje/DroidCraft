package be.perrybmwghosttje.droidcraft.client.renderer.models;

public class ModelDroid extends ModelBase
{
  //fields
    ModelRenderer droidMiddleBase;
    ModelRenderer droidLegRightBack;
    ModelRenderer droidLegLeftFront;
    ModelRenderer droidLegLeftBack;
    ModelRenderer droidLegRightFront;
    ModelRenderer droidMotorRightBack;
    ModelRenderer droidMotorRightFront;
    ModelRenderer droidMotorLeftFront;
    ModelRenderer droidMotorLeftBack;
    ModelRenderer droidTop;
    ModelRenderer droidBottom;
  
  public ModelDroid()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      droidMiddleBase = new ModelRenderer(this, 0, 0);
      droidMiddleBase.addBox(0F, 0F, 0F, 6, 2, 6);
      droidMiddleBase.setRotationPoint(-3F, 19F, -3F);
      droidMiddleBase.setTextureSize(256, 128);
      droidMiddleBase.mirror = true;
      setRotation(droidMiddleBase, 0F, 0F, 0F);
      droidLegRightBack = new ModelRenderer(this, 27, 0);
      droidLegRightBack.addBox(-6F, 0F, 0F, 6, 1, 1);
      droidLegRightBack.setRotationPoint(6.7F, 21F, 6F);
      droidLegRightBack.setTextureSize(256, 128);
      droidLegRightBack.mirror = true;
      setRotation(droidLegRightBack, 0F, -0.7853982F, 0.2617994F);
      droidLegLeftFront = new ModelRenderer(this, 27, 6);
      droidLegLeftFront.addBox(0F, 0F, 0F, 6, 1, 1);
      droidLegLeftFront.setRotationPoint(-6.2F, 21.1F, -6.9F);
      droidLegLeftFront.setTextureSize(256, 128);
      droidLegLeftFront.mirror = true;
      setRotation(droidLegLeftFront, 0F, -0.7853982F, -0.2617994F);
      droidLegLeftBack = new ModelRenderer(this, 27, 3);
      droidLegLeftBack.addBox(-6F, 0F, 0F, 6, 1, 1);
      droidLegLeftBack.setRotationPoint(-6F, 21F, 6.7F);
      droidLegLeftBack.setTextureSize(256, 128);
      droidLegLeftBack.mirror = true;
      setRotation(droidLegLeftBack, 0F, -2.356194F, 0.2617994F);
      droidLegRightFront = new ModelRenderer(this, 27, 9);
      droidLegRightFront.addBox(0F, 0F, 0F, 6, 1, 1);
      droidLegRightFront.setRotationPoint(6.9F, 21.1F, -6.3F);
      droidLegRightFront.setTextureSize(256, 128);
      droidLegRightFront.mirror = true;
      setRotation(droidLegRightFront, 0F, -2.356194F, -0.2617994F);
      droidMotorRightBack = new ModelRenderer(this, 53, 0);
      droidMotorRightBack.addBox(0F, 0F, 0F, 2, 4, 2);
      droidMotorRightBack.setRotationPoint(5F, 20F, 5F);
      droidMotorRightBack.setTextureSize(256, 128);
      droidMotorRightBack.mirror = true;
      setRotation(droidMotorRightBack, 0F, 0F, 0F);
      droidMotorRightFront = new ModelRenderer(this, 71, 0);
      droidMotorRightFront.addBox(0F, 0F, 0F, 2, 4, 2);
      droidMotorRightFront.setRotationPoint(5F, 20F, -7F);
      droidMotorRightFront.setTextureSize(256, 128);
      droidMotorRightFront.mirror = true;
      setRotation(droidMotorRightFront, 0F, 0F, 0F);
      droidMotorLeftFront = new ModelRenderer(this, 62, 0);
      droidMotorLeftFront.addBox(0F, 0F, 0F, 2, 4, 2);
      droidMotorLeftFront.setRotationPoint(-7F, 20F, -7F);
      droidMotorLeftFront.setTextureSize(256, 128);
      droidMotorLeftFront.mirror = true;
      setRotation(droidMotorLeftFront, 0F, 0F, 0F);
      droidMotorLeftBack = new ModelRenderer(this, 43, 0);
      droidMotorLeftBack.addBox(0F, 0F, 0F, 2, 4, 2);
      droidMotorLeftBack.setRotationPoint(-7F, 20F, 5F);
      droidMotorLeftBack.setTextureSize(256, 128);
      droidMotorLeftBack.mirror = true;
      setRotation(droidMotorLeftBack, 0F, 0F, 0F);
      droidTop = new ModelRenderer(this, 0, 11);
      droidTop.addBox(0F, 0F, 0F, 2, 1, 2);
      droidTop.setRotationPoint(-1F, 18F, -1F);
      droidTop.setTextureSize(256, 128);
      droidTop.mirror = true;
      setRotation(droidTop, 0F, 0F, 0F);
      droidBottom = new ModelRenderer(this, 13, 11);
      droidBottom.addBox(0F, 0F, 0F, 2, 1, 2);
      droidBottom.setRotationPoint(-1F, 21F, -1F);
      droidBottom.setTextureSize(256, 128);
      droidBottom.mirror = true;
      setRotation(droidBottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    droidMiddleBase.render(f5);
    droidLegRightBack.render(f5);
    droidLegLeftFront.render(f5);
    droidLegLeftBack.render(f5);
    droidLegRightFront.render(f5);
    droidMotorRightBack.render(f5);
    droidMotorRightFront.render(f5);
    droidMotorLeftFront.render(f5);
    droidMotorLeftBack.render(f5);
    droidTop.render(f5);
    droidBottom.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
