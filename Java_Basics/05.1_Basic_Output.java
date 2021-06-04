// Basic Output in Java
/*
    Note:
        To get input from user using the object of Scanner class.
        In order to use the object of Scanner, we need to (import java.util.Scanner) package.

        Then we need to create an object of the Scanner class. 
        We can use the object to take input from the user.
    Example : 
        create an object of Scanner
            Scanner Name = new Scanner(System.in);
        take input from the user
            int number = Name.nextInt();

        The nextInt() method of the Scanner class to get an integer input from the user.
        Similarly, 
            we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get 
            long, float, double, and for string input use only next() to store only 1 word.
            to store a sentence use Name.nextLine()

    Note: 
        We have used the close() method to close the object. 
        It is recommended to close the scanner object once the input is taken.
    Example :
        Name.close()
*/

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of int :");
        int a = input.nextInt();
        
        System.out.println("Enter the value of float :");
        float b = input.nextFloat();

        System.out.println("Enter the value of double :");
        double c = input.nextDouble();

        System.out.println("Enter the string :");
        String d = input.next();

        System.out.println("Int : " + a);
        System.out.println("Float : " + b);
        System.out.println("Double : " + c);
        System.out.println("String : " + d);

        System.out.print("Enter for Bool : ");
        boolean b1 = input.hasNextInt();
        System.out.println("The value is " + b1);

        System.out.print("Enter the string sen : ");
        String str = input.nextLine();
        System.out.println("The string is : " + str);

        input.close();
    }
}