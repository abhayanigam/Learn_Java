/*
    In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.

    Once any entity (variable, method or class) is declared final, it can be assigned only once.
        That is,
           1. the final variable cannot be reinitialized with another value
           2. the final method cannot be overridden
           3. the final class cannot be extended

    Note: It is recommended to use uppercase to declare final variables in Java.
 */

class Main {
    // create a final method
    public final void display() {
        System.out.println("This is a final class function.");
    }
}

// create a final class
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

public class FinalMethod {
    // create a final variable
    final int AGE = 32;

    // try to change the final variable
    //AGE = 45;  // -- > Gives an Array.

    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        System.out.println("AGE " + obj.AGE);

        // Final in Class Function.
        Main obj2 = new Main();
        obj2.display();

        //Final Class
        FinalClass obj3 = new FinalClass();
        obj3.display();
    }
}
