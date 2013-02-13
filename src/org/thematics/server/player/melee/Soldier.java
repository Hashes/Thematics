package org.thematics.server.player.melee;

import org.thematics.server.entity.Combat.CombatTypes;
import org.thematics.server.player.Player;
import org.thematics.server.player.Settings;

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
		super(CombatTypes.MELEE, Settings.SOLDIER_HITPOINTS);
	}
	
}
