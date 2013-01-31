package org.thematics.npc;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

public class NpcCombat extends Combat {

	public void attack(Entity entity) {
		System.out.println("Npc attacking.");
	}

	public boolean canAttack() {
		return false;
	}	
}
