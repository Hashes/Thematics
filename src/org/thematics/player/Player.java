package org.thematics.player;

import java.io.Serializable;
import java.util.regex.Pattern;

import org.thematics.entity.Combat.CombatTypes;
import org.thematics.entity.Entity;

/**
 * Defines specific traits for a player.
 * @author Guillaume
 *
 */
public class Player extends Entity implements Serializable {
	
	private static final long serialVersionUID = -8938021786221710215L;
	
	/**
	 * Class instances
	 */
	
	
	/**
	 * Variables
	 */
	private String username;
	private String password;
	private int runEnergy;
	
	/**
	 * Creates a new player.
	 * @param combat
	 */
	public Player(CombatTypes combatTypes, int hitpoints) {
		super(combatTypes, hitpoints);
		username = null;
		password = null;
		runEnergy = 100;
	}

	/**
	 * Sets the player run energy if not above 100 or below 0.	
	 * @param runEnergy
	 */
	public void setRunEnergy(int runEnergy) {
		this.runEnergy = (runEnergy > 100 ? 100 : runEnergy < 0 ? 0 : runEnergy);
	}
	
	/**
	 * Returns the player's run energy.
	 * @return runEnergy
	 */
	public int getRunEnergy() {
		return runEnergy;
	}

	/**
	 * Returns the player's username.
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the player's username.
	 * @param username
	 */
	public void setUsername(String username) {
		if (!hasProperUsername(username)) {
			System.out.println("Your username may only contain letters and numbers.");
			return;
		}
		this.username = username;
	}
	
	/**
	 * If the player's username contains only letters or numbers.
	 * @param username
	 * @return username meets conditions.
	 */
	public boolean hasProperUsername(String username) {
		return (Pattern.matches("[a-zA-Z0-9]+", username));
	}

	/**
	 * Returns the player's password.
	 * @return password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the player's password.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
