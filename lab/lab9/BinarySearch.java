import java.util.*;

public class BinarySearch
{
	private ArrayList<Integer> list;
	private int number; //number we're looking for
	
	public BinarySearch(ArrayList<Integer> list, int value)
	{
		this.list = list;
		this.number = value;
	}
	
	/*This is a binary search. We are searching for a given data element within an
	 * already sorted list. If the list contains the element we are searching for, we
	 * want to return the INDEX in the list at which that element was found. Otherwise,
	 * if the element is not in the list, we will return -1.
	 * 
	 * We begin by searching for the element at the middle index of the list. If we find
	 * the element at that index, we return the value of the middle index. Otherwise, if
	 * the number we are looking for is greater than the value at the middle index of the
	 * list, we start our search again, keeping the value of our high index in the list
	 * the same, but changing the value of our low index in the list to middle index + 1.
	 * 
	 * If the number we are looking for is less than the value at the middle index of the
	 * list, we start our search again, keeping the value of our low index in the list
	 * the same, but changing the value of our high index in the list to middle index - 1.
	 * 
	 * We then recalculate the value of our new middle index and start the process again.
	 * If at some point, the value of our low index becomes greater than the value of our
	 * high index, we know that the element we are looking for is not in the list.
	 * 
	 * The implementation of the binary search has been started for you below. It is your
	 * task to complete the implementation.*/
	public int bSearch(int lowIndex, int highIndex)
	{		
		int middle; 
		boolean foundIndex = false;
		
		while (foundIndex == false) {
			//Set middle index equal to (lowIndex + highIndex)/2
			//On our first iteration of the loop, our lowIndex of our array/list will be 0
			//and our highIndex will be the last index in the array/list (list.size()-1)
			middle = (lowIndex + highIndex)/2;
			//Do not remove this print statement
			System.out.println("high index: " + highIndex
					+ "\tlow index: " + lowIndex + 
					"\tmiddle index: " + middle + System.lineSeparator()
					+ "value at middle index: " + this.list.get(middle));
			
			//If the number we are looking for (this.number) equals the number at the middle index of the list
			//return middle
			if(this.number == this.list.get(middle)){
				return middle;
			}
			//Otherwise, if the number we are looking for is less than the number at the
			//middle of the list, set our high index equal to our middle index minus 1.
			//Otherwise, set our low index equal to our middle index plus 1.
			//#TODO
			else if(this.number < this.list.get(middle)){
				highIndex = middle - 1;
			}
			else if(this.number > this.list.get(middle)){
				lowIndex = middle + 1;
			}
			
			//Finally, test to see if our low index has become greater than our high index
			//If it has, set foundIndex equal to true so that we break out of the loop
			//#TODO
			if(lowIndex > highIndex){
				foundIndex = true;
			}
		}//end while loop
		
		//If value is not found, return -1
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {1,2,7,8,9,18,29,30,66,73};
		ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(numbers));
		BinarySearch search = new BinarySearch(data, 8);
		System.out.println(search.bSearch(0, search.list.size()-1));
	}
}
