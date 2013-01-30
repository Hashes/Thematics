package org.thematics.player.combat;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

/**
 * Defines magic attacks.
 * @author Guillaume
 *
 */
public class Magic implements Combat {

	public Magic() {
		
	}
	
	@Override
	public void attack(Entity entity) {
		System.out.println("Mage attack.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
