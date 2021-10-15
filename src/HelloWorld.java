//Hello World in Java

/* --> This Starting of multi line comment.

	Note :-
		What is JVM?
			JVM (Java Virtual Machine) is an abstract machine that enables your computer to run
			a Java program.
			When you run the Java program, Java compiler first compiles your Java code to bytecode.
			Then, the JVM translates bytecode into native machine code (set of instructions that a
			computer's CPU executes directly).
			Since JVM â€‹executes the Java bytecode which is platform-independent, Java is platform-independent.

		What is JRE?
			JRE (Java Runtime Environment) is a software package that provides Java class libraries,
			Java Virtual Machine (JVM), and other components that are required to run Java applications.

		What is JDK?
			JDK (Java Development Kit) is a software development kit required to develop applications in Java.
			When you download JDK, JRE is also downloaded with it. In addition to JRE, JDK also contains a number
			of development tools (compilers, JavaDoc, Java Debugger, etc).

		1. // --> is the single line comment like C,C++.

		2. Every line of code that runs in Java must be inside a class.
		In our example, we named the class Main.
		A class should always start with an uppercase first letter

		3. Java is case-sensitive: "Main" and "m" has different meaning.

		4. The curly braces {} marks the beginning and the end of a block of code.

		5. Each code statement must end with a semicolon.

This is end of multi line comment -- > */

// we can also write public class main.
public class HelloWorld {

    // The main() method is required and you will see it in every Java program:

    // Inside the main() method, we can use the println() method to print a line of
    // text to the screen:

    // Public(access modifier) : Public is used here to use this function publicly or anywhere in program.

    // Static : Static allow us to use this class function without creating an object.

    // String[] args: It stores Java command line arguments and is an array of type java

    // We can name the argument anything you want, but most programmers choose "args" or "argv".

    // The main method accepts a single argument: an array of elements of type String.
    public static void main(String[] args) {

        //The System class from the core library to print the "Hello World!" message to standard output
        System.out.println("Hello World!");
    }
}