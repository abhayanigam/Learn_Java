/*
    1.Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
    2.The new class that is created is known as subclass (child or derived class) and
    the existing class from where the child class is derived is known as superclass (parent or base class).
        The (extends) keyword is used to perform inheritance in Java

    For example,
            class Animal {
              // methods and fields
            }

            // use of extends keyword
            // to perform inheritance

            class Dog extends Animal {

              // methods and fields of Animal
              // methods and fields of Dog
            }
 */

class Animal{
    String name;
    public void eat(){
        System.out.println("And I can eat");
    }
}

//Inherit from Animal
class Dog extends Animal{
    public void display(){
        System.out.println("Dag name is :" + name);
    }

    //overriding the eat() method.
    /*
        Note :
         We have used the @Override annotation to tell the compiler that we are overriding a method.
         However, the annotation is not mandatory.
     */
//    @Override
    public void eat(){
        /*
           The super keyword is used to call the method of the parent class from the method of the child class
         */
        super.eat();
        System.out.println("And i eat only dog's food.");
    }

    //new method is subclass.
    public void bark(){
        System.out.println("I can bark.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "Kaloo";
        obj.display();

        // call method of superclass
        // using object of subclass
        // obj.eat();

        //after overloading.
        obj.eat();
        obj.bark();
    }
}