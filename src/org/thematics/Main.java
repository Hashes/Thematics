package org.thematics;

import org.thematics.server.Server;
import org.thematics.server.player.Player;
import org.thematics.server.player.melee.Soldier;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;


/**
 * Entry point of the program.
 * @author Guillaume
 *
 */
public class Main {

	/**
	 * @param args 
	 * 
	 */
	public static void main(String[] args) {
		Log.log("Starting Thematics...", Level.INFO);
		Server.start();
		Log.log("Thematics launched.", Level.INFO);
		Player player = new Soldier();
		player.start();
	}
}
