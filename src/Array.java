/*
    Note:
        - An array is a collection of similar types of data.

        - To declare an array in Java:
            In Java, here is how we can declare an array.
                    dataType[] arrayName ;
                                or
                    dataType[] arrayName  = new dataType[size];
            dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
            arrayName - it is an identifier
            new - The new operator denotes a request for memory allocation on the Free Store. (Just like malloc and calloc in C)

          - declare and initialize an array
                    int[] age = {12, 4, 5, 2, 5};

          - Array Length:
                To find out how many elements an array has
                Example : arrayName.length
 */

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // 1st initializing an array
        int[] myNum = {10, 20, 30, 40};  // --> int type
        for (int i = 0; i< myNum.length; i++){
            System.out.println("Index NO. i:"+ i +" = "+ myNum[i]+" ");
        }
//        // For each loop way
//        for(int i : myNum){
//            System.out.println(i);
//        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //2nd User define array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        int[] arr;
        arr = new int[size];
        for (int j =0; j<arr.length;j++){
            System.out.print("Enter the element : ");
            arr[j] = sc.nextInt();
        }
        for (int k : arr){
            System.out.println(k);
        }
        sc.close();

//        2d Arrays
//            A multidimensional array is an array containing one or more arrays.
//            To create a two-dimensional array, add each array within its own set of curly braces.
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
//        for (int[] innerArray: myNumbers) {
//            // second for...each loop access each element inside the row
//            for(int data: innerArray) {
//                System.out.println(data);
//            }
//        }

//          create a 3d array
        int[][][] test = {
                {{1, -2, 3},
                        {2, 3, 4}},
                {{-4, -5, 6, 9},
                        {1}, {2, 3}}
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


        //for loop has been replaced by a single line of code using Arrays.toString() function
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        //To get the numbers from the inner array, we just another function Arrays.deepToString().
        // This gets us the numbers 1, 2 and so on, we are looking for.
        int[][] b = {{1,2,3,4},{1,2,4,5}};
        System.out.println(Arrays.deepToString(b));
    }
}
