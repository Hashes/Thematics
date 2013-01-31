package org.thematics.player.combat;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

/**
 * Defines melee attacks.
 * @author Guillaume
 *
 */
public class Melee implements Combat {

	private static final long serialVersionUID = 8992816812324462739L;

	@Override
	public void attack(Entity entity) {
		System.out.println("Melee attack.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
