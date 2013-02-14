package org.thematics.server.entity;

import org.thematics.server.npc.NpcCombat;
import org.thematics.server.player.Player;
import org.thematics.server.player.PlayerCombat;

/**
 * Class handling general combat.
 * @author Guillaume
 *
 */
public abstract class Combat {

	/**
	 * The different combat types for entities.
	 * @author Guillaume
	 *
	 */
	public static enum CombatTypes {
		MELEE,
		RANGE,
		MAGIC;
	}
	
	/**
	 * Determines which entity is attacking and access
	 * statically the attack method of the (Entity) class.
	 * @param attacker
	 * @param victim
	 */
	public static void attack(Entity attacker, Entity victim) {
		if (attacker instanceof Player)
			PlayerCombat.attack(attacker, victim);
		else
			NpcCombat.attack(attacker, victim);
	}
}
