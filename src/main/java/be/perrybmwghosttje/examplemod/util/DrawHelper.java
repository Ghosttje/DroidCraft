package be.perrybmwghosttje.examplemod.util;

import com.sun.prism.Texture;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 2/08/2015.
 */
public class DrawHelper {

    private static final float TWOPI = (float)Math.PI*2;

    public static void glRect(int x, int y, int width, int height, float lineWidth) {
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glLineWidth(lineWidth);
        GL11.glBegin(GL11.GL_LINE_LOOP);
        GL11.glVertex2f(x, y);
        GL11.glVertex2f(x + width, y);
        GL11.glVertex2f(x + width, y + height);
        GL11.glVertex2f(x, y + height);
        GL11. glEnd();
    }

    public static void glFillRect(int x, int y, int width, int height) {
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glRecti(x, y, x + width, y + height);
    }

    public static void glCircle(int centerx, int centery, float radius, int slices) {
        float step = TWOPI/slices;
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBegin(GL11.GL_LINE_LOOP);
        for(float angle = 0.0f; angle < TWOPI; angle += step)
            GL11.glVertex2f(centerx + (float) Math.cos(angle) * radius, centery + (float) Math.sin(angle) * radius);
        GL11.glEnd();
    }

    public static void glFillCircle(int centerx, int centery, float radius, int slices) {
        float step = TWOPI/slices;
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glBegin(GL11.GL_TRIANGLE_FAN);
        for(float angle = 0.0f; angle < TWOPI; angle += step)
            GL11.glVertex2f(centerx + (float) Math.cos(angle) * radius, centery + (float) Math.sin(angle) * radius);
        GL11.glEnd();
    }
}
