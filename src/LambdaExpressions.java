/*
    A lambda expression is a short block of code which takes in parameters and returns a value.
    Lambda expressions are similar to methods, but they do not need a name and they can be implemented
    right in the body of a method.

    Syntax :
        The simplest lambda expression contains a single parameter and an expression:
            parameter -> expression

        To use more than one parameter, wrap them in parentheses:
            (parameter1, parameter2) -> expression

        If the lambda expression needs to return a value, then the code block should have a return statement.
            (parameter1, parameter2) -> { code block }

*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // lambda expression in the ArrayList's forEach() method to print every item in the list:
        numbers.forEach((n) -> {System.out.print(n + " ");});
        System.out.println();

        //Java's Consumer interface to store a lambda expression in a variable:
        Consumer<Integer> method = (n) -> {System.out.print(n+" ");};

        numbers.forEach(method);
    }
}
