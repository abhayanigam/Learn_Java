/*
    Java Singleton ensures that only one object of a class can be created.
    Here's
        how we can implement singletons in Java.
    1. create a private constructor that restricts to create an object outside of the class
    2. create a private attribute that refers to the singleton object.
    3. create a public static method that allows us to create and access the object we created.
       Inside the method, we will create a condition that restricts us from creating more than one object.

    Example:
           class SingletonExample {

            // private field that refers to the object
               private static SingletonExample singleObject;

               private SingletonExample() {
                  // constructor of the SingletonExample class
               }

               public static SingletonExample getInstance() {
                  // write code that allows us to create only one object
                  // access the object as per our need
               }
            }

    1. private static SingletonExample singleObject - a reference to the object of the class.

    2. private SingletonExample() - a private constructor that restricts creating objects outside of the class.

    3. public static SingletonExample getInstance() - this method returns the reference to the only object of
       the class. Since the method static, it can be accessed using the class name.
 */

/*
    Use of Singleton in Java
        Singletons can be used while working with databases.
        They can be used to create a connection pool to access the database while reusing
        the same connection for all the clients.
 */
class Database{
    private static Database dbObject;

    private Database(){
    }

    public static Database getInstance(){
        // create object if it's not already created
        if (dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }

    public void getConnection(){
        System.out.println("You are now connected to the database.");
    }
}
public class Singleton {
    public static void main(String[] args) {
        Database D1;

        //refers to the only object of Database.
        D1 = Database.getInstance();
        D1.getConnection();
    }
}
