package org.thematics.character.melee;

import org.thematics.character.Character;
import org.thematics.combat.Melee;

/**
 * Soldier class defining specific traits
 * for the soldier character.
 * @author Guillaume
 *
 */
public class Soldier extends Character {

	/**
	 * Creates a new instance of Soldier.
	 */
	public Soldier() {
		super(new Melee(), 20);
	}
	
}
