import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*;

public class TestTokenizePhoneNumber
{
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream systemOut = System.out;
	
	@Before
	public void setUp()
	{
		System.setOut(new PrintStream(output));
	}
	
	@Test
	public void testConvertPhoneNumber()
	{
		String phoneNumber1 = "(999) 123-4567";
		String phoneNumber2 = "(504) 555-5555";
		String phoneNumber3 = "(111) 111-1111";
		assertEquals(TokenizePhoneNumber.convertPhoneNumber(phoneNumber1), "9991234567");
		assertEquals(TokenizePhoneNumber.convertPhoneNumber(phoneNumber2), "5045555555");
		assertEquals(TokenizePhoneNumber.convertPhoneNumber(phoneNumber3), "1111111111");
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}
}