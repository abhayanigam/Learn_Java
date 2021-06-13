//Single Inheritance in Java.
class A{
    public void eat(){
        System.out.println("Eating....");
    }
}
class B extends A{
    public void bark(){
        System.out.println("barking....");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.eat();
        obj.bark();
    }
}
