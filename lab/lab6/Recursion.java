public class Recursion {

	public static void main(String[] args) {
		System.out.println("Fibonacci: " + fibonacci(10));
		System.out.println("Factorial: " + factorial(5));
		System.out.println(stringIterator("Beware M. Bison's psycho power!"));

	}
	
	//Fibonacci: Each term equals the sum of prior two terms.
	//By definition, term 0 is 0 and term 1 is 1. These are our base cases.
	//Term 0: 0
	//Term 1: 1
	//Term 2: Term 0 + Term 1 = 0 + 1 = 1
	//Term 3: Term 1 + Term 2 = 1 + 1 = 2
	//Term 4: Term 2 + Term 3 = 1 + 2 = 3
	//Term 5: Term 3 + Term 4 = 2 + 3 = 5
	public static int fibonacci(int nthTerm) {
		if (nthTerm == 0 || nthTerm == 1) {
			return nthTerm;
		} else {
			return fibonacci(nthTerm-1) + fibonacci(nthTerm-2);
		}
	}
	
	//Factorial: Factorial is denoted by "!". Factorial means multiplying
	//the number by all of the integers less than that number down to
	//and including 1. For example, 5! = 5 x 4 x 3 x 2 x 1 = 120
	//This also happens to mean that the factorial of a number is equal to
	//that number multiplied by the factorial of the number one less than itself.
	//For example, 5! = 5 x 4!, because 4! = 4 x 3 x 2 x 1.
	//Similarly, 4! = 4 x 3!, because 3! = 3 x 2 x 1. This means that
	//5! = 5 x 4 x 3!, and so on. We can follow this pattern right up
	//until we get to 5! = 5 x 4 x 3 x 2 x 1!. Because we know that
	//1! = 1, once we reach 1!, our problem becomes solvable.
	//By definition, 1! and 0! both equal 1. These are our base cases.
	
	//Implement a method which takes an int, n, as an argument
	//and returns the factorial of that number.
	public static int factorial(int n) {
		System.out.println("n: " + n);//Keep this line
		//#TODO
		//base case:
		if(n==0 || n==1){
			return 1;
		}
		//recursive case:
		else{
			return n * factorial(n-1);
		}
	}
	
	//Here we will work with Strings. This method will iterate through
	//the characters in a string (remember, strings are just arrays of chars),
	//starting from the last character, moving all the way down to the first character.
	//If the character at the last position in the string is 'M', it will return
	//that character. If not, the method will call itself, using as an argument
	//the string that is one character shorter than the previous string. The purpose
	//of this task is simply to illustrate that recursion can essentially be used
	//to do iteration.
	
	//Hint: This task can be done with 3 methods from the String class:
	//.length(), .charAt() and .substring().
	public static char stringIterator(String string) {	
		if (string.charAt(/*TODO*/string.length()-1) == 'M') {
			return /*TODO*/string.charAt(string.length()-1);
		} else {
			System.out.println(string);//Keep this line
			return /*#TODO*/stringIterator(string.substring(0, string.length()-1));
		}
	}
}
