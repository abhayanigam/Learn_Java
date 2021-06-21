/*
    Annotations are metadata (data about data) for our program source code.
    They provide additional information about the program to the compiler but are not part of the program itself.
    These annotations do not affect the execution of the compiled program.
        Annotations start with @.
        Its syntax is:
                     @AnnotationName
    Types of Annotations
        1. Predefined annotations
                                  @Deprecated
                                  @Override
                                  @SuppressWarnings
                                  @SafeVarargs
                                  @FunctionalInterface
         2. Meta-annotations
                             @Retention
                             @Documented
                             @Target
                             @Inherited
                             @Repeatable
 */

import java.util.*;

//@Override Annotation : It is not mandatory to use @Override when overriding a method.
class Q{
    public void display(){
        System.out.println("I'm Q.....");
    }
}
class R extends Q{
    @Override
    public void display(){
        System.out.println("I'm R.....");
        super.display();
    }
}
public class Annotations {

    @SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
        wordList.add("GitHub");

        System.out.println("Word list => " + wordList);
    }

    public static void main(String[] args) {
        R obj = new R();
        obj.display();
        wordsList();
    }
}
