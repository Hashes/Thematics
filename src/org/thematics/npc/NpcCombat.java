package org.thematics.npc;

import org.thematics.entity.Combat;
import org.thematics.entity.Entity;

@SuppressWarnings("serial")
public class NpcCombat implements Combat {

	@Override
	public void attack(Entity entity) {
		
	}

	@Override
	public boolean canAttack() {
		return false;
	}	
}
