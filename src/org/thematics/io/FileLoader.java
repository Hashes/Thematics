package org.thematics.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileLoader implements Serializable {

	private static final long serialVersionUID = 2949997069915938262L;
	
	public static void writeToFile(Serializable s, File file) {
		ObjectOutputStream output;
		
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(s);
			
			output.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	public static Object readFromFile(File file) throws FileNotFoundException, IOException, ClassNotFoundException  {
		ObjectInputStream input;
			
		if (!file.exists())
			return null;
		
		input = new ObjectInputStream(new FileInputStream(file));
		Object object = input.readObject();
		input.close();
		
		return object;
	}
}
