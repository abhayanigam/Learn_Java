// Hierarchical Inheritance.

class A1{
    void eat(){System.out.println("eating...");}
}
class B1 extends A1{
    void bark(){System.out.println("barking...");}
}
class C1 extends A1{
    void meow(){System.out.println("meowing...");}
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.eat();
        obj.meow();
//        obj.bark(); // Gives an error.
    }
}
