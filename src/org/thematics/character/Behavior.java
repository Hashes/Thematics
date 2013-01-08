package org.thematics.character;

import org.thematics.character.mage.Mage;

public class Behavior {

	public void walk(Character character) {
		if (character instanceof Mage)
			System.out.println("Walk");
	}
	
	public void rest() {
		
	}
	
}
