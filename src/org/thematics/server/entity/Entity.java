package org.thematics.server.entity;

import java.io.Serializable;

import org.thematics.server.entity.Combat.CombatTypes;


/**
 * The entity: player & npc.
 * @author Guillaume
 *
 */
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -7601037320831877391L;

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
	 * @param combatTypes
	 * @param hitpoints
	 */
	protected Entity(CombatTypes combatTypes, int hitpoints) {
		this.combatTypes = combatTypes;
		setHitpoints(hitpoints);
	}

	/**
	 * Used to initiate a new instance of subclasses.
	 */
	protected Entity() {
	}
	
	/**
	 * Created a new entity with 0 as hitpoints.
	 * @param combatTypes
	 */
	protected Entity(CombatTypes combatTypes) {
		this(combatTypes, 0);
	}
	
	/**
	 * Processes and updates the entity every
	 * worldTick delay (600 milliseconds).
	 */
	protected void process() {
		
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
