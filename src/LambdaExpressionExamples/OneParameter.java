package LambdaExpressionExamples;

interface i2{
    public String show(String msg);
}

public interface OneParameter {
    public static void main(String[] args) {

        // Single-parameter lambda expression.
        i2 s1=(msg)->{
            return "Hello, "+msg;
        };
        System.out.println(s1.show("Sonoo"));

        // The function parentheses can be omitted.
        i2 s2= msg ->{
            return "Hello, "+msg;
        };
        System.out.println(s2.show("Sonoo"));
    }
}
