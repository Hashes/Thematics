package org.thematics.io;

import org.jboss.netty.buffer.ChannelBuffer;

public class InputStream {

	/**
	 * The input streams buffer.
	 */
	ChannelBuffer buffer;
	
	/**
	 * The capacity of the buffer.
	 */
	private int capacity;
	
	public InputStream(int capacity) {
		this.capacity = capacity;
	}
}
