import org.junit.*;//Makes JUnit (annotations etc.) work
import static org.junit.Assert.*;//Makes asserts work. Note, Assert methods are static

public class TestOperations {
	
	private int result;
	private int maxValue = Integer.MAX_VALUE;//2,147,483,647
	private int minValue = Integer.MIN_VALUE;//-2,147,483,648
		
	@Before
	public void setUp(){
		result = 0;
	}
	
	@Test
	public void testAdd(){
		System.out.println("Result testAdd: " + result);
		result = Operations.add(5, 3);
		assertTrue(result == 8);
		result = Operations.add(maxValue, 1);
		assertEquals(result, minValue);
		assertFalse((Operations.add(maxValue, 1)) > 0);
		System.out.println("Result testAdd: " + result);
	}
	
	//tester method for subtract()
	@Test
	public void testSubtract(){
		//First line should be System.out.println("Result testSubtract: " + result);
		System.out.println("Result testSubtract: " + result);
		
		//Do 5 minus 3 using the subtract() method and store the result in variable result
		result = Operations.subtract(5, 3);
		
		//Assert that it is true that result equals 2
		assertTrue(result == 2);
	
		//Do minValue minus 1 using the subtract() method and store the result in variable result
		result = Operations.subtract(minValue, 1);
	
		//Using this value (that is stored in result), write an assertEquals() statement
		assertEquals(result, maxValue);//that will cause the test to pass (ie, a valid assertEquals statement)
	
		//IN ONE LINE subtract 1 from minValue using the subtract method and assert 
		assertFalse(Operations.subtract(minValue, 1) < 0);//that it is false that this value is less than 0
		
		//Last line should be System.out.println("Result testSubtract: " + result);
		System.out.println("Result testSubtract: " + result);
	}//END METHOD
	
	
	//#TODO
	//tester method for multiply()
	@Test
	public void testMultiply(){
		//First line should be System.out.println("Result testMultiply: " + result);
		System.out.println("Result testMultiply: " + result);
		
		//Do 5 times 3 using the multiply() method and store the result in variable result
		result = Operations.multiply(5, 3);
		
		//Assert that it is true that result equals 15
		assertTrue(result == 15);
	
		//Do 1073741824 times 2 using the multiply() method and store the result in variable result
		result = Operations.multiply(1073741824, 2);
		
		//Using this value (that is stored in result), write an assertEquals() statement
		//that will cause the test to pass (ie, a valid assertEquals statement)
		assertEquals(result, minValue);
	
		//IN ONE LINE multiply 1073741824 by 2 using the multiply method and assert
		//that it is false that this value is greater than 0
		assertFalse(Operations.multiply(1073741824, 2) > 0);
	
		//Last line should be System.out.println("Result testMultiply: " + result);
		System.out.println("Result testMultiply: " + result);

	}//END METHOD
	
	
	
	@Test
	public void testDivide(){
		
		result = Operations.divide(5, 3);
		assertTrue(result == 1);
		
		String errorMessage = "";
		
		try {
			Operations.divide(3, 0);
		} catch (ArithmeticException e) {
			errorMessage = e.getMessage();
		}
		
		System.out.println(errorMessage);
		assertTrue(errorMessage.equals("Divide by 0!"));
	}

}
