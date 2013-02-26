package org.thematics.server.world;

import java.util.concurrent.TimeUnit;

import org.thematics.server.Executing;
import org.thematics.server.event.EventHandler;
import org.thematics.server.event.WorldEvents;
import org.thematics.server.npc.Npc;
import org.thematics.server.player.Player;

public class WorldExecuting {
	
	private static EventHandler events;
	
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
		
		events = new EventHandler();
		events.startEvent(new WorldEvents());
		events.process();
	}
	
	
	
	/**
	 * The tasks processed by the world tick.
	 */
	private static void processWorldTick() {
		for (Player players : World.getWorld().getPlayers())
			players.process();
		
		for (Npc npcs : World.getWorld().getNpcs())
			npcs.process();
		
		System.out.println("This tick is processed every " + DELAY + " milliseconds.");
	}
}
