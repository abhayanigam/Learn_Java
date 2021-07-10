package List;

/*
    The Queue interface of the Java collections framework provides the functionality of the queue data structure.
    It extends the Collection interface.

    How to use Queue?
        In Java, we must import java.util.Queue package in order to use Queue.
             LinkedList implementation of Queue
                Queue<String> animal1 = new LinkedList<>();

             Array implementation of Queue
                Queue<String> animal2 = new ArrayDeque<>();

             Priority Queue implementation of Queue
                Queue<String> animal 3 = new PriorityQueue<>();

    Some of the commonly used methods of the Queue interface are:
        add() - Inserts the specified element into the queue. If the task is successful,
                add() returns true, if not it throws an exception.

        offer() - Inserts the specified element into the queue. If the task is successful,
                  offer() returns true, if not it returns false.

        element() - Returns the head of the queue. Throws an exception if the queue is empty.

        peek() - Returns the head of the queue. Returns null if the queue is empty.

        remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.

        poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
*/

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_DS {
    public static void main(String[] args){
//      1. Implementing the LinkedList Class
        Queue<Integer> numbers = new LinkedList<>();

        System.out.println("Implementing the LinkedList Class");

        //offer element to the queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);

        System.out.println("Queue : " + numbers);

        //Access elements of the queue
        System.out.println("Accessed Element : " + numbers.peek());

        //Remove element from the queue
        System.out.println("Removed Element : " + numbers.poll());

        System.out.println("Updated Queue : " + numbers);

//------------------------------------------------------------------------------------------------------------

//      2. Implementing the PriorityQueue Class
        Queue<Integer> number = new PriorityQueue<>();

        System.out.println("Implementing the PriorityQueue Class");

        //Offer element to the queue
        number.offer(5);
        number.offer(1);
        number.offer(2);

        //Access elements of the Queue
        System.out.println("Accessed Element : " + number.peek());

        // Remove element from the queue
        System.out.println("Removed Element : " + number.poll());

        System.out.println("Update Queue : " + number);
    }
}
