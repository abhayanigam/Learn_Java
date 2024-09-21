import java.util.function.Predicate;

/*
* The Predicate allows programmers to test a specific condition imposed on values or objects.
* Such a condition will always return a boolean value.
* */
public class ExamplePredicate {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = i -> (i<18);
        // Calling Predicate method
        System.out.println("Result 1 -> " + lessThan.test(10));

        //Predicate Chaining:
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);

        System.out.println("Result 2 -> " + result);

        //negate() : Returns a predicate that represents the logical negation of this predicate.
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println("Result 3 -> " + result2);

        pred(10, (i) -> i > 7);
    }

    private static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)){
            System.out.println("Number : " + number);
        }
    }
}
