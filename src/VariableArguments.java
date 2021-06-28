// Variable Arguments (VarArgs) in Java.
/*
    Using VarArgs we can pass many numbers to the function to do a an operations.
    And the syntax is:
        public static void foo(int ...arr){
            //array is available here as int[] array.
        }
     Now,
        calling this function :- foo(7) , foo(7,8), foo(7,6,2,74,5)

    If we want to pass at least one digit in the function instead of zero.
    example:
        public static void foo(int x,int ...arr){
            int result = x;
            for (int a : arr){
                result += a;
            }
            return result;
        }
    Now,
        calling this function :- foo(7) , foo(7,8), foo(7,6,2,74,5)
 */

public class VariableArguments {
    static int sum(int ... arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of Nothing is: " + sum());
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4 ,5 and 6 is: " + sum(4,5,6));
        System.out.println("The sum of 4 ,5 ,6 and 8 is: " + sum(4,5,6,8));
    }
}
