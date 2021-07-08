/*
    The Java collections framework has a class named Stack that provides the functionality of the stack data structure.
    The Stack class extends the Vector class.

    Stack Implementation
        In stack, elements are stored and accessed in Last In First Out manner.
        That is, elements are added to the top of the stack and removed from the top of the stack.

    Here is how we can create a stack in Java.
        Stack<Type> stacks = new Stack<>();

        Here, Type indicates the stack's type. For example,
            // Create Integer type stack
            Stack<Integer> stacks = new Stack<>();

            // Create String type stack
            Stack<String> stacks = new Stack<>();
 */

import java.util.Stack;
public class Stacks_Implimentation {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        //Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cats");

        System.out.println("Stack: " + animals);

        //Removing element Stacks
        System.out.println("Removed Element: " + animals.pop());

        //Access element from the top
        System.out.println("Element at top: " + animals.peek());

        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse : " + position);

        //Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty : " + result);
    }
}
