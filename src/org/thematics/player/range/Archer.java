package org.thematics.player.range;

import org.thematics.player.Player;
import org.thematics.player.Settings;
import org.thematics.player.combat.Range;

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
		super(new Range(), Settings.ARCHER_HITPOINTS);
	}
	
}
