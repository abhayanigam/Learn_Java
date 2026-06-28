enum options{
    // enum constants calling then enum constructor.
    SMALL("The size is small"),
    MEDIUM("The size is medium"),
    LARGE("The size is large"),
    EXTRALARGE("The size is extra large");

    private final String pizzaSize;

    // private enum constructor
    private options(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getOp() {
        return pizzaSize;
    }
}

public class enumConstructor {
    public static void main(String[] args) {
        options size = options.SMALL;
//        System.out.println(options.getOp());
    }
}


/*
## Why You Cannot Use new
You cannot use new because the compiler strictly forces enum constructors to be private. [1, 2] 

// This will cause a compilation error
Status myStatus = new Status(); 


* Fixed Set of Instances: An enum represents a fixed, closed set of constants. Allowing new would let developers create random, uncontrolled copies at runtime. [3, 4, 5] 
* Compiler Block: Even if you do not type the word private, Java automatically forces the constructor to be private behind the scenes. If you try to call it from outside, the compiler blocks it. [6] 
* Reflection Protection: Java even blocks the Reflection API (Constructor.newInstance()) from bypassing this rule, throwing an IllegalArgumentException if anyone tries to force a new enum object.

------------------------------
## Why the Constructor Runs Only Once per Constant
An enum constructor does not run "just one single time for the whole enum." Instead, it runs exactly one time for each declared constant when the class is first loaded into memory. [7] 
If you have 3 constants, the constructor runs exactly 3 times. [8] 
## 1. It Happens During Class Loading
Behind the scenes, enum constants are public static final objects. In Java, static variables are initialized exactly once when the JVM loads the class into memory. [9, 10, 11] 
## 2. The Compiler Translation
When you write this:

public enum Size {
    SMALL, MEDIUM, LARGE;

    Size() {
        System.out.println("Constructor called!");
    }
}

The Java compiler automatically converts your constants into static initializers like this: [12] 

public final class Size extends Enum {
    public static final Size SMALL;
    public static final Size MEDIUM;
    public static final Size LARGE;

    static {
        // These run exactly once when the class loads
        SMALL = new Size("SMALL", 0);
        MEDIUM = new Size("MEDIUM", 1);
        LARGE = new Size("LARGE", 2);
    }
}

## 3. The Result
Because they are initialized inside a static block, the JVM handles the creation. Once those instances (SMALL, MEDIUM, LARGE) are built, they live in memory forever as singletons. Any time you reference Size.SMALL in your code, you are reusing that exact same object, so the constructor never needs to trigger again.
If you are interested, we can explore:

*/
