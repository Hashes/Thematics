package org.thematics.io.networking;

import java.net.InetSocketAddress;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelException;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.thematics.utility.Log;
import org.thematics.utility.Log.Level;

public class Channel extends SimpleChannelHandler {
	
	private static final int PORT= 43594;
	private static ServerBootstrap bootstrap;
	
	public Channel() {
		
	}
	
	public void init() {
		ChannelFactory factory = new NioServerSocketChannelFactory();
		
	        bootstrap = new ServerBootstrap(factory);
	        
	        bootstrap.getPipeline().addLast("handler", this);
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
	
	@Override
	public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
		
	}
	
	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) {
		
	}
	
	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		
	}
	
	@Override
	public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
		
	}
	
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {
		System.out.println((String)e.getMessage());
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent ee) throws Exception {
		
	}
	
	public static final void shutdown() {
		bootstrap.shutdown();
		bootstrap.releaseExternalResources();
	}
}
