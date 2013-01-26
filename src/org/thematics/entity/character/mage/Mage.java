package org.thematics.entity.character.mage;

import org.thematics.combat.Magic;
import org.thematics.entity.character.Character;
import org.thematics.entity.character.Settings;

/**
 * Mage class defining specific traits
 * for the mage character.
 * @author Guillaume
 *
 */
public final class Mage extends Character {

	/**
	 * Creates a new instance of Mage
	 */
	public Mage() {
		super(new Magic(), Settings.MAGE_HITPOINTS);
	}
	
}
