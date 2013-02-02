package org.thematics;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.thematics.io.FilesManager;
import org.thematics.player.Player;

/**
 * Class to handle when a player logs in.
 * @author Guillaume
 *
 */
public class Login {

	public Login() {
		
	}
	
	public void login(Player player) {
		String username;
		String password;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please enter your username.");
			username = scanner.next();
			player.setUsername(username);
		} while (!player.hasProperUsername(username));
		
		System.out.println("Please enter your password.");
		password = scanner.next();
		player.setPassword(password);
		
		try {
			// Must keep it to not change player info if he already exist.
			if (FilesManager.readFromFile(new File(username + ".txt")) == null)
				FilesManager.writeToFile(player, new File(username + ".txt"));
			
			// Assigns the player object by reading the proper text file.
			player = (Player) FilesManager.readFromFile(new File(username + ".txt"));
			
			if (!password.equals(player.getPassword())) {
				System.out.println("Wrong password, please try again.");
				return;
			}
			
			System.out.println("You successfully login. Welcome, " + player.getUsername() + "!");
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	
}
