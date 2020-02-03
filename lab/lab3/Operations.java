public class Operations {
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int subtract(int x, int y) {
		return x-y;
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	
	public static int divide(int x, int y) {
		//#TODO
		//if y == 0, throw an ArithmeticException
		if(y==0){
			//containing the error message "Divide by 0!" as its argument
			throw new ArithmeticException("Divide by 0!");
		}
		return x/y;
	}
}
