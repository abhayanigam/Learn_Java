/*
    The Java Generics allows us to create a single class, interface,
    and method that can be used with different types of data (objects).
*/

// Creating a generic class
class Generics<T>{
    // variable of T type
    T data;

    public Generics(T data){
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}
public class GenericsClass {
    public static void main(String[] args) {
        Generics<Integer> obj1 = new Generics<>(5);
        System.out.println("Generic Class returns the int : " + obj1.getData());

        Generics<String> obj2 = new Generics<>("Java Program");
        System.out.println("Generic Class returns the string : " + obj2.getData());
    }
}
