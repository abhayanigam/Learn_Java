class DemoClass{
    // create a generics method
    public <T> void genericsMethod(T data){
        System.out.println("Generics Method :");
        System.out.println("Data Passed : " + data);
    }
}
public class GenericsMethods {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();

        // Generic method working with string
        obj.<String>genericsMethod("Java Program");

        // Generic Method working with integer
        obj.<Integer>genericsMethod(25);
    }
}
