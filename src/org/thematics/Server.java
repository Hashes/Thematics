package org.thematics;

import org.thematics.io.Channel;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class Server {

	public static void start() {
		new Channel();
		Log.log("Creating the world...", Level.INFO);
		World world = World.getWorld();
		world.initWorld();
		Log.log("Finished creating the world.", Level.INFO);
	}
	
}
