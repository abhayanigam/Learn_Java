class Creature{
    protected String Dname;
    protected void print(){
        System.out.println("I am an animal.");
    }
}

class D_dog extends Creature{
    public void getInfo(){
        System.out.println("My name is : "+ Dname);
    }
}
public class Protected_Member_Inheritance {
    public static void main(String[] args) {
        D_dog obj = new D_dog();
        obj.Dname = "kalloo";
        obj.getInfo();
    }
}
