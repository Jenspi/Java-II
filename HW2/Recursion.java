/**
 This class finds the first String alphabetically in a group of given strings.
	@author Jennifer Spicer
	@version 1.0
*/
public class Recursion{

	private static String s1, s2, minimum;
	private static int counter = 0;
	private static int i = 0;
	private static int chars = 0;
	private static int returnValue = 999999;

	/**
	 @param s1 		First string
	 @param s2 		Second string
	 @return 		First string that would appear alphabetically.
	*/
	public static int compare(String s1, String s2){
		// use alphabetical order as the natural order (case insensitive).
		// changed compareTo() to compare() to make less confusing
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		chars = Math.min(s1.length(), s2.length());

		if(counter < chars){
			// if s1 char comes first
			if(s1.charAt(counter) < s2.charAt(counter)){
				return -1;
			}
			// if s2 char comes first
			else if(s1.charAt(counter) > s2.charAt(counter)){
				return 1;
			}
			// recursive case:
			else if(s1.charAt(counter) == s2.charAt(counter)){
				returnValue = 0;//idk if i need
				counter++;/////
				compare(s1, s2);
			}
		}
		if(returnValue == 0 && s1.length() != s2.length()){
			if(s1.length() < s2.length()){
				//s1 first
				return -1;
			}
			if(s1.length() > s2.length()){
				//s2 first
				return 1;
			}
		}
		return returnValue;
	}//end compare() method

	/**
	 @param stringArray 	Array of strings
	 @param numStrings 		Number of Strings in stringArray
	 @return				First string that would appear alphabetically.
	*/
	public static String findMinimum(String[] stringArray, int numStrings){
		// find the minimum (i.e. first by alphabetical order) String in an array of Strings
		String[] array = stringArray;
		int len = numStrings;
		// if only 1 String in the array, that String is the minimum:
		if(len == 1){
			return array[0];
		}
		if(i<len-1){
			// if String 1 comes before String 2, String 1 is the minimum:
			if(compare(array[i], array[i+1]) <= 0){
				minimum = array[i];
				i++;
				findMinimum(array, len);
			}
			// if String 2 comes before String 1, String 2 is the minimum:
				else{
					if(compare(array[i], array[i+1]) > 0){
						minimum = array[i+1];
						i++;
						findMinimum(array, len);
					}
				}
		}
		if(i==len-1){
			if(compare(array[i], array[0]) <= 0){
					minimum = array[i];
					i++;
					findMinimum(array, len);
				}
				// if String 2 comes before String 1, String 2 is the minimum:
				else{
					if(compare(array[0], array[i]) > 0){
						minimum = array[0];
						i++;
						findMinimum(array, len);
					}
				}
		}
		return minimum;
	}//end findMinimum() method

}//end class
