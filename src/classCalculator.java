import java.util.Scanner;

class Calculator{
    int operations(int n1,int n2,char op){
        switch (op){
            case '+':
                return (n1+n2);
            case '-':
                return (n1-n2);
            case '*':
                return (n1*n2);
            case '/':
                return (n1/n2);
            default:
                return 0;
        }
    }
}

class PrintData{
    void displayData(int ans){
        if (ans == 0){
            System.out.println("Enter the correct operator");
        }
        else{
            System.out.println("The ans is : " + ans);
        }
    }
}

public class classCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a : ");
        int a = input.nextInt();

        System.out.print("Enter the value for b : ");
        int b = input.nextInt();

        System.out.print("Enter the operation : ");
        char op = input.next().charAt(0);

        Calculator obj1 = new Calculator();
        int result = obj1.operations(a,b,op);

        PrintData obj2 = new PrintData();
        obj2.displayData(result);

        input.close();
    }
}
