package org.thematics;

import java.awt.EventQueue;

import org.thematics.frame.LoginFrame;
import org.thematics.server.Server;
import org.thematics.server.npc.Npc;
import org.thematics.server.player.Player;
import org.thematics.server.player.mage.Mage;
import org.thematics.server.player.melee.Soldier;
import org.thematics.server.world.World;
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
		
		/**
		 * Creates the frame to login.
		 */
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginFrame().setVisible(true);
			}
		});
		
		Log.log("Thematics launched.", Level.INFO);
	}
}
