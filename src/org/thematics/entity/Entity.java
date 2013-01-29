package org.thematics.entity;

import org.thematics.player.Player;

/**
 * The entity: player & npc.
 * @author Guillaume
 *
 */
public class Entity {

	/**
	 * The class instances.
	 */
	private Combat combat;
	
	/**
	 * The variables.
	 */
	private int hitpoints;
	
	/**
	 * Creates a new entity.
	 * @param combat
	 * @param hitpoints
	 */
	protected Entity(Combat combat, int hitpoints) {
		this.combat = combat;
		this.hitpoints = hitpoints;
	}
	
	/**
	 * Created a new entity with 0 as hitpoints.
	 * @param combat
	 */
	protected Entity(Combat combat) {
		this(combat, 0);
	}
	
	public void attack(Entity entity) {
		combat.attack(entity);
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
