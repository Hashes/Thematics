package org.thematics.entity.character;

import org.thematics.combat.Combat;
import org.thematics.entity.Entity;

/**
 * The character.
 * @author Guillaume
 *
 */

public class Character extends Entity {

	/**
	 * Class instances
	 */
	private Character character;
	
	/**
	 * Variables
	 */
	private int runEnergy;
	
	/**
	 * Constructor instancing parameters (class).
	 * @param combat
	 */
	protected Character(Combat combat, int hitpoints) {
		super(combat, hitpoints);
		runEnergy = 100;
	}
	
	/**
	 * Initializes a new character.
	 * @param character
	 */
	public void setCharacter(Character character) {
		this.character = character;
	}
	
	/**
	 * Returns the character instance.
	 * @return character
	 */
	public Character getCharacter() {
		return character;
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
