class Bicycle{
/*
    fields (variables) and methods represent the state and behavior of the object respectively.
          - fields are used to store data
          - methods are used to perform some operations (Just like function)

    Access Modifiers  - Public
                      - Private
                      - Protected
    Public - Public class that can be used over the file.
    Private - Objects cannot access the data members and function outside the class.
            "These members can only be accessed inside the class."

    Protected - Objects cannot access the data members and function outside the class.
            "These members can be accessed inside the class and inherited class."
*/
    // state or field
//  private int gear = 5;
    public int gear = 5;

    // behavior or method
    public void braking() {
        System.out.println("Working of Braking");
    }
}

public class Object_And_Class {
    public static void main(String[] args) {
//        An object is called an instance of a class.
//          For example, suppose Bicycle is a class then MountainBicycle, SportsBicycle, TouringBicycle,
//          etc can be considered as objects of the class.
//        To create an object of a class :
//              className objectName = new className();

        // for Bicycle class
        Bicycle sportsBicycle = new Bicycle(); // --> Object 1
        Bicycle touringBicycle = new Bicycle(); // --> Object 2

        // access field and method
        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();

        System.out.println(touringBicycle.gear);
        touringBicycle.braking();
    }
}
