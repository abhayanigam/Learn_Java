import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,p = 0;

        System.out.print("Enter the Value for n : ");
        n = sc.nextInt();

        for (int i=1; i<=n;i++){
            if (n%i == 0){
                p++;
            }
        }
        if (p == 2){
            System.out.println("The Number is a Prime Number");
        }
        else {
            System.out.println("The Number is not a Prime Number");
        }
    }
}
