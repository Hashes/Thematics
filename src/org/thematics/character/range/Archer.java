package org.thematics.character.range;

import org.thematics.combat.Range;
import org.thematics.character.Character;

/**
 * Archer class defining specific traits
 * for the archer character.
 * @author Guillaume
 *
 */
public class Archer extends Character {

	/**
	 * Creates a new instance of Archer.
	 */
	public Archer() {
		super(new Range(), 15);
	}
	
}
