package org.thematics;

import org.thematics.character.Behavior;
import org.thematics.character.Character;
import org.thematics.character.mage.Mage;
import org.thematics.character.melee.Soldier;
import org.thematics.combat.Magic;
import org.thematics.frame.Frame;

/**
 * Entry point of the program.
 * @author Guillaume
 *
 */
public class Main {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		Character character = new Soldier();
		Frame frame = new Frame();
		character.setCombat(new Magic());
		character.attack();
		frame.start();
		
		character.getBehavior().walk(character);
	}
}
