package org.thematics.server.player.skills;

import org.thematics.server.player.Player;

public class SkillsHandler {
	
	private Skills skills;

	/**
	 * Processes the skill depending on the skills instance.
	 * @param player
	 */
	public void processSkill(Player player) {
		if (!canProcess(player))
			return;
		if (skills == null)
			return;
		
		skills.process(player);
	}

	/**
	 * If the skill can be processed or not.
	 * @param player
	 * @return
	 */
	public boolean canProcess(Player player) {
		return true;
	}
	
	/**
	 * Sets the skill instance to process it.
	 * @param skills
	 */
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	
	/**
	 * Stops the skills process by assigning it null
	 * so it returns when processing skills.
	 */
	public void stopSkill() {
		skills = null;
	}
}
