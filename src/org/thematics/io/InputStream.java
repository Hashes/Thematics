package org.thematics.io;

public class InputStream {

	private byte[] buffer;
	
	private int capacity;
	
	public InputStream(int capacity) {
		buffer = new byte[capacity];
		this.capacity = capacity;
	}
}
