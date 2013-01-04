package org.thematics.frame;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

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
		start();
	}
	
	/**
	 * Creates the frame and updates it if 
	 * no close request is sent by the user
	 */
	private void start() {
		try {
			Display.setDisplayMode(new DisplayMode(600, 600));
			Display.setTitle("Thematics frame");
			Display.create();
			
			while (!Display.isCloseRequested()) {
				Display.update();
				Display.sync(60);
			}
			
		} catch (LWJGLException exception) {
			exception.printStackTrace();
			Display.destroy();
			System.exit(1);
		}
	}
}
