import java.util.Scanner;
public class IfElse_Statment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount:- ");
        int saving = sc.nextInt();

        if (saving>5000)
        {
            System.out.println("Too high");
        }
        else if(saving>2000){
            System.out.println("In Mid");
        }
        else{
            System.out.println("Too low");
        }

        sc.close();
    }
}
