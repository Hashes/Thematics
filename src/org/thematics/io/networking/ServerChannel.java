package org.thematics.io.networking;

import java.net.InetSocketAddress;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelException;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class ServerChannel {
	
	private static final int PORT= 43594;
	private static ServerBootstrap bootstrap;
	
	public ServerChannel() {
		
	}
	
	public void init() {
		ChannelFactory factory = new NioServerSocketChannelFactory();
		
	    bootstrap = new ServerBootstrap(factory);
	       
	    Handler handler = new Handler();
	        
	    ChannelPipeline pipeline = bootstrap.getPipeline();
	    pipeline.addLast("handler", handler);
	        
	    bootstrap.setOption("child.tcpNoDelay", true);
	    bootstrap.setOption("child.keepAlive", true);
	       
	    try {
	    	bootstrap.bind(new InetSocketAddress(PORT));
	    } catch (ChannelException e) {
	    	Log.log("Could not bind the server to port " + PORT + ", shutting down..." , Level.FATAL);
	        shutdown();
	        System.exit(0);
	    }
	        Log.log("Successfully bound on port " + PORT + ".", Level.INFO);
	}
	
	public static final void shutdown() {
		bootstrap.shutdown();
		bootstrap.releaseExternalResources();
	}
}
