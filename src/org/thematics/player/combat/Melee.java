package org.thematics.player.combat;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

/**
 * Defines melee attacks.
 * @author Guillaume
 *
 */
public class Melee implements Combat {

	@Override
	public void attack(Entity entity) {
		
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}