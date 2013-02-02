package org.thematics.entity;

import org.thematics.npc.NpcCombat;
import org.thematics.player.Player;
import org.thematics.player.PlayerCombat;

/**
 * Class handling general combat.
 * @author Guillaume
 *
 */
public abstract class Combat {

	public static enum CombatTypes {
		MELEE,
		RANGE,
		MAGIC;
	}
	
	public static void attack(Entity attacker, Entity victim) {
		if (attacker instanceof Player)
			PlayerCombat.attack(attacker, victim);
		else
			NpcCombat.attack(attacker, victim);
	}
}
