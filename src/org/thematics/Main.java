package org.thematics;

import org.thematics.server.Server;
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
	}
}
