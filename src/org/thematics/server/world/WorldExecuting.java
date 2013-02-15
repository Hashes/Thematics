package org.thematics.server.world;

import java.util.concurrent.TimeUnit;

import org.thematics.server.Executing;
import org.thematics.server.player.Player;
import org.thematics.server.world.World.WorldSingleton;

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
		for (Player players : WorldSingleton.INSTANCE.getPlayers())
			players.process();
		System.out.println("600 ms.");
	}
	
}
