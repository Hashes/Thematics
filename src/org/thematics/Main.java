package org.thematics;

import java.awt.EventQueue;

import org.thematics.frame.Frame;

/**
 * Entry point of the program.
 * @author Guillaume
 *
 */
public class Main {

	/**
	 * @param args 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
	}
}
