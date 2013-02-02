package org.thematics.npc;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

public class NpcCombat extends Combat {

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
