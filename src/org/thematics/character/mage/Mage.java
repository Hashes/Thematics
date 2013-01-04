package org.thematics.character.mage;

import org.thematics.character.Character;
import org.thematics.combat.Magic;

/**
 * Mage class defining specific traits
 * for the mage character.
 * @author Guillaume
 *
 */
public class Mage extends Character {

	/**
	 * Creates a new instance of Mage
	 */
	public Mage() {
		super(new Magic(), 15);
	}
	
}
