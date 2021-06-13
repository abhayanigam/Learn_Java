/*
    Polymorphism:
        Polymorphism allows us to create consistent code. In the previous example,
        we can also create different methods

            1. This will work perfectly. However, for every shape, we need to create different methods.
               It will make our code inconsistent.
            2. To solve this, polymorphism in Java allows us to create a single method that will
                behave differently for different shapes.

    Note:
        The print() method is also an example of polymorphism.
        It is used to print values of different types like char, int, string, etc.

    We can achieve polymorphism in Java using the following ways:
        1. Method Overriding
        2. Method Overloading
        3. Operator Overloading
 */

//    1. Method Overriding
//    Note:
//        The method that is called is determined during the execution of the program.
//        Hence, method overriding is a run-time polymorphism.
class Languages{
    public void displayInfo(){
        System.out.println("Common English language.\n");
    }
}

class Java extends Languages{
    @Override
    public void displayInfo(){
        System.out.println("Method Overriding:");
        System.out.println("Java Programming Language.");
    }
}

//    2. Method Overloading
//          In a Java class, we can create methods with the same name if they differ in parameters.
//       Note:
//          The method that is called is determined by the compiler.
//          Hence, it is also known as compile-time polymorphism.
class Pattern{
    //method without Parameter
    public void display(){
        System.out.println("Method Overloading:");
        for (int i =0; i<10;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    //method with single parameter
    public void display(char symbol){
        for (int i =0; i<10;i++){
            System.out.print(symbol);
        }
        System.out.println("\n");
    }
}

//    Polymorphic Variables
class ProgrammingLanguage {
    public void display() {
        System.out.println("Polymorphic Variables :");
        System.out.println("I am Programming Language.");
    }
}

class JavaLang extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // 1. Method Overriding
        Java j = new Java();
        j.displayInfo();
        Languages l = new Languages();
        l.displayInfo();

        // 2. Method Overloading
        Pattern p = new Pattern();
        p.display();
        p.display('#');

        // Polymorphic Variable
        ProgrammingLanguage p1;
        p1 = new ProgrammingLanguage();
        p1.display();

        p1 = new JavaLang();
        p1.display();

//        3. Java Operator Overloading
//            1. When + is used with numbers(integers and floating-point numbers),
//               it performs mathematical addition.
//            2. When we use the + operator with strings,
//               it will perform string concatenation (join two strings).
//
//            Here, we can see that the + operator is overloaded in
//            Java to perform two operations: addition and concatenation.
    }
}
