package org.thematics;

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
		new Login().login(new Soldier());
	}
}
