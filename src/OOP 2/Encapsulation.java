/*
    Encapsulation is one of the key features of object-oriented programming.
    Encapsulation refers to the bundling of fields and methods inside a single class.

    It prevents outer classes from accessing and changing fields and methods of a class.
    This also helps to achieve data hiding.

    Note :
        1. encapsulation helps us to keep related fields and methods together,
           which makes our code cleaner and easy to read.
        2. It helps to control the values of our data fields.

    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
     To achieve this, you must:
        1. declare class variables/attributes as private
        2. provide public get and set methods to access and update the value of a private variable
            Example:
                    public class Person {
                      private String name; // private = restricted access

                      // Getter
                      public String getName() {
                        return name;
                      }

                      // Setter
                      public void setName(String newName) {
                        this.name = newName;
                      }
                    }
 */

class Area{
    // Field to calculate area
    int length;
    int breadth;

    Area(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    //method to calculate area.
    public void getArea(){
        int area = length*breadth;
        System.out.println("Area is : " + area);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Area obj = new Area(5,6);
        obj.getArea();
    }
}
