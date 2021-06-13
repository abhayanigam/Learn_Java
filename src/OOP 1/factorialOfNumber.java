// Factorial of a number using recursion in Java.
import java.util.Scanner;
public class factorialOfNumber {

    static int factorial(int num){
        if (num != 0){
            return num*factorial(num-1);
        }else{ return 1; }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int result = factorial(num);

        System.out.printf("The factorial of the Number %d is %d \n",num,result);

        input.close();
    }
}
