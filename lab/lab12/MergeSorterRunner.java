/**
* A class that runs MergeSorter and passes in an
* unsorted array of integers.
*/
import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSorterRunner {

	public static void main(String[] args){
		SecureRandom numGen = new SecureRandom();
		int[] data = numGen.ints(10, 1, 100).toArray();
		
		System.out.printf("Unsorted Array: %s%n%n", Arrays.toString(data));
		MergeSorter.mergeSort(data);
		System.out.printf("Sorted Array: %s%n", Arrays.toString(data));
	}
}