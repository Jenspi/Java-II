/**
 @author Jennifer Spicer
 @version v0
*/
public class Iterator<T> {

    private LinkedList<T> myList;
    private LinkedList<T>.Node myCurrentNode;

    public Iterator(LinkedList<T> list) {
        myList = list;
        myCurrentNode =  myList.itsFirstNode;
    }

    // return true if there is a "next" element, otherwise returns false
    public boolean hasNext() {
        if (myCurrentNode != null)
            return true;
        return false;
    }

    // TO BE IMPLEMENTED
    // return true if there is a "prior" element, otherwise returns false
    public boolean hasPrior() {
		if (myCurrentNode != null){
            return true;
        }
        return false;
    }

    // returns the "next" node (really the current one) and
    // moves the Iterator forward by one node
    public T next() {
        T data = myCurrentNode.getData();
        myCurrentNode = myCurrentNode.getNextNode();
        return data;
    }

    // IMPLEMENTED:
    // returns the "prior" node (really the current one) and
    // moves the Iterator backward by one node
    public T prior() {
    	T data = myCurrentNode.getData();
        myCurrentNode = myCurrentNode.getPriorNode();
       return data;
    }

    // Sets this iterator to point to the last Node in the list
    public void setToEnd() {
		myCurrentNode = myList.itsLastNode;
    }
    
}// end class Iterator
