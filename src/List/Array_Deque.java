package List;

/*
   In Java, we can use the ArrayDeque class to implement queue and deque data structures using arrays.
   Creating ArrayDeque:
        In order to create an array deque, we must import the java.util.ArrayDeque package.
            Here is how we can create an array deque in Java:

            ArrayDeque<Type> animal = new ArrayDeque<>();
            Here, Type indicates the type of the array deque. For example,

            // Creating String type ArrayDeque
            ArrayDeque<String> animals = new ArrayDeque<>();

            // Creating Integer type ArrayDeque
            ArrayDeque<Integer> age = new ArrayDeque<>();
 */

import java.util.ArrayDeque;
import java.util.Iterator;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();

        //Using add()
        animals.add("cat");

        //Using add first
        animals.addFirst("Dog");

        //Using add last
        animals.addLast("Horse");

        System.out.println("ArrayDeque using add function : " + animals);

        //Using offer()
        animals.offer("elephant");

        //Using add first
        animals.offerFirst("Pig");

        //Using add last
        animals.offerLast("tiger");

        System.out.println("ArrayDeque using offer function : " + animals);

        // Get the first element
        System.out.println("Get First Element : " +  animals.getFirst());

        // Get the Last element
        System.out.println("Get Last Element : " +  animals.getLast());

        // Using peek() --> (peek() - returns the first element of the array deque)
        System.out.println("Peek Head Element: " + animals.peek());

        // Using peekFirst()
        System.out.println("Peek First Element: " + animals.peekFirst());

        // Using peekLast
        System.out.println("Peek Last Element: " + animals.peekLast());

        // Using remove() --> (remove() - returns and removes an element from the first element of the array deque)
        System.out.println("Removed Element: " + animals.remove());

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        System.out.println("Removed First Element: " + animals.removeFirst());

        // Using removeLast()
        System.out.println("Removed Last Element: " + animals.removeLast());

        // Using poll()
        System.out.println("Polled Element: " + animals.poll());
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        System.out.println("Polled First Element: " + animals.pollFirst());

        // Using pollLast()
        System.out.println("Polled Last Element: " + animals.pollLast());

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(", ");
        }

        System.out.print("ArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }

        // Using clear()
        animals.clear();
        System.out.println("New ArrayDeque: " + animals);

//-------------------------------------------------------------------------------------
        //ArrayDeque as a Stack
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Add elements to stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack: " + stack);

        // Access element from top of stack
        System.out.println("Accessed Element: " + stack.peek());

        // Remove elements from top of stack
        System.out.println("Removed element: " + stack.pop());
    }
}
