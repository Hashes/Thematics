package org.thematics.io;

import org.thematics.server.player.Player;


/**
 * Class to handle when a player logs in.
 * @author Guillaume
 *
 */
public class Login {

	public Login() {
		
	}
	
	/**
	 * The login : handles both new players and existing players.
	 * @param frame
	 */
	/*public void login() {
		Player player;
		try {
			// Creates a new account and creates a default player.
			/*if (FilesManager.readFromFile(new File("data/characters/" + frame.getUsername() + ".ser")) == null) {
				player = new Player();
				//initNewPlayer(player, frame);
				return;
			}
			
			// Assigns the player object by reading the proper text file.
			player = (Player) FilesManager.readFromFile(new File("data/characters/" + frame.getUsername() + ".ser"));*/
			
			/*if (!frame.getEncryptedPassword().equals(player.getPassword())) {
	        	 JOptionPane.showMessageDialog(frame,
	                     "Invalid password. Try again.",
	                     "Wrong password.",
	                     JOptionPane.ERROR_MESSAGE);
				return;
			}*/
			
			/*System.out.println("You successfully login. Welcome, " + player.getUsername() + "!");
			//frame.dispose();
			player.start();
		} catch (ClassNotFoundException | IOException  e) {
			e.printStackTrace();
		}
	}
	*/
	/**
	 * Initiates the new player, complete information
	 * and create the file to save.
	 * @param player
	 * @param frame
	 */
	private void initNewPlayer(Player player) {
		/*if (!player.hasProperUsername(frame.getUsername())) {
			JOptionPane.showMessageDialog(frame, 
					"Your username may only contain letters and numbers.",
					"Wrong username.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if (frame.getPassword().isEmpty() || frame.getPassword().length() < 6) {
			JOptionPane.showMessageDialog(frame, 
					"Your password must be at least 6 characters long.",
					"Too short password.",
					JOptionPane.ERROR_MESSAGE);
			return;
		}*/
	}
}
