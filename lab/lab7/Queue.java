//package Lab5;

import java.util.ArrayList;

public class Queue<T> {
	
	private ArrayList<T> elements;
	
	Queue() {
		this.elements = new ArrayList<T>();
	}
	
	//Add an element to the end of the queue
	public void offer(T element) {
		//#TODO
		this.elements.add(element);
	}
	
	//Retrieve (but do NOT remove) an element from the start of the queue
	//If the queue is empty, return null
	public T peek() {
		//#TODO
		if(this.elements.isEmpty()){
			return null;
		}
		else{
			return this.elements.get(0);// returns first element
		}
	}
	
	//Retrieve AND remove an element from the start of the queue
	//If the queue is empty, return null
	public T poll() {
		//#TODO
		if(this.elements.isEmpty()){
			return null;
		}
		else{
			T value = this.elements.get(0);
			this.elements.remove(0);
			return value;
		}
	}
	
	
	public static void main(String[] args) {
		Queue queue = new Queue<String>();
		queue.offer("This");
		queue.offer("is");
		queue.offer("a");
		queue.offer("queue");
		
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek() + System.lineSeparator());
		
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll()+ System.lineSeparator());
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		
		
	}
		

}
