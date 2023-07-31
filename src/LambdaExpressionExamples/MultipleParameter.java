package LambdaExpressionExamples;

interface i3{
    int sum(int a, int b);
}

public interface MultipleParameter {
    public static void main(String[] args) {

        // lambda expression with Multiple parameters
        i3 a=(x,y)->(x+y);
        System.out.println(a.sum(10,20));

        // Multiple parameters with data type in lambda expression
        i3 b=(int x,int y)->(x+y);
        System.out.println(b.sum(100,200));
    }
}
