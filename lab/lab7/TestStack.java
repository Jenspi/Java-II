
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;//Comment this out and uncomment
//import junit.framework.* and extends TestCase and things will also work

//import junit.framework.*;//Makes TestCase and Asserts work
import java.io.*; //IO Library for testing System.out messages

public class TestStack //extends TestCase
{

	private Stack stack;
	//private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	//private final PrintStream systemOut = System.out;
	
	@Before
	public void setUp()
	{
		stack = new Stack<String>();
		//Output Streams for testing
		//System.setOut(new PrintStream(output));
	}
	
	@Test
	public void testPush()
	{
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");
		assertEquals(stack.toString(), "This\nis\na\nstack\n");
	}

	
	@Test
	public void testPop()
	{
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");

		Object result;
		result = stack.pop();
		assertEquals(result.toString(), "stack");

		result = stack.pop();
		assertEquals(result.toString(), "a");

		result = "This\nis\n";
		assertEquals(stack.toString(), result);
	}

	
	@Test
	public void testPeek()
	{
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");

		Object result;
		result = stack.peek();
		assertEquals(result, "stack");

		result = stack.peek();
		assertEquals(result, "stack");
	}
	

	@After
	public void restoreStreams() {
    	//System.setOut(systemOut);
	}
	
}