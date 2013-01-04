package org.thematics.combat;

/**
 * Defines melee attacks.
 * @author Guillaume
 *
 */
public class Melee implements Combat {

	@Override
	public void attack() {
		System.out.println("I attack with melee.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
