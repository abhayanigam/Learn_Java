/*
    Java Autoboxing - Primitive Type to Wrapper Object
        In autoboxing, the Java compiler automatically converts primitive types
        into their corresponding wrapper class objects.

    Java Unboxing - Wrapper Objects to Primitive Types
        In unboxing, the Java compiler automatically converts wrapper class objects into their corresponding
        primitive types.
 */

import java.util.ArrayList;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList : " + list);

        //unboxing
        int a = list.get(0);
        System.out.println("Value at index 0 : " + a);
    }
}
