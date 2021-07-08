/*
    The LinkedList class is almost identical to the ArrayList
    When To Use
        It is best to use an ArrayList when:
            > You want to access random items frequently
            > You only need to add or remove elements at the end of the list
        It is best to use a LinkedList when:
            > You only use the list by looping through it instead of accessing random items
            > You frequently need to add and remove items from the beginning, middle or end of the
              list

     LinkedList Syntax:
         LinkedList<Type> linkedList = new LinkedList<>();
 */

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");

        System.out.println(cars);

        // get the element from the linked list
        String str = cars.get(1);
        System.out.println("Element at index 1: " + str);

        // change elements at index 3
        cars.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + cars);

        // remove elements from index 1
        String s = cars.remove(1);
        System.out.println("Removed Element: " + s);

        System.out.println();
        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        System.out.println("add the item to the beginning : " + cars);

        // Use addLast() to add the item to the end
        cars.addLast("Mazda");
        System.out.println("addLast() to add the item to the end :"+cars);

        // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println("removeFirst() remove the first item from the list : " +cars);

        // Use removeLast() remove the last item from the list
        cars.removeLast();
        System.out.println("removeLast() remove the last item from the list : " + cars);

        // Use getFirst() to display the first item in the list
        System.out.println("getFirst() to display the first item in the list : " +cars.getFirst());

        // Use getLast() to display the last item in the list
        System.out.println("getLast() to display the last item in the list : " + cars.getLast());
    }
}
