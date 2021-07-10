package List;

/*
    Iterating Over a PriorityQueue
        To iterate over the elements of a priority queue, we can use the iterator() method.
        In order to use this method, we must import the java.util.Iterator package.

    Other PriorityQueue Methods
             contains(element) -> Searches the priority queue for the specified element.
                                    If the element is found, it returns true, if not it returns false.
             size() -> Returns the length of the priority queue.
             toArray() -> Converts a priority queue to an array and returns it.
*/

import java.util.PriorityQueue;
import java.util.Iterator;

public class Priority_Queue {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);

        System.out.print("Priority Queue using iterator() : ");

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
