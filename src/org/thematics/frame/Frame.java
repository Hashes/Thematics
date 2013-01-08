package org.thematics.frame;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 * Handles the creation of a new frame
 * @author Guillaume
 *
 */
public class Frame {
	
	/**
	 * Frame constructor; instantiates a new frame
	 */
	public Frame() {
	}
	
	/**
	 * Creates the frame and updates it if 
	 * no close request is sent by the user
	 */
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(FrameSettings.FRAME_WIDTH,
					FrameSettings.FRAME_HEIGHT));
			Display.setTitle(FrameSettings.FRAME_NAME + " frame");
			Display.create();
		} catch (LWJGLException exception) {
			exception.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
		
		while (!Display.isCloseRequested()) {
			draw();
			Display.update();
			Display.sync(60);
		}
	}
	
	private void draw() {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		
		glBegin(GL_TRIANGLES);
		
		glColor3f(1.0f, 0, 0);
		glVertex2f(-0.75f, 0.75f);
		glColor3f(0, 1.0f, 0);
		glVertex2f(0.75f, 0.75f);
		glColor3f(0, 0, 1.0f);
		glVertex2f(0.75f, -0.75f);
		
		
		glEnd();
	}
}
