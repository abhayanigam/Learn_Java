package Iterate;
/*
    An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    It is called an "iterator" because "iterating" is the technical term for looping.

    To use an Iterator, you must import it from the java.util package.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get thr iterator
        Iterator<String> iterate = cars.iterator();

        // Print the first item
        System.out.println(iterate.next());

        System.out.println("To loop through a collection , use the hasNext() and next() methods of the iterator():");
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
