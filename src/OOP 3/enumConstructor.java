enum options{
    // enum constants calling then enum constructor.
    SMALL("The size is small"),
    MEDIUM("The size is medium"),
    LARGE("The size is large"),
    EXTRALARGE("The size is extra large");

    private final String pizzaSize;

    // private enum constructor
    private options(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getOp() {
        return pizzaSize;
    }
}

public class enumConstructor {
    public static void main(String[] args) {
        options size = options.SMALL;
//        System.out.println(options.getOp());
    }
}
