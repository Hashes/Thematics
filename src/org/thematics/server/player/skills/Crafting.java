package org.thematics.server.player.skills;

import org.thematics.server.player.Player;

public class Crafting implements Skills {

	@Override
	public void process(Player player) {
		System.out.println("Crafting.");
	}

	@Override
	public boolean canProcess(Player player) {
		return false;
	}

}
