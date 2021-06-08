/*
    Method overloading, multiple methods can have the same name with different parameters:
    Example
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)

    Important Points
        1. Two or more methods can have the same name inside the same class if they accept different arguments.
            This feature is known as method overloading.
        2. Method overloading is achieved by either:
            - changing the number of arguments.
            - or changing the data type of arguments.
        3. It is not method overloading if we only change the return type of methods.
            There must be differences in the number of parameters.
 */
public class Method_Overloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display("Hello");
    }
}
