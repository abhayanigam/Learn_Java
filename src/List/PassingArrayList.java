package List;

import java.util.ArrayList;
public class PassingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(1);
        num.add(0);
        num.add(6);

        System.out.print("Elements are : ");
        display(num);
//        PassingArrayList d = new PassingArrayList();
//        d.display(num);

        System.out.print("The Longest Number is : ");
        System.out.println(LongestInt(num));
    }
    public static void display(ArrayList<Integer> num){
        for (int i : num){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int LongestInt(ArrayList<Integer> num){
        int a = num.get(0);
        for (int i = 1; i< num.size();i++){
            if (a < num.get(i)){
                a = num.get(i);
            }
        }
        return a;
    }
}
