package org.thematics.combat;

/**
 * Defines range attacks.
 * @author Guillaume
 *
 */
public class Range implements Combat {

	public Range() {
		
	}

	@Override
	public void attack() {
		System.out.println("Range attack.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
