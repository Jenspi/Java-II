import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*;

public class TestDateFormatConverter
{
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream systemOut = System.out;
	
	@Before
	public void setUp()
	{
		System.setOut(new PrintStream(output));
	}
	
	@Test
	public void numbersToWords()
	{
		assertEquals(DateFormatConverter.numbersToWords("04/25/1955"), "April 25, 1955");
		assertEquals(DateFormatConverter.numbersToWords("11/11/1999"), "November 11, 1999");
		assertEquals(DateFormatConverter.numbersToWords("01/01/2000"), "January 1, 2000");
	}
	
	@Test
	public void wordsToNumbers()
	{
		assertEquals(DateFormatConverter.wordsToNumbers("April 25, 1955"), "04/25/1955");
		assertEquals(DateFormatConverter.wordsToNumbers("November 11, 1999"), "11/11/1999");
		assertEquals(DateFormatConverter.wordsToNumbers("January 1, 2000"), "01/01/2000");
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}
}