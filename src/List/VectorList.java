/*
    The Vector class is an implementation of the List interface that allows us to create
     resizable-arrays similar to the ArrayList class.

     Note: It is recommended to use ArrayList in place of Vector
            because vectors are not threadsafe and are less efficient.

     Creating a Vector:
        Vector<Type> vector = new Vector<>();

     Create Integer Type Linked List
        Vector<Integer> vector= new Vector<>();

     Create String Type Linked list
        Vector<String> vector= new Vector<>();

     Add Elements to Vector
        add(element) - adds an element to vectors
        add(index, element) - adds an element to the specified position
        addAll(vector) - adds all elements of a vector to another vector
 */

import java.util.Vector;
import java.util.Iterator;
public class VectorList {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();

        //Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        //Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector : " + mammals);

        //Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector : " + animals);

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        // Using remove()
        String ele = animals.remove(1);
        System.out.println("Removed Element: " + ele);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
