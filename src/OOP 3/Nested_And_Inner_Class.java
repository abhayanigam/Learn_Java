/*
    In Java, you can define a class within another class. Such class is known as nested class.
        For example :
                        class OuterClass {
                            // ...
                            class NestedClass {
                                // ...
                            }
                        }
    There are two types of nested classes you can create in Java.
        1. Non-static nested class (inner class)
        2. Static nested class
 */

//  1. Non- Static nested Class (Inner Class)
class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}

//   2. Static Inner Class
class MotherBoard {
    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }

}
public class Nested_And_Inner_Class {
    public static void main(String[] args) {
//        1. Non- Static nested Class (Inner Class)
        OuterClass OC = new OuterClass();
        OuterClass.InnerClass IC = OC.new InnerClass();
        System.out.println("Non-Static Class :");
        System.out.println("The sum is " + (OC.x + IC.y) + "\n");

//        2. Static Inner Class
//              create an object of the static nested class
//              using the name of the outer class
        MotherBoard.USB obj = new MotherBoard.USB();
        System.out.println("Static Inner Class :");
        System.out.println("The no. od ports are : "+ obj.getTotalPorts());
    }
}
