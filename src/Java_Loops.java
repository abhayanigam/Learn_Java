public class Java_Loops {
    public static void main(String[] args) {
                System.out.println("For loop starts");
                int n = 5,i,j;
                for (i = 0; i<n; i++){
                    System.out.println("Hello " + (i+1));
                }

                System.out.println("While Starts");
                j = 0;
                while(j<n){
                    System.out.println("hello");
                    j++;
                }

                System.out.println("Do While loop starts");
                do {
                    System.out.println(i);
                    i++;
                } while(i <= n);

                System.out.println("For-each loop starts");
                int [] array = {1,2,3,4,5};
                int sum = 0;
                for (int num : array){
                    sum += num;
                }
                System.out.println("The sum is : "+ sum);

                char[] vowels = {'a', 'e', 'i', 'o', 'u'};
                // iterating through an array using the for-each loop
                for (char item: vowels) {
                    System.out.print(item+ " ");
                }

    }
}
