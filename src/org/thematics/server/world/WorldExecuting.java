package org.thematics.server.world;

import java.util.concurrent.TimeUnit;

import org.thematics.server.Executing;

public class WorldExecuting {
	
	private static final int DELAY = 600;

	/**
	 * The tick every DELAY milliseconds that processes
	 * the updates in the world.
	 */
	public static void init() {
		Executing.worldTick.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				processWorldTick();
			}
			
		}, 0, DELAY, TimeUnit.MILLISECONDS);
	};
	
	/**
	 * The tasks processed by the world tick.
	 */
	private static void processWorldTick() {
		
	}
	
}
