class Main{
    public static void main(String[] args) {
        int a = 12;
        float b = 2.5f;
        double c = 3.445e2;
        long d = 10l;
        char e = 'A';
        String f = "Hello";
        boolean myBool = true;

        //The println() method is often used to display variables.
        //To combine both text and a variable, use the + character:

        System.out.println("Int :" + a);
        System.out.println("float :" + b);
        System.out.println("double :" + c);
        System.out.println("long :" + d);
        System.out.println("char :" + e);
        System.out.println("String :" + f);
        System.out.println("Boolean value :" + myBool);

        // can also use the + character to add a variable to another variable:
        String FirstName = "Git";
        String LastName = "Hub";
        System.out.println("Hello "+FirstName+LastName);

        // Declare Many Variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
    }
}
