import javax.lang.model.type.ArrayType;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class ThrowVsThrows{
    public static double area(int radius) throws NegativeRadiusException{
        if (radius<0){
            throw new NegativeRadiusException();
        }return (Math.PI*radius*radius);
    }
    public static int divide(int a , int b)  throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int result = divide(6,0);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}