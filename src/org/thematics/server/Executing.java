package org.thematics.server;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.thematics.server.world.WorldExecuting;

/**
 * The concurrency threads used for server tasks.
 * @author Guillaume
 *
 */
public final class Executing {
	
	/**
	 * The world tick processed every x amount of time.
	 */
	public static ScheduledExecutorService worldTick;
	
	/**
	 * Executes a task once and small tasks
	 * are preferred for it's performance.
	 */
	public static ScheduledExecutorService smallTasks;
	
	/**
	 * Executes a task once: preferred for big tasks.
	 */
	public static ScheduledExecutorService bigTasks;
	
	/**
	 * Initiates the scheduled executors by assigning
	 * a maximum number of threads and their behavior.
	 */
	public static void initExecutors() {
		worldTick = Executors.newSingleThreadScheduledExecutor();
		smallTasks = Executors.newSingleThreadScheduledExecutor();
		bigTasks = Executors.newScheduledThreadPool(2);
		
		WorldExecuting.init();
	}
	
	/**
	 * Shuts down the scheduled executors.
	 */
	public static void shutdown() {
		worldTick.shutdown();
		smallTasks.shutdown();
		bigTasks.shutdown();
	}
}
