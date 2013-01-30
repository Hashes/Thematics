package org.thematics.player.combat;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

/**
 * Defines range attacks.
 * @author Guillaume
 *
 */
public class Range implements Combat {

	public Range() {
		
	}

	@Override
	public void attack(Entity entity) {
		System.out.println("Range attack.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
