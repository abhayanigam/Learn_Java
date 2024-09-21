package ComparableInterface.ComparableClass;

// In Java, you can sort objects of a class using the Comparable interface or by providing a Comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
    String name;
    int grade;

    Students(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.grade, o.grade);
    }

    @Override
    public String toString(){
        return name + " " + grade;
    }
}

class StudentTwo{
    String name;
    int grade;

    StudentTwo(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }
}
public class Student {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students("Alice",90));
        studentsList.add(new Students("Bob",85));
        studentsList.add(new Students("Charlie",95));

        Collections.sort(studentsList);

        for (Students st : studentsList){
            System.out.println(st);
        }


        // If you want to sort based on multiple attributes or don't want to modify the class, you can use a Comparator.
        List<StudentTwo> studentTwos = new ArrayList<>();

        studentTwos.add(new StudentTwo("Alice", 90));
        studentTwos.add(new StudentTwo("Bob", 85));
        studentTwos.add(new StudentTwo("Charlie", 95));

        Collections.sort(studentTwos, new Comparator<StudentTwo>() {
            @Override
            public int compare(StudentTwo o1, StudentTwo o2) {
                return Integer.compare(o1.grade, o2.grade); // Ascending order
            }
        });

        for (StudentTwo st : studentTwos){
            System.out.println(st);
        }

    }
}

/*
Note :

1. Comparable Interface :
    Purpose: The Comparable interface is used to define the natural ordering of objects of a class.
    It provides a single compareTo method that must be implemented by the class itself.

    Usage: You implement the Comparable interface in the class whose objects you want to sort,
    and then override the compareTo method to define how objects of that class should be compared.

2. Comparator Interface :
    Purpose: The Comparator interface is used to define multiple ways of ordering objects of a class.
    It allows you to create separate classes or anonymous classes that define custom sorting logic.

    Usage: You implement the Comparator interface in a separate class or as an anonymous class,
    and override the compare method to define the order.


Key Differences :
    Feature             	Comparable	                             Comparator
Interface Method	compareTo(T obj)	                        compare(T obj1, T obj2)
Implementation	    Implemented by the class itself	            Implemented in a separate class or anonymously
Natural Order	    Defines the natural order of objects	    Defines custom orders, can be multiple
Usage Example	    Collections.sort(list)	                    Collections.sort(list, comparator)
Flexibility	        Only one compareTo method	                Multiple comparators can be created
When to Use	        When a class has a single, natural order	When you need multiple or custom sorting orders

 */
