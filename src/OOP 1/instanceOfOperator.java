/*
    The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
    Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.


 */
public class instanceOfOperator {
    public static void main(String[] args) {
        // Crete a variable of string type.
        String name = "GitHub";

        //Checking if name is instance of string.
        boolean result1 = name instanceof String;
        System.out.println("Name is an instance of string : " + result1);

        instanceOfOperator obj = new instanceOfOperator();

        //Checking if obj is an instance of main
        boolean result2 = obj instanceof instanceOfOperator;
        System.out.println("Obj is an instance of instanceOfOperator : "+result2);
    }
}
