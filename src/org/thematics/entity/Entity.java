package org.thematics.entity;

import org.thematics.entity.Combat.CombatTypes;


/**
 * The entity: player & npc.
 * @author Guillaume
 *
 */
public abstract class Entity {

	/**
	 * The class instances.
	 */
	private Combat combat;
	private CombatTypes combatTypes;
	
	/**
	 * The variables.
	 */
	private int hitpoints;
	
	/**
	 * Creates a new entity.
	 * @param combat
	 * @param hitpoints
	 */
	protected Entity(CombatTypes combatTypes, int hitpoints) {
		this.combatTypes = combatTypes;
		// TODO Combat must be initialized to use attack.
		setHitpoints(hitpoints);
	}
	
	protected Entity() {
	}
	
	/**
	 * Created a new entity with 0 as hitpoints.
	 * @param combat
	 */
	protected Entity(CombatTypes combatTypes) {
		this(combatTypes, 0);
	}
	/**
	 * Defines the way the character will attack
	 * and which attack style he will use.
	 */
	public void attack(Entity entity) {
		combat.attack(entity);
	}
	
	/**
	 * Defines if a player can attck or not.
	 * @return canAttack
	 */
	public abstract boolean canAttack();
	
	/**
	 * The combat type used by the player.
	 * @return combatTypes
	 */
	public CombatTypes getCombatTypes() {
		return combatTypes;
	}
	
	/**
	 * Sets the entity's hitpoints.
	 * @param hitpoints
	 */
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints < 0 ? 0 : hitpoints;
	}
	
	/**
	 * Returns the entity's hitpoints.
	 * @return hitpoints
	 */
	public int getHitpoints() {
		return hitpoints;
	}
}
