package org.thematics.server;

import org.thematics.io.FilesManager;
import org.thematics.io.networking.ServerChannel;
import org.thematics.server.player.Player;
import org.thematics.server.world.World;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class Server {

	/**
	 * Starts the server with the threads, the world and everything needed to be
	 * launched on server launching.
	 */
	public static void start() {
		Log.log("Creating the world...", Level.INFO);
		World.getWorld().initWorld();
		Log.log("Finished creating the world.", Level.INFO);
		Log.log("Initiating network handler...", Level.INFO);
		ServerChannel channel = new ServerChannel();
		channel.init();
		Executing.initExecutors();
	}
	
	public static void stopServer() {
		Log.log("Closing the server...", Level.WARNING);
		for (Player player : World.getWorld().getPlayers())
			FilesManager.savePlayer(player);
		ServerChannel.shutdown();
		Executing.shutdown();
		Log.log("Server closed.", Level.INFO);
		System.exit(0);
	}
}
