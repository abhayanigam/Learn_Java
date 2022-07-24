import java.util.Scanner;
class student {

    public int id;
    public String name;

    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void display()
    {
        System.out.println("Student id is: " + id + " " + "and Student name is: " + name);
    }
}

public class CreatingMultipleObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        String str;

        System.out.print("Enter the size : ");
        int size = input.nextInt();

        student[] arr = new student[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number " + (i+1) + " : ");
            data = input.nextInt();
            System.out.print("Enter the name " + (i+1) + " : ");
            str = input.next();
            arr[i] = new student(data,str);
        }

        for (int i = 0; i < size; i++) {
            arr[i].display();
        }

        input.close();
    }
}
