public class Operators {
/*
    Note:
        Operators in Java just (like C and C++ )can be classified into 5 types:
        Arithmetic Operators
        Assignment Operators
        Relational Operators
        Logical Operators
        Unary Operators
        Bitwise Operators

    The ternary operator (conditional operator) is shorthand for the if-then-else statement.
    Also same like C program.
 */
        public static void main(String[] args) {
            int result = 20;
            String ans = (result == 20 ) ? "result is 20" : "Not 20";
            System.out.println(ans);
            // or
            System.out.println((result == 10 ) ? "result is 20" : "Not 20");
        }
}
