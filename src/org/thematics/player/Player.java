package org.thematics.player;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

/**
 * Defines specific traits for a player.
 * @author Guillaume
 *
 */
public class Player extends Entity {
	
	private static final long serialVersionUID = -8938021786221710215L;
	
	/**
	 * Variables
	 */
	private int runEnergy;
	
	/**
	 * Creates a new player.
	 * @param combat
	 */
	public Player(Combat combat, int hitpoints) {
		super(combat, hitpoints);
		runEnergy = 100;
	}
	
	public Player() {
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
}
