import java.util.Scanner;
public class maximum_num_using_if_Else {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter : ");
        int a = scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt();
        // or
//        int a,b,c;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();

        if (a > b){
            if (a>c){

                System.out.printf("A is greater : %d",a);
            }
            else {
                System.out.printf("C is greater : %d",c);
            }
        }
        else{
            if (b>c)
            {
                System.out.printf("B is greater : %d",b);
            }
            else{
                System.out.printf("C is greater : %d",c);
            }
        }
    }
}
