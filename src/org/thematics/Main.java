package org.thematics;

import org.thematics.player.Player;
import org.thematics.player.melee.Soldier;

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
		Player player = new Soldier();
		
		new Login().login(player);
	}
}
