import java.util.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;//Comment this out and uncomment
//import junit.framework.* and extends TestCase and things will also work

//import junit.framework.*;//Makes TestCase and Asserts work
import java.io.*; //IO Library for testing System.out messages

public class TestCollections //extends TestCase
{
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream systemOut = System.out;
	
	@Before
	public void setUp()
	{
		//Output Streams for testing
		System.setOut(new PrintStream(output));
	}

	@Test
	public void testCollectionsExercises(){
		output.reset();
		CollectionsExercises.main(null);
		String submission = output.toString().replace("\r", "");
		assertEquals( getExpectedOutput() , submission);
	}

	public String getExpectedOutput(){
		String out = "";
		out += "Are countries 2 and 4 in our map equal?\n";
		out += "The countries are equal\n\n";
		out += "Contents of Set:\n";
		out += "United Kingdom    Blood Pudding   -5\n";
		out += "Countries adjacent to United Kingdom are Canada Japan \n\n"; 
		out += "Canada    Poutine   0\n";
		out += "Countries adjacent to Canada are United Kingdom Japan \n\n"; 
		out += "Japan    O-sushi, Akihito-sama!   9001\n";
		out += "Countries adjacent to Japan are United Kingdom Canada \n\n"; 
		out += "Contents of List:\n";
		out += "United Kingdom    Blood Pudding   -5\n";
		out += "Countries adjacent to United Kingdom are Canada Japan \n\n"; 
		out += "Canada    Poutine   0\n";
		out += "Countries adjacent to Canada are United Kingdom Japan \n\n"; 
		out += "Japan    O-sushi, Akihito-sama!   9001\n";
		out += "Countries adjacent to Japan are United Kingdom Canada \n\n"; 
		out += "Canada    Poutine   0\n";
		out += "Countries adjacent to Canada are United Kingdom Japan \n\n"; 
		out += "Contents of sorted List:\n";
		out += "Canada    Poutine   0\n";
		out += "Countries adjacent to Canada are United Kingdom Japan \n\n"; 
		out += "Canada    Poutine   0\n";
		out += "Countries adjacent to Canada are United Kingdom Japan \n\n"; 
		out += "Japan    O-sushi, Akihito-sama!   9001\n";
		out += "Countries adjacent to Japan are United Kingdom Canada \n\n"; 
		out += "United Kingdom    Blood Pudding   -5\n";
		out += "Countries adjacent to United Kingdom are Canada Japan \n\n";
		return out;
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}

/* 
*/
	
}