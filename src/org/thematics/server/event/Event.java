package org.thematics.server.event;

import java.util.ArrayList;
import java.util.List;

/**
 * Class containing the specifications for the events.
 * @author Guillaume
 *
 */
public abstract class Event {

	/**
	 * The delay between each event process.
	 */
	private int delay;
	
	/**
	 * The events to be processed.
	 */
	private List<Event> events = new ArrayList<Event>();
	
	/**
	 * An empty constructor with delay initialized with super() call.
	 */
	public Event() {
	}
	
	/**
	 * The processed event instance to initialize the delay.
	 * @param delay
	 */
	protected Event(int delay) {
		this.delay = delay;
	}
	
	/**
	 * Returns the events to be processed.
	 * @return events
	 */
	public List<Event> getEvents() {
		return events;
	}
	
	/**
	 * The delay between each event process.
	 * @return delay
	 */
	public int getDelay() {
		return delay;
	}
	
	/**
	 * The event processed every x amount of time
	 * depending on the delay value.
	 * @param event
	 * 			the event processed.
	 */
	public abstract void processEvent(Event event);
}
