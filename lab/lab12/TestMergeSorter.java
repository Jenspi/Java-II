import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*;
import java.security.SecureRandom;
import java.util.Arrays;

public class TestMergeSorter
{
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream systemOut = System.out;
	private int[] data;
    private int[] data2;
	
	@Before
	public void setUp()
	{
		System.setOut(new PrintStream(output));
		data = new int[]{73, 12, 89, 21, 57, 43, 41, 32, 6, 35};
        data2 = new int[]{10, 1};
	}
	
	@Test
	public void testMergeSort()
	{
		int[] result = MergeSorter.mergeSort(data);
        int[] correct = new int[]{6, 12, 21, 32, 35, 41, 43, 57, 73, 89};
		assertArrayEquals(result, correct);
	}
	
	@Test
	public void testSortArray()
	{
        int[] result = MergeSorter.sortArray(data2, 0, 1);
        int[] correct = new int[]{1, 10};
        assertArrayEquals(result, correct);
	}

	@After
	public void restoreStreams() {
    	System.setOut(systemOut);
	}
}
