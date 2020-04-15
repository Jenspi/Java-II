/**
 @author Jennifer Spicer
 @version v0
*/
import static org.junit.Assert.*;
import org.junit.*;
public class LinkedListTester{

	private static Dog fifi, butch, spot, jack;
	private static LinkedList<Dog> myDogList;

	@BeforeClass
	public static void setup(){
		// setup Dog objects:
		fifi = new Dog("Fifi", 12, 8);
        butch = new Dog("Butch", 10, 10);
        spot = new Dog("Spot", 17, 9);
        jack = new Dog("Jack", 18, 18);
	}

	@Test
	public void testSetup(){
		// make sure setup worked:
		assertTrue(fifi != null);
	}

	//##//##//##//   LIST TESTING   //##//##//##//
	@Test
	public void test___LinkedListMethods(){
		myDogList = new LinkedList<Dog>();

		/*
		  TEST: add(x)
				size()
				get()
				add(x,y)
				indexOf()
				contains()
				toString()
		*/

		myDogList.add(fifi);
		myDogList.add(spot);
		assertEquals(2, myDogList.size());
		assertEquals(fifi, myDogList.get(0));

		myDogList.add(jack, 1);
		assertEquals(myDogList.indexOf(fifi), 0);
		assertEquals(myDogList.indexOf(jack), 1);
		assertEquals(myDogList.indexOf(spot), 2);
		assertEquals(3, myDogList.size());

		assertTrue(myDogList.contains(fifi));
		assertEquals("Dog: Fifi , height: 8 weight: 12", myDogList.get(0).toString());
	}



	//##//##//##//   ITERATOR TESTING   //##//##//##//
	@Test
	public void test___IteratorMethods(){
		myDogList = new LinkedList<Dog>();

		/*
		  TEST: getIterator()
				hasNext()
				next()
				iteratorAt()
				hasPrior()
				prior()
				setToEnd()
		*/

		myDogList.add(fifi);
		myDogList.add(butch);
		myDogList.add(spot);
		myDogList.add(jack);

        Iterator<Dog> iter = myDogList.getIterator();
        assertTrue(iter.hasNext());
        assertEquals(fifi, iter.next());
        assertEquals(butch, iter.next());
       
        Iterator<Dog> iter2 = myDogList.iteratorAt(fifi);
        assertTrue(iter2.hasPrior());
		assertEquals(butch, iter2.prior());
		assertFalse(iter2.hasPrior());

        iter2.setToEnd();
        assertTrue(iter2.hasPrior());
		assertEquals(jack, iter2.prior());
		assertEquals(spot, iter2.prior());
	}
}// end LinkedListTester
