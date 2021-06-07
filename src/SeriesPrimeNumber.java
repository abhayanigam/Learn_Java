import java.util.Scanner;
public class SeriesPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,p,i;

        System.out.print("Enter the Value for n : ");
        n = sc.nextInt();

        for (p = 0; p<=n; p++){
            for (i = 2; i<p; i++){
                if (p%i == 0) {
                    break;
                }
            }
            if (i == p){
                System.out.println(i);
            }
        }
    }
}
