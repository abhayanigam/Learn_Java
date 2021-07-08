// Java Collections Framework
/*
    The Java collections framework provides a set of interfaces
    and classes to implement various data structures and algorithms.
        For example, the LinkedList class of the collections framework provides
        the implementation of the doubly-linked list data structure.

    Interfaces of Collections FrameWork
        The Java collections framework provides various interfaces
            collection --> List
                       --> Set  --> SortedSet
                       --> Queue --> Dequeue
            Map --> SortedMap
            Iterator --> ListIterator

    1. All the methods of the Collection interface are also present in its subinterfaces.
    2. The List interface is an ordered collection that allows us to add and remove elements like an array.
    3. The Set interface allows us to store elements in different sets similar to the set in mathematics.
        It cannot have duplicate elements.
    4. The Queue interface is used when we want to store and access elements in First In, First Out manner.
    5. In Java, the Map interface allows elements to be stored in key/value pairs. Keys are unique names that can be
       used to access a particular element in a map. And, each key has a single value associated with it.
    6. In Java, the Iterator interface provides methods that can be used to access elements of collections.

    The difference between a built-in array and an ArrayList
    1. Array : in Java, is that the size of an array cannot be modified (if you want to add or remove elements
                to/from an array,you have to create a new one)
                Note : To print array in a loop array uses ArrayName.length();
                syntax : int[] myNum = {10, 20, 30, 40};

    2. ArrayList : Using ArrayList ,elements can be added and removed from an ArrayList whenever you want.
                     there is no need to create the new one and the size to.
                   Note : To print arrayList in a loop arraylist uses ArrayListName.size();
                   syntax : ArrayList<String> Name = new ArrayList<String>();

 */


//The ArrayList class allows us to create resizable arrays. The class implements the List interface
// (which is a subinterface of the Collection interface).

import java.util.ArrayList;
import java.util.Collections; // Importing collection class to sort the list

public class Collections_FrameWork {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        //Add Items in a Array list.
        animals.add("cat");
        animals.add("dog");
        animals.add("pig");
        animals.add("cow");

        System.out.println(animals);

        // To print the first element in an arraylist
        System.out.println("The first animal is " + animals.get(0));
        // To print the last element in an arraylist
        System.out.println("The Last animal is " + animals.get(animals.size() - 1));

        // To change an item in an arraylist
        animals.set(2,"Buffalo");
        // add() method with the index parameter
        animals.add(1, "pig");
        System.out.println(animals);

        // To remove an item in an arraylist
        animals.remove(2);
        System.out.println(animals);

        // To print the size of an arraylist
        int size = animals.size();
        System.out.println(size);

        // accessing item of an arraylist using loops
        for (int i= 0; i<animals.size(); i++){
            System.out.print(animals.get(i)+" ");
        }
        System.out.println();
        for (String i : animals) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sort an ArrayList
        Collections.sort(animals);
        for (String i : animals) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Making arrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        for (int i : numbers) {
            System.out.println(i);
        }

        // Sort an ArrayList
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        // To clear a list
        animals.clear();
        numbers.clear();
        System.out.println(animals);
        System.out.println(numbers);
    }
}
