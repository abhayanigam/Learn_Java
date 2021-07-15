/*
    Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    The table below shows the primitive type and the equivalent wrapper class:

    Primitive Data Type	Wrapper Class
        byte    ->  Byte
        short   ->  Short
        int     ->  Integer
        long	->  Long
        float	->  Float
        double	->  Double
        boolean	->  Boolean
        char	->  Character

    Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
    where primitive types cannot be used (the list can only store objects):
        Example
            ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
            ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
*/

public class WrapperClasses {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Both are equal

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        Integer Num = 100;
        String myString = Num.toString();
        System.out.println("The length is :" + myString.length());
    }
}
