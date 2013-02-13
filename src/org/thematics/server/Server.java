package org.thematics.server;

import org.thematics.server.world.World;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class Server {

	public static void start() {
		Log.log("Creating the world...", Level.INFO);
		World.getWorld().initWorld();
		Log.log("Finished creating the world.", Level.INFO);
	}
	
}
