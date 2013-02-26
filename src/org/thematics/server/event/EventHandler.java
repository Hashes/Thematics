package org.thematics.server.event;

import java.util.concurrent.TimeUnit;

import org.thematics.server.Executing;

public class EventHandler {

	/**
	 * The event instance to be processed.
	 */
	private Event event;
	
	/**
	 * Adds an event in the list to be processed and 
	 * initializes the event instance.
	 * @param event
	 */
	public void startEvent(Event event) {
		event.getEvents().add(event);
		this.event = event;
	}

	/**
	 * Processes all the events from the list with a delay
	 * determined with the constructor of the class.
	 */
	public void process() {
		Executing.bigTasks.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				for (Event events : event.getEvents())
					events.processEvent(events);
			}
			
		}, 0, event.getDelay(), TimeUnit.MILLISECONDS);
	}
}
