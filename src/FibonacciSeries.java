import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = 0,s = 1 ,nxt,i,n,sum = 0 ;
        System.out.print("Enter the number :");
        n = sc.nextInt();

        for (i = 0; i<n; i++){
            if (i<=1){
                nxt = i;
            }
            else {
                nxt = f+s;
                f = s;
                s = f;
            }
            System.out.print(i + " ");
            sum +=i;
        }
        System.out.println("\n");

        sc.close();
    }
}
