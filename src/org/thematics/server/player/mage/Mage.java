package org.thematics.server.player.mage;

import org.thematics.server.entity.Combat.CombatTypes;
import org.thematics.server.player.Player;
import org.thematics.server.player.Settings;

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
		super(CombatTypes.MAGIC, Settings.MAGE_HITPOINTS);
	}
	
}
