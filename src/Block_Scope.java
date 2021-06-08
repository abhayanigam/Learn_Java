/*
    Block Scope
        A block of code refers to all of the code between curly braces {}.
        Variables declared inside blocks of code are only accessible by the code between the curly braces,
        which follows the line in which the variable was declared
 */

public class Block_Scope {
    public static void main(String[] args) {

        // Code here CANNOT use x

        { // This is a block starts here

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x
//        System.out.println(x); // This shows an error.
    }
}
