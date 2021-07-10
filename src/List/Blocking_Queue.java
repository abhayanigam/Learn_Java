package List;

/*
    The BlockingQueue interface of the Java Collections framework extends the Queue interface.
    It allows any operation to wait until it can be successfully performed.

    For example, if we want to delete an element from an empty queue,
            then the blocking queue allows the delete operation to wait until the queue contains
             some elements to be deleted.

    Creating blocking queues
        We must import the java.util.concurrent.BlockingQueue package in order to use BlockingQueue.

        // Array implementation of BlockingQueue
        BlockingQueue<String> animal1 = new ArraryBlockingQueue<>();

        // LinkedList implementation of BlockingQueue
        BlockingQueue<String> animal2 = new LinkedBlockingQueue<>();

    Creating ArrayBlockingQueue
        In order to create an array blocking queue, we must import the java.util.concurrent.ArrayBlockingQueue package.
        ArrayBlockingQueue<Type> animal = new ArrayBlockingQueue<>(int capacity);
            Here,
                Type - the type of the array blocking queue
                capacity - the size of the array blocking queue
                For example,

                // Creating String type ArrayBlockingQueue with size 5
                ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

                // Creating Integer type ArrayBlockingQueue with size 5
                ArrayBlockingQueue<Integer> age = new ArrayBlockingQueue<>(5);
                Note: It is compulsory to provide the size of the array.

     Creating LinkedBlockingQueue
            In order to create a linked blocking queue, we must import the java.util.concurrent.LinkedBlockingQueue
            package.

            Here is how we can create a linked blocking queue in Java:

            1. Without the initial capacity

            LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>();
            Here the default initial capacity will be 231-1.

            2. With the initial capacity

            LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>(int capacity);
            Here,

            Type - the type of the linked blocking queue
            capacity - the size of the linked blocking queue
            For example,

            // Creating String type LinkedBlockingQueue with size 5
            LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

            // Creating Integer type LinkedBlockingQueue with size 5
            LinkedBlockingQueue<Integer> age = new LinkedBlockingQueue<>(5);
            Note: It is not compulsory to provide the size of the linked list.
*/

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Blocking_Queue {
    public static void main(String[] args) {
        // Creating a blocking using the ArrayBlockingQueue
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try{
            //Insert element to blocking queue
            // Insert element to blocking queue
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BLockingQueue: " + numbers);

            // Remove Elements from blocking queue
            int removedNumber = numbers.take();
            System.out.println("Removed Number: " + removedNumber);
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
