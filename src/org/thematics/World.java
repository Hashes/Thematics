package org.thematics;

/**
 * The world containing entities and objects.
 * @author Guillaume
 *
 */
public final class World {

	private static World world;
	
	/**
	 * Singleton because we don't want more than 1 world to be created.
	 * @return the world.
	 */
	public static World getWorld() {
		if (world == null)
			world = new World();
		
		return world;
	}
	
	public void initWorld() {
		// TODO add npcs, objects and other things in the world.
	}
	
	/**
	 * So only the singleton can create the world.
	 */
	private World() {
		
	}
	
}
