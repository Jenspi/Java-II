//#TODO
//Use appropriate imports
//hint: there are a lot!
import java.io.IOException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	//Method that writes one CartoonCharacter object out to a file
	public static void serializeCharacter(CartoonCharacter character) {

		try {
			//#TODO
			//Initialize outputCartoon to serialize objects to a file called Cartoon.ser
			outputCartoon = new ObjectOutputStream(new FileOutputStream("Cartoon.ser"));
			//Write the character object out to the file
			outputCartoon.writeObject(character);
			//Close the stream
			outputCartoon.close();
		}
			catch(IOException e){
				e.printStackTrace();
			}
	}
	
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		
		try{
			//#TODO
			//Initialize inputCartoon to read objects from a file called Cartoon.ser
			inputCartoon = new ObjectInputStream(new FileInputStream("Cartoon.ser"));
			//Read one CartoonCharacter object and store it in variable cartoon
			cartoon = (CartoonCharacter) inputCartoon.readObject();
		}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		return cartoon;
	}
	
	public static void printToFile(String stringToFile) throws FileNotFoundException {
		
		//#TODO
		//Initialize writer to print characters to a file called C-137.txt
		writer = new PrintWriter(new FileOutputStream("C-137.txt"));
		//Print stringToFile to that file
		writer.print(stringToFile);
		//Print the string "PrintWriter makes printing 50 times easier!" followed by a newline character out to the file
		writer.printf("PrintWriter makes printing %d times easier!%n", 50);
		//Close the PrintWriter stream
		writer.close();
	}

}
