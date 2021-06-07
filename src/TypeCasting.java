/*
Java Type Casting
    In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
 */

public class TypeCasting {
    public static void main(String[] args) {

        //Widening Casting
        int a = 2;
        double b = a; // Automatic casting: int to double

        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);

        //Narrowing Casting
        double c =  9.78;
        int d = (int) c; // Manual casting: double to int

        System.out.println("The value of c " + c);
        System.out.println("The value of d " + d);
    }
}
