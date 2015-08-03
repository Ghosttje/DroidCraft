package be.perrybmwghosttje.droidcraft.client.renderer.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWirelessCharger extends ModelBase
{
  //fields
    ModelRenderer BottomSupport;
    ModelRenderer VerticalSender;
    ModelRenderer FirstHorizontalSender;
    ModelRenderer SecondHorizontalSender;
    ModelRenderer ThirdHorizontalSender;
    ModelRenderer BottomSupport2;
  
  public ModelWirelessCharger()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      BottomSupport = new ModelRenderer(this, 0, 0);
      BottomSupport.addBox(0F, 0F, 0F, 16, 1, 16);
      BottomSupport.setRotationPoint(-8F, 23F, -8F);
      BottomSupport.setTextureSize(128, 64);
      BottomSupport.mirror = true;
      setRotation(BottomSupport, 0F, 0F, 0F);
      VerticalSender = new ModelRenderer(this, 0, 20);
      VerticalSender.addBox(0F, 0F, 0F, 2, 15, 2);
      VerticalSender.setRotationPoint(-1F, 8F, -1F);
      VerticalSender.setTextureSize(128, 64);
      VerticalSender.mirror = true;
      setRotation(VerticalSender, 0F, 0F, 0F);
      FirstHorizontalSender = new ModelRenderer(this, 9, 20);
      FirstHorizontalSender.addBox(0F, 0F, 0F, 8, 1, 8);
      FirstHorizontalSender.setRotationPoint(-4F, 18F, -4F);
      FirstHorizontalSender.setTextureSize(128, 64);
      FirstHorizontalSender.mirror = true;
      setRotation(FirstHorizontalSender, 0F, 0F, 0F);
      SecondHorizontalSender = new ModelRenderer(this, 9, 30);
      SecondHorizontalSender.addBox(0F, 0F, 0F, 6, 1, 6);
      SecondHorizontalSender.setRotationPoint(-3F, 14F, -3F);
      SecondHorizontalSender.setTextureSize(128, 64);
      SecondHorizontalSender.mirror = true;
      setRotation(SecondHorizontalSender, 0F, 0F, 0F);
      ThirdHorizontalSender = new ModelRenderer(this, 9, 38);
      ThirdHorizontalSender.addBox(0F, 0F, 0F, 4, 1, 4);
      ThirdHorizontalSender.setRotationPoint(-2F, 10F, -2F);
      ThirdHorizontalSender.setTextureSize(128, 64);
      ThirdHorizontalSender.mirror = true;
      setRotation(ThirdHorizontalSender, 0F, 0F, 0F);
      BottomSupport2 = new ModelRenderer(this, 0, 44);
      BottomSupport2.addBox(0F, 0F, 0F, 14, 1, 14);
      BottomSupport2.setRotationPoint(-7F, 22F, -7F);
      BottomSupport2.setTextureSize(128, 64);
      BottomSupport2.mirror = true;
      setRotation(BottomSupport2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BottomSupport.render(f5);
    VerticalSender.render(f5);
    FirstHorizontalSender.render(f5);
    SecondHorizontalSender.render(f5);
    ThirdHorizontalSender.render(f5);
    BottomSupport2.render(f5);
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
