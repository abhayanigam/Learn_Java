/*
    Declaring a Java Method
    The syntax to declare a method is:
        returnType methodName() {
          // method body
        }
    - returnType - It specifies what type of value a method returns
        For example if a method has an int return type then it returns an (integer value.)
                    If the method does not return a value, its return type is (void).
             Void - void means that this method does not have a return value.
    - methodName - It is an identifier that is used to refer to the particular method in a program.
    - method body - It includes the programming statements that are used to perform some tasks. T
                    he method body is enclosed inside the curly braces { }

    static - If we use the static keyword, it can be accessed without creating objects.
        For example, the sqrt() method of standard Math class is static.
                    Hence, we can directly call Math.sqrt() without creating an instance of Math class.
    parameter1/parameter2 - These are values passed to a method. We can pass any number of arguments to a method.

    for example:
        static returnType nameOfMethod (parameter1, parameter2, ...) {
          // method body
        }
 */

public class Methods {
    public int sum(int a, int b){
        return a+b;
    }

    public void mult(int a, int b){
        System.out.println("The multiplication is : "+ (a*b));
    }

    static void square(int a) {
        // using the sqrt() method
        System.out.println("Square root of 4 is: " + Math.sqrt(a));
    }

    static void myMethod(String fname) {
        System.out.println("Hello "+ fname);
    }


    public static void main(String[] args) {
        Methods obj1 = new Methods();

        int x = 2 ,y = 3;
        int result = obj1.sum(x,y);
        System.out.println("The sum is : " + result);

        obj1.mult(4,5);

        square(4);

        myMethod("Abhaya");
    }
}
