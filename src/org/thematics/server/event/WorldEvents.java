package org.thematics.server.event;


/**
 * All the events processed every 2000 ms.
 * @author Guillaume
 *
 */
public class WorldEvents extends Event {
	
	public WorldEvents() {
		super(2000);
	}

	@Override
	public void processEvent(Event event) {
		
	}
}
