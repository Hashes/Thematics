package org.thematics.npc;

import org.thematics.entity.Combat.CombatTypes;
import org.thematics.entity.Entity;

public final class Npc extends Entity {
	
	/**
	 * Creates a new non-player character.
	 * @param combat
	 * @param hitpoints
	 */
	public Npc(CombatTypes combatTypes, int hitpoints) {
		super(combatTypes, hitpoints);
	}
	
	/**
	 * Sets the combat as melee for default
	 * along with 10 hitpoints.
	 */
	public Npc() {
		this(CombatTypes.MELEE, 10);
	}
	
}
