import java.util.Scanner;
public class OddEven_ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number to check odd and even :");
        int n = input.nextInt();

        if (n%2 == 0){
            System.out.println("The Number is even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }
}
