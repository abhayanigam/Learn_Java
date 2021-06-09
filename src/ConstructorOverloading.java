/*
    In Java, (this) keyword is used to refer to the current object inside a method or a constructor.
    this keyword is commonly used in :
        if instance variables and parameters may have the same name.
        For example:
                    class MyClass {
                        // instance variable
                        int age;

                        // parameter
                        MyClass(int age){
                            age = age;
                        }
                     }
     (The Java compiler gets confused because of the ambiguity in names between
     instance the variable and the parameter)

     So, Use this keyword:
                int age;
                Main(int age){
                    this.age = age;
                }

-------------------------------------------------------------------------------------------------

            class Main {
                int age;

                Main(int i) {
                    age = i;
                }
            }

Is equivalent to:

            class Main {
                int age;

                Main(int i) {
                    this.age = i;
                }
            }

 */

public class ConstructorOverloading {
    String name;

    // this keyword method.
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    //Constructors Overloading in Java
    String language;

    // constructor with no parameter
    ConstructorOverloading(){
        this.language = "Java";
    }

    // constructor with a single parameter
    ConstructorOverloading(String language) {
        this.language = language;
    }

    public void getLanguage(){
        System.out.println(this.language + " Programming Language.");
    }

    public static void main(String[] args) {
        // this keyword method.
        ConstructorOverloading obj = new ConstructorOverloading();
        obj.setName("Hello");
        System.out.println("Name is : " + obj.name);

        // constructor with no parameter
        ConstructorOverloading obj1 = new ConstructorOverloading();
        obj1.getLanguage();

        // constructor with a single parameter
        ConstructorOverloading obj2 = new ConstructorOverloading("Python");
        obj2.getLanguage();
    }
}
