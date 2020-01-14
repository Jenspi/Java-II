/**
* A simple JUnit test for StringMaker.
*
* @author	Christian Roos
* @version	August 18th, 2019
*/
import org.junit.*;
import static org.junit.Assert.*;

public class StringMakerTest {
	
	@Test 
	public void testConcatenate() {
        StringMaker myStringMaker = new StringMaker();

        String result = myStringMaker.concatenate("Howdy", " ho!");

        assertEquals(result, "Howdy ho!");
    }
}