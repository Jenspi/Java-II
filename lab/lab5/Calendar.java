import java.io.IOException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Calendar
{
	public static void main (String[] args)
	{
		Event party = new Event ("Fun Party", "2016-03-03 22:00", "French Quarter", "It's Mardi Gras");
		Event test = new Event ("CSCI Party", "2016-03-03 22:00", "UNO", "Because Rocket League");
		ArrayList<Event> eventList = new ArrayList();
		//Add Event objects to ArrayList
		eventList.add(party); eventList.add(test);
		
		//Declare ObjectOutputStreams for writing objects out to disk
		ObjectOutputStream output = null;
		ObjectOutputStream outputList = null;
		
		try
		{
			//Writing objects out, one at a time to file eventFile.ser
			output = new ObjectOutputStream(new FileOutputStream("eventFile.ser"));//ObjectOutputStream does the conversion, FileOutputStream pushes the data
			output.writeObject(party);//Write party Event object out to eventFile.ser on disk
			output.writeObject(test);//Write test Event object out to eventFile.ser on disk
			output.close();//Call .close() to flush any remaining bytes in the stream out to disk and free the memory from the stream
			
			//Writing out a whole list of objects to file eventListFile.ser in one call to writeObject()
			outputList = new ObjectOutputStream(new FileOutputStream("eventListFile.ser"));
			outputList.writeObject(eventList);//Write eventList ArrayList<Event> object out to eventFile.ser on disk
			outputList.close();//Call .close() to flush any remaining bytes in the stream out to disk and free the memory from the stream
		}
		catch (IOException e)//Must include
		{
			e.printStackTrace();
		}
		
		//Declare ObjectInputStreams for reading objects from files on disk
		ObjectInputStream input = null;
		ObjectInputStream inputList = null;
		
		Event event = null;
		
		try
		{
			//Initialize ObjectInputStream to read from file eventFile.ser
			input = new ObjectInputStream(new FileInputStream("eventFile.ser"));//ObjectInputStream does the conversion, FileInputStream pulls the data
			//Read Event objects from file until there are none left to read
			while (true) {
				event = (Event)input.readObject();//IMPORTANT, Serialized object must be cast into its correct type when deserializing!
				System.out.println(event);//Print contents of each event
			}
		}
		catch (ClassNotFoundException e)//Must include
		{
			e.printStackTrace();
		}
		catch (IOException e)//Must include
		{
			try {
				input.close();
				if (e instanceof EOFException) {//When end of file is reached, print this message
					System.out.println("Reached end of file, " + e);
				} else {
					e.printStackTrace();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		eventList = null;//Set our eventList ArrayList equal to null just to demonstrate
		//that it is empty before we read our ArrayList object back into it
		System.out.println(eventList);//Print its contents to show it is null
		
		try {
			//Initialize ObjectInputStream to read from file eventFileList.ser
			inputList = new ObjectInputStream(new FileInputStream("eventListFile.ser"));
			eventList = (ArrayList<Event>) inputList.readObject();//Read in and deserialize the arraylist and assign it to eventlist
			System.out.println(eventList);//print out contents of our deserialized arraylist
			inputList.close();//Call .close() to flush any remaining bytes and free (deallocate) the memory from the stream
		} catch (ClassNotFoundException e) {//Must include
			e.printStackTrace();
		} catch (IOException e) {//Must include
			e.printStackTrace();
		}
		
	}
}
