package org.thematics.server.npc;

import org.thematics.server.entity.Combat;
import org.thematics.server.entity.Entity;

public class NpcCombat extends Combat {

	/**
	 * The npc attacking.
	 * @param attacker
	 * @param victim
	 */
	public static void attack(Entity attacker, Entity victim) {
		
		System.out.println(attacker.getCombatTypes());
		System.out.println("Npc attacking.");
	}

	public boolean canAttack() {
		return false;
	}
	
	private static void meleeAttack(Entity attacker, Entity victim) {
		
	}
}
