import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Functions {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(10);
        numbers.add(1);
        numbers.add(30);
        System.out.println(numbers);

        // size() -> Returns the length of the arraylist.
        System.out.println("The size of an arraylist is : " + numbers.size());

        // sort() -> Sort the arraylist elements.
        Collections.sort(numbers);
        System.out.print("The sorted list is :- ");
        for (int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();

        //clone() -> Creates a new arraylist with the same element, size, and capacity.
        ArrayList<Integer> cloneNumbers = (ArrayList<Integer>)numbers.clone();
        System.out.println("Cloned ArrayList: " + cloneNumbers);

        //contains() -> Searches the arraylist for the specified element and returns a boolean result.
        System.out.print("Is 3 present in the arraylist: ");
        System.out.println(numbers.contains(3));

        // ensureCapacity() -> Specifies the total element the arraylist can contain.
        // However, when we add 4th element in the arraylist, the arraylist automatically resizes.
        numbers.ensureCapacity(3);
        System.out.println(numbers);

        // isEmpty() -> Checks if the arraylist is empty.
        boolean result = numbers.isEmpty(); // true
        System.out.println("Is the ArrayList empty? " + result);

        // indexOf() -> Searches a specified element in an arraylist and returns the index of the element.
        // find the position of 13
        int position1 = numbers.indexOf(10);
        System.out.println("Index of 13: " + position1);

        //Note : If the element is not there in the array list then it will return -1;
    }
}
