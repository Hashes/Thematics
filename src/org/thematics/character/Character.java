package org.thematics.character;

import org.thematics.combat.Combat;

public class Character {

	/**
	 * Class instances
	 */
	private Character character;
	private Behavior behavior;
	private Combat combat;
	
	/**
	 * Variables
	 */
	protected int hitpoints;
	
	/**
	 * Constructor instancing parameters (class).
	 * @param combat
	 */
	protected Character(Combat combat, int hitpoints) {
		this.combat = combat;
	}
	
	@SuppressWarnings("unused")
	private Character() {	
	}
	
	public void attack() {
		combat.attack();
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
	 * Sets the combat instance.
	 * @param combat
	 */
	public void setCombat(Combat combat) {
		this.combat = combat;
	}
	
	/**
	 * Returns the combat instance.
	 * @return combat
	 */
	public Combat getCombat() {
		return combat;
	}
	
	public Behavior getBehavior() {
		if (behavior == null)
			behavior = new Behavior();
		return behavior;
	}
	
}
