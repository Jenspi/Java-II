/**
* A class that creates a SinglyLinkedList object and
* performs the four operations contained in the 
* SinglyLinkedList class.
*
* @author	Christian Roos
* @author	Anthony Marchiafava
* @version	April 7, 2020
*/
public class SinglyLinkedListRunner{

	public static void main(String[] args){
		SinglyLinkedList funList = new SinglyLinkedList("funList");
		
		funList.add(1);
		funList.add(2);
		funList.add(3);
		funList.add(4);
		funList.add(5);
		funList.add(6);
		funList.add(7);
		funList.add(8);
		funList.add(9);
		funList.add(10);
		
		System.out.println("\n" + funList);
		
		funList.removeByElement(1);
		System.out.println(funList);
		
		funList.removeByElement(6);
		System.out.println(funList);
		
		funList.removeByElement(13);
		System.out.println(funList);
		
		funList.removeByIndex(0);
		System.out.println(funList);
		
		funList.removeByIndex(4);
		System.out.println(funList);
		
		funList.removeByIndex(12);
		System.out.println(funList);
		
		funList.addByIndex(0, 1);
		System.out.println(funList);
		
		funList.addByIndex(1, 2);
		System.out.println(funList);
		
		funList.addByIndex(5, 6);
		System.out.println(funList);
		
		funList.addByIndex(7, 8);
		System.out.println(funList);
	}
}