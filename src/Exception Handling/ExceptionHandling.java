/*
 Exception Types
    The exception hierarchy also has two branches:
        1. RuntimeException
        2. IOException.

    1. RuntimeException: A runtime exception happens due to a programming error.
                         They are also known as unchecked exceptions.
        These exceptions are not checked at compile-time but run-time.
        Some of the common runtime exceptions are:
            1. Improper use of an API - IllegalArgumentException
            2. Null pointer access (missing the initialization of a variable) - NullPointerException
            3. Out-of-bounds array access - ArrayIndexOutOfBoundsException
            4. Dividing a number by 0 - ArithmeticException
            5. The (NullPointerException) would not have occurred if you had checked whether the variable
                was initialized or not before using it.
            6. An (ArrayIndexOutOfBoundsException) would not have occurred if you tested the array index
                against the array bounds.

     2. IOException : An IOException is also known as a checked exception.
                      They are checked by the compiler at the compile-time and the programmer is prompted
                      to handle these exceptions.

            Some of the examples of checked exceptions are:
                1. Trying to open a file that doesn’t exist results in FileNotFoundException
                2. Trying to read past the end of a file
 Note:
     Here's a list of different approaches to handle exceptions in Java.
        1. try...catch block : Every try block is followed by a catch block.
                               When an exception occurs, it is caught by the catch block.
                               The catch block cannot be used without the try block.

        2. finally block : the finally block is always executed no matter whether there is an exception or not.
                           The finally block is optional. And, for each try block, there can be only one finally block.
                               Note:
                                   It is a good practice to use the finally block.
                                   It is because it can include important cleanup codes like,
                                       1. code that might be accidentally skipped by return, continue or break
                                       2. closing a file or connection

        3. throw and throws keyword : throw keyword is used to explicitly throw a single exception.
                                      When we throw an exception, the flow of the program moves from
                                       the try block to the catch block.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("Something went wrong");
            System.out.println(e);
//            System.out.println(e.getMessage());
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
