package org.thematics.player;

import java.util.regex.Pattern;

import org.thematics.entity.Combat.CombatTypes;
import org.thematics.entity.Entity;

/**
 * Defines specific traits for a player.
 * @author Guillaume
 *
 */
public class Player extends Entity {
	
	private static final long serialVersionUID = -8938021786221710215L;
	
	/**
	 * Class instances
	 */
	
	
	/**
	 * Variables
	 */
	private String username;
	private String password;
	private String characterName;
	private int runEnergy;
	
	/**
	 * Creates a new player.
	 * @param combat
	 */
	public Player(CombatTypes combatTypes, int hitpoints, String username, String password) {
		super(combatTypes, hitpoints);
		this.username = username;
		this.password = password;
		setRunEnergy(100);
	}
	
	public Player(CombatTypes combatTypes, int hitpoints) {
		this(combatTypes, hitpoints, null, null);
	}
	
	public Player() {
		super();
	}
	
	/**
	 * Starts the game once the player is logged in.
	 * 
	 */
	public void start() {
		System.out.println("You are playing as a : " + this.getClass().getSimpleName());
		System.out.println("Your character name is " + this.characterName + ".");
		System.out.println("You have " + getHitpoints() + " hitpoints and " + this.runEnergy + "% run energy.");
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
		this.username = username;
	}
	
	/**
	 * If the player's username contains only letters or numbers.
	 * @param username
	 * @return username meets conditions.
	 */
	public boolean hasProperUsername(String username) {
		return (Pattern.matches("[a-zA-Z0-9]+", username) && !username.isEmpty());
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

	/**
	 * Returns the character's name.
	 * @return characterName.
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Sets the in-game player username.
	 * @param characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}
