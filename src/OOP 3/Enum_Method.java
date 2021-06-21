/*
    In Java, an enum (short for enumeration) is a type that has a fixed set of constant values.
    We use the enum keyword to declare enums.
        Example,
                enum Size {
                   SMALL, MEDIUM, LARGE, EXTRALARGE
                }
    Here,
     we have created an enum named Size. It contains fixed values SMALL, MEDIUM, LARGE, and EXTRALARGE.
    These values inside the braces are called enum constants (values).
        Note:
            The enum constants are usually represented in uppercase.
 */

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test{
    Size pizzaSize;
    public Test(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }
    public void orderPizza(){
        switch (pizzaSize){
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case LARGE:
                System.out.println("I order a Large size pizza");
                break;
            case MEDIUM:
                System.out.println("I order a medium size pizza");
                break;
            case EXTRALARGE:
                System.out.println("I order a extra large size pizza");
                break;
        }
    }
}

public class Enum_Method {
//    //    Enum Class
//    enum size1{
//        A,B,C,D;
//
//        public String getAddress() {
//
//            // this will refer to the object SMALL
//            switch(this) {
//                case A:
//                    return "A";
//
//                case B:
//                    return "B";
//
//                case C:
//                    return "C";
//
//                case D:
//                    return "D";
//
//                default:
//                    return null;
//            }
//        }
        public static void main(String[] args) {
        Test t = new Test(Size.MEDIUM);
        t.orderPizza();

//        System.out.println("The address is " + size1.B);
    }
}
