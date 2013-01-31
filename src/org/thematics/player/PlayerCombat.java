package org.thematics.player;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

public class PlayerCombat extends Combat {

	public void attack(Entity entity) {
		System.out.println("Player attacking.");
	}
	
	public boolean canAttack() {
		return false;
	}
	
}
