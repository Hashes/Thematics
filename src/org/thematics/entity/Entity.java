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
	 * The combat type used by the player.
	 * @return combatTypes
	 */
	public CombatTypes getCombatTypes() {
		return combatTypes;
	}
	
	/**
	 * Sets the entity combat type.
	 * Must be used only when the player
	 * chooses to change his combat type.
	 */
	public void setCombatTypes(CombatTypes combatTypes) {
		this.combatTypes = combatTypes;
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
