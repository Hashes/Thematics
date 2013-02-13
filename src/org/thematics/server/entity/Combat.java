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
