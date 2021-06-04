// Basic Input in Java.
/*
    Note:
        - System is a class
        - out is public static field :it accepts output data.

    Difference Between println(), print(), printf() :-
        1. print(): It prints string inside the quotes.
        2. println(): It prints string inside the quotes similar 
                        like (print()) method. Then the cursor moves
                        to the beginning  of the next line.
        3. printf(): It provides strings formatting (Similar to printf
                        in C/C++ language).
*/

class Main{
    public static void main(String[] args) {
        //print() and println()
        System.out.println("1. println");
        System.out.println("2. println");

        System.out.print("1. print ");
        System.out.print("2. print ");

        System.out.println("\n");

        //printf()
        /*
            Conversion-Characters just like (C and C++):
                %d : decimal integer [byte, short, int, long]
                %f : floating-point number [float, double]
                %c : character Capital C will uppercase the letter
                %s : String Capital S will uppercase all the letters in the string
                %h : hashcode A hashcode is like an address. This is useful for printing a reference
                \n : newline Platform specific newline character- use %n instead of \n for greater compatibility
                \n : New Line	
                \r : Carriage Return	
                \t : Tab	
                \b : Backspace	
        */

        int a = 10;
        float b = 2.5f;
        String s = "hello";

        System.out.printf("The int value is %d\n",a);
        System.out.printf("The float value is %.2f%n",b);
        System.out.printf("The String in lower case %s\n",s);
        System.out.printf("The String in Upper case %S\n",s);

        System.out.printf("The String object %s is at hash code %h%n", s, s);

        // You can build a formatted String and assign it to a variable using the static format method in the String class
        String c = String.format("Grand Total: %d", a);
        System.out.println(c);

        //String Length
        //the length of a string can be found with the length()
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the string is: " + txt.length());

        //toUpperCase() and toLowerCase()
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string 
        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println("The loation is : "+ txt1.indexOf("locate"));

        //String Concatenation
        // The + operator can be used between strings to combine them
        // also use the concat() method to concatenate two strings.
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println("Using + : " + firstName+lastName);
        System.out.println("Using concat() : " + firstName.concat(lastName));

        //Special Characters
        // Because strings must be written within quotes, Java will misunderstand this string, and generate an error
        //      \' -->	'	Single quote
        //      \" -->	"	Double quote
        //      \\ -->	\	Backslash
        System.out.println("hello \"hi\" hello");
        System.out.println("It\'s me");
        System.out.println("Go \\ now");

    }
}