package org.thematics.server.world;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.thematics.server.entity.Entity;

/**
 * The class to create the array for the entities.
 * @author Guillaume
 *
 * @param <E>
 * 		to create generics only with an entity.
 */
public class WorldEntity<E extends Entity> implements Iterable<E> {

	/**
	 * The index we're at when reading the array.
	 */
	private int index = 0;
	/**
	 * The maximum capacity of the array and list.
	 */
	private int capacity;
	
	/**
	 * An array containing the entities in the world.
	 */
	private Entity[] entities;
	/**
	 * A list containing the entities in the world
	 * so we don't get null when removing an entity.
	 */
	private List<Entity> noNullEntities;
	
	/**
	 * Creates a new instance and initialises the array/list
	 * along with their capacity.
	 * @param capacity
	 */
	public WorldEntity(int capacity) {
		entities = new Entity[capacity];
		noNullEntities = new ArrayList<Entity>();
		this.capacity = capacity;
	}
	
	/**
	 * Adds a player to the array and increase the array.
	 * Synchronized to make sure another thread doesn't access
	 * the array while the index hasn't been increased.
	 * @param entity
	 */
	public void addEntity(E entity) {
		synchronized(this) {
			if (this.entities[index] != null)
				return;
			
			this.entities[index] = entity;
			noNullEntities.add(index, entity);
			increaseIndex();
		}
	}
	
	/**
	 * Removes a player to the array and decrease the array.
	 * Synchronized to make sure another thread doesn't access
	 * the array while the index hasn't been decreased.
	 * @param entity
	 */
	public void removeEntity(E entity) {
		synchronized(this) {
			int index = getIndex(entity);
			entities[index] = null;
			noNullEntities.remove(entity);
			decreaseIndex();
		}
	}
	
	/**
	 * Returns an entity in the arraylist.
	 * @param entity
	 * @return the entity
	 */
	@SuppressWarnings("unchecked")
	public E get(E entity) {
		return (E) noNullEntities.get(noNullEntities.indexOf(entity));
	}
	
	/**
	 * Returns the index depending on the entity.
	 * @param entity
	 * @return the index
	 */
	private int getIndex(E entity) {
		for (int i = 0; i < entities.length; i++)
			if (entities[i].equals(entity))
				return i;
		
		return 0;
	}
	
	/**
	 * Increases the index and make sure it
	 * doesn't go over the maximum capacity.
	 */
	private void increaseIndex() {
		if (index > capacity) {
			index = capacity;
			return;
		}
		
		index++;
	}
	
	/**
	 * Decreases the index and makes sure it
	 * doesn't go below 0.
	 */
	private void decreaseIndex() {
		if (index < 0) {
			index = 0;
			return;
		}
		
		index--;
	}
	
	/**
	 * Returns the length of the array.
	 * @return array length
	 */
	public int getLength() {
		return entities.length;
	}
	
	/**
	 * Returns the number of entities in the world.
	 * The method below is suggested since it's less prompt
	 * to errors and avoids useless calculations.
	 * @return number
	 */
	public int getNumberOf() {
		int entities = 0;
		for (int i = 0; i < this.entities.length; i++)
			if (this.entities[i] != null)
				entities++;
		
		return entities;
	}
	
	/**
	 * Returns the number of entities in the world.
	 * @return size of arraylist
	 */
	public int getNumberOfEntities() {
		return noNullEntities.size();
	}

	/**
	 * An iterator so we can loop through the
	 * entities list with the for loop.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Iterator<E> iterator() {
		 Iterator<E> iterator = (Iterator<E>) noNullEntities.iterator();
	     return iterator; 
	}
}
