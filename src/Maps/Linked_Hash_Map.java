/*
   The LinkedHashMap class of the Java collections framework provides the hash table
    linked list implementation of the Map interface.
    The LinkedHashMap interface extends the HashMap class to store its entries in a hash table.
    It internally maintains a doubly-linked list among all of its entries to order its entries.

    In order to create a linked hashmap, we must import the java.util.LinkedHashMap package first.
    Once we import the package, here is how we can create linked hashmaps in Java.

        // LinkedHashMap with initial capacity 8 and load factor 0.6
        LinkedHashMap<Key, Value> numbers = new LinkedHashMap<>(8, 0.6f);

        capacity - The capacity of this linked hashmap is 8. Meaning, it can store 8 entries.
        loadFactor - The load factor of this linked hashmap is 0.6.
                        This means, whenever our hash map is filled by 60%, the entries are
                         moved to a new hash table of double the size of the original hash table.

        Default capacity and load factor
            It's possible to create a linked hashmap without defining its capacity and load factor.
            For example,
                //LinkedHashMap with default capacity and load factor
                LinkedHashMap<Key, Value> numbers1 = new LinkedHashMap<>();

                By default,
                    > the capacity of the linked hashmap will be 16
                    > the load factor will be 0.75
                    Note: The LinkedHashMap class also allows us to define the order of its entries. For example

                // LinkedHashMap with specified order
                LinkedHashMap<Key, Value> numbers2 = new LinkedHashMap<>(capacity, loadFactor, accessOrder);

                Here, accessOrder is a boolean value. Its default value is false.
                In this case entries in the linked hashmap are ordered on the basis of their insertion order.
                However,
                 if true is passed as accessOrder, entries in the linked hashmap will be
                  ordered from least-recently accessed to most-recently accessed.
*/

import java.util.LinkedHashMap;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        // Creating a LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap 1 : " + evenNumbers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three" , 3);

        System.out.println("LinkedHashMap 2 : " + numbers);

        // Using putIfAbsent() - inserts the specified key/value mapping to the map if the
        //                       specified key is not present in the map
        evenNumbers.putIfAbsent("six" , 6);
        System.out.println("Updated LinkedHashMap() : " + evenNumbers);

        // Using entrySet() - return a set of all the key.\/value mapping of the map.
        System.out.println("key/Value mapping : " + evenNumbers.entrySet());

        // Using keySet() - returns a set of all the keys of the map.
        System.out.println("Keys : " + evenNumbers.keySet());

        // Using values() - returns a set of all the values of the map
        System.out.println("Values : " + evenNumbers.values());

        // Using get() - returns the value associated with the specified key. If the key is not found , it return null.
        System.out.println("Return Number : " + evenNumbers.get("Three"));

        // Using getOrDefault() - returns the value associated with the specified key. If is not found,
        //                        it returns the specified default value
        System.out.println("Returned Number : " + evenNumbers.getOrDefault("Five", 5));

        // remove method with single parameter - returns and removes the entry associated
        //                                       with specified key from the map
        System.out.println("Removed Value : " + evenNumbers.remove("Two"));

        // remove method with two parameter - removes the entry from the map only if the specified
        //                                    key mapped to be the specified value and return a boolean value.
        boolean result = evenNumbers.remove("Three", 3);
        System.out.println("Is the entry Three removed ? : " + result);
        System.out.println("Updated LinkedHashMap : " + evenNumbers);
    }
}
