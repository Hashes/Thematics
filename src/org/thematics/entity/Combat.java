package org.thematics.entity;

import org.thematics.npc.NpcCombat;
import org.thematics.player.Player;
import org.thematics.player.PlayerCombat;

/**
 * Class handling general combat.
 * @author Guillaume
 *
 */
public class Combat {

	public static enum CombatTypes {
		MELEE,
		RANGE,
		MAGIC;
	}
	
	public void attack(Entity entity) {
		Combat combat;
		if (entity instanceof Player) {
			combat = new PlayerCombat();
			combat.attack(entity);
		}
		else {
			combat = new NpcCombat();
			combat.attack(entity);
		}
	}
}
