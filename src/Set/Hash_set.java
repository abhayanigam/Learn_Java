package Set;
/*
    A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
        import java.util.HashSet; // Import the HashSet class
        HashSet<String> cars = new HashSet<String>();
 */

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>(); // Or HashSet<String> cars = new HashSet<>(); (Both are Equal).

        // Adding Items
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("BMW"); // --> This BMW can't add int the set because set contains the unique and non repeated items.
        System.out.println(cars);

        // Checking if an item Exists
        boolean value = cars.contains("Mazda");
        System.out.println("Item exits in the list : " + value);

        // Remove an item or we can also use removeAll()
        cars.remove("BMW");
        System.out.println("After Removing an item : " + cars);

        // Clear a whole set
//        cars.clear();
        System.out.println("The List is Empty : " + cars);

        // HashSet Size
        System.out.println("The size of the HashSet is : " + cars.size());

        // Loop Through a HashSet
        for (String i: cars) {
            System.out.println(i);
        }

        // Calling iterator() method
        Iterator<String> iterate = cars.iterator();
        System.out.println("HashSet using Iterator : ");
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();

        // Creating a new HashSet of Integer type
        HashSet<Integer> numbers = new HashSet<>();

        // Adding the value to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // show which numbers between 1 to 10 in the set
        for (int i = 0; i<= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " Was found in the set.");
            }else
                System.out.println(i + " not found");
        }

        // Union of two set
        HashSet<Integer> num1 = new HashSet<>();
        num1.add(2);
        num1.add(4);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(3);

        num2.addAll(num1);
        System.out.println("Union is : " + num2);
    }
}
