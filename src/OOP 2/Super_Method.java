//Super Method in Java
/*
    The super keyword in Java is used in subclasses to access
    superclass members (attributes, constructors and methods).

    Uses of super keyword:
        1. To call methods of the superclass that is overridden in the subclass.
        2. To access attributes (fields) of the superclass if both superclass and
            subclass have attributes with the same name.
        3. To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.
 */

class Animal1{
    protected String type = "Dog";
    Animal1(String name) {
        System.out.println("I am an animal1 " + name);
    }
}

class Dog1 extends Animal1{
    public String type1 = "mammal";

    public void printType(){
        System.out.println("I am an " + type1);
        System.out.println("I am a " + super.type);
    }

    Dog1() {
        // Use of super() to access superclass constructor
        // Call Parameterized Constructor Using super()
        super("tommy");
        System.out.println("I am a dog1");
    }
}

public class Super_Method {
    public static void main(String[] args) {
        Dog1 obj = new Dog1();
        obj.printType();
    }
}
