//Merge Sort in Java

import java.util.Scanner;
public class merge_sort {
    void merging(int arr[], int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i<n1; i++)
            left[i] = arr[start + i];
        for (int j = 0; j<n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j= 0, k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int start, int end){
        if (start<end){
            int mid = start+(end - start) /2;

            sort(arr,start,mid);
            sort(arr,mid+1,end);

            merge_sort obj = new merge_sort();
            obj.merging(arr,start,mid,end);
        }
    }
    static void display(int arr[]){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("Enter the size :");
        size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter the element No."+(i+1)+" : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Entered Array are :");
        display(arr);

        sort(arr,0,arr.length-1);

        System.out.println("Sorted Array are :");
        display(arr);

        input.close();
    }
}
