//Hello World in Java

/* --> This Starting of multi line comment. 
	
	Note :-
		What is JVM?
			JVM (Java Virtual Machine) is an abstract machine that enables your computer to run
			a Java program.
			When you run the Java program, Java compiler first compiles your Java code to bytecode. 
			Then, the JVM translates bytecode into native machine code (set of instructions that a 
			computer's CPU executes directly).
			Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.

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
class Main {

	// The main() method is requirsed and you will see it in every Java program:

	// Inside the main() method, we can use the println() method to print a line of
	// text to the screen:

	// Public is used here to use this function publicly

	// declare the function as static, then it limits the function scope. The static
	// function can be accessed within a file only.

	// String[] args: It stores Java command line arguments and is an array of type
	// java
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}