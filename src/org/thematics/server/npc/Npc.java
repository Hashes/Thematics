package org.thematics.server.npc;

import org.thematics.server.entity.Entity;
import org.thematics.server.entity.Combat.CombatTypes;

public final class Npc extends Entity {
	
	private static final long serialVersionUID = 7950349279933113072L;

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
	
	@Override
	public void process() {
		System.out.println("Npcs process.");
	}
}
