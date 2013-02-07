package org.thematics.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creates the logger for the server.
 * @author Guillaume
 *
 */
public class Log {
	
	/**
	 * The different loggin levels.
	 * @author Guillaume
	 *
	 */
	public static enum Level {
		INFO,
		WARNING,
		ERROR,
		FATAL;
	}
	
	/**
	 * Logs the desired message with the formatted date.
	 * @param message
	 * @param level
	 */
	public static void log(String message, Level level) {
		SimpleDateFormat date = new SimpleDateFormat("h:mm:ss a");
		String formated = date.format(new Date());
		
		switch(level) {
		case INFO:
			System.err.println("["+ formated + "] " + message);
			break;
		case WARNING:
			System.err.println("["+ formated + "][WARNING] " + message);
			break;
		case ERROR:
			System.err.println("["+ formated + "][ERROR] " + message);
			break;
		case FATAL:
			System.err.println("["+ formated + "][FATAL] " + message);
			break;
		}
	}
}
