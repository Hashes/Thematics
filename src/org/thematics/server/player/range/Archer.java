package org.thematics.server.player.range;

import org.thematics.server.entity.Combat.CombatTypes;
import org.thematics.server.player.Player;
import org.thematics.server.player.Settings;

/**
 * Archer class defining specific traits
 * for the archer character.
 * @author Guillaume
 *
 */
public final class Archer extends Player {

	private static final long serialVersionUID = -163937089487192101L;

	/**
	 * Creates a new instance of Archer.
	 */
	public Archer() {
		super(CombatTypes.RANGE, Settings.ARCHER_HITPOINTS);
	}
	
}
