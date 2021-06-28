//Assertion in Java
/*
Assertions in Java help to detect bugs by testing code we assume to be true.
        An assertion is made using the assert keyword.
            Its syntax is:
                assert condition;
        Enabling Assertions
        By default, assertions are disabled and ignored at runtime.
            To enable assertions, we use:
                        java -ea:arguments
                                OR
                        java -enableassertions:arguments
*/

public class AssertionError {
    public static void main(String args[]) {
        String[] weekend = {"monday","tuesday","wednesday"};
        assert weekend.length == 2 : "There are only 2 weekends in a week";
        System.out.println("There are " + weekend.length + " weekends in a week");
    }
}
