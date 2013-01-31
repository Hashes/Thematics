package org.thematics.entity;

import java.io.Serializable;

/**
 * The entity: player & npc.
 * @author Guillaume
 *
 */
public class Entity implements Serializable {

	private static final long serialVersionUID = -8502240702924446695L;

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
		setHitpoints(hitpoints);
	}
	
	protected Entity() {
	}
	
	/**
	 * Created a new entity with 0 as hitpoints.
	 * @param combat
	 */
	protected Entity(Combat combat) {
		this(combat, 0);
	}
	
	/**
	 * The action of attacking.
	 * @param entity
	 * 			the entity attacking.
	 */
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
