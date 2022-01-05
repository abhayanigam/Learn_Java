package JavaThreads;

/*
    Java Threads
        Threads allows a program to operate more efficiently by doing multiple things at the same time.
        Threads can be used to perform complicated tasks in the background without interrupting the main program.

    Creating a Thread
        There are two ways to create a thread.
            1. By extending Thread class
            2. By implementing Runnable interface.

     Commonly used Constructors of Thread class:
        Thread()
        Thread(String name)
        Thread(Runnable r)
        Thread(Runnable r,String name)

      Runnable interface:
        The Runnable interface should be implemented by any class whose instances are intended to be executed by a
        thread. Runnable interface have only one method named run().

         > public void run(): is used to perform action for a thread.

      Starting a thread:
        The start() method of Thread class is used to start a newly created thread. It performs the following tasks:

         > public void start(): starts the execution of the thread.JVM calls the run() method on the thread.

            A new thread starts(with new callstack).
            The thread moves from New state to the Runnable state.
            When the thread gets a chance to execute, its target run() method will run.
 */

// // 1.  Java Thread Example by extending thread class
//public class Intro_Thread extends Thread{
//    public void run(){
//        System.out.println("Thread 1 is running...!!");
//    }
//
//    public static void main(String[] args) {
//        Intro_Thread t1 = new Intro_Thread();
//        t1.start();
//    }
//}


// // 2. Java Thread Example by implementing Runnable interface
//public class Intro_Thread implements Runnable{
//    public void run(){
//        System.out.println("Thread 2 is running...!!");
//    }
//
//    public static void main(String[] args) {
//        Intro_Thread t1 = new Intro_Thread();
//        Thread t2 = new Thread(t1); // Using the constructor Thread(Runnable)
//        t2.start();
//    }
//}

// // 3. Using the Thread Class: Thread(String Name)
//public class Intro_Thread {
//    public static void main(String args[])
//    {
//        // creating an object of the Thread class using the constructor Thread(String name)
//        Thread t= new Thread("My third thread");
//
//        // the start() method moves the thread to the active state
//        t.start();
//
//        // getting the thread name by invoking the getName() method
//        String str = t.getName();
//        System.out.println(str);
//    }
//}

//4. Using the Thread Class: Thread(Runnable r, String name)
public class Intro_Thread implements Runnable{
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    public static void main(String argvs[])
    {
        // creating an object of the class MyThread2
        Runnable r1 = new Intro_Thread();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "My new thread");

        // the start() method moves the thread to the active state
        th1.start();

        // getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}