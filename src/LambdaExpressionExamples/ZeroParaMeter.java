package LambdaExpressionExamples;

import org.w3c.dom.ls.LSOutput;

interface i1{
//    public String show();
    void display();
}

public interface ZeroParaMeter {
    public static void main(String[] args) {
//        i1 i= () -> {
//            return "I have nothing to say with Method 1";
//        };
//        System.out.println(i.show());

        i1 i=()->System.out.print("I have nothing to say with Method 2");
        i.display();
    }
}
