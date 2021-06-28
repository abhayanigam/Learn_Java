import javax.crypto.spec.PSource;
import java.util.Scanner;
class Employee{
    private int id;
    private String name;

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
}

public class GetterAndSetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.print("Enter the name of the employee : ");
        String name = input.nextLine();
        obj.setName(name);

        System.out.print("Enter the Id Number of the employee : ");
        int i = input.nextInt();
        obj.setId(i);

        System.out.println("Name of the Employee is: " + obj.getName());
        System.out.println("Name of the Employee is: " + obj.getId());
    }
}
