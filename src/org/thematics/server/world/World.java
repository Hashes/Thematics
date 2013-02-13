package org.thematics.server.world;

import org.thematics.server.Settings;
import org.thematics.server.npc.Npc;
import org.thematics.server.player.Player;

/**
 * The world containing entities and objects.
 * @author Guillaume
 *
 */
public final class World {

	/**
	 * The world singleton.
	 */
	private static World world;
	
	/**
	 * The players in the world with maximum of Settings.MAXIMUM_PLAYERS.
	 */
	private WorldEntity<Player> players = new WorldEntity<Player>(Settings.MAXIMUM_PLAYERS);
	
	/**
	 * The npcs in the world with maximum of Settings.MAXIMUM_NPCS.
	 */
	private WorldEntity<Npc> npcs = new WorldEntity<Npc>(Settings.MAXIMUM_NPCS);
	
	/**
	 * The players of the array.
	 * @return players
	 * 			the players in the world.
	 */
	public WorldEntity<Player> getPlayers() {
		return players;
	}
	
	/**
	 * The npcs of the array.
	 * @return npcs
	 * 			the npcs in the world.
	 */
	public WorldEntity<Npc> getNpcs() {
		return npcs;
	}
	/**
	 * Singleton because we don't want more than 1 world to be created.
	 * @return the world.
	 */
	public static World getWorld() {
		if (world == null)
			world = new World();
		
		return world;
	}
	
	/**
	 * Adds the npcs, players and objects in the world.
	 * Must be called on server launch to initialise everything.
	 */
	public void initWorld() {
		
	}
	
	/**
	 * So only the singleton can create the world.
	 */
	private World() {
		
	}
	
}
