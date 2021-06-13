/*
    Java Abstract Class:
        The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
         We use the abstract keyword to declare an abstract class.

    An abstract class can have both the regular methods and abstract methods.
    For example,
                abstract class Language {

                  // abstract method
                  abstract void method1();

                  // regular method
                  void method2() {
                    System.out.println("This is regular method");
                  }
                }

     Java Abstract Method:
        A method that doesn't have its body is known as an abstract method.
        We use the same abstract keyword to create abstract methods.
             For example,
                abstract void display();
             Here,
                display() is an abstract method. The body of display() is replaced by ;.

     If a class contains an abstract method, then the class should be declared abstract.
     Otherwise, it will generate an error.

     Note:
        To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
 */

//Java Abstract Class and Method
abstract class Language{
    //method of abstract class
    public void display(){
        System.out.println("This is Java Programming.");
    }

    //Java Abstraction method:
    abstract void practice();
}

//Method to Access Abstract Class
//public class Abstract_Class extends Language {
//    public static void main(String[] args) {
//
//        // create an object of Main
//        Abstract_Class obj = new Abstract_Class();
//
//        // access method of abstract class
//        // using object of Main class
//        obj.display();
//    }
//}

//Method to access Abstract class through another class
class Code extends Language{
    public void practice(){
        System.out.println("So practice this language daily");
    }
    public void loveLanguage(){
        System.out.println("I love this language");
    }
}
public class Abstract_Class{
    public static void main(String[] args) {

        // create an object of Main
        Code obj = new Code();

        // access method of abstract class
        // using object of Main class
        obj.display();
        obj.loveLanguage();
        obj.practice();
    }
}