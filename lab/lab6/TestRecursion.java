
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*;

public class TestRecursion
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
	public void testFibonacci()
	{
		int result = Recursion.fibonacci(10);
		assertEquals(result, 55);
	}

	@Test
	public void testFactorial()
	{
		output.reset();
		int result = Recursion.factorial(5);
		assertEquals(result, 120);
		assertEquals(output.toString(), "n: 5\nn: 4\nn: 3\nn: 2\nn: 1\n");
	}

	@Test
	public void testStringIterator()
	{
		output.reset();
		char result = Recursion.stringIterator("Beware M. Bison's psycho power!");
		assertEquals(result, 'M');
		String solutionText = "Beware M. Bison's psycho power!\n"
							+ "Beware M. Bison's psycho power\n"
							+ "Beware M. Bison's psycho powe\n"
							+ "Beware M. Bison's psycho pow\n"
							+ "Beware M. Bison's psycho po\n"
							+ "Beware M. Bison's psycho p\n"
							+ "Beware M. Bison's psycho \n"
							+ "Beware M. Bison's psycho\n"
							+ "Beware M. Bison's psych\n"
							+ "Beware M. Bison's psyc\n"
							+ "Beware M. Bison's psy\n"
							+ "Beware M. Bison's ps\n"
							+ "Beware M. Bison's p\n"
							+ "Beware M. Bison's \n"
							+ "Beware M. Bison's\n"
							+ "Beware M. Bison'\n"
							+ "Beware M. Bison\n"
							+ "Beware M. Biso\n"
							+ "Beware M. Bis\n"
							+ "Beware M. Bi\n"
							+ "Beware M. B\n"
							+ "Beware M. \n"
							+ "Beware M.\n";
		assertEquals(output.toString(), solutionText);
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}	
}
