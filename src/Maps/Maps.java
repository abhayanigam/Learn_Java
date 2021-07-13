/**
    *Java HashMap
        In the ArrayList chapter, you learned that Arrays store items as an ordered collection,
        and you have to access them with an index number (int type). A HashMap however,
        store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

        One object is used as a key (index) to another object (value).
        It can store different types: String keys and Integer values, or the same type,
        like: String keys and String values:

        In order to use functionalities of the Map interface, we can use these classes:
            1. HashMap
            2. EnumMap
            3. LinkedHashMap
            4. WeakHashMap
            5. TreeMap

    *  Creating Map:
        In Java, we must import the java.util.Map package in order to use Map.
        Once we import the package, here's how we can create a map.
            // Map implementation using HashMap
            Map<Key, Value> numbers = new HashMap<>();
*/

//Import the Hashmap class
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and value (Country, City)
        //      The HashMap class has many useful methods.
        //      For example, to add items to it, use the put() method:
        capitalCities.put("England", "landon");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // Access an Item :
        //      To access a value in the HashMap,
        //      use the get() method and refer to its key:
        System.out.println(capitalCities.get("England"));

        // Remove an Item
        //      To remove an item,
        //      use the remove() method and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //      To find out how many items there are, use the size() method:
        System.out.println("The size of the map is : " + capitalCities.size());

        // Loop Through a HashMap
        //        Loop through the items of a HashMap with a for-each loop.
        //        Note: Use the keySet() method if you only want the keys,
        //        and use the values() method if you only want the values:
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
        // Print values
        System.out.println("Printing Values : ");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i +" and" + " value: " + capitalCities.get(i));
        }

        //      To remove all items, use the clear() method:
        capitalCities.clear();
        System.out.println(capitalCities);

//-------------------------------------------------------------------------------------------------------------

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
