/*
    A constructor in Java is similar to a method that is invoked when an object of the class is created.
    className() is a constructor. It has the same name as that of the class and doesn't have a return type.

    Types of Constructor
        In Java, constructors can be divided into 3 types:
            No-Arg Constructor
            Parameterized Constructor
            Default Constructor

    1. No-Arg Constructor - a constructor that does not accept any arguments

    2. Parameterized constructor - a constructor that accepts arguments

    3. Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly
                            defined.

    4. A constructor cannot be abstract or static or final.

    5. A constructor can be overloaded but can not be overridden.
 */


class Company {
    String name;

    // 1.1. public No-Arg constructor
    public Company() {
        name = "Google";
    }
}
public class Constructor {
    private String name;
    int i;

//    Constructor(){
//        System.out.println("Constructor Called");
//        name = "GitHub";
//    }

    // 1. Private No-Arg Constructor
    // Once a constructor is declared private, it cannot be accessed from outside the class.
//    private Constructor(){
//        i = 5;
//        System.out.println("No Arg Constructor Called");
//    }

    // 2. Parameterized Constructor
//    String language;
//    Constructor(String lang){
//        language = lang;
//        System.out.println(language + " Programming Language.");
//    }

    int a;
    boolean b;

    // 3. Default a private constructor
    private Constructor() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
//        Constructor obj = new Constructor();
//        System.out.println("Name is "+ obj.name);

//        // 1. Private No Arg Constructor.
//        Constructor obj = new Constructor();
//        System.out.println("Int is "+ obj.i);

        // 1.1. public No-Arg constructor
        Company obj = new Company();
        System.out.println("The Company name is " + obj.name);

        // 2. Parameterized Constructor
//        Constructor obj1 = new Constructor("Java");
//        Constructor obj2 = new Constructor("C");
//        Constructor obj3 = new Constructor("Python");

        // 3. Default a private constructor
        Constructor obj4 = new Constructor();
        System.out.println("a is "+ obj4.a);
        System.out.println("boolean is "+ obj4.b);
    }
}
