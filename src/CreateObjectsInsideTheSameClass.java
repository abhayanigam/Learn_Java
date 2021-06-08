public class CreateObjectsInsideTheSameClass {
    int a = 5;
    void rupee(){
        System.out.println("You have : " + a +" Rupees.");
    }

    public static void main(String[] args) {
        CreateObjectsInsideTheSameClass obj1 = new CreateObjectsInsideTheSameClass();
        obj1.rupee();
    }
}
