package org.thematics.server.player.skills;

import org.thematics.server.player.Player;


/**
 * Interface handling general skills actions.
 * @author Guillaume
 *
 */
public interface Skills {

	/**
	 * The skills process, called every game tick (600 milliseconds).
	 * @param player
	 */
	public void process(Player player);
	
	/**
	 * Returns whether the process method can be called or not.
	 * @param player
	 * @return canProcess
	 */
	public boolean canProcess(Player player);
	
}
