package org.thematics.server;

import org.thematics.io.FilesManager;
import org.thematics.io.networking.Channel;
import org.thematics.server.player.Player;
import org.thematics.server.world.World.WorldSingleton;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class Server {

	/**
	 * Starts the server with the threads,
	 * the world and everything needed to be
	 * launched on server launching.
	 */
	public static void start() {
		Log.log("Creating the world...", Level.INFO);
		WorldSingleton.INSTANCE.initWorld();
		Log.log("Finished creating the world.", Level.INFO);
		Executing.initExecutors();
		Log.log("Initiating network handler...", Level.INFO);
		Channel channel = new Channel();
		channel.init();
	}
	
	public static void stopServer() {
		for (Player player : WorldSingleton.INSTANCE.getPlayers())
			FilesManager.savePlayer(player);
		Executing.shutdown();
	}
}
