// Java Maths is the class that has may methods that allows you to perform
// mathematical tasks on numbers.

public class JavaMaths {
    public static void main(String[] args) {

        // Method to Find the highest value between x and y.
        int a = 2, b =3;
        System.out.println(Math.max(a,b));

        // Method to Find the lowest value between x and y.
        System.out.println(Math.min(a,b));

        //The Math.sqrt(x) method returns the square root of x:
        System.out.println(Math.sqrt(64));

        //The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-4.7));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());

        //To print a random number between 0 and 10.
        int randNum = (int) (Math.random()*11); //Always take 1 digit more like python random function.
        System.out.println(randNum);
    }

}
