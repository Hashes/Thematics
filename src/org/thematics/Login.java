package org.thematics;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.thematics.frame.Frame;
import org.thematics.io.FilesManager;
import org.thematics.player.Player;
import org.thematics.player.melee.Soldier;

/**
 * Class to handle when a player logs in.
 * @author Guillaume
 *
 */
public class Login {

	public Login() {
		
	}
	
	public void login(Frame frame) {
		Player player;
		try {
			// Must keep it to not change player info if he already exist.
			if (FilesManager.readFromFile(new File("data/characters/" + frame.getUsername() + ".ser")) == null) {
				player = new Soldier();
				player.setUsername(frame.getUsername());
				player.setPassword(frame.getPassword());
				FilesManager.writeToFile(player, new File("data/characters/" + frame.getUsername() + ".ser"));
			}
			
			// Assigns the player object by reading the proper text file.
			player = (Player) FilesManager.readFromFile(new File("data/characters/" + frame.getUsername() + ".ser"));
			 
			if (!frame.getPassword().equals(player.getPassword())) {
	        	 JOptionPane.showMessageDialog(frame,
	                     "Invalid password. Try again.",
	                     "Error Message",
	                     JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			System.out.println("You successfully login. Welcome, " + player.getUsername() + "!");
			player.start();
		} catch (ClassNotFoundException | IOException  e) {
			e.printStackTrace();
		}
		
	}
	
}
