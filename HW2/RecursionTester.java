import static org.junit.Assert.*;
import org.junit.*;
public class RecursionTester{

	private static String appleString, appcapString, orangeString, alphabetString, alphaString, a1, a2;
	private static int result;
	private static String outcome;

	@BeforeClass
	public static void setupStrings(){
		appleString = "apple";
		appcapString = "APPLE";
		orangeString = "orange";
		alphabetString = "alphabet";
		alphaString = "alpha";
		a1 = "aaaaa";
		a2 = "aaa";
	}

	@After
	public void resetValues(){
		result = 99999;
		outcome = "";
	}

	//////////// compare(): ////////////
	/* Rules:
	   String 1 comes before String 2 if compare() returns -1;
	   String 1 is indistinguisable from String 2 if compare() returns 0;
	   String 2 comes before String 1 if compare() returns 1;
	*/

	@Test
	public void caseTest(){
		// apple vs. APPLE
		assertEquals(0, Recursion.compare(appleString, appcapString));
	}

	@Test
	public void standardOrderTest(){

		// a vs. z
		assertEquals(-1, Recursion.compare("a", "b"));
		// z vs. a
		assertEquals(1, Recursion.compare("b", "a"));

		// apple vs. orange
		assertEquals(-1, Recursion.compare(appleString, orangeString));
		// orange vs. apple
		assertEquals(1, Recursion.compare(orangeString, appleString));
	}

	@Test
	public void lengthTest(){
		// alpha vs. alphabet
		assertEquals(-1, Recursion.compare(alphaString, alphabetString));

		// aaaaa vs. aaa
		assertEquals(1, Recursion.compare(a1, a2));
	}

	/////////// findMinimum(): ///////////

	@Test
	public void stringTest(){
		String[] substrings = new String[]{"alpha", "alpine", "alpaca"};

		outcome = Recursion.findMinimum(substrings, substrings.length);
		assertEquals("alpaca", outcome);
	}

	@Test
	public void oneStringTest(){
		String[] one = new String[]{"hello"};
		assertTrue(Recursion.findMinimum(one, one.length).equals("hello"));
	}

}//end Tester
