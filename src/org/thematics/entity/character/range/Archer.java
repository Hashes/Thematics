package org.thematics.entity.character.range;

import org.thematics.combat.Range;
import org.thematics.entity.character.Character;
import org.thematics.entity.character.Settings;

/**
 * Archer class defining specific traits
 * for the archer character.
 * @author Guillaume
 *
 */
public final class Archer extends Character {

	/**
	 * Creates a new instance of Archer.
	 */
	public Archer() {
		super(new Range(), Settings.ARCHER_HITPOINTS);
	}
	
}
