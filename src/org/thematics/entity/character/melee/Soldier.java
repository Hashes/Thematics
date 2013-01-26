package org.thematics.entity.character.melee;

import org.thematics.combat.Melee;
import org.thematics.entity.character.Character;
import org.thematics.entity.character.Settings;

/**
 * Soldier class defining specific traits
 * for the soldier character.
 * @author Guillaume
 *
 */
public final class Soldier extends Character {

	/**
	 * Creates a new instance of Soldier.
	 */
	public Soldier() {
		super(new Melee(), Settings.SOLDIER_HITPOINTS);
	}
	
}
