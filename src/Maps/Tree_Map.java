package Maps;
/*
    The TreeMap class of the Java collections framework provides the tree data structure implementation.
    In order to create a TreeMap, we must import the java.util.TreeMap package first. Once we import the package,
    here is how we can create a TreeMap in Java.
                            TreeMap<Key, Value> numbers = new TreeMap<>();
*/

import java.util.TreeMap;
public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<String,Integer> evenNumbers = new TreeMap<>();

        //Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six",6);
        System.out.println("TreeMap os even Numbers : " + evenNumbers);

        // Creating a TreeMap of numbers
        TreeMap<String ,Integer> numbers = new TreeMap<>();
        numbers.put("Three", 3);

        //Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of Number : " + numbers);

        // Using entrySet()
        System.out.println("Key/Values : " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys : " + numbers.keySet());

        // Using values()
        System.out.println("Values : " + numbers.values());

        // Using get()
        System.out.println("Using get() : " + numbers.get("Three"));

        // Using getOrDefault()
        System.out.println("Using getOrDefault() : " + numbers.getOrDefault("Five",5));

        // Remove method with single parameter
        System.out.println("Removed value : " + numbers.remove("Three"));
        System.out.println("The Updated Map is : " + numbers);

        //Remove method with two parameter
        boolean value = numbers.remove("Three",3);
        System.out.println("Is the entry {Three = 3} removed ? : " + value);

        System.out.println("Updated List is : " + numbers);

        // Using Replace
        numbers.replace("Second", 22);
        numbers.replace("Third", 3,33);
        System.out.println("TreeMap using replace : " + numbers);

        //Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2); // This is the lambda expression
        System.out.println("TreeMap using replaceAll : " + numbers);

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());

        // Using higher() -> Returns the lowest key among those keys that are greater than the specified key.
        System.out.println("Using higherKey(): " + numbers.higherKey("Fourth"));
        System.out.println("Using higherEntry(): " + numbers.higherEntry("Fourth"));

        // Using lower() -> Returns the greatest key among all those keys that are less than the specified key.
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey("Fourth"));
        System.out.println("Using lowerEntry(): " + numbers.lowerEntry("Fourth"));
    }
}
