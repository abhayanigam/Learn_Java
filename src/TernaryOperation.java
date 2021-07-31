import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st No. : ");
        int n1 = input.nextInt();

        System.out.print("Enter the 2nd No. : ");
        int n2 = input.nextInt();

        // Largest among n1 and n2
        int max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);
        input.close();
    }
}
