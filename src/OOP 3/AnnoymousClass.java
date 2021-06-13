/*
    1. A nested class that doesn't have any name is known as an anonymous class.
    2. An anonymous class must be defined inside another class.
        Hence, it is also known as an anonymous inner class.
        Its syntax is:
                        class className{
                               ...
                        }
                        class outerClass {

                            // defining anonymous class
                            className object1 = new className(parameterList) {
                                 // body of the anonymous class
                            };
                        }
    3. Anonymous classes usually extend subclasses or implement interfaces.
        Here, Type can be
            i.)  a superclass that an anonymous class extends
            ii.) an interface that an anonymous class implements

    The above code creates an object, object1, of an anonymous class at runtime.
         Note:
            Anonymous classes are defined inside an expression.
            So, the (semicolon) is used at the end of anonymous classes to indicate the end of the expression.
 */

class PolyGon{
    public void display(){
        System.out.println("Inside the polygon class.");
    }
}

// Same as above.
//interface Polygon {
//    public void display();
//}

class Demo_anonymous{
    public void createClass(){

        //creation of anonymous class extending the polygon.
        PolyGon p1 = new PolyGon(){
            public void display(){
                System.out.println("Inside the anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnnoymousClass {
    public static void main(String[] args) {
        Demo_anonymous an = new Demo_anonymous();
        an.createClass();
    }
}
