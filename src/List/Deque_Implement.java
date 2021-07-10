package List;

/*
    In a regular queue, elements are added from the rear and removed from the front.
    However, in a deque, we can insert and remove elements from both front and rear.

    Classes that implement Deque
        In order to use the functionalities of the Deque interface,
        we need to use classes that implement it:
                                                    ArrayDeque
                                                    LinkedList

    In Java, we must import the java.util.Deque package to use Deque.
        // Array implementation of Deque
        Deque<String> animal1 = new ArrayDeque<>();

        // LinkedList implementation of Deque
        Deque<String> animal2 = new LinkedList<>();

     Methods of Deque:
        addFirst() - Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
        addLast() - Adds the specified element at the end of the deque. Throws an exception if the deque is full.
        offerFirst() - Adds the specified element at the beginning of the deque. Returns false if the deque is full.
        offerLast() - Adds the specified element at the end of the deque. Returns false if the deque is full.
        getFirst() - Returns the first element of the deque. Throws an exception if the deque is empty.
        getLast() - Returns the last element of the deque. Throws an exception if the deque is empty.
        peekFirst() - Returns the first element of the deque. Returns null if the deque is empty.
        peekLast() - Returns the last element of the deque. Returns null if the deque is empty.
        removeFirst() - Returns and removes the first element of the deque. Throws an exception if the deque is empty.
        removeLast() - Returns and removes the last element of the deque. Throws an exception if the deque is empty.
        pollFirst() - Returns and removes the first element of the deque. Returns null if the deque is empty.
        pollLast() - Returns and removes the last element of the deque. Returns null if the deque is empty.

      Here are the methods the Deque interface provides to implement stack:
            push() - adds an element at the beginning of deque
            pop() - removes an element from the beginning of deque
            peek() - returns an element from the beginning of deque
*/

import java.util.Deque;
import java.util.ArrayDeque;

public class Deque_Implement {
    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        //add element to the Deque
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Deque : "+ numbers);

        // Access element of the Deque
        System.out.println("First Element : " + numbers.peekFirst());
        System.out.println("Last Element : " + numbers.peekLast());

        // Remove elements from the Deque
        System.out.println("Removed First Element : " + numbers.pollFirst());
        System.out.println("Removed Last Element : " + numbers.pollLast());

        System.out.println("Updated Deque : " + numbers);
    }
}
