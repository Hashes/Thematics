package org.thematics.player.mage;

import org.thematics.player.Player;
import org.thematics.player.Settings;
import org.thematics.player.combat.Magic;

/**
 * Mage class defining specific traits
 * for the mage character.
 * @author Guillaume
 *
 */
public final class Mage extends Player {

	private static final long serialVersionUID = -4653890433595940247L;

	/**
	 * Creates a new instance of Mage
	 */
	public Mage() {
		super(new Magic(), Settings.MAGE_HITPOINTS);
	}
	
}
