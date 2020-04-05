/**
 @author Jennifer Spicer
 @version v. 0
*/
import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;
public class Sorters2120 {

    /**
     sorts a List by comparing the 0th and 1st index to find which element is smaller, assigning that to
     the 0th index, then continuing until the list is fully sorted
     @param <T>         type parameter
     @param theList     list to sort
    */
    public static <T extends Comparable<T> > void bubbleSort(List<T> theList) {
        int lastToConsider = theList.size();
        while (lastToConsider > 1) {
            for (int j=0; j<lastToConsider-1; j++) {
                if (theList.get(j).compareTo(theList.get(j+1))  >  0 ) {
                    swap(theList,j,j+1);
                }
            }
            lastToConsider--;
        }
    }// written by Summa



    /**
     swaps two elements in a list
     @param <T>         type parameter
     @param theList     list to swap elements in
     @param i1          first item to swap
     @param i2          second item to swap
    */
    private static <T extends Comparable<T> > void swap(List<T> theList, int i1, int i2) {

        T temp = theList.get(i1);
        theList.set(i1,theList.get(i2));
        theList.set(i2,temp);
    }// written by Summa



    /**
     sorts a list by searching the entire list for the smallest element, assigning that to the 0th index,
     then repeating for each element afterwards until completely sorted
     @param <T>         type parameter
     @param theList     list to sort
    */
    public static <T extends Comparable<T> > void selectionSort(List<T> theList) {

        // stubbed
        // FIND SMALLEST AND SWITCH
        if(theList.size()>1){
            for(int i = 0; i<theList.size()-1; i++){
                int index = i;
                for(int x = i+1; x< theList.size(); x++){
                    if((theList.get(x).compareTo(theList.get(index))) < 0){
                        index = x;
                    }
                }
                swap(theList, index, i);
            }// end first for loop
        }
    }



    /**
     sorts a list by splitting it into two, sorting the lists, then combining them into one sorted list
     @param <T>         type parameter
     @param theList     list to sort
    */
    public static <T extends Comparable<T> > void mergeSort(List<T> theList) {
        recursiveMergeSortHelper(theList,0,theList.size()-1);
    }// written by Summa


    
    /**
     sorts a list by splitting it into two, sorting the lists, then combining them into one sorted list
     @param <T>         type parameter
     @param theList     list to sort
     @param first       index to start sorting at (inclusive)
     @param last        index to stop sorting at (inclusive)
    */
    private static <T extends Comparable<T> > void recursiveMergeSortHelper(List<T> theList, int first, int last) {

        // stubbed
        // SPLIT INTO TWO, SORT, COMBINE
        int lowerBound = first;
        int median = (first+last)/2;
        int lowerBound2 = median+1;
        ArrayList<T> temp = new ArrayList<T>();
        temp.addAll(theList);
        int num = first;// temporary number

        if(theList.size() > 1){// doesn't need to be sorted if theList is empty or only has one element
            if(last > first){
                recursiveMergeSortHelper(theList, lowerBound, median);
                recursiveMergeSortHelper(theList, median+1, last);
            }

            while(lowerBound < median+1 && lowerBound2 < last+1){
                if(theList.get(lowerBound).compareTo(theList.get(lowerBound2)) < 0){
                    temp.set(num++, theList.get(lowerBound++));
                } 
                    else{
                        temp.set(num++, theList.get(lowerBound2++));
                    } 
            }

            if(lowerBound == median+1){
                while(lowerBound2 < last+1){
                        temp.set(num++, theList.get(lowerBound2++));
                    }
            }
                else{
                     while(lowerBound < median+1){
                        temp.set(num++, theList.get(lowerBound++));
                    }
                }

            for(int i = first; i < last+1; i++){
                theList.set(i, temp.get(i));
            }
        }// end first if statement
    }



    /**
     finds the index of an item in a list
     @param <T>         type parameter
     @param searchItem  item searching for
     @param theList     list to sort
     @return index of item in list
    */
    public static <T extends Comparable<T> > int indexOf(T searchItem, List<T> theList) {
        return recursiveBinarySearcher(searchItem, theList, 0, theList.size()-1);
    }// written by Summa



    /**
     searches for an item in a list by checking the middle index first, then checking lower/higher, etc. depending on whether
     the item is "less than" or "greater than" the median index
     @param <T>         type parameter
     @param searchItem  item to search the list for
     @param theList     list to search
     @param first       index to start searching at (inclusive)
     @param last        index to stop searching at (inclusive)
     @return index of item in the list, or -1 if item not found
    */
    private static <T extends Comparable<T> > int recursiveBinarySearcher(T searchItem, List<T> theList, int first, int last) {

        // stubbed
        // GUESSING GAME STYLE (try the middle first, etc.)
        int median = (first+last)/2;
        int temp = 0;
        if(theList.get(median).compareTo(searchItem) == 0){
            // base case
            return median;
        }
        if(first == last && !(theList.get(median).compareTo(searchItem) == 0)){
            // if we've gone through the entire list and haven't found the item, return -1
            return -1;
        }
        else if(theList.get(median).compareTo(searchItem) < 0){
            return recursiveBinarySearcher(searchItem, theList, median+1, last);
        }
        else if(theList.get(median).compareTo(searchItem) > 0){
            return recursiveBinarySearcher(searchItem, theList, first, median);
        }
        return -13;// only need this return statement to compile; algorithm will always go through the if/else if statements
    } 
}
