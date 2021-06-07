import java.util.Scanner;

public class calculator_switch_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        char operator;

        System.out.println("Enter the Value for A : ");
        a = input.nextInt();

        System.out.println("Enter the Value for B : ");
        b = input.nextInt();

        System.out.println("Enter the opeartion (+,-,*,/) : ");
        operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("The sum is : "+(a+b));
                break;
            case '-':
                System.out.println("The sum is : "+(a-b));
                break;
            case '*':
                System.out.println("The sum is : "+(a*b));
                break;
            case '/':
                System.out.println("The sum is : "+(a/b));
                break;
            default:
                System.out.println("Enter the correct operator");
                break;
        }

        input.close();
    }
}
