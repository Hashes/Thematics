package org.thematics.player.melee;

import org.thematics.player.Player;
import org.thematics.player.Settings;
import org.thematics.player.combat.Melee;

/**
 * Soldier class defining specific traits
 * for the soldier character.
 * @author Guillaume
 *
 */
public final class Soldier extends Player {

	private static final long serialVersionUID = -9029451886958466300L;

	/**
	 * Creates a new instance of Soldier.
	 */
	public Soldier() {
		super(new Melee(), Settings.SOLDIER_HITPOINTS);
	}
	
}
