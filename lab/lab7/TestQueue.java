
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;//Comment this out and uncomment
//import junit.framework.* and extends TestCase and things will also work

//import junit.framework.*;//Makes TestCase and Asserts work
import java.io.*; //IO Library for testing System.out messages

public class TestQueue //extends TestCase
{

	private Queue queue;
	//private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	//private final PrintStream systemOut = System.out;
	
	@Before
	public void setUp()
	{
		queue = new Queue<String>();
		//Output Streams for testing
		//System.setOut(new PrintStream(output));
	}
	
	@Test
	public void testOfferAndPeek()
	{
		queue.offer("This");
		queue.offer("is");
		queue.offer("a");
		queue.offer("queue");

		Object result;
		result = queue.peek();
		assertEquals(result.toString(), "This");

		result = queue.peek();
		assertEquals(result.toString(), "This");

		result = queue.peek();
		assertEquals(result.toString(), "This");
	}

	@Test
	public void testOfferAndPoll()
	{
		queue.offer("This");
		queue.offer("is");
		queue.offer("a");
		queue.offer("queue");

		Object result;
		result = queue.poll();
		assertEquals(result.toString(), "This");

		result = queue.poll();
		assertEquals(result.toString(), "is");

		result = queue.poll();
		assertEquals(result.toString(), "a");

		result = queue.poll();
		assertEquals(result.toString(), "queue");
	}

	@Test
	public void testPollAndPeek()
	{
		Object result;
		result = queue.poll();
		assertEquals(result, null);

		result = queue.peek();
		assertEquals(result, null);
	}

	@After
	public void restoreStreams() {
    	//System.setOut(systemOut);
	}
	
}