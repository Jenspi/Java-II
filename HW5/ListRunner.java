public class ListRunner {

    public static void main(String[] args) {

        Dog fifi = new Dog("Fifi", 12, 8);
        Dog butch = new Dog("Butch", 10, 10);
        Dog leonard = new Dog("Leonard", 22, 13);
        Dog spot = new Dog("Spot", 17, 9);

        LinkedList<Dog> myDogList = new LinkedList<Dog>();
   

        System.out.println(myDogList);
        System.out.println();
        myDogList.add(fifi);

        System.out.println(myDogList);
        System.out.println();

        myDogList.add(butch);
        myDogList.add(leonard);
        myDogList.add(spot);

        System.out.println(myDogList);
        System.out.println();

        Dog jack = new Dog("Jack", 18, 18);

        myDogList.add(jack,1);

        System.out.println(myDogList);
        System.out.println();

        // the following lines build Iterators, and provide an example
        // of how you would use an Iterator to step through this data
        // structure
        Iterator<Dog> iter1 = myDogList.getIterator();
        Iterator<Dog> iter2 = myDogList.getIterator();

        System.out.println("Iterating using Iterators!!!");
        while (iter1.hasNext()) {
            Dog foo = iter1.next();
            System.out.println(foo);
        }

        System.out.println();
        
        // In a doubly-linked list, an iterator can move either forward or backward,
        // so this should the print the list out in reverse order if you've correctly
        // implemented everything
        
        System.out.println(">>>>> Iterating backwards using Iterators!!! <<<<<");
        iter2.setToEnd();
        while (iter2.hasPrior()) {
            Dog foo = iter2.prior();
            System.out.println(foo);
        }

    }// end main
} // end class ListRunner
