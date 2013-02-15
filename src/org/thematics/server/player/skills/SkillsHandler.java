package org.thematics.server.player.skills;

import org.thematics.server.player.Player;

public class SkillsHandler implements Skills {

	@Override
	public void process(Player player) {
		if (!canProcess(player))
			return;
	}

	@Override
	public boolean canProcess(Player player) {
		return true;
	}
}
