package org.thematics.combat;

/**
 * Defines magic attacks.
 * @author Guillaume
 *
 */
public class Magic implements Combat {

	public Magic() {
		
	}
	
	@Override
	public void attack() {
		System.out.println("Magic attack.");
	}

	@Override
	public boolean canAttack() {
		return false;
	}

}
