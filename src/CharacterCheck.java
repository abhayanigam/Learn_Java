public class CharacterCheck {
    public static void main(String[] args) {
        String email = "abhaya@gmail.com/#something";
        System.out.println((containsEmailAndHash(email)) ? "This email is invalid" : "This is the valid email");

    }

    private static boolean containsEmailAndHash(String str) {
        return (str.matches(".*[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}.*")) ? str.contains("#") : false;

    }
}
