package org.thematics.player;

import org.thematics.entity.Entity;
import org.thematics.entity.Combat.CombatTypes;

public class PlayerCombat {

	public static void attack(Entity attacker, Entity victim) {
		if (!canAttack(attacker, victim))
			return;
		
		if (attacker.getCombatTypes() == CombatTypes.MELEE)
			meleeAttack(attacker, victim);
		else if (attacker.getCombatTypes() == CombatTypes.RANGE)
			rangeAttack(attacker, victim);
		else
			magicAttack(attacker, victim);
	}
	
	private static boolean canAttack(Entity attacker, Entity victim) {
		return attacker.getHitpoints() != 10;
	}
	
	private static void meleeAttack(Entity attacker, Entity victim) {
		System.out.println("You attack with melee.");
	}
	
	private static void rangeAttack(Entity attacker, Entity victim) {
		System.out.println("You attack with range.");
	}
	
	private static void magicAttack(Entity attacker, Entity victim) {
		System.out.println("You attack with magic.");
	}
	
}
