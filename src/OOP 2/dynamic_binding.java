class X{
    void eat(){
        System.out.println("X is eating...");
    }
}

class Y extends X{
    void eat(){
        System.out.println("Y is eating...");
    }
}

public class dynamic_binding {
    public static void main(String[] args) {
        X obj1 = new X();
        obj1.eat();

        X obj2 = new Y();
        obj2.eat();
    }
}
