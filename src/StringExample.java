public class StringExample {
    public static void main(String args[]){
        String s1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // iteration in String

        String s4 = "java";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.println(c);
        }

        for (char c : s1.toCharArray()) {
            System.out.println(c);
        }

        s1.chars().forEach(ch -> System.out.println((char) ch));
        
    }
}

/*
To understand the **String Pool** in Java, we need to look at how Java tries to save memory. Because Strings are used everywhere in programming, 
creating a brand new object every single time you type a word would quickly eat up all of your computer's RAM.

To fix this, Java uses the String Pool. Let's use an analogy to see how it works.

---

### The Analogy: The Shared Bulletin Board

Imagine your office has a central, shared **Community Bulletin Board** (The String Pool), and every employee has their own private **Notepad** (The General Heap Memory).

**1. Creating a String Literal (The Bulletin Board)**
When you type a String in quotation marks like this: `String a = "Hello";`
Java acts as the office manager. It walks up to the Community Bulletin Board and checks: *"Is the word 'Hello' already pinned up here?"*

* If **no**, it writes "Hello" on a card, pins it to the board, and ties a string from your variable `a` to that card.
* If **yes**, it doesn't write a new card. It just takes a second piece of string and ties your new variable to the exact same card that is already on the board.

**2. Creating a String with `new` (The Private Notepad)**
When you force Java to create a String like this: `String b = new String("Hello");`
You are explicitly telling the office manager: *"I don't care about the shared board. 
Buy me a brand new, private notepad and write 'Hello' on it just for me."* Java will always
use up new memory to do this, even if "Hello" is already on the shared board.

---

### The Code Example

Because of this shared memory trick, we run into the classic trap of `==` versus `.equals()`.

* `==` checks if two variables are pointing to the **exact same physical memory location** (the same card on the board).
* `.equals()` checks if the **text itself** matches, regardless of where it is written.

```java
// 1. We use literals. Java puts "Java" in the String Pool.
String s1 = "Java";
String s2 = "Java";

// 2. We use the 'new' keyword. Java forces a brand new object in general memory.
String s3 = new String("Java");

System.out.println(s1 == s2);      // TRUE! They point to the exact same card in the Pool.
System.out.println(s1 == s3);      // FALSE! s3 is a completely separate object in memory.

System.out.println(s1.equals(s3)); // TRUE! The physical objects are different, but the text is the same.

```

### Why does Java do this?

Because Strings in Java are **Immutable** (they cannot be changed once created). Since a String's text can never be edited, it 
is perfectly safe for a thousand different variables to point to the exact same "Hello" object in memory. None of them can
accidentally ruin it for the others.

*/
