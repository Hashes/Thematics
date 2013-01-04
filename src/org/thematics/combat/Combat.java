package org.thematics.combat;

/**
 * Interface handling general combat.
 * @author Guillaume
 *
 */
public interface Combat {

	/**
	 * Defines the way the character will attack
	 * and which attack style he will use.
	 */
	public void attack();
	
	/**
	 * Defines if a player can attck or not.
	 * @return canAttack
	 */
	public boolean canAttack();
	
}
