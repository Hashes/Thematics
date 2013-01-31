package org.thematics.npc;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;
import org.thematics.player.combat.Melee;

@SuppressWarnings("serial")
public final class Npc extends Entity {

	/**
	 * Creates a new non-player character.
	 * @param combat
	 * @param hitpoints
	 */
	public Npc(Combat combat, int hitpoints) {
		super(combat, hitpoints);
	}
	
	/**
	 * Sets the combat as melee for default
	 * along with 10 hitpoints.
	 */
	public Npc() {
		this(new Melee(), 10);
	}
	
}
