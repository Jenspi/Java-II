/**
 @author Jennifer Spicer
 @version v.0
*/
public class LinkedList<T>  {

    Node itsFirstNode;
    Node itsLastNode;
    private int size;


    public LinkedList() {
        itsFirstNode = null;
        itsLastNode = null;
        size = 0;
    }// end constructor

    public int size() {
        return this.size;
    }
    
    public Iterator<T> getIterator() {
        return new Iterator<T>(this);
    }

    // MODIFIED FOR DOUBLY LINKED LIST:
    // append element
    public void add(T element) {

        Node node = new Node(element);

        if (itsFirstNode == null) {
            itsFirstNode = node;
            itsLastNode = node;
        }
        else {
            itsLastNode.setNextNode(node);// adds element onto end
            node.setPriorNode(itsLastNode);// sets new node's previous node
            itsLastNode = node;// sets element as last node
            itsLastNode.setNextNode(null);//sets next to null

        }
        size++;
    }

    // MODIFIED FOR DOUBLY LINKED LIST:
    // add element between elements
    public void add(T element, int index) {
        int counter = 0;
        Node newNode = new Node(element);
        // set currentNode to first
        Node current = itsFirstNode;
        // while node isn't null
        while (current != null ) {
        	// if counter at last element
            if (counter == index - 1 )
            	// break from the loop
                break;
            // move to next node
            current = current.getNextNode();
            // increase the counter since we're at the next node
            counter++;
        }
        /*
         visualization: { A, C }
			A = current node
			C = next node;
						{ A, C }
			    			^ Add B (B = new node)
			finally, our list will be { A, B, C }
        */
        // set next/previous nodes
        current.getNextNode().setPriorNode(newNode);// sets the next node after our current node's previous to the new node (pushing new node between current & next)
        newNode.setNextNode(current.getNextNode());// sets our new node's next node to the previously known "next" node
        newNode.setPriorNode(current);// sets previous node to current for our new node
        current.setNextNode(newNode);// sets the current node's next node to the new node
        size++;
    }

    public T get(int index) {
        int counter = 0;
        Node current = itsFirstNode;
        while (current != null ) {
            if (counter == index)
                break;
            current = current.getNextNode();
            counter++;
        }
        return current.getData();
    }

    // IMPLEMENTED:
    // returns true if element is in the list, false if not
    public boolean contains(T element) {
    	// make sure list isn't empty
    	if(this.size() == 0){
    		return false;
    	}
    	for(int i=0; i<size; i++){
    		if(this.get(i).equals(element)){
    			return true;
    		}
    	}
    	return false;
    }

    // IMPLEMENTED:
    // returns the index of the element if it is in the list, -1 if not found
    public int indexOf(T element) {
    	// check to see if the element is in the list
    	if(this.contains(element) == true){
			for(int i = 0; i<size;i++){
				if(this.get(i).equals(element)){
					return i;
				}
			}
    	}
    	return -1;
    }// end indexOf

    // IMPLEMENTED:
    // returns an Iterator at the location of the element if it is in the list
    // returns the null reference if the element is not found
    public Iterator<T> iteratorAt(T element) {
    	if(this.contains(element) == true){
    		Iterator<T> iter = this.getIterator();
    		while(iter.hasNext()){
    			if(iter.next().equals(element)){
    				LinkedList<T> temp = new LinkedList<T>();
    				while(iter.hasNext()){
	    				temp.add(iter.next());
    				}
    				return new Iterator<T>(temp);
    			}
    		}
    	}
    	return null;
    }

    public String toString() {
        String returnVal = "";
        Node current = itsFirstNode;
        if (size != 0 ) {
            while (current != null ) {
                returnVal += current.toString();
                returnVal += "\n";
                current = current.getNextNode();
            }
        }
        return returnVal;
    }// end toString

    class Node {
    
        private T data;
        private Node itsNext;
        private Node itsPrior;
    
        public Node(T data) {
            itsNext = null;
            itsPrior = null;
            this.data = data;
        }
    
    
        public T getData() {
            return this.data;
        }
    
        public Node getNextNode() {
            return itsNext;
        }

        // IMPLEMENTED:
        public Node getPriorNode() {
        	return itsPrior;
        }
    
        public void setNextNode(Node next) {
            itsNext = next;
        }

        // IMPLEMENTED:
        public void setPriorNode(Node prior) {
        	itsPrior = prior;
        }
    
        public String toString() {
            return data.toString();
        }
    
    }// end of Node
}// end of LinkedList
