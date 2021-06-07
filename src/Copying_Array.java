import java.util.Arrays;

public class Copying_Array {
    public static void main(String[] args) {
//        1. Copying Arrays Using Assignment Operator
        int[] a = {1,2,3,4,5};
        int[] b = a; //copying array
        // change value of first array
        b[0] = -1;

        System.out.println(Arrays.toString(b));

//         2. Using Loop
//              iterate and copy elements from source to destination
        int[] c = new int[5];
        for (int i = 0; i < a.length; ++i) {
            c[i] = a[i];
        }

        // converting array to string
        System.out.println(Arrays.toString(c));

//          3. Copying Arrays Using arraycopy() method
//             The arraycopy() method
//                  arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1,0,n2,0,n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1,2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));

//        4. Copying Arrays Using copyOfRange() method
        int[] d = {2,3,4,5,6,7};
        int[] d1 = Arrays.copyOfRange(d,0,d.length);
        System.out.println("d1 : " + Arrays.toString(d1));

        // copying from index 2 to 5 (5 is not included)
        int[] d2 = Arrays.copyOfRange(d,2,5);
        System.out.println("d2 : " + Arrays.toString(d2));
    }
}
